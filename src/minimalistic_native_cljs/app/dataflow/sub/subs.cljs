(ns bank-of-shanghai-minimalistic-pad-project.app.dataflow.sub.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  :get-greeting
  (fn [db _]
    (:greeting db)))
