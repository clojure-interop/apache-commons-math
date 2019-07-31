(ns org.apache.commons.math4.analysis.function.Atanh
  "Hyperbolic arc-tangent function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Atanh]))

(defn ->atanh
  "Constructor."
  (^Atanh []
    (new Atanh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Atanh this ^Double x]
    (-> this (.value x))))

