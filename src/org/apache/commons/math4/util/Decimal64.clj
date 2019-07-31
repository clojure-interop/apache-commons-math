(ns org.apache.commons.math4.util.Decimal64
  "This class wraps a double value in an object. It is similar to the
  standard class Double, while also implementing the
  RealFieldElement interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Decimal64]))

(defn ->decimal-64
  "Constructor.

  Creates a new instance of this class.

  x - the primitive double value of the object to be created - `double`"
  (^Decimal64 [^Double x]
    (new Decimal64 x)))

(def *-zero
  "Static Constant.

  The constant value of 0d as a Decimal64.

  type: org.apache.commons.math4.util.Decimal64"
  Decimal64/ZERO)

(def *-one
  "Static Constant.

  The constant value of 1d as a Decimal64.

  type: org.apache.commons.math4.util.Decimal64"
  Decimal64/ONE)

(def *-negative-infinity
  "Static Constant.

  The constant value of Double.NEGATIVE_INFINITY as a
   Decimal64.

  type: org.apache.commons.math4.util.Decimal64"
  Decimal64/NEGATIVE_INFINITY)

(def *-positive-infinity
  "Static Constant.

  The constant value of Double.POSITIVE_INFINITY as a
   Decimal64.

  type: org.apache.commons.math4.util.Decimal64"
  Decimal64/POSITIVE_INFINITY)

(def *-nan
  "Static Constant.

  The constant value of Double.NaN as a Decimal64.

  type: org.apache.commons.math4.util.Decimal64"
  Decimal64/NAN)

(defn floor
  "Get the largest whole number smaller than instance.

  returns: floor(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.floor))))

(defn log-1p
  "Shifted natural logarithm.

  returns: logarithm of one plus the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.log1p))))

(defn ceil
  "Get the smallest whole number larger than instance.

  returns: ceil(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.ceil))))

(defn cosh
  "Hyperbolic cosine operation.

  returns: cosh(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.cosh))))

(defn short-value
  "The current implementation performs casting to a short.

  returns: `short`"
  (^Short [^Decimal64 this]
    (-> this (.shortValue))))

(defn double-value
  "returns: `double`"
  (^Double [^Decimal64 this]
    (-> this (.doubleValue))))

(defn long-value
  "The current implementation performs casting to a long.

  returns: `long`"
  (^Long [^Decimal64 this]
    (-> this (.longValue))))

(defn multiply
  "Compute this × a.

   The current implementation strictly enforces
   this.multiply(a).equals(new Decimal64(this.doubleValue()
   * a.doubleValue())).

  a - element to multiply - `org.apache.commons.math4.util.Decimal64`

  returns: a new element representing this × a - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a]
    (-> this (.multiply a))))

(defn root-n
  "Nth root.

  n - order of the root - `int`

  returns: nth root of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^Integer n]
    (-> this (.rootN n))))

(defn atan-2
  "Two arguments arc tangent operation.

  x - second argument of the arc tangent - `org.apache.commons.math4.util.Decimal64`

  returns: atan2(this, x) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 x]
    (-> this (.atan2 x))))

(defn negate
  "Returns the additive inverse of this element.

   The current implementation strictly enforces
   this.negate().equals(new Decimal64(-this.doubleValue())).

  returns: the opposite of this. - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.negate))))

(defn cbrt
  "Cubic root.

  returns: cubic root of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.cbrt))))

(defn byte-value
  "The current implementation performs casting to a byte.

  returns: `byte`"
  (^Byte [^Decimal64 this]
    (-> this (.byteValue))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

   The current implementation strictly enforces
   this.reciprocal().equals(new Decimal64(1.0
   / this.doubleValue())).

  returns: the inverse of this. - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.reciprocal))))

(defn pow
  "Power operation.

  p - power to apply - `double`

  returns: thisp - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^Double p]
    (-> this (.pow p))))

(defn copy-sign
  "Returns the instance with the sign of the argument.
   A NaN sign argument is treated as positive.

  sign - the sign for the returned value - `org.apache.commons.math4.util.Decimal64`

  returns: the instance with the same sign as the sign argument - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 sign]
    (-> this (.copySign sign))))

(defn to-string
  "The returned String is equal to
   Double.toString(this.doubleValue())

  returns: `java.lang.String`"
  (^java.lang.String [^Decimal64 this]
    (-> this (.toString))))

(defn atan
  "Arc tangent operation.

  returns: atan(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.atan))))

(defn log
  "Natural logarithm.

  returns: logarithm of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.log))))

(defn acosh
  "Inverse hyperbolic cosine operation.

  returns: acosh(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.acosh))))

(defn sin
  "Sine operation.

  returns: sin(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.sin))))

(defn scalb
  "Multiply the instance by a power of 2.

  n - power of 2 - `int`

  returns: this × 2n - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^Integer n]
    (-> this (.scalb n))))

(defn infinite?
  "Returns true if this double precision number is infinite
   (Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY).

  returns: true if this number is infinite - `boolean`"
  (^Boolean [^Decimal64 this]
    (-> this (.isInfinite))))

(defn hypot
  "Returns the hypotenuse of a triangle with sides this and y
   - sqrt(this2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  y - a value - `org.apache.commons.math4.util.Decimal64`

  returns: sqrt(this2 y2) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 y]
    (-> this (.hypot y))))

(defn float-value
  "The current implementation performs casting to a float.

  returns: `float`"
  (^Float [^Decimal64 this]
    (-> this (.floatValue))))

(defn remainder
  "IEEE remainder operator.

  a - right hand side parameter of the operator - `double`

  returns: this - n × a where n is the closest integer to this/a
   (the even integer is chosen for n if this/a is halfway between two integers) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^Double a]
    (-> this (.remainder a))))

(defn exp
  "Exponential.

  returns: exponential of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.exp))))

(defn subtract
  "Compute this - a.

   The current implementation strictly enforces
   this.subtract(a).equals(new Decimal64(this.doubleValue()
   - a.doubleValue())).

  a - element to subtract - `org.apache.commons.math4.util.Decimal64`

  returns: a new element representing this - a - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a]
    (-> this (.subtract a))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.Field<org.apache.commons.math4.util.Decimal64>`"
  (^org.apache.commons.math4.Field [^Decimal64 this]
    (-> this (.getField))))

(defn log-10
  "Base 10 logarithm.

  returns: base 10 logarithm of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.log10))))

(defn sqrt
  "Square root.

  returns: square root of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.sqrt))))

(defn tan
  "Tangent operation.

  returns: tan(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.tan))))

(defn cos
  "Cosine operation.

  returns: cos(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.cos))))

(defn get-real
  "Get the real value of the number.

  returns: real value - `double`"
  (^Double [^Decimal64 this]
    (-> this (.getReal))))

(defn abs
  "absolute value.

  returns: abs(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.abs))))

(defn na-n?
  "Returns true if this double precision number is
   Not-a-Number (NaN), false otherwise.

  returns: true if this is NaN - `boolean`"
  (^Boolean [^Decimal64 this]
    (-> this (.isNaN))))

(defn int-value
  "The current implementation performs casting to a int.

  returns: `int`"
  (^Integer [^Decimal64 this]
    (-> this (.intValue))))

(defn expm-1
  "Exponential minus 1.

  returns: exponential minus one of the instance - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.expm1))))

(defn divide
  "Compute this ÷ a.

   The current implementation strictly enforces
   this.divide(a).equals(new Decimal64(this.doubleValue()
   / a.doubleValue())).

  a - element to divide by - `org.apache.commons.math4.util.Decimal64`

  returns: a new element representing this ÷ a - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a]
    (-> this (.divide a))))

(defn hash-code
  "The current implementation returns the same value as
   new Double(this.doubleValue()).hashCode()

  returns: `int`"
  (^Integer [^Decimal64 this]
    (-> this (.hashCode))))

(defn add
  "Compute this  a.

   The current implementation strictly enforces
   this.add(a).equals(new Decimal64(this.doubleValue()
    a.doubleValue())).

  a - element to add - `org.apache.commons.math4.util.Decimal64`

  returns: a new element representing this  a - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a]
    (-> this (.add a))))

(defn atanh
  "Inverse hyperbolic  tangent operation.

  returns: atanh(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.atanh))))

(defn compare-to
  "The current implementation returns the same value as
    new Double(this.doubleValue()).compareTo(new
   Double(o.doubleValue()))

  o - `org.apache.commons.math4.util.Decimal64`

  returns: `int`"
  (^Integer [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 o]
    (-> this (.compareTo o))))

(defn sinh
  "Hyperbolic sine operation.

  returns: sinh(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.sinh))))

(defn asinh
  "Inverse hyperbolic sine operation.

  returns: asin(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.asinh))))

(defn round
  "Get the closest long to instance value.

  returns: closest long to RealFieldElement.getReal() - `long`"
  (^Long [^Decimal64 this]
    (-> this (.round))))

(defn asin
  "Arc sine operation.

  returns: asin(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.asin))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Decimal64 this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn tanh
  "Hyperbolic tangent operation.

  returns: tanh(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.tanh))))

(defn rint
  "Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.

  returns: a double number r such that r is an integer r - 0.5 ≤ this ≤ r  0.5 - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.rint))))

(defn signum
  "Compute the signum of the instance.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.signum))))

(defn linear-combination
  "Compute a linear combination.

  a-1 - first factor of the first term - `org.apache.commons.math4.util.Decimal64`
  b-1 - second factor of the first term - `org.apache.commons.math4.util.Decimal64`
  a-2 - first factor of the second term - `org.apache.commons.math4.util.Decimal64`
  b-2 - second factor of the second term - `org.apache.commons.math4.util.Decimal64`
  a-3 - first factor of the third term - `org.apache.commons.math4.util.Decimal64`
  b-3 - second factor of the third term - `org.apache.commons.math4.util.Decimal64`
  a-4 - first factor of the third term - `org.apache.commons.math4.util.Decimal64`
  b-4 - second factor of the third term - `org.apache.commons.math4.util.Decimal64`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a-1 ^org.apache.commons.math4.util.Decimal64 b-1 ^org.apache.commons.math4.util.Decimal64 a-2 ^org.apache.commons.math4.util.Decimal64 b-2 ^org.apache.commons.math4.util.Decimal64 a-3 ^org.apache.commons.math4.util.Decimal64 b-3 ^org.apache.commons.math4.util.Decimal64 a-4 ^org.apache.commons.math4.util.Decimal64 b-4]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4)))
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a-1 ^org.apache.commons.math4.util.Decimal64 b-1 ^org.apache.commons.math4.util.Decimal64 a-2 ^org.apache.commons.math4.util.Decimal64 b-2 ^org.apache.commons.math4.util.Decimal64 a-3 ^org.apache.commons.math4.util.Decimal64 b-3]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3)))
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this ^org.apache.commons.math4.util.Decimal64 a-1 ^org.apache.commons.math4.util.Decimal64 b-1 ^org.apache.commons.math4.util.Decimal64 a-2 ^org.apache.commons.math4.util.Decimal64 b-2]
    (-> this (.linearCombination a-1 b-1 a-2 b-2)))
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this a b]
    (-> this (.linearCombination a b))))

(defn acos
  "Arc cosine operation.

  returns: acos(this) - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64 this]
    (-> this (.acos))))

