(ns org.apache.commons.math4.util.BigReal
  "Arbitrary precision decimal number.

  This class is a simple wrapper around the standard BigDecimal
  in order to implement the FieldElement interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util BigReal]))

(defn ->big-real
  "Constructor.

  Build an instance from a characters representation.

  in - character representation of the value - `char[]`
  offset - offset of the first character to analyze - `int`
  len - length of the array slice to analyze - `int`
  mc - context to use - `java.math.MathContext`"
  (^BigReal [in ^Integer offset ^Integer len ^java.math.MathContext mc]
    (new BigReal in offset len mc))
  (^BigReal [^java.math.BigInteger unscaled-val ^Integer scale ^java.math.MathContext mc]
    (new BigReal unscaled-val scale mc))
  (^BigReal [^java.math.BigInteger unscaled-val ^Integer scale]
    (new BigReal unscaled-val scale))
  (^BigReal [^java.math.BigDecimal val]
    (new BigReal val)))

(def *-zero
  "Static Constant.

  A big real representing 0.

  type: org.apache.commons.math4.util.BigReal"
  BigReal/ZERO)

(def *-one
  "Static Constant.

  A big real representing 1.

  type: org.apache.commons.math4.util.BigReal"
  BigReal/ONE)

(defn set-rounding-mode
  "Sets the rounding mode for decimal divisions.

  rounding-mode - rounding mode for decimal divisions - `java.math.RoundingMode`"
  ([^BigReal this ^java.math.RoundingMode rounding-mode]
    (-> this (.setRoundingMode rounding-mode))))

(defn double-value
  "Get the double value corresponding to the instance.

  returns: double value corresponding to the instance - `double`"
  (^Double [^BigReal this]
    (-> this (.doubleValue))))

(defn multiply
  "Compute this × a.

  a - element to multiply - `org.apache.commons.math4.util.BigReal`

  returns: a new element representing this × a - `org.apache.commons.math4.util.BigReal`"
  (^org.apache.commons.math4.util.BigReal [^BigReal this ^org.apache.commons.math4.util.BigReal a]
    (-> this (.multiply a))))

(defn big-decimal-value
  "Get the BigDecimal value corresponding to the instance.

  returns: BigDecimal value corresponding to the instance - `java.math.BigDecimal`"
  (^java.math.BigDecimal [^BigReal this]
    (-> this (.bigDecimalValue))))

(defn negate
  "Returns the additive inverse of this element.

  returns: the opposite of this. - `org.apache.commons.math4.util.BigReal`"
  (^org.apache.commons.math4.util.BigReal [^BigReal this]
    (-> this (.negate))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `org.apache.commons.math4.util.BigReal`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if this is zero"
  (^org.apache.commons.math4.util.BigReal [^BigReal this]
    (-> this (.reciprocal))))

(defn subtract
  "Compute this - a.

  a - element to subtract - `org.apache.commons.math4.util.BigReal`

  returns: a new element representing this - a - `org.apache.commons.math4.util.BigReal`"
  (^org.apache.commons.math4.util.BigReal [^BigReal this ^org.apache.commons.math4.util.BigReal a]
    (-> this (.subtract a))))

(defn get-scale
  "Sets the scale for division operations.
   The default is 64

  returns: the scale - `int`"
  (^Integer [^BigReal this]
    (-> this (.getScale))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.Field<org.apache.commons.math4.util.BigReal>`"
  (^org.apache.commons.math4.Field [^BigReal this]
    (-> this (.getField))))

(defn divide
  "Compute this ÷ a.

  a - element to divide by - `org.apache.commons.math4.util.BigReal`

  returns: a new element representing this ÷ a - `org.apache.commons.math4.util.BigReal`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if a is zero"
  (^org.apache.commons.math4.util.BigReal [^BigReal this ^org.apache.commons.math4.util.BigReal a]
    (-> this (.divide a))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BigReal this]
    (-> this (.hashCode))))

(defn add
  "Compute this  a.

  a - element to add - `org.apache.commons.math4.util.BigReal`

  returns: a new element representing this  a - `org.apache.commons.math4.util.BigReal`"
  (^org.apache.commons.math4.util.BigReal [^BigReal this ^org.apache.commons.math4.util.BigReal a]
    (-> this (.add a))))

(defn compare-to
  "a - `org.apache.commons.math4.util.BigReal`

  returns: `int`"
  (^Integer [^BigReal this ^org.apache.commons.math4.util.BigReal a]
    (-> this (.compareTo a))))

(defn set-scale
  "Sets the scale for division operations.

  scale - scale for division operations - `int`"
  ([^BigReal this ^Integer scale]
    (-> this (.setScale scale))))

(defn get-rounding-mode
  "Gets the rounding mode for division operations
   The default is RoundingMode.HALF_UP

  returns: the rounding mode. - `java.math.RoundingMode`"
  (^java.math.RoundingMode [^BigReal this]
    (-> this (.getRoundingMode))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BigReal this ^java.lang.Object other]
    (-> this (.equals other))))

