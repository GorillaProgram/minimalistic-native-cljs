(ns minimalistic-native-cljs.app.main.utilities.data.json-utility)

(defn to-string
  [params]
  (.stringify js/JSON params))

(defn to-json
  [params]
  (.parse js/JSON params))
