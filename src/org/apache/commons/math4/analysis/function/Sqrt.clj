(ns org.apache.commons.math4.analysis.function.Sqrt
  "Square-root function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sqrt]))

(defn ->sqrt
  "Constructor."
  (^Sqrt []
    (new Sqrt )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Sqrt this ^Double x]
    (-> this (.value x))))

