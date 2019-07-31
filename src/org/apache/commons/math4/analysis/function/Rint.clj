(ns org.apache.commons.math4.analysis.function.Rint
  "rint function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Rint]))

(defn ->rint
  "Constructor."
  (^Rint []
    (new Rint )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Rint this ^Double x]
    (-> this (.value x))))

