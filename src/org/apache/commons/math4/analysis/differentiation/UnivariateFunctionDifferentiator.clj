(ns org.apache.commons.math4.analysis.differentiation.UnivariateFunctionDifferentiator
  "Interface defining the function differentiation operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation UnivariateFunctionDifferentiator]))

(defn differentiate
  "Create an implementation of a differential from a regular function.

  function - function to differentiate - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: differential function - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction`"
  (^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction [^UnivariateFunctionDifferentiator this ^org.apache.commons.math4.analysis.UnivariateFunction function]
    (-> this (.differentiate function))))

