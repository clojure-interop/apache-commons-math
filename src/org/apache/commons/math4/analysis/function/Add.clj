(ns org.apache.commons.math4.analysis.function.Add
  "Add the two operands."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Add]))

(defn ->add
  "Constructor."
  (^Add []
    (new Add )))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^Add this ^Double x ^Double y]
    (-> this (.value x y))))

