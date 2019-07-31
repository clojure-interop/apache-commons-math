(ns org.apache.commons.math4.analysis.MultivariateVectorFunction
  "An interface representing a multivariate vectorial function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis MultivariateVectorFunction]))

(defn value
  "Compute the value for the function at the given point.

  point - point at which the function must be evaluated - `double[]`

  returns: function value for the given point - `double[]`

  throws: java.lang.IllegalArgumentException - if point's dimension is wrong"
  ([^MultivariateVectorFunction this point]
    (-> this (.value point))))

