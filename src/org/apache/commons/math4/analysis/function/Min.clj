(ns org.apache.commons.math4.analysis.function.Min
  "Minimum function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Min]))

(defn ->min
  "Constructor."
  (^Min []
    (new Min )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Min this ^Double x ^Double y]
    (-> this (.value x y))))

