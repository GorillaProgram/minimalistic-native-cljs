(ns minimalistic-native-cljs.app.main.modules.network
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def network-module (.-NetworkModule native-modules))