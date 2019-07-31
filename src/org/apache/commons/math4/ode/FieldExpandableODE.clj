(ns org.apache.commons.math4.ode.FieldExpandableODE
  "This class represents a combined set of first order differential equations,
  with at least a primary set of equations expandable by some sets of secondary
  equations.

  One typical use case is the computation of the Jacobian matrix for some ODE.
  In this case, the primary set of equations corresponds to the raw ODE, and we
  add to this set another bunch of secondary equations which represent the Jacobian
  matrix of the primary set.


  We want the integrator to use only the primary set to estimate the
  errors and hence the step sizes. It should not use the secondary
  equations in this computation. The integrator will
  be able to know where the primary set ends and so where the secondary sets begin."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FieldExpandableODE]))

(defn ->field-expandable-ode
  "Constructor.

  Build an expandable set from its primary ODE set.

  primary - the primary set of differential equations to be integrated. - `org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations`"
  (^FieldExpandableODE [^org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations primary]
    (new FieldExpandableODE primary)))

(defn get-mapper
  "Get the mapper for the set of equations.

  returns: mapper for the set of equations - `org.apache.commons.math4.ode.FieldEquationsMapper<T>`"
  (^org.apache.commons.math4.ode.FieldEquationsMapper [^FieldExpandableODE this]
    (-> this (.getMapper))))

(defn add-secondary-equations
  "Add a set of secondary equations to be integrated along with the primary set.

  secondary - secondary equations set - `org.apache.commons.math4.ode.FieldSecondaryEquations`

  returns: index of the secondary equation in the expanded state, to be used
   as the parameter to FieldODEState.getSecondaryState(int) and
   FieldODEStateAndDerivative.getSecondaryDerivative(int) (beware index
   0 corresponds to main state, additional states start at 1) - `int`"
  (^Integer [^FieldExpandableODE this ^org.apache.commons.math4.ode.FieldSecondaryEquations secondary]
    (-> this (.addSecondaryEquations secondary))))

(defn init
  "Initialize equations at the start of an ODE integration.

  t-0 - value of the independent time variable at integration start - `T`
  y-0 - array containing the value of the state vector at integration start - `T[]`
  final-time - target time for the integration - `T`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^FieldExpandableODE this t-0 y-0 final-time]
    (-> this (.init t-0 y-0 final-time))))

(defn compute-derivatives
  "Get the current time derivative of the complete state vector.

  t - current value of the independent time variable - `T`
  y - array containing the current value of the complete state vector - `T[]`

  returns: time derivative of the complete state vector - `T[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^FieldExpandableODE this t y]
    (-> this (.computeDerivatives t y))))

