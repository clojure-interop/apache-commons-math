(ns org.apache.commons.math4.analysis.function.Tanh
  "Hyperbolic tangent function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Tanh]))

(defn ->tanh
  "Constructor."
  (^Tanh []
    (new Tanh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Tanh this ^Double x]
    (-> this (.value x))))

