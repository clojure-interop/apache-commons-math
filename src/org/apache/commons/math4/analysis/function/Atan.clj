(ns org.apache.commons.math4.analysis.function.Atan
  "Arc-tangent function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Atan]))

(defn ->atan
  "Constructor."
  (^Atan []
    (new Atan )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Atan this ^Double x]
    (-> this (.value x))))

