(ns org.apache.commons.math4.fraction.Fraction
  "Representation of a rational number.

  implements Serializable since 2.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction Fraction]))

(defn ->fraction
  "Constructor.

  Create a fraction given the double value and maximum error allowed.

   References:


   Continued Fraction equations (11) and (22)-(26)

  value - the double value to convert to a fraction. - `double`
  epsilon - maximum error allowed. The resulting fraction is within epsilon of value, in absolute terms. - `double`
  max-iterations - maximum number of convergents - `int`

  throws: org.apache.commons.math4.fraction.FractionConversionException - if the continued fraction failed to converge."
  (^Fraction [^Double value ^Double epsilon ^Integer max-iterations]
    (new Fraction value epsilon max-iterations))
  (^Fraction [^Double value ^Integer max-denominator]
    (new Fraction value max-denominator))
  (^Fraction [^Double value]
    (new Fraction value)))

(def *-two
  "Static Constant.

  A fraction representing \"2 / 1\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/TWO)

(def *-one
  "Static Constant.

  A fraction representing \"1\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ONE)

(def *-zero
  "Static Constant.

  A fraction representing \"0\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ZERO)

(def *-four-fifths
  "Static Constant.

  A fraction representing \"4/5\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/FOUR_FIFTHS)

(def *-one-fifth
  "Static Constant.

  A fraction representing \"1/5\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ONE_FIFTH)

(def *-one-half
  "Static Constant.

  A fraction representing \"1/2\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ONE_HALF)

(def *-one-quarter
  "Static Constant.

  A fraction representing \"1/4\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ONE_QUARTER)

(def *-one-third
  "Static Constant.

  A fraction representing \"1/3\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/ONE_THIRD)

(def *-three-fifths
  "Static Constant.

  A fraction representing \"3/5\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/THREE_FIFTHS)

(def *-three-quarters
  "Static Constant.

  A fraction representing \"3/4\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/THREE_QUARTERS)

(def *-two-fifths
  "Static Constant.

  A fraction representing \"2/5\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/TWO_FIFTHS)

(def *-two-quarters
  "Static Constant.

  A fraction representing \"2/4\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/TWO_QUARTERS)

(def *-two-thirds
  "Static Constant.

  A fraction representing \"2/3\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/TWO_THIRDS)

(def *-minus-one
  "Static Constant.

  A fraction representing \"-1 / 1\".

  type: org.apache.commons.math4.fraction.Fraction"
  Fraction/MINUS_ONE)

(defn *get-reduced-fraction
  "Creates a Fraction instance with the 2 parts
   of a fraction Y/Z.

   Any negative signs are resolved to be on the numerator.

  numerator - the numerator, for example the three in 'three sevenths' - `int`
  denominator - the denominator, for example the seven in 'three sevenths' - `int`

  returns: a new fraction instance, with the numerator and denominator reduced - `org.apache.commons.math4.fraction.Fraction`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the denominator is zero"
  (^org.apache.commons.math4.fraction.Fraction [^Integer numerator ^Integer denominator]
    (Fraction/getReducedFraction numerator denominator)))

(defn percentage-value
  "Gets the fraction percentage as a double. This calculates the
   fraction as the numerator divided by denominator multiplied by 100.

  returns: the fraction percentage as a double. - `double`"
  (^Double [^Fraction this]
    (-> this (.percentageValue))))

(defn double-value
  "Gets the fraction as a double. This calculates the fraction as
   the numerator divided by denominator.

  returns: the fraction as a double - `double`"
  (^Double [^Fraction this]
    (-> this (.doubleValue))))

(defn long-value
  "Gets the fraction as a long. This returns the whole number part
   of the fraction.

  returns: the whole number fraction part - `long`"
  (^Long [^Fraction this]
    (-> this (.longValue))))

(defn multiply
  "Multiplies the value of this fraction by another, returning the
   result in reduced form.

  fraction - the fraction to multiply by, must not be null - `org.apache.commons.math4.fraction.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.math4.fraction.Fraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the fraction is null"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this ^org.apache.commons.math4.fraction.Fraction fraction]
    (-> this (.multiply fraction))))

(defn negate
  "Return the additive inverse of this fraction.

  returns: the negation of this fraction. - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this]
    (-> this (.negate))))

(defn reciprocal
  "Return the multiplicative inverse of this fraction.

  returns: the reciprocal fraction - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this]
    (-> this (.reciprocal))))

(defn to-string
  "Returns the String representing this fraction, ie
   \"num / dem\" or just \"num\" if the denominator is one.

  returns: a string representation of the fraction. - `java.lang.String`"
  (^java.lang.String [^Fraction this]
    (-> this (.toString))))

(defn get-numerator
  "Access the numerator.

  returns: the numerator. - `int`"
  (^Integer [^Fraction this]
    (-> this (.getNumerator))))

(defn float-value
  "Gets the fraction as a float. This calculates the fraction as
   the numerator divided by denominator.

  returns: the fraction as a float - `float`"
  (^Float [^Fraction this]
    (-> this (.floatValue))))

(defn subtract
  "Subtracts the value of another fraction from the value of this one,
   returning the result in reduced form.

  fraction - the fraction to subtract, must not be null - `org.apache.commons.math4.fraction.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.math4.fraction.Fraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the fraction is null"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this ^org.apache.commons.math4.fraction.Fraction fraction]
    (-> this (.subtract fraction))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.fraction.FractionField`"
  (^org.apache.commons.math4.fraction.FractionField [^Fraction this]
    (-> this (.getField))))

(defn abs
  "Returns the absolute value of this fraction.

  returns: the absolute value. - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this]
    (-> this (.abs))))

(defn int-value
  "Gets the fraction as an int. This returns the whole number part
   of the fraction.

  returns: the whole number fraction part - `int`"
  (^Integer [^Fraction this]
    (-> this (.intValue))))

(defn divide
  "Divide the value of this fraction by another.

  fraction - the fraction to divide by, must not be null - `org.apache.commons.math4.fraction.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.math4.fraction.Fraction`

  throws: java.lang.IllegalArgumentException - if the fraction is null"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this ^org.apache.commons.math4.fraction.Fraction fraction]
    (-> this (.divide fraction))))

(defn hash-code
  "Gets a hashCode for the fraction.

  returns: a hash code value for this object - `int`"
  (^Integer [^Fraction this]
    (-> this (.hashCode))))

(defn add
  "Adds the value of this fraction to another, returning the result in reduced form.
   The algorithm follows Knuth, 4.5.1.

  fraction - the fraction to add, must not be null - `org.apache.commons.math4.fraction.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.math4.fraction.Fraction`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the fraction is null"
  (^org.apache.commons.math4.fraction.Fraction [^Fraction this ^org.apache.commons.math4.fraction.Fraction fraction]
    (-> this (.add fraction))))

(defn compare-to
  "Compares this object to another based on size.

  object - the object to compare to - `org.apache.commons.math4.fraction.Fraction`

  returns: -1 if this is less than object, 1 if this is greater
           than object, 0 if they are equal. - `int`"
  (^Integer [^Fraction this ^org.apache.commons.math4.fraction.Fraction object]
    (-> this (.compareTo object))))

(defn equals
  "Test for the equality of two fractions.  If the lowest term
   numerator and denominators are the same for both fractions, the two
   fractions are considered to be equal.

  other - fraction to test for equality to this fraction - `java.lang.Object`

  returns: true if two fractions are equal, false if object is
           null, not an instance of Fraction, or not equal
           to this fraction instance. - `boolean`"
  (^Boolean [^Fraction this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-denominator
  "Access the denominator.

  returns: the denominator. - `int`"
  (^Integer [^Fraction this]
    (-> this (.getDenominator))))

