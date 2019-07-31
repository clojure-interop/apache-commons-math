(ns org.apache.commons.math4.ode.FirstOrderConverter
  "This class converts second order differential equations to first
  order ones.

  This class is a wrapper around a SecondOrderDifferentialEquations which allow to use a FirstOrderIntegrator to integrate it.

  The transformation is done by changing the n dimension state
  vector to a 2n dimension vector, where the first n components are
  the initial state variables and the n last components are their
  first time derivative. The first time derivative of this state
  vector then really contains both the first and second time
  derivative of the initial state vector, which can be handled by the
  underlying second order equations set.

  One should be aware that the data is duplicated during the
  transformation process and that for each call to computeDerivatives, this wrapper does copy 4n
  scalars : 2n before the call to computeSecondDerivatives in order to dispatch the y state vector
  into z and zDot, and 2n after the call to gather zDot and zDDot
  into yDot. Since the underlying problem by itself perhaps also
  needs to copy data and dispatch the arrays into domain objects,
  this has an impact on both memory and CPU usage. The only way to
  avoid this duplication is to perform the transformation at the
  problem level, i.e. to implement the problem as a first order one
  and then avoid using this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FirstOrderConverter]))

(defn ->first-order-converter
  "Constructor.

  Simple constructor.
   Build a converter around a second order equations set.

  equations - second order equations set to convert - `org.apache.commons.math4.ode.SecondOrderDifferentialEquations`"
  (^FirstOrderConverter [^org.apache.commons.math4.ode.SecondOrderDifferentialEquations equations]
    (new FirstOrderConverter equations)))

(defn get-dimension
  "Get the dimension of the problem.
   The dimension of the first order problem is twice the
   dimension of the underlying second order problem.

  returns: dimension of the problem - `int`"
  (^Integer [^FirstOrderConverter this]
    (-> this (.getDimension))))

(defn compute-derivatives
  "Get the current time derivative of the state vector.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector - `double[]`
  y-dot - placeholder array where to put the time derivative of the state vector - `double[]`"
  ([^FirstOrderConverter this ^Double t y y-dot]
    (-> this (.computeDerivatives t y y-dot))))

