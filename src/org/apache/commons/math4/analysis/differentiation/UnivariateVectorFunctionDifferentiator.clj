(ns org.apache.commons.math4.analysis.differentiation.UnivariateVectorFunctionDifferentiator
  "Interface defining the function differentiation operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation UnivariateVectorFunctionDifferentiator]))

(defn differentiate
  "Create an implementation of a differential from a regular vector function.

  function - function to differentiate - `org.apache.commons.math4.analysis.UnivariateVectorFunction`

  returns: differential function - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableVectorFunction`"
  (^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableVectorFunction [^UnivariateVectorFunctionDifferentiator this ^org.apache.commons.math4.analysis.UnivariateVectorFunction function]
    (-> this (.differentiate function))))

