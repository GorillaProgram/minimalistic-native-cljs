(ns minimalistic-native-cljs.app.main.modules.db
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def db-module (.-DBModule native-modules))
