(ns minimalistic-native-cljs.app.main.modules.callback
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def callback-module (.-TestCallbackModule native-modules))

(defn test-callback
  [action-type success-callback error-callback]
  (.callbackByActionType callback-module action-type success-callback error-callback))
