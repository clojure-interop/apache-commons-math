(ns org.apache.commons.math4.analysis.function.Constant
  "Constant function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Constant]))

(defn ->constant
  "Constructor.

  c - Constant. - `double`"
  (^Constant [^Double c]
    (new Constant c)))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Constant this ^Double x]
    (-> this (.value x))))

