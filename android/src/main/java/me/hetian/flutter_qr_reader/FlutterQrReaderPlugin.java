package me.hetian.flutter_qr_reader;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import java.io.File;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import me.hetian.flutter_qr_reader.factorys.QrReaderFactory;


/** FlutterQrReaderPlugin */
public class FlutterQrReaderPlugin implements MethodCallHandler {

//  private static final int REQUEST_CODE_CAMERA_PERMISSION = 3777;
  private static final String CHANNEL_NAME = "me.hetian.flutter_qr_reader";
  private static final String CHANNEL_VIEW_NAME = "me.hetian.flutter_qr_reader.reader_view";


  private  Registrar registrar;

  FlutterQrReaderPlugin(Registrar registrar) {
    this.registrar = registrar;
  }

//  private interface PermissionsResult {
//    void onSuccess();
//    void onError();
//  }

  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), CHANNEL_NAME);
    registrar.platformViewRegistry().registerViewFactory(CHANNEL_VIEW_NAME, new QrReaderFactory(registrar));
    final FlutterQrReaderPlugin instance = new FlutterQrReaderPlugin(registrar);
    channel.setMethodCallHandler(instance);
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    result.notImplemented();
  }
}
