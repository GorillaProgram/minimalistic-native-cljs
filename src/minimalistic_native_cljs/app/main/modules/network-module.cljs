(ns minimalistic-native-cljs.app.main.modules.network
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]
            [minimalistic-native-cljs.app.main.utilities.data.json-utility :refer [to-string]]))

(def network-module (.-NetworkModule native-modules))

(defn add-network-job
  "add network job"
  [url params success-callback failure-callback]
  (.addNetworkJob network-module url (to-string (clj->js params)) success-callback failure-callback))
