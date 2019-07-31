(ns org.apache.commons.math4.ode.SecondOrderDifferentialEquations
  "This interface represents a second order differential equations set.

  This interface should be implemented by all real second order
  differential equation problems before they can be handled by the
  integrators SecondOrderIntegrator.integrate(org.apache.commons.math4.ode.SecondOrderDifferentialEquations, double, double[], double[], double, double[], double[]) method.

  A second order differential equations problem, as seen by an
  integrator is the second time derivative d2Y/dt^2 of a
  state vector Y, both being one dimensional
  arrays. From the integrator point of view, this derivative depends
  only on the current time t, on the state vector
  Y and on the first time derivative of the state
  vector.

  For real problems, the derivative depends also on parameters
  that do not belong to the state vector (dynamical model constants
  for example). These constants are completely outside of the scope
  of this interface, the classes that implement it are allowed to
  handle them as they want."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode SecondOrderDifferentialEquations]))

(defn get-dimension
  "Get the dimension of the problem.

  returns: dimension of the problem - `int`"
  (^Integer [^SecondOrderDifferentialEquations this]
    (-> this (.getDimension))))

(defn compute-second-derivatives
  "Get the current time derivative of the state vector.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector - `double[]`
  y-dot - array containing the current value of the first derivative of the state vector - `double[]`
  y-d-dot - placeholder array where to put the second time derivative of the state vector - `double[]`"
  ([^SecondOrderDifferentialEquations this ^Double t y y-dot y-d-dot]
    (-> this (.computeSecondDerivatives t y y-dot y-d-dot))))

