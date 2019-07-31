(ns org.apache.commons.math4.ode.events.FilterType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.events FilterType]))

(def TRIGGER_ONLY_DECREASING_EVENTS
  "Enum Constant.

  Constant for triggering only decreasing events.
   When this filter is used, the wrapped event handler eventOccurred method will be called only with
   its increasing argument set to false.

  type: org.apache.commons.math4.ode.events.FilterType"
  FilterType/TRIGGER_ONLY_DECREASING_EVENTS)

(def TRIGGER_ONLY_INCREASING_EVENTS
  "Enum Constant.

  Constant for triggering only increasing events.
   When this filter is used, the wrapped event handler eventOccurred method will be called only with
   its increasing argument set to true.

  type: org.apache.commons.math4.ode.events.FilterType"
  FilterType/TRIGGER_ONLY_INCREASING_EVENTS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FilterType c : FilterType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ode.events.FilterType[]`"
  ([]
    (FilterType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ode.events.FilterType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ode.events.FilterType [^java.lang.String name]
    (FilterType/valueOf name)))

