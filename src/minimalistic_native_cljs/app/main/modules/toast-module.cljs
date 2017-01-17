(ns minimalistic-native-cljs.app.main.modules.toast
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def toast-module (.-TestToastModule native-modules))

(defn show-toast
  "toast"
  [message duration]
  (.show toast-module message duration))

(defn show-long-toast
  "toast long time"
  [message]
  (show-toast message (.-LONG toast-module)))

(defn show-short-toast
  "toast short time"
  [message]
  (show-toast message (.-SHORT toast-module)))
