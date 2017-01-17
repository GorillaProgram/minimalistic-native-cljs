(ns minimalistic-native-cljs.app.main.modules.jump-to-native
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def jump-to-native-module (.-TestJumpToNativeModule native-modules))

(defn to-activity
  "jump to native activity"
  [activityName params]
  (println jump-to-native-module)
  (.jumpToNative jump-to-native-module activityName params))
