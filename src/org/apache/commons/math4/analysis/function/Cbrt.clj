(ns org.apache.commons.math4.analysis.function.Cbrt
  "Cube root function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Cbrt]))

(defn ->cbrt
  "Constructor."
  (^Cbrt []
    (new Cbrt )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Cbrt this ^Double x]
    (-> this (.value x))))

