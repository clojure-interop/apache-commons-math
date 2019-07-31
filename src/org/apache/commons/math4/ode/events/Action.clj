(ns org.apache.commons.math4.ode.events.Action
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.events Action]))

(def STOP
  "Enum Constant.

  Stop indicator.
   This value should be used as the return value of the eventOccurred method when the integration should be
   stopped after the event ending the current step.

  type: org.apache.commons.math4.ode.events.Action"
  Action/STOP)

(def RESET_STATE
  "Enum Constant.

  Reset state indicator.
   This value should be used as the return value of the eventOccurred} method when the integration should
   go on after the event ending the current step, with a new state
   vector (which will be retrieved thanks to the resetState
   method).

  type: org.apache.commons.math4.ode.events.Action"
  Action/RESET_STATE)

(def RESET_DERIVATIVES
  "Enum Constant.

  Reset derivatives indicator.
   This value should be used as the return value of the eventOccurred method when the integration should
   go on after the event ending the current step, with a new derivatives
   vector.

  type: org.apache.commons.math4.ode.events.Action"
  Action/RESET_DERIVATIVES)

(def CONTINUE
  "Enum Constant.

  Continue indicator.
   This value should be used as the return value of the eventOccurred method when the integration should go
   on after the event ending the current step.

  type: org.apache.commons.math4.ode.events.Action"
  Action/CONTINUE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Action c : Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ode.events.Action[]`"
  ([]
    (Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ode.events.Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ode.events.Action [^java.lang.String name]
    (Action/valueOf name)))

