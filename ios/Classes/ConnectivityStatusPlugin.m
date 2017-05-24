#import "ConnectivityStatusPlugin.h"
#import <connectivity_status/connectivity_status-Swift.h>

@implementation ConnectivityStatusPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftConnectivityStatusPlugin registerWithRegistrar:registrar];
}
@end
