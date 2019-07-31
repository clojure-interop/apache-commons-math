(ns org.apache.commons.math4.analysis.function.Atan2
  "Arc-tangent function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Atan2]))

(defn ->atan-2
  "Constructor."
  (^Atan2 []
    (new Atan2 )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Atan2 this ^Double x ^Double y]
    (-> this (.value x y))))

