(ns minimalistic-native-cljs.app.main.modules.toast
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def ReactNative (js/require "react-native"))

(def toast-modules (.-TestToastModule native-modules))

(defn show-toast
  [message duration]
  (.show toast-modules message duration))

(defn show-long-toast
  "toast long time"
  [message]
  (show-toast (.-LONG toast-modules)))

(defn show-short-toast
  "toast short time"
  [message]
  (show-toast (.-SHORT toast-modules)))
