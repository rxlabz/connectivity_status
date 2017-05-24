# connectivity_status POC

A flutter plugin to check the device connectivity 

```dart

import 'package:connectivity_status/connectivity_status.dart'; 

//...
isConnected = await ConnectivityStatus.isConnected;
//...
```

## iOS

  - this plugin is written in swift, so to use with a Flutter/ObjC project, it seems to be needed to convert the project to "Current swift syntax" ( Edit/Convert/current swift syntax)  

## Android

- :warning: needs the `ACCESS_NETWORK_STATE` permission