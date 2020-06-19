#import "FlutterQrReaderPlugin.h"
#import "QrReaderViewController.h"

@implementation FlutterQrReaderPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
    // 注册原生视图
    QrReaderViewFactory *viewFactory = [[QrReaderViewFactory alloc] initWithRegistrar:registrar];
    [registrar registerViewFactory:viewFactory withId:@"me.hetian.flutter_qr_reader.reader_view"];
    
    FlutterMethodChannel* channel = [FlutterMethodChannel
                                     methodChannelWithName:@"me.hetian.flutter_qr_reader"
                                     binaryMessenger:[registrar messenger]];
    FlutterQrReaderPlugin* instance = [[FlutterQrReaderPlugin alloc] init];
    [registrar addMethodCallDelegate:instance channel:channel];
}

- (void)handleMethodCall:(FlutterMethodCall*)call result:(FlutterResult)result {
    result(FlutterMethodNotImplemented);
}

@end
