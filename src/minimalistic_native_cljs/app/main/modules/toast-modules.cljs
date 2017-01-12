(ns minimalistic-native-cljs.app.main.modules.toast
    (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

(def native-modules (.-NativeModules ReactNative))

(defn show-toast
  [message]
  (.show (.-TestToastModule native-modules) message (.-LONG (.-TestToastModule native-modules))))
