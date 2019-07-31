(ns org.apache.commons.math4.analysis.differentiation.GradientFunction
  "Class representing the gradient of a multivariate function.

  The vectorial components of the function represent the derivatives
  with respect to each function parameters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation GradientFunction]))

(defn ->gradient-function
  "Constructor.

  Simple constructor.

  f - underlying real-valued function - `org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableFunction`"
  (^GradientFunction [^org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableFunction f]
    (new GradientFunction f)))

(defn value
  "Compute the value for the function at the given point.

  point - point at which the function must be evaluated - `double[]`

  returns: function value for the given point - `double[]`"
  ([^GradientFunction this point]
    (-> this (.value point))))

