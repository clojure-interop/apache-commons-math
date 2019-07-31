(ns org.apache.commons.math4.analysis.differentiation.UnivariateMatrixFunctionDifferentiator
  "Interface defining the function differentiation operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation UnivariateMatrixFunctionDifferentiator]))

(defn differentiate
  "Create an implementation of a differential from a regular matrix function.

  function - function to differentiate - `org.apache.commons.math4.analysis.UnivariateMatrixFunction`

  returns: differential function - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableMatrixFunction`"
  (^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableMatrixFunction [^UnivariateMatrixFunctionDifferentiator this ^org.apache.commons.math4.analysis.UnivariateMatrixFunction function]
    (-> this (.differentiate function))))

