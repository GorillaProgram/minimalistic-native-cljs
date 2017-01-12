(ns minimalistic-native-cljs.app.main.modules.toast
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def toast-modules (.-TestToastModule native-modules))

(defn show-toast
  "toast"
  [message duration]
  (.show toast-modules message duration))

(defn show-long-toast
  "toast long time"
  [message]
  (show-toast message (.-LONG toast-modules)))

(defn show-short-toast
  "toast short time"
  [message]
  (show-toast message (.-SHORT toast-modules)))
