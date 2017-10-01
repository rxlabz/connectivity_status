# DEPRECATED ~~connectivity_status~~

=> see the official Flutter plugin https://pub.dartlang.org/packages/connectivity

A flutter plugin to check the device connectivity 

## Example

```bash
cd connectivity_status/example
flutter packages get
flutter run
```

## Usage

To use this plugin, add connectivity_status as a dependency in your pubspec.yaml file.

```dart

import 'package:connectivity_status/connectivity_status.dart'; 

//...
isConnected = await ConnectivityStatus.isConnected;
//...
```

## iOS

- :warning: this plugin is written in swift, so to use with in a Flutter/ObjC project, it seems to be needed to convert the project to "Current swift syntax" ( Edit/Convert/current swift syntax)  

## Android

- :warning: needs the `ACCESS_NETWORK_STATE` permission

## Todo 

- [ ] option to stream the status connection
