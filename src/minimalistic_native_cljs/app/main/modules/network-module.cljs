(ns minimalistic-native-cljs.app.main.modules.network
  (:require [reagent.core :as r :refer [atom]]
            [cognitect.transit :as t]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]
            [minimalistic-native-cljs.app.main.utilities.data.json-utility :refer [to-json to-string]]))

(def network-module (.-NetworkModule native-modules))

(defn add-network-job
  "add network job"
  [url params success-callback failure-callback]
  (.addNetworkJob network-module
                  url
                  (to-string (clj->js params))
                  #(success-callback (js->clj (to-json %)))
                  #(failure-callback (js->clj (to-json %)))))

(def r (t/reader :json))
(def w (t/writer :json))
