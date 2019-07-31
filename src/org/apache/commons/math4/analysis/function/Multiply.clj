(ns org.apache.commons.math4.analysis.function.Multiply
  "Multiply the two operands."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Multiply]))

(defn ->multiply
  "Constructor."
  (^Multiply []
    (new Multiply )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Multiply this ^Double x ^Double y]
    (-> this (.value x y))))

