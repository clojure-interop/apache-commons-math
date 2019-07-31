(ns org.apache.commons.math4.analysis.TrivariateFunction
  "An interface representing a trivariate real function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis TrivariateFunction]))

(defn value
  "Compute the value for the function.

  x - x-coordinate for which the function value should be computed. - `double`
  y - y-coordinate for which the function value should be computed. - `double`
  z - z-coordinate for which the function value should be computed. - `double`

  returns: the value. - `double`"
  (^Double [^TrivariateFunction this ^Double x ^Double y ^Double z]
    (-> this (.value x y z))))

