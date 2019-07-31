(ns org.apache.commons.math4.ode.ParameterJacobianProvider
  "Interface to compute exactly Jacobian matrix for some parameter
   when computing partial derivatives equations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode ParameterJacobianProvider]))

(defn compute-parameter-jacobian
  "Compute the Jacobian matrix of ODE with respect to one parameter.
   If the parameter does not belong to the collection returned by
   Parameterizable.getParametersNames(), the Jacobian will be set to 0,
   but no errors will be triggered.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the main state vector - `double[]`
  y-dot - array containing the current value of the time derivative of the main state vector - `double[]`
  param-name - name of the parameter to consider - `java.lang.String`
  d-fd-p - placeholder array where to put the Jacobian matrix of the ODE with respect to the parameter - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ParameterJacobianProvider this ^Double t y y-dot ^java.lang.String param-name d-fd-p]
    (-> this (.computeParameterJacobian t y y-dot param-name d-fd-p))))

