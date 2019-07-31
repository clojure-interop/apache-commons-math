(ns org.apache.commons.math4.ode.ExpandableStatefulODE
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
  (:import [org.apache.commons.math4.ode ExpandableStatefulODE]))

(defn ->expandable-stateful-ode
  "Constructor.

  Build an expandable set from its primary ODE set.

  primary - the primary set of differential equations to be integrated. - `org.apache.commons.math4.ode.FirstOrderDifferentialEquations`"
  (^ExpandableStatefulODE [^org.apache.commons.math4.ode.FirstOrderDifferentialEquations primary]
    (new ExpandableStatefulODE primary)))

(defn get-total-dimension
  "Return the dimension of the complete set of equations.

   The complete set of equations correspond to the primary set plus all secondary sets.

  returns: dimension of the complete set of equations - `int`"
  (^Integer [^ExpandableStatefulODE this]
    (-> this (.getTotalDimension))))

(defn get-primary
  "Get the primary set of differential equations.

  returns: primary set of differential equations - `org.apache.commons.math4.ode.FirstOrderDifferentialEquations`"
  (^org.apache.commons.math4.ode.FirstOrderDifferentialEquations [^ExpandableStatefulODE this]
    (-> this (.getPrimary))))

(defn set-time
  "Set current time.

  time - current time - `double`"
  ([^ExpandableStatefulODE this ^Double time]
    (-> this (.setTime time))))

(defn set-primary-state
  "Set primary part of the current state.

  primary-state - primary part of the current state - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the array does not match the primary set"
  ([^ExpandableStatefulODE this primary-state]
    (-> this (.setPrimaryState primary-state))))

(defn get-primary-state-dot
  "Get primary part of the current state derivative.

  returns: primary part of the current state derivative - `double[]`"
  ([^ExpandableStatefulODE this]
    (-> this (.getPrimaryStateDot))))

(defn get-complete-state
  "Get the complete current state.

  returns: complete current state - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the complete state does not match the complete equations sets dimension"
  ([^ExpandableStatefulODE this]
    (-> this (.getCompleteState))))

(defn get-primary-state
  "Get primary part of the current state.

  returns: primary part of the current state - `double[]`"
  ([^ExpandableStatefulODE this]
    (-> this (.getPrimaryState))))

(defn get-primary-mapper
  "Get an equations mapper for the primary equations set.

  returns: mapper for the primary set - `org.apache.commons.math4.ode.EquationsMapper`"
  (^org.apache.commons.math4.ode.EquationsMapper [^ExpandableStatefulODE this]
    (-> this (.getPrimaryMapper))))

(defn set-complete-state
  "Set the complete current state.

  complete-state - complete current state to copy data from - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the complete state does not match the complete equations sets dimension"
  ([^ExpandableStatefulODE this complete-state]
    (-> this (.setCompleteState complete-state))))

(defn get-secondary-mappers
  "Get the equations mappers for the secondary equations sets.

  returns: equations mappers for the secondary equations sets - `org.apache.commons.math4.ode.EquationsMapper[]`"
  ([^ExpandableStatefulODE this]
    (-> this (.getSecondaryMappers))))

(defn add-secondary-equations
  "Add a set of secondary equations to be integrated along with the primary set.

  secondary - secondary equations set - `org.apache.commons.math4.ode.SecondaryEquations`

  returns: index of the secondary equation in the expanded state - `int`"
  (^Integer [^ExpandableStatefulODE this ^org.apache.commons.math4.ode.SecondaryEquations secondary]
    (-> this (.addSecondaryEquations secondary))))

(defn get-secondary-state-dot
  "Get secondary part of the current state derivative.

  index - index of the part to set as returned by addSecondaryEquations(SecondaryEquations) - `int`

  returns: secondary part of the current state derivative - `double[]`"
  ([^ExpandableStatefulODE this ^Integer index]
    (-> this (.getSecondaryStateDot index))))

(defn get-secondary-state
  "Get secondary part of the current state.

  index - index of the part to set as returned by addSecondaryEquations(SecondaryEquations) - `int`

  returns: secondary part of the current state - `double[]`"
  ([^ExpandableStatefulODE this ^Integer index]
    (-> this (.getSecondaryState index))))

(defn set-secondary-state
  "Set secondary part of the current state.

  index - index of the part to set as returned by addSecondaryEquations(SecondaryEquations) - `int`
  secondary-state - secondary part of the current state - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the partial state does not match the selected equations set dimension"
  ([^ExpandableStatefulODE this ^Integer index secondary-state]
    (-> this (.setSecondaryState index secondary-state))))

(defn compute-derivatives
  "Get the current time derivative of the complete state vector.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the complete state vector - `double[]`
  y-dot - placeholder array where to put the time derivative of the complete state vector - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ExpandableStatefulODE this ^Double t y y-dot]
    (-> this (.computeDerivatives t y y-dot))))

(defn get-time
  "Get current time.

  returns: current time - `double`"
  (^Double [^ExpandableStatefulODE this]
    (-> this (.getTime))))

