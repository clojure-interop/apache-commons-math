(ns org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableMatrixFunction
  "Extension of UnivariateMatrixFunction representing a univariate differentiable matrix function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation UnivariateDifferentiableMatrixFunction]))

(defn value
  "Compute the value for the function.

  x - the point for which the function value should be computed - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: the value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure[][]`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if x does not satisfy the function's constraints (argument out of bound, or unsupported derivative order for example)"
  ([^UnivariateDifferentiableMatrixFunction this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure x]
    (-> this (.value x))))

