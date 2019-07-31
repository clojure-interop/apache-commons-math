(ns org.apache.commons.math4.analysis.function.Acos
  "Arc-cosine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Acos]))

(defn ->acos
  "Constructor."
  (^Acos []
    (new Acos )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Acos this ^Double x]
    (-> this (.value x))))

