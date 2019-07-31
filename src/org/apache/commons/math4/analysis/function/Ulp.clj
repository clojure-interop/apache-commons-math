(ns org.apache.commons.math4.analysis.function.Ulp
  "ulp function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Ulp]))

(defn ->ulp
  "Constructor."
  (^Ulp []
    (new Ulp )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Ulp this ^Double x]
    (-> this (.value x))))

