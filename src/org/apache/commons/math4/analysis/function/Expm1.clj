(ns org.apache.commons.math4.analysis.function.Expm1
  "ex-1 function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Expm1]))

(defn ->expm-1
  "Constructor."
  (^Expm1 []
    (new Expm1 )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Expm1 this ^Double x]
    (-> this (.value x))))

