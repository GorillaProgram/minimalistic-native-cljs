(ns minimalistic-native-cljs.app.main.components.view.ui-components
  (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

(def app-registry (.-AppRegistry ReactNative))
(def text (r/adapt-react-class (.-Text ReactNative)))
(def view (r/adapt-react-class (.-View ReactNative)))
(def image (r/adapt-react-class (.-Image ReactNative)))
(def touchable-highlight (r/adapt-react-class (.-TouchableHighlight ReactNative)))

(defn show-alert
  [message]
  (.alert (.-Alert ReactNative) message))

(defn simple-component [style message]
  [view {:style {:flex-direction "column" :margin 40 :align-items "center"}}
   [text {:style {:font-size 30 :font-weight "100" :margin-bottom 20 :text-align "center"}} (message :text)]])
