(ns org.apache.commons.math4.analysis.function.Log1p
  "log(1  p) function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Log1p]))

(defn ->log-1p
  "Constructor."
  (^Log1p []
    (new Log1p )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Log1p this ^Double x]
    (-> this (.value x))))

