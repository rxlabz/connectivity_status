package bz.rxla.flutter.connectivity_status;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * ConnectivityStatusPlugin
 */
public class ConnectivityStatusPlugin implements MethodCallHandler {

  private final Activity activity;
  ConnectivityManager connManager;

  private ConnectivityStatusPlugin(Activity activity) {
    this.activity = activity;
  }

  /**
   * Plugin registration.
   */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "connectivity_status");
    channel.setMethodCallHandler(new ConnectivityStatusPlugin(registrar.activity()));
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {

    if(  connManager == null )
      connManager = (ConnectivityManager) activity.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

    if (call.method.equals("isConnected")) {
      NetworkInfo info = connManager.getActiveNetworkInfo();
      if( info != null)
        result.success(info.isConnected());
      else
        result.success(false);
        //result.error("UNAVAILABLE","Connectivity is not available", null);
    } else {
      result.notImplemented();
    }
  }
}
