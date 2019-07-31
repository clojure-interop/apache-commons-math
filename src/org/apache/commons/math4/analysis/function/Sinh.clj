(ns org.apache.commons.math4.analysis.function.Sinh
  "Hyperbolic sine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sinh]))

(defn ->sinh
  "Constructor."
  (^Sinh []
    (new Sinh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Sinh this ^Double x]
    (-> this (.value x))))

