(ns org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util ResizableDoubleArray$ExpansionMode]))

(def MULTIPLICATIVE
  "Enum Constant.

  Multiplicative expansion mode.

  type: org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode"
  ResizableDoubleArray$ExpansionMode/MULTIPLICATIVE)

(def ADDITIVE
  "Enum Constant.

  Additive expansion mode.

  type: org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode"
  ResizableDoubleArray$ExpansionMode/ADDITIVE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ResizableDoubleArray.ExpansionMode c : ResizableDoubleArray.ExpansionMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode[]`"
  ([]
    (ResizableDoubleArray$ExpansionMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode [^java.lang.String name]
    (ResizableDoubleArray$ExpansionMode/valueOf name)))

