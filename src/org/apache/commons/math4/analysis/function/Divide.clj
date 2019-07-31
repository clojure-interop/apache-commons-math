(ns org.apache.commons.math4.analysis.function.Divide
  "Divide the first operand by the second."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Divide]))

(defn ->divide
  "Constructor."
  (^Divide []
    (new Divide )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Divide this ^Double x ^Double y]
    (-> this (.value x y))))

