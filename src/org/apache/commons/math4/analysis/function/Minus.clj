(ns org.apache.commons.math4.analysis.function.Minus
  "Minus function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Minus]))

(defn ->minus
  "Constructor."
  (^Minus []
    (new Minus )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Minus this ^Double x]
    (-> this (.value x))))

