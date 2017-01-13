(ns minimalistic-native-cljs.app.main.constant.image-path
  (:require [reagent.core :as r :refer [atom]]))

(def logo-img (js/require "./images/cljs.png"))
