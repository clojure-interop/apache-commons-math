(ns org.apache.commons.math4.transform.TransformType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform TransformType]))

(def FORWARD
  "Enum Constant.

  The type to be specified for forward transforms.

  type: org.apache.commons.math4.transform.TransformType"
  TransformType/FORWARD)

(def INVERSE
  "Enum Constant.

  The type to be specified for inverse transforms.

  type: org.apache.commons.math4.transform.TransformType"
  TransformType/INVERSE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TransformType c : TransformType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.transform.TransformType[]`"
  ([]
    (TransformType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.transform.TransformType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.transform.TransformType [^java.lang.String name]
    (TransformType/valueOf name)))

