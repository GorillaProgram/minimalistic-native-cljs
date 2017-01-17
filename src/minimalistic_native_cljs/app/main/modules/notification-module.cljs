(ns minimalistic-native-cljs.app.main.modules.notification
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def notification-module (.-NotificationModule native-modules))

(defn show-notification
  "show notification"
  [title message activityName]
  (.showNotification notification-module title message activityName))
