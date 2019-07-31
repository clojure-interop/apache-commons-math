(ns org.apache.commons.math4.optim.linear.PivotSelectionRule
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear PivotSelectionRule]))

(def DANTZIG
  "Enum Constant.

  The classical rule, the variable with the most negative coefficient
   in the objective function row will be chosen as entering variable.

  type: org.apache.commons.math4.optim.linear.PivotSelectionRule"
  PivotSelectionRule/DANTZIG)

(def BLAND
  "Enum Constant.

  The first variable with a negative coefficient in the objective function
   row will be chosen as entering variable. This rule guarantees to prevent
   cycles, but may take longer to find an optimal solution.

  type: org.apache.commons.math4.optim.linear.PivotSelectionRule"
  PivotSelectionRule/BLAND)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PivotSelectionRule c : PivotSelectionRule.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.optim.linear.PivotSelectionRule[]`"
  ([]
    (PivotSelectionRule/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.optim.linear.PivotSelectionRule`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.optim.linear.PivotSelectionRule [^java.lang.String name]
    (PivotSelectionRule/valueOf name)))

