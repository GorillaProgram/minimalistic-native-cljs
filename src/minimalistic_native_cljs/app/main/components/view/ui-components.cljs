(ns minimalistic-native-cljs.app.main.components.view.ui-components
  (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))

; ============================== Common components start ====================================
(def app-registry (.-AppRegistry ReactNative))
(def text (r/adapt-react-class (.-Text ReactNative)))
(def view (r/adapt-react-class (.-View ReactNative)))
(def image (r/adapt-react-class (.-Image ReactNative)))
(def picker (r/adapt-react-class (.-Picker ReactNative)))
(def picker-item (r/adapt-react-class (.-Picker.Item ReactNative)))
(def list-view (r/adapt-react-class (.-ListView ReactNative)))
(def scroll-view (r/adapt-react-class (.-ScrollView ReactNative)))
(def input (r/adapt-react-class (.-TextInput ReactNative)))
(def touchable-highlight (r/adapt-react-class (.-TouchableHighlight ReactNative)))
(def navigator (r/adapt-react-class (.-Navigator ReactNative)))
; ============================== Common components end ====================================

(defn show-alert
  [message]
  (.alert (.-Alert ReactNative) message))

(defn simple-component
  [params]
  [view {:style {:flex-direction "column" :margin 40 :align-items "center"}}
   [text {:style {:font-size 30 :font-weight "100" :margin-bottom 20 :text-align "center"}} (params :text)]])
