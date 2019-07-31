(ns org.apache.commons.math4.ode.FieldODEState
  "Container for time, main and secondary state vectors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FieldODEState]))

(defn ->field-ode-state
  "Constructor.

  Simple constructor.

  time - time - `T`
  state - state at time - `T[]`
  secondary-state - state at time (may be null) - `T[][]`"
  (^FieldODEState [time state secondary-state]
    (new FieldODEState time state secondary-state))
  (^FieldODEState [time state]
    (new FieldODEState time state)))

(defn get-time
  "Get time.

  returns: time - `T`"
  ([^FieldODEState this]
    (-> this (.getTime))))

(defn get-state-dimension
  "Get main state dimension.

  returns: main state dimension - `int`"
  (^Integer [^FieldODEState this]
    (-> this (.getStateDimension))))

(defn get-state
  "Get main state at time.

  returns: main state at time - `T[]`"
  ([^FieldODEState this]
    (-> this (.getState))))

(defn get-number-of-secondary-states
  "Get the number of secondary states.

  returns: number of secondary states. - `int`"
  (^Integer [^FieldODEState this]
    (-> this (.getNumberOfSecondaryStates))))

(defn get-secondary-state-dimension
  "Get secondary state dimension.

  index - index of the secondary set as returned by FieldExpandableODE.addSecondaryEquations(FieldSecondaryEquations) (beware index 0 corresponds to main state, additional states start at 1) - `int`

  returns: secondary state dimension - `int`"
  (^Integer [^FieldODEState this ^Integer index]
    (-> this (.getSecondaryStateDimension index))))

(defn get-secondary-state
  "Get secondary state at time.

  index - index of the secondary set as returned by FieldExpandableODE.addSecondaryEquations(FieldSecondaryEquations) (beware index 0 corresponds to main state, additional states start at 1) - `int`

  returns: secondary state at time - `T[]`"
  ([^FieldODEState this ^Integer index]
    (-> this (.getSecondaryState index))))

