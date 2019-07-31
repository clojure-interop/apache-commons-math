(ns org.apache.commons.math4.analysis.function.Log10
  "Base 10 logarithm function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Log10]))

(defn ->log-10
  "Constructor."
  (^Log10 []
    (new Log10 )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Log10 this ^Double x]
    (-> this (.value x))))

