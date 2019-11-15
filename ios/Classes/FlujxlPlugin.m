#import "FxpoiPlugin.h"
#import <fxpoi/fxpoi-Swift.h>

@implementation FxpoiPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFxpoiPlugin registerWithRegistrar:registrar];
}
@end
