(ns minimalistic-native-cljs.app.main.modules.native-modules)

(def ReactNative (js/require "react-native"))

(def native-modules
  (.-NativeModules ReactNative))
