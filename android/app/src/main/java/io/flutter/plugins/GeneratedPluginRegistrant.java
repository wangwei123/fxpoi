package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.yueting.fxpoi.FxpoiPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FxpoiPlugin.registerWith(registry.registrarFor("com.yueting.fxpoi.FxpoiPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
