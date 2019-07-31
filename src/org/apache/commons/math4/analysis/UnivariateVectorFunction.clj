(ns org.apache.commons.math4.analysis.UnivariateVectorFunction
  "An interface representing a univariate vectorial function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis UnivariateVectorFunction]))

(defn value
  "Compute the value for the function.

  x - the point for which the function value should be computed - `double`

  returns: the value - `double[]`"
  ([^UnivariateVectorFunction this ^Double x]
    (-> this (.value x))))

