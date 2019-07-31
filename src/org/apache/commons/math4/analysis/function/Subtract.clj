(ns org.apache.commons.math4.analysis.function.Subtract
  "Subtract the second operand from the first."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Subtract]))

(defn ->subtract
  "Constructor."
  (^Subtract []
    (new Subtract )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Subtract this ^Double x ^Double y]
    (-> this (.value x y))))

