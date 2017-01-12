(ns minimalistic-native-cljs.app.main.modules.toast
    (:require [reagent.core :as r :refer [atom]]
        [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def ReactNative (js/require "react-native"))

(def toast-modules (.-TestToastModule native-modules))

(defn show-toast
  [message]
  (.show toast-modules message (.-LONG toast-modules)))
