(ns org.apache.commons.math4.ode.FieldODEStateAndDerivative
  "Container for time, main and secondary state vectors as well as their derivatives."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FieldODEStateAndDerivative]))

(defn ->field-ode-state-and-derivative
  "Constructor.

  Simple constructor.

  time - time - `T`
  state - state at time - `T[]`
  derivative - derivative of the state at time - `T[]`
  secondary-state - state at time (may be null) - `T[][]`
  secondary-derivative - derivative of the state at time (may be null) - `T[][]`"
  (^FieldODEStateAndDerivative [time state derivative secondary-state secondary-derivative]
    (new FieldODEStateAndDerivative time state derivative secondary-state secondary-derivative))
  (^FieldODEStateAndDerivative [time state derivative]
    (new FieldODEStateAndDerivative time state derivative)))

(defn get-derivative
  "Get derivative of the main state at time.

  returns: derivative of the main state at time - `T[]`"
  ([^FieldODEStateAndDerivative this]
    (-> this (.getDerivative))))

(defn get-secondary-derivative
  "Get derivative of the secondary state at time.

  index - index of the secondary set as returned by FieldExpandableODE.addSecondaryEquations(FieldSecondaryEquations) (beware index 0 corresponds to main state, additional states start at 1) - `int`

  returns: derivative of the secondary state at time - `T[]`"
  ([^FieldODEStateAndDerivative this ^Integer index]
    (-> this (.getSecondaryDerivative index))))

