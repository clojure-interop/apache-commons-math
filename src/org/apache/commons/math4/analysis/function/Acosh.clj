(ns org.apache.commons.math4.analysis.function.Acosh
  "Hyperbolic arc-cosine function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Acosh]))

(defn ->acosh
  "Constructor."
  (^Acosh []
    (new Acosh )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Acosh this ^Double x]
    (-> this (.value x))))

