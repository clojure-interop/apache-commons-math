(ns org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction
  "Interface for univariate functions derivatives.
  This interface represents a simple function which computes
  both the value and the first derivative of a mathematical function.
  The derivative is computed with respect to the input variable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation UnivariateDifferentiableFunction]))

(defn value
  "Simple mathematical function.
   UnivariateDifferentiableFunction classes compute both the
   value and the first derivative of the function.

  t - function input value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: function result - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if t is inconsistent with the function's free parameters or order"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^UnivariateDifferentiableFunction this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure t]
    (-> this (.value t))))

