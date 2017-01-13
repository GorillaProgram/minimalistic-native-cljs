(ns minimalistic-native-cljs.app.main.modules.jump-to-native
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def jump-to-native-modules (.-TestJumpToNativeModule native-modules))

(defn to-activity
  "jump to native activity"
  [activityName params]
  (println jump-to-native-modules)
  (.jumpToNative jump-to-native-modules activityName params))
