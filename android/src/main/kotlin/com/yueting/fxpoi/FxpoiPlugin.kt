package com.yueting.fxpoi

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

import com.yueting.fxpoi.excel.ExcelUtils

import org.json.JSONArray
import org.json.JSONStringer
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader

class FxpoiPlugin: MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "fxpoi")
      channel.setMethodCallHandler(FxpoiPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "getPlatformVersion") {
      result.success("Android ${android.os.Build.VERSION.RELEASE}")
    } else if (call.method == "readExcelCSVAll") {
      var excelPath: String? = call.argument("excelPath")
      var list = ExcelUtils.getInstance().readExcelCSV2List(excelPath!!)

      result.success(list)
    } else if (call.method == "readExcelCSVFirstRow") {
      var excelPath: String? = call.argument("excelPath")

      var list = ExcelUtils.getInstance().readExcelCSV2List(excelPath!!, 0, 0)
      result.success(list)
    } else if (call.method == "readExcelCSVByPage") {
      var excelPath: String? = call.argument("excelPath")
      var offset: Int? = call.argument("offset")
      var limit: Int? = call.argument("limit")

      var list = ExcelUtils.getInstance().readExcelCSV2List(excelPath!!, offset!!, limit!!)
      result.success(list)
    } else if (call.method == "getRowCount") {
      var excelPath: String? = call.argument("excelPath")
      var count = ExcelUtils.getInstance().getRowCount(excelPath!!)
      result.success(count)
    } else {
      result.notImplemented()
    }
  }
}