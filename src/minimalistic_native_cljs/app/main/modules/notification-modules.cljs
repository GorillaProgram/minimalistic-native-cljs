(ns minimalistic-native-cljs.app.main.modules.notification
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def notification-modules (.-NotificationModule native-modules))

(defn show-notification
  "show notification"
  [title message]
  (.showNotification notification-modules title message))
