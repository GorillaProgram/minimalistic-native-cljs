(ns minimalistic-native-cljs.app.main.modules.polling
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native :refer [native-modules]]))

(def polling-module (.-PollingModule native-modules))

(defn start-polling
  "start polling service"
  [service duration]
  (.startPolling polling-module service duration))

(defn stop-polling
  "stop polling service"
  [service]
  (.stopPolling polling-module service))
