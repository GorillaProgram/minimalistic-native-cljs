(ns bank-of-shanghai-minimalistic-pad-project.ios.core
  (:require
    [reagent.core :as r :refer [atom]]
    [re-frame.core :refer [subscribe dispatch dispatch-sync]]
    [bank-of-shanghai-minimalistic-pad-project.app.core :refer [app-root-view]]))

(def ReactNative (js/require "react-native"))
(def app-registry (.-AppRegistry ReactNative))

(defn app-root [] (app-root-view))

(defn init []
  (dispatch-sync [:initialize-db])
  (.registerComponent app-registry "MinimalisticNativeCljs" #(r/reactify-component app-root)))
