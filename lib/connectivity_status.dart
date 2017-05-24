import 'dart:async';

import 'package:flutter/services.dart';

class ConnectivityStatus {
  static const MethodChannel _channel =
      const MethodChannel('connectivity_status');

  static Future<bool> get isConnected =>
      _channel.invokeMethod('isConnected');
}
