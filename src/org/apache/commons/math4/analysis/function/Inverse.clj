(ns org.apache.commons.math4.analysis.function.Inverse
  "Inverse function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Inverse]))

(defn ->inverse
  "Constructor."
  (^Inverse []
    (new Inverse )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Inverse this ^Double x]
    (-> this (.value x))))

