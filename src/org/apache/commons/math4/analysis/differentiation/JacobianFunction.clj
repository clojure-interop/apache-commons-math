(ns org.apache.commons.math4.analysis.differentiation.JacobianFunction
  "Class representing the Jacobian of a multivariate vector function.

  The rows iterate on the model functions while the columns iterate on the parameters; thus,
  the numbers of rows is equal to the dimension of the underlying function vector
  value and the number of columns is equal to the number of free parameters of
  the underlying function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation JacobianFunction]))

(defn ->jacobian-function
  "Constructor.

  Simple constructor.

  f - underlying vector-valued function - `org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableVectorFunction`"
  (^JacobianFunction [^org.apache.commons.math4.analysis.differentiation.MultivariateDifferentiableVectorFunction f]
    (new JacobianFunction f)))

(defn value
  "Compute the value for the function at the given point.

  point - point at which the function must be evaluated - `double[]`

  returns: function value for the given point - `double[][]`"
  ([^JacobianFunction this point]
    (-> this (.value point))))

