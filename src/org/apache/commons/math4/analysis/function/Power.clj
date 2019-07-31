(ns org.apache.commons.math4.analysis.function.Power
  "Power function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Power]))

(defn ->power
  "Constructor.

  p - Power. - `double`"
  (^Power [^Double p]
    (new Power p)))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Power this ^Double x]
    (-> this (.value x))))

