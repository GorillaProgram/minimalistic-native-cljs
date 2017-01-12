(ns minimalistic-native-cljs.app.core
  (:require [reagent.core :as r :refer [atom]]
            [re-frame.core :refer [subscribe dispatch dispatch-sync]]
            [minimalistic-native-cljs.app.main.modules.toast :refer [show-long-toast show-short-toast]]
            [minimalistic-native-cljs.app.main.modules.callback :refer [test-callback]]
            [minimalistic-native-cljs.app.dataflow.event.events]
            [minimalistic-native-cljs.app.dataflow.sub.subs]))

(def ReactNative (js/require "react-native"))

(def app-registry (.-AppRegistry ReactNative))
(def text (r/adapt-react-class (.-Text ReactNative)))
(def view (r/adapt-react-class (.-View ReactNative)))
(def image (r/adapt-react-class (.-Image ReactNative)))
(def touchable-highlight (r/adapt-react-class (.-TouchableHighlight ReactNative)))

(def logo-img (js/require "./images/cljs.png"))

(defn successCallback
  [message, actionType]
  (show-long-toast actionType)
  (.alert (.-Alert ReactNative) message))

(defn errorCallback
  [message, actionType]
  (show-long-toast actionType)
  (.alert (.-Alert ReactNative) message))

(defn handle-click [message]
  (test-callback message successCallback errorCallback))

(defn app-root-view []
  (let [greeting (subscribe [:get-greeting])]
    (fn []
      [view {:style {:flex-direction "column" :margin 40 :align-items "center"}}
       [text {:style {:font-size 30 :font-weight "100" :margin-bottom 20 :text-align "center"}} @greeting]
       [image {:source logo-img
               :style  {:width 80 :height 80 :margin-bottom 30}}]
       [touchable-highlight {:style {:background-color "#999" :padding 10 :border-radius 5}
                             :on-press #(handle-click "success")}
        [text {:style {:color "white" :text-align "center" :font-weight "bold"}} "Press Me"]]])))
