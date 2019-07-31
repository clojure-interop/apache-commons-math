(ns org.apache.commons.math4.analysis.MultivariateMatrixFunction
  "An interface representing a multivariate matrix function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis MultivariateMatrixFunction]))

(defn value
  "Compute the value for the function at the given point.

  point - point at which the function must be evaluated - `double[]`

  returns: function value for the given point - `double[][]`

  throws: java.lang.IllegalArgumentException - if point's dimension is wrong"
  ([^MultivariateMatrixFunction this point]
    (-> this (.value point))))

