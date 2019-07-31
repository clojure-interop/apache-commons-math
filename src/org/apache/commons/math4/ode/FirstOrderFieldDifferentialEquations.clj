(ns org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations
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
  (:import [org.apache.commons.math4.ode FirstOrderFieldDifferentialEquations]))

(defn get-dimension
  "Get the dimension of the problem.

  returns: dimension of the problem - `int`"
  (^Integer [^FirstOrderFieldDifferentialEquations this]
    (-> this (.getDimension))))

(defn init
  "Initialize equations at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the equations to initialize some internal data
   if needed.

  t-0 - value of the independent time variable at integration start - `T`
  y-0 - array containing the value of the state vector at integration start - `T[]`
  final-time - target time for the integration - `T`"
  ([^FirstOrderFieldDifferentialEquations this t-0 y-0 final-time]
    (-> this (.init t-0 y-0 final-time))))

(defn compute-derivatives
  "Get the current time derivative of the state vector.

  t - current value of the independent time variable - `T`
  y - array containing the current value of the state vector - `T[]`

  returns: time derivative of the state vector - `T[]`"
  ([^FirstOrderFieldDifferentialEquations this t y]
    (-> this (.computeDerivatives t y))))

