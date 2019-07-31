(ns org.apache.commons.math4.analysis.function.Log
  "Natural logarithm function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Log]))

(defn ->log
  "Constructor."
  (^Log []
    (new Log )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Log this ^Double x]
    (-> this (.value x))))

