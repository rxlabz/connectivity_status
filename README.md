# connectivity_status POC

A flutter plugin ( mostly to test the `flutter create --plugin -i swift` command and ) to check the device connectivity 

```dart

import 'package:connectivity_status/connectivity_status.dart'; 

//...
isConnected = await ConnectivityStatus.isConnected;
//...
```

## Android

- :warning: needs the `ACCESS_NETWORK_STATE` permission