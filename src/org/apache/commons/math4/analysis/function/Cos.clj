(ns org.apache.commons.math4.analysis.function.Cos
  "Cosine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Cos]))

(defn ->cos
  "Constructor."
  (^Cos []
    (new Cos )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Cos this ^Double x]
    (-> this (.value x))))

