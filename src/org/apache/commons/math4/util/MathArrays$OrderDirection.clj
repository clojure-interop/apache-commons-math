(ns org.apache.commons.math4.util.MathArrays$OrderDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MathArrays$OrderDirection]))

(def INCREASING
  "Enum Constant.

  Constant for increasing direction.

  type: org.apache.commons.math4.util.MathArrays$OrderDirection"
  MathArrays$OrderDirection/INCREASING)

(def DECREASING
  "Enum Constant.

  Constant for decreasing direction.

  type: org.apache.commons.math4.util.MathArrays$OrderDirection"
  MathArrays$OrderDirection/DECREASING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MathArrays.OrderDirection c : MathArrays.OrderDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.util.MathArrays$OrderDirection[]`"
  ([]
    (MathArrays$OrderDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.util.MathArrays$OrderDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.util.MathArrays$OrderDirection [^java.lang.String name]
    (MathArrays$OrderDirection/valueOf name)))

