(ns minimalistic-native-cljs.app.main.modules.toast
    (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

(def native-modules (r/adapt-react-class (.-NativeModules ReactNative)))

(defn show-toast
  [message]
  (println native-modules))
