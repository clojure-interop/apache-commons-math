(ns org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableFunction
  "Extension of MultivariateFunction representing a
  multivariate differentiable real function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation MultivariateDifferentiableFunction]))

(defn value
  "Compute the value for the function at the given point.

  point - Point at which the function must be evaluated. - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure[]`

  returns: the function value for the given point. - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if point does not satisfy the function's constraints (wrong dimension, argument out of bound, or unsupported derivative order for example)"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^MultivariateDifferentiableFunction this point]
    (-> this (.value point))))

