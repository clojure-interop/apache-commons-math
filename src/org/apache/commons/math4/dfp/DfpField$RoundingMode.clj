(ns org.apache.commons.math4.dfp.DfpField$RoundingMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.dfp DfpField$RoundingMode]))

(def ROUND_DOWN
  "Enum Constant.

  Rounds toward zero (truncation).

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_DOWN)

(def ROUND_UP
  "Enum Constant.

  Rounds away from zero if discarded digit is non-zero.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_UP)

(def ROUND_HALF_UP
  "Enum Constant.

  Rounds towards nearest unless both are equidistant in which case it rounds away from zero.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_HALF_UP)

(def ROUND_HALF_DOWN
  "Enum Constant.

  Rounds towards nearest unless both are equidistant in which case it rounds toward zero.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_HALF_DOWN)

(def ROUND_HALF_EVEN
  "Enum Constant.

  Rounds towards nearest unless both are equidistant in which case it rounds toward the even neighbor.
   This is the default as  specified by IEEE 854-1987

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_HALF_EVEN)

(def ROUND_HALF_ODD
  "Enum Constant.

  Rounds towards nearest unless both are equidistant in which case it rounds toward the odd neighbor.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_HALF_ODD)

(def ROUND_CEIL
  "Enum Constant.

  Rounds towards positive infinity.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_CEIL)

(def ROUND_FLOOR
  "Enum Constant.

  Rounds towards negative infinity.

  type: org.apache.commons.math4.dfp.DfpField$RoundingMode"
  DfpField$RoundingMode/ROUND_FLOOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DfpField.RoundingMode c : DfpField.RoundingMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.dfp.DfpField$RoundingMode[]`"
  ([]
    (DfpField$RoundingMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.dfp.DfpField$RoundingMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.dfp.DfpField$RoundingMode [^java.lang.String name]
    (DfpField$RoundingMode/valueOf name)))

