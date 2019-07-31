(ns org.apache.commons.math4.ode.FieldSecondaryEquations
  "This interface allows users to add secondary differential equations to a primary
  set of differential equations.

  In some cases users may need to integrate some problem-specific equations along
  with a primary set of differential equations. One example is optimal control where
  adjoined parameters linked to the minimized Hamiltonian must be integrated.


  This interface allows users to add such equations to a primary set of first order differential equations
  thanks to the FieldExpandableODE.addSecondaryEquations(FieldSecondaryEquations)
  method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FieldSecondaryEquations]))

(defn get-dimension
  "Get the dimension of the secondary state parameters.

  returns: dimension of the secondary state parameters - `int`"
  (^Integer [^FieldSecondaryEquations this]
    (-> this (.getDimension))))

(defn init
  "Initialize equations at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the equations to initialize some internal data
   if needed.

  t-0 - value of the independent time variable at integration start - `T`
  primary-0 - array containing the value of the primary state vector at integration start - `T[]`
  secondary-0 - array containing the value of the secondary state vector at integration start - `T[]`
  final-time - target time for the integration - `T`"
  ([^FieldSecondaryEquations this t-0 primary-0 secondary-0 final-time]
    (-> this (.init t-0 primary-0 secondary-0 final-time))))

(defn compute-derivatives
  "Compute the derivatives related to the secondary state parameters.

  t - current value of the independent time variable - `T`
  primary - array containing the current value of the primary state vector - `T[]`
  primary-dot - array containing the derivative of the primary state vector - `T[]`
  secondary - array containing the current value of the secondary state vector - `T[]`

  returns: derivative of the secondary state vector - `T[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^FieldSecondaryEquations this t primary primary-dot secondary]
    (-> this (.computeDerivatives t primary primary-dot secondary))))

