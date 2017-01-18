(ns minimalistic-native-cljs.app.main.modules.ui-module
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def ui-module (.-UIModule native-modules))
