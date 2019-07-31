(ns org.apache.commons.math4.ode.FirstOrderDifferentialEquations
  "This interface represents a first order differential equations set.

  This interface should be implemented by all real first order
  differential equation problems before they can be handled by the
  integrators FirstOrderIntegrator.integrate(org.apache.commons.math4.ode.FirstOrderDifferentialEquations, double, double[], double, double[]) method.

  A first order differential equations problem, as seen by an
  integrator is the time derivative dY/dt of a state
  vector Y, both being one dimensional arrays. From the
  integrator point of view, this derivative depends only on the
  current time t and on the state vector
  Y.

  For real problems, the derivative depends also on parameters
  that do not belong to the state vector (dynamical model constants
  for example). These constants are completely outside of the scope
  of this interface, the classes that implement it are allowed to
  handle them as they want."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FirstOrderDifferentialEquations]))

(defn get-dimension
  "Get the dimension of the problem.

  returns: dimension of the problem - `int`"
  (^Integer [^FirstOrderDifferentialEquations this]
    (-> this (.getDimension))))

(defn compute-derivatives
  "Get the current time derivative of the state vector.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector - `double[]`
  y-dot - placeholder array where to put the time derivative of the state vector - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^FirstOrderDifferentialEquations this ^Double t y y-dot]
    (-> this (.computeDerivatives t y y-dot))))

