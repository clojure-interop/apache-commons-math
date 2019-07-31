(ns org.apache.commons.math4.ode.MainStateJacobianProvider
  "Interface expanding first order
   differential equations in order to compute exactly the main state jacobian
   matrix for partial derivatives equations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode MainStateJacobianProvider]))

(defn compute-main-state-jacobian
  "Compute the jacobian matrix of ODE with respect to main state.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the main state vector - `double[]`
  y-dot - array containing the current value of the time derivative of the main state vector - `double[]`
  d-fd-y - placeholder array where to put the jacobian matrix of the ODE w.r.t. the main state vector - `double[][]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^MainStateJacobianProvider this ^Double t y y-dot d-fd-y]
    (-> this (.computeMainStateJacobian t y y-dot d-fd-y))))

