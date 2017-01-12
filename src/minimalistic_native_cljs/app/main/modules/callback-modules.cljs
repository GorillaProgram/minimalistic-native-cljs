
(ns minimalistic-native-cljs.app.main.modules.callback
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def callback-modules (.-TestCallbackModule native-modules))

(defn test-callback
  [actionType successCallback errorCallback]
  (.callbackByActionType callback-modules actionType successCallback errorCallback))
