(ns minimalistic-native-cljs.app.main.components.view.cacheable-image-view
  (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

(def require-native-component (r/adapt-react-class (.-requireNativeComponent ReactNative)))
