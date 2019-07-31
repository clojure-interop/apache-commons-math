(ns org.apache.commons.math4.analysis.MultivariateFunction
  "An interface representing a multivariate real function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis MultivariateFunction]))

(defn value
  "Compute the value for the function at the given point.

  point - Point at which the function must be evaluated. - `double[]`

  returns: the function value for the given point. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the parameter's dimension is wrong for the function being evaluated."
  (^Double [^MultivariateFunction this point]
    (-> this (.value point))))

