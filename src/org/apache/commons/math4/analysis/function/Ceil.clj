(ns org.apache.commons.math4.analysis.function.Ceil
  "ceil function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Ceil]))

(defn ->ceil
  "Constructor."
  (^Ceil []
    (new Ceil )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Ceil this ^Double x]
    (-> this (.value x))))

