(ns minimalistic-native-cljs.app.core
  (:require [reagent.core :as r :refer [atom]]
            [re-frame.core :refer [subscribe dispatch dispatch-sync]]
            [minimalistic-native-cljs.app.main.components.view.ui-components :refer [button simple-component text view image touchable-highlight show-alert]]
            [minimalistic-native-cljs.app.main.components.view.cacheable-image-view :refer []]
            [minimalistic-native-cljs.app.main.constant.image-path :refer [logo-img]]
            [minimalistic-native-cljs.app.main.constant.service-types :refer [polling-service]]
            [minimalistic-native-cljs.app.main.modules.toast :refer [show-long-toast show-short-toast]]
            [minimalistic-native-cljs.app.main.modules.notification :refer [show-notification]]
            [minimalistic-native-cljs.app.main.modules.callback :refer [test-callback]]
            [minimalistic-native-cljs.app.main.modules.jump-to-native :refer [to-activity]]
            [minimalistic-native-cljs.app.main.modules.polling :refer [start-polling stop-polling]]
            [minimalistic-native-cljs.app.main.utilities.data.json-utility :refer [to-string to-json]]
            [minimalistic-native-cljs.app.dataflow.event.events]
            [minimalistic-native-cljs.app.dataflow.sub.subs]))

(defn success-callback
  [message action-type]
  (start-polling polling-service 60)
  (dispatch [:set-greeting "Hello Native World!"]))
  ; (show-notification "new title" "new message" "com.framework.pages.activity.MessageActivity")
  ; (to-activity "com.framework.pages.activity.TestActivity" (to-string {:params "jump to native"}))
  ; (println (to-json {:params "jump to native"}))
  ; (show-long-toast action-type)
  ; (show-alert message)

(defn error-callback
  [message action-type]
  (show-long-toast action-type)
  (show-alert message))

(defn handle-press
  [message]
  (test-callback message success-callback error-callback))

(defn app-root-view []
  (let [greeting (subscribe [:get-greeting])]
    (fn []
      [view {:style {:flex-direction "column" :margin 40 :align-items "center"}}
       [text {:style {:font-size 30 :font-weight "100" :margin-bottom 20 :text-align "center"}} @greeting]
       [image {:source logo-img
               :style  {:width 80 :height 80 :margin-bottom 30}}]
       [button {:button-style {:background-color "#00f"}
                :text-style {:color "white"}
                :text "button ~"
                :on-press #(handle-press "success")}]
       [simple-component {:style {:background-color "#00f"}
                          :text "some message"}]])))
