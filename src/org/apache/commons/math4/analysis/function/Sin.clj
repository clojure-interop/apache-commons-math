(ns org.apache.commons.math4.analysis.function.Sin
  "Sine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sin]))

(defn ->sin
  "Constructor."
  (^Sin []
    (new Sin )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Sin this ^Double x]
    (-> this (.value x))))

