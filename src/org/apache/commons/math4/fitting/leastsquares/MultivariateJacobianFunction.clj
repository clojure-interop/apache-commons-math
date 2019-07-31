(ns org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction
  "A interface for functions that compute a vector of values and can compute their
  derivatives (Jacobian)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares MultivariateJacobianFunction]))

(defn value
  "Compute the function value and its Jacobian.

  point - the abscissae - `org.apache.commons.math4.linear.RealVector`

  returns: the values and their Jacobian of this vector valued function. - `org.apache.commons.math4.util.Pair<org.apache.commons.math4.linear.RealVector,org.apache.commons.math4.linear.RealMatrix>`"
  (^org.apache.commons.math4.util.Pair [^MultivariateJacobianFunction this ^org.apache.commons.math4.linear.RealVector point]
    (-> this (.value point))))

