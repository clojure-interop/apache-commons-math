(ns org.apache.commons.math4.analysis.function.Cosh
  "Hyperbolic cosine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Cosh]))

(defn ->cosh
  "Constructor."
  (^Cosh []
    (new Cosh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Cosh this ^Double x]
    (-> this (.value x))))

