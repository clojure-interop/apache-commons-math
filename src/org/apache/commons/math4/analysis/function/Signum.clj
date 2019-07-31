(ns org.apache.commons.math4.analysis.function.Signum
  "signum function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Signum]))

(defn ->signum
  "Constructor."
  (^Signum []
    (new Signum )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Signum this ^Double x]
    (-> this (.value x))))

