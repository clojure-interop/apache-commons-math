(ns org.apache.commons.math4.analysis.function.Floor
  "floor function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Floor]))

(defn ->floor
  "Constructor."
  (^Floor []
    (new Floor )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Floor this ^Double x]
    (-> this (.value x))))

