(ns org.apache.commons.math4.fitting.leastsquares.ValueAndJacobianFunction
  "A interface for functions that compute a vector of values and can compute their
  derivatives (Jacobian)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares ValueAndJacobianFunction]))

(defn compute-value
  "Compute the value.

  params - Point. - `double[]`

  returns: the value at the given point. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ValueAndJacobianFunction this params]
    (-> this (.computeValue params))))

(defn compute-jacobian
  "Compute the Jacobian.

  params - Point. - `double[]`

  returns: the Jacobian at the given point. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ValueAndJacobianFunction this params]
    (-> this (.computeJacobian params))))

