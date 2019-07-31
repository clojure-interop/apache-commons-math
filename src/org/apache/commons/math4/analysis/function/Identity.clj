(ns org.apache.commons.math4.analysis.function.Identity
  "Identity function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Identity]))

(defn ->identity
  "Constructor."
  (^Identity []
    (new Identity )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Identity this ^Double x]
    (-> this (.value x))))

