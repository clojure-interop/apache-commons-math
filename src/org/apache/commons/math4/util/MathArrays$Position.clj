(ns org.apache.commons.math4.util.MathArrays$Position
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MathArrays$Position]))

(def HEAD
  "Enum Constant.

  Designates the beginning of the array (near index 0).

  type: org.apache.commons.math4.util.MathArrays$Position"
  MathArrays$Position/HEAD)

(def TAIL
  "Enum Constant.

  Designates the end of the array.

  type: org.apache.commons.math4.util.MathArrays$Position"
  MathArrays$Position/TAIL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MathArrays.Position c : MathArrays.Position.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.util.MathArrays$Position[]`"
  ([]
    (MathArrays$Position/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.util.MathArrays$Position`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.util.MathArrays$Position [^java.lang.String name]
    (MathArrays$Position/valueOf name)))

