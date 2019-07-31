(ns org.apache.commons.math4.analysis.function.Tan
  "Tangent function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Tan]))

(defn ->tan
  "Constructor."
  (^Tan []
    (new Tan )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Tan this ^Double x]
    (-> this (.value x))))

