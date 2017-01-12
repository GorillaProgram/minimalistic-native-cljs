(ns minimalistic-native-cljs.app.main.modules.native
    (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

(def native-modules
    (.-NativeModules ReactNative))
