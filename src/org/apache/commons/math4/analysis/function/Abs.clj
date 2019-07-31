(ns org.apache.commons.math4.analysis.function.Abs
  "Absolute value function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Abs]))

(defn ->abs
  "Constructor."
  (^Abs []
    (new Abs )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Abs this ^Double x]
    (-> this (.value x))))

