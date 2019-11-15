import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:fxpoi/fxpoi.dart';

void main() {
  const MethodChannel channel = MethodChannel('fxpoi');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await Fxpoi.platformVersion, '42');
  });
}
