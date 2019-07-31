(ns org.apache.commons.math4.fraction.BigFraction
  "Representation of a rational number without any overflow. This class is
  immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction BigFraction]))

(defn ->big-fraction
  "Constructor.

  Create a fraction given the double value and maximum error allowed.

   References:


   Continued Fraction equations (11) and (22)-(26)

  value - the double value to convert to a fraction. - `double`
  epsilon - maximum error allowed. The resulting fraction is within epsilon of value, in absolute terms. - `double`
  max-iterations - maximum number of convergents. - `int`

  throws: org.apache.commons.math4.fraction.FractionConversionException - if the continued fraction failed to converge."
  (^BigFraction [^Double value ^Double epsilon ^Integer max-iterations]
    (new BigFraction value epsilon max-iterations))
  (^BigFraction [^java.math.BigInteger num ^java.math.BigInteger den]
    (new BigFraction num den))
  (^BigFraction [^java.math.BigInteger num]
    (new BigFraction num)))

(def *-two
  "Static Constant.

  A fraction representing \"2 / 1\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/TWO)

(def *-one
  "Static Constant.

  A fraction representing \"1\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ONE)

(def *-zero
  "Static Constant.

  A fraction representing \"0\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ZERO)

(def *-minus-one
  "Static Constant.

  A fraction representing \"-1 / 1\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/MINUS_ONE)

(def *-four-fifths
  "Static Constant.

  A fraction representing \"4/5\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/FOUR_FIFTHS)

(def *-one-fifth
  "Static Constant.

  A fraction representing \"1/5\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ONE_FIFTH)

(def *-one-half
  "Static Constant.

  A fraction representing \"1/2\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ONE_HALF)

(def *-one-quarter
  "Static Constant.

  A fraction representing \"1/4\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ONE_QUARTER)

(def *-one-third
  "Static Constant.

  A fraction representing \"1/3\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/ONE_THIRD)

(def *-three-fifths
  "Static Constant.

  A fraction representing \"3/5\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/THREE_FIFTHS)

(def *-three-quarters
  "Static Constant.

  A fraction representing \"3/4\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/THREE_QUARTERS)

(def *-two-fifths
  "Static Constant.

  A fraction representing \"2/5\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/TWO_FIFTHS)

(def *-two-quarters
  "Static Constant.

  A fraction representing \"2/4\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/TWO_QUARTERS)

(def *-two-thirds
  "Static Constant.

  A fraction representing \"2/3\".

  type: org.apache.commons.math4.fraction.BigFraction"
  BigFraction/TWO_THIRDS)

(defn *get-reduced-fraction
  "Creates a BigFraction instance with the 2 parts of a fraction
   Y/Z.



   Any negative signs are resolved to be on the numerator.

  numerator - the numerator, for example the three in 'three sevenths'. - `int`
  denominator - the denominator, for example the seven in 'three sevenths'. - `int`

  returns: a new fraction instance, with the numerator and denominator
           reduced. - `org.apache.commons.math4.fraction.BigFraction`

  throws: java.lang.ArithmeticException - if the denominator is zero."
  (^org.apache.commons.math4.fraction.BigFraction [^Integer numerator ^Integer denominator]
    (BigFraction/getReducedFraction numerator denominator)))

(defn percentage-value
  "Gets the fraction percentage as a double. This calculates the
   fraction as the numerator divided by denominator multiplied by 100.

  returns: the fraction percentage as a double. - `double`"
  (^Double [^BigFraction this]
    (-> this (.percentageValue))))

(defn get-numerator-as-int
  "Access the numerator as a int.

  returns: the numerator as a int. - `int`"
  (^Integer [^BigFraction this]
    (-> this (.getNumeratorAsInt))))

(defn double-value
  "Gets the fraction as a double. This calculates the fraction as
   the numerator divided by denominator.

  returns: the fraction as a double - `double`"
  (^Double [^BigFraction this]
    (-> this (.doubleValue))))

(defn get-numerator-as-long
  "Access the numerator as a long.

  returns: the numerator as a long. - `long`"
  (^Long [^BigFraction this]
    (-> this (.getNumeratorAsLong))))

(defn long-value
  "Gets the fraction as a long. This returns the whole number part
   of the fraction.

  returns: the whole number fraction part. - `long`"
  (^Long [^BigFraction this]
    (-> this (.longValue))))

(defn multiply
  "Multiplies the value of this fraction by the passed
   BigInteger, returning the result in reduced form.

  bg - the BigInteger to multiply by. - `java.math.BigInteger`

  returns: a BigFraction instance with the resulting values. - `org.apache.commons.math4.fraction.BigFraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if bg is null."
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this ^java.math.BigInteger bg]
    (-> this (.multiply bg))))

(defn big-decimal-value
  "Gets the fraction as a BigDecimal following the passed scale
   and rounding mode. This calculates the fraction as the numerator divided
   by denominator.

  scale - scale of the BigDecimal quotient to be returned. see BigDecimal for more information. - `int`
  rounding-mode - rounding mode to apply. see BigDecimal constants. - `int`

  returns: the fraction as a BigDecimal. - `java.math.BigDecimal`"
  (^java.math.BigDecimal [^BigFraction this ^Integer scale ^Integer rounding-mode]
    (-> this (.bigDecimalValue scale rounding-mode)))
  (^java.math.BigDecimal [^BigFraction this ^Integer rounding-mode]
    (-> this (.bigDecimalValue rounding-mode)))
  (^java.math.BigDecimal [^BigFraction this]
    (-> this (.bigDecimalValue))))

(defn negate
  "Return the additive inverse of this fraction, returning the result in
   reduced form.

  returns: the negation of this fraction. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this]
    (-> this (.negate))))

(defn reciprocal
  "Return the multiplicative inverse of this fraction.

  returns: the reciprocal fraction. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this]
    (-> this (.reciprocal))))

(defn pow
  "Returns a BigFraction whose value is
   (this<sup>exponent</sup>), returning the result in reduced form.

  exponent - exponent to which this BigFraction is to be raised. - `int`

  returns: thisexponent. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this ^Integer exponent]
    (-> this (.pow exponent))))

(defn to-string
  "Returns the String representing this fraction, ie
   \"num / dem\" or just \"num\" if the denominator is one.

  returns: a string representation of the fraction. - `java.lang.String`"
  (^java.lang.String [^BigFraction this]
    (-> this (.toString))))

(defn get-numerator
  "Access the numerator as a BigInteger.

  returns: the numerator as a BigInteger. - `java.math.BigInteger`"
  (^java.math.BigInteger [^BigFraction this]
    (-> this (.getNumerator))))

(defn float-value
  "Gets the fraction as a float. This calculates the fraction as
   the numerator divided by denominator.

  returns: the fraction as a float. - `float`"
  (^Float [^BigFraction this]
    (-> this (.floatValue))))

(defn subtract
  "Subtracts the value of an BigInteger from the value of this
   BigFraction, returning the result in reduced form.

  bg - the BigInteger to subtract, cannot be null. - `java.math.BigInteger`

  returns: a BigFraction instance with the resulting values. - `org.apache.commons.math4.fraction.BigFraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the BigInteger is null."
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this ^java.math.BigInteger bg]
    (-> this (.subtract bg))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.fraction.BigFractionField`"
  (^org.apache.commons.math4.fraction.BigFractionField [^BigFraction this]
    (-> this (.getField))))

(defn abs
  "Returns the absolute value of this BigFraction.

  returns: the absolute value as a BigFraction. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this]
    (-> this (.abs))))

(defn int-value
  "Gets the fraction as an int. This returns the whole number part
   of the fraction.

  returns: the whole number fraction part. - `int`"
  (^Integer [^BigFraction this]
    (-> this (.intValue))))

(defn get-denominator-as-long
  "Access the denominator as a long.

  returns: the denominator as a long. - `long`"
  (^Long [^BigFraction this]
    (-> this (.getDenominatorAsLong))))

(defn divide
  "Divide the value of this fraction by the passed BigInteger,
   ie this * 1 / bg, returning the result in reduced form.

  bg - the BigInteger to divide by, must not be null - `java.math.BigInteger`

  returns: a BigFraction instance with the resulting values - `org.apache.commons.math4.fraction.BigFraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the BigInteger is null"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this ^java.math.BigInteger bg]
    (-> this (.divide bg))))

(defn hash-code
  "Gets a hashCode for the fraction.

  returns: a hash code value for this object. - `int`"
  (^Integer [^BigFraction this]
    (-> this (.hashCode))))

(defn add
  "Adds the value of this fraction to the passed BigInteger,
   returning the result in reduced form.

  bg - the BigInteger to add, must'nt be null. - `java.math.BigInteger`

  returns: a BigFraction instance with the resulting values. - `org.apache.commons.math4.fraction.BigFraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the BigInteger is null."
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this ^java.math.BigInteger bg]
    (-> this (.add bg))))

(defn reduce
  "Reduce this BigFraction to its lowest terms.

  returns: the reduced BigFraction. It doesn't change anything if
           the fraction can be reduced. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFraction this]
    (-> this (.reduce))))

(defn compare-to
  "Compares this object to another based on size.

  object - the object to compare to, must not be null. - `org.apache.commons.math4.fraction.BigFraction`

  returns: -1 if this is less than object, 1 if this is greater
           than object, 0 if they are equal. - `int`"
  (^Integer [^BigFraction this ^org.apache.commons.math4.fraction.BigFraction object]
    (-> this (.compareTo object))))

(defn equals
  "Test for the equality of two fractions. If the lowest term numerator and
   denominators are the same for both fractions, the two fractions are
   considered to be equal.

  other - fraction to test for equality to this fraction, can be null. - `java.lang.Object`

  returns: true if two fractions are equal, false if object is
           null, not an instance of BigFraction, or not
           equal to this fraction instance. - `boolean`"
  (^Boolean [^BigFraction this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-denominator
  "Access the denominator as a BigInteger.

  returns: the denominator as a BigInteger. - `java.math.BigInteger`"
  (^java.math.BigInteger [^BigFraction this]
    (-> this (.getDenominator))))

(defn get-denominator-as-int
  "Access the denominator as a int.

  returns: the denominator as a int. - `int`"
  (^Integer [^BigFraction this]
    (-> this (.getDenominatorAsInt))))

