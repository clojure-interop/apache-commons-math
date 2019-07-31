(ns org.apache.commons.math4.optim.nonlinear.scalar.GoalType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar GoalType]))

(def MAXIMIZE
  "Enum Constant.

  Maximization.

  type: org.apache.commons.math4.optim.nonlinear.scalar.GoalType"
  GoalType/MAXIMIZE)

(def MINIMIZE
  "Enum Constant.

  Minimization.

  type: org.apache.commons.math4.optim.nonlinear.scalar.GoalType"
  GoalType/MINIMIZE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GoalType c : GoalType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.optim.nonlinear.scalar.GoalType[]`"
  ([]
    (GoalType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.optim.nonlinear.scalar.GoalType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.optim.nonlinear.scalar.GoalType [^java.lang.String name]
    (GoalType/valueOf name)))

