(ns org.apache.commons.math4.geometry.partitioning.Side
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Side]))

(def PLUS
  "Enum Constant.

  Code for the plus side of the hyperplane.

  type: org.apache.commons.math4.geometry.partitioning.Side"
  Side/PLUS)

(def MINUS
  "Enum Constant.

  Code for the minus side of the hyperplane.

  type: org.apache.commons.math4.geometry.partitioning.Side"
  Side/MINUS)

(def BOTH
  "Enum Constant.

  Code for elements crossing the hyperplane from plus to minus side.

  type: org.apache.commons.math4.geometry.partitioning.Side"
  Side/BOTH)

(def HYPER
  "Enum Constant.

  Code for the hyperplane itself.

  type: org.apache.commons.math4.geometry.partitioning.Side"
  Side/HYPER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Side c : Side.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.geometry.partitioning.Side[]`"
  ([]
    (Side/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.geometry.partitioning.Side`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.geometry.partitioning.Side [^java.lang.String name]
    (Side/valueOf name)))

