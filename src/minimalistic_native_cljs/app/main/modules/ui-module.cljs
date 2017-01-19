(ns minimalistic-native-cljs.app.main.modules.ui-module
  (:require [reagent.core :as r :refer [atom]]
            [minimalistic-native-cljs.app.main.modules.native-modules :refer [native-modules]]))

(def ui-module (.-UIModule native-modules))

(defn show-loading
  "show loading view"
  []
  (.showLoading ui-module))

(defn show-message-loading
  "show message loading view"
  [message]
  (.showLoadingWithMessage ui-module message))

(defn show-uncancelable-loading
  "show uncancelable loading view"
  []
  (.showLoadingCouldCancelable ui-module false))

(defn show-uncancelable-message-loading
  "show uncancelable message loading view"
  [message]
  (.showLoadingCouldCancelableWithMessage ui-module false message))

(defn dismiss-loading
  "dismiss loading view"
  []
  (.dismissLoading ui-module))
