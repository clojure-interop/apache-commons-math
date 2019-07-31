(ns org.apache.commons.math4.analysis.UnivariateMatrixFunction
  "An interface representing a univariate matrix function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis UnivariateMatrixFunction]))

(defn value
  "Compute the value for the function.

  x - the point for which the function value should be computed - `double`

  returns: the value - `double[][]`"
  ([^UnivariateMatrixFunction this ^Double x]
    (-> this (.value x))))

