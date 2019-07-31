(ns org.apache.commons.math4.analysis.function.Exp
  "Exponential function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Exp]))

(defn ->exp
  "Constructor."
  (^Exp []
    (new Exp )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Exp this ^Double x]
    (-> this (.value x))))

