# flutter_qr_reader

QR code (scan code &#x2F; picture) recognition （AndroidView&#x2F;UiKitView）

## DEMO

![demo](https://github.com/hetian9288/flutter_qr_reader/blob/master/Screenshot_20190608-153849.jpg?raw=true)

![demo](https://github.com/hetian9288/flutter_qr_reader/blob/master/ezgif-3-7c8bfe5fd68a.gif?raw=true)

## Getting Started

``` dart
import 'package:flutter_qr_reader/flutter_qr_reader.dart';


// 嵌入视图
QrReaderView(
  width: 320,
  height: 350,
  callback: (container) {},
)
// 打开手电筒
..setFlashlight
// 开始扫码
..startCamera
// 结束扫码
..stopCamera
```

### For IOS
Opt-in to the embedded views preview by adding a boolean property to the app's Info.plist file with the key io.flutter.embedded_views_preview and the value YES.

	<key>io.flutter.embedded_views_preview</key>
	<string>YES</string>

And you will need provide the description of camera's permission to work properly, otherwise will crash your app.
``` 
  <key>NSCameraUsageDescription</key>
	<string>The porpuse explaining why you will use the camera</string>
```
