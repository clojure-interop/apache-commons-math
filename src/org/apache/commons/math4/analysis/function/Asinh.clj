(ns org.apache.commons.math4.analysis.function.Asinh
  "Hyperbolic arc-sine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Asinh]))

(defn ->asinh
  "Constructor."
  (^Asinh []
    (new Asinh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Asinh this ^Double x]
    (-> this (.value x))))

