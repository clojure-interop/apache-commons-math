(ns org.apache.commons.math4.analysis.function.Asin
  "Arc-sine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Asin]))

(defn ->asin
  "Constructor."
  (^Asin []
    (new Asin )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Asin this ^Double x]
    (-> this (.value x))))

