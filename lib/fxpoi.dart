import 'dart:async';

import 'package:flutter/services.dart';

class Fxpoi {
  static const MethodChannel _channel = const MethodChannel('fxpoi');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<int> getRowCount(String excelPath) async {
    var result = await _channel
        .invokeMethod<int>('getRowCount', {"excelPath": excelPath});
    return result;
  }

  static Future<List> readExcelAll(String excelPath) async {
    var result = await _channel
        .invokeMethod<List>('readExcelCSVAll', {"excelPath": excelPath});
    return result;
  }

  static Future<List> readExcelCSVByPage(
      String excelPath, int offset, int limit) async {
    var result = await _channel.invokeMethod<List>('readExcelCSVByPage',
        {"excelPath": excelPath, "offset": offset, "limit": limit});
    return result;
  }

  static Future<List> readExcelOneLine(String excelPath) async {
    var result = await _channel
        .invokeMethod<List>('readExcelOneLine', {"excelPath": excelPath});
    return result;
  }
}
