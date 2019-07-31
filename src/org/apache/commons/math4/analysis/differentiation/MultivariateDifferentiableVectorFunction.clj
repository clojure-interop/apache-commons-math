(ns org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableVectorFunction
  "Extension of MultivariateVectorFunction representing a
  multivariate differentiable vectorial function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation MultivariateDifferentiableVectorFunction]))

(defn value
  "Compute the value for the function at the given point.

  point - point at which the function must be evaluated - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure[]`

  returns: function value for the given point - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure[]`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if point does not satisfy the function's constraints (wrong dimension, argument out of bound, or unsupported derivative order for example)"
  ([^MultivariateDifferentiableVectorFunction this point]
    (-> this (.value point))))

