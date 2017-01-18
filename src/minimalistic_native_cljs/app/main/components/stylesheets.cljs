(ns minimalistic-native-cljs.app.main.components.stylesheets)

; See
; https://github.com/Trustroots/trustroots/blob/master/modules/core/client/less/global-variables.less
(def primary-color      "#12b591") ;; Trustroots Green
(def primary-color-dark "#0f9779") ;; Trustroots Dark Green
(def secondary-color    "#cd771b") ;; Trustroots Brown"
(def body-bg            "#f9f9f9")
(def brand-gradient-from        "#19e6df")
(def brand-gradient-to          "#e0a70e")

(def styles
  {:app       {:position            "absolute"
               :top                 0
               :left                0
               :bottom              0
               :right               0}
   :page      {:background-color    body-bg
               :flex                1}

   :statusbar {:background-color "#01579B"
               :height           26}
   :toolbar   {:position         "relative"
               :background-color "#01579B"}
   :pages     {:login {:field     {}}}

   :scenes    {:main  {:view      {:align-items    "stretch"
                                   :padding-top    4
                                   :padding-bottom 4}}
               :about {:view            {:padding 16}
                       :title           {:font-weight   "bold"
                                         :margin-bottom 4}
                       :author          {:margin-top    4
                                         :margin-bottom 20}}}})
