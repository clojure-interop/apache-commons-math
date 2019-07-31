(ns org.apache.commons.math4.ode.SecondaryEquations
  "This interface allows users to add secondary differential equations to a primary
  set of differential equations.

  In some cases users may need to integrate some problem-specific equations along
  with a primary set of differential equations. One example is optimal control where
  adjoined parameters linked to the minimized hamiltonian must be integrated.


  This interface allows users to add such equations to a primary set of first order differential equations
  thanks to the ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations)
  method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode SecondaryEquations]))

(defn get-dimension
  "Get the dimension of the secondary state parameters.

  returns: dimension of the secondary state parameters - `int`"
  (^Integer [^SecondaryEquations this]
    (-> this (.getDimension))))

(defn compute-derivatives
  "Compute the derivatives related to the secondary state parameters.

  t - current value of the independent time variable - `double`
  primary - array containing the current value of the primary state vector - `double[]`
  primary-dot - array containing the derivative of the primary state vector - `double[]`
  secondary - array containing the current value of the secondary state vector - `double[]`
  secondary-dot - placeholder array where to put the derivative of the secondary state vector - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^SecondaryEquations this ^Double t primary primary-dot secondary secondary-dot]
    (-> this (.computeDerivatives t primary primary-dot secondary secondary-dot))))

