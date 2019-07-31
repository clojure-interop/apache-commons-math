(ns org.apache.commons.math4.RealFieldElement
  "Interface representing a real
  field."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4 RealFieldElement]))

(defn floor
  "Get the largest whole number smaller than instance.

  returns: floor(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.floor))))

(defn log-1p
  "Shifted natural logarithm.

  returns: logarithm of one plus the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.log1p))))

(defn ceil
  "Get the smallest whole number larger than instance.

  returns: ceil(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.ceil))))

(defn cosh
  "Hyperbolic cosine operation.

  returns: cosh(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.cosh))))

(defn multiply
  "'×' operator.

  a - right hand side parameter of the operator - `double`

  returns: this×a - `T`"
  ([^RealFieldElement this ^Double a]
    (-> this (.multiply a))))

(defn root-n
  "Nth root.

  n - order of the root - `int`

  returns: nth root of the instance - `T`"
  ([^RealFieldElement this ^Integer n]
    (-> this (.rootN n))))

(defn atan-2
  "Two arguments arc tangent operation.

  x - second argument of the arc tangent - `T`

  returns: atan2(this, x) - `T`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  ([^RealFieldElement this x]
    (-> this (.atan2 x))))

(defn cbrt
  "Cubic root.

  returns: cubic root of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.cbrt))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `T`"
  ([^RealFieldElement this]
    (-> this (.reciprocal))))

(defn pow
  "Power operation.

  p - power to apply - `double`

  returns: thisp - `T`"
  ([^RealFieldElement this ^Double p]
    (-> this (.pow p))))

(defn copy-sign
  "Returns the instance with the sign of the argument.
   A NaN sign argument is treated as positive.

  sign - the sign for the returned value - `T`

  returns: the instance with the same sign as the sign argument - `T`"
  ([^RealFieldElement this sign]
    (-> this (.copySign sign))))

(defn atan
  "Arc tangent operation.

  returns: atan(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.atan))))

(defn log
  "Natural logarithm.

  returns: logarithm of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.log))))

(defn acosh
  "Inverse hyperbolic cosine operation.

  returns: acosh(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.acosh))))

(defn sin
  "Sine operation.

  returns: sin(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.sin))))

(defn scalb
  "Multiply the instance by a power of 2.

  n - power of 2 - `int`

  returns: this × 2n - `T`"
  ([^RealFieldElement this ^Integer n]
    (-> this (.scalb n))))

(defn hypot
  "Returns the hypotenuse of a triangle with sides this and y
   - sqrt(this2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  y - a value - `T`

  returns: sqrt(this2 y2) - `T`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  ([^RealFieldElement this y]
    (-> this (.hypot y))))

(defn remainder
  "IEEE remainder operator.

  a - right hand side parameter of the operator - `double`

  returns: this - n × a where n is the closest integer to this/a
   (the even integer is chosen for n if this/a is halfway between two integers) - `T`"
  ([^RealFieldElement this ^Double a]
    (-> this (.remainder a))))

(defn exp
  "Exponential.

  returns: exponential of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.exp))))

(defn subtract
  "'-' operator.

  a - right hand side parameter of the operator - `double`

  returns: this-a - `T`"
  ([^RealFieldElement this ^Double a]
    (-> this (.subtract a))))

(defn log-10
  "Base 10 logarithm.

  returns: base 10 logarithm of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.log10))))

(defn sqrt
  "Square root.

  returns: square root of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.sqrt))))

(defn tan
  "Tangent operation.

  returns: tan(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.tan))))

(defn cos
  "Cosine operation.

  returns: cos(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.cos))))

(defn get-real
  "Get the real value of the number.

  returns: real value - `double`"
  (^Double [^RealFieldElement this]
    (-> this (.getReal))))

(defn abs
  "absolute value.

  returns: abs(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.abs))))

(defn expm-1
  "Exponential minus 1.

  returns: exponential minus one of the instance - `T`"
  ([^RealFieldElement this]
    (-> this (.expm1))))

(defn divide
  "'÷' operator.

  a - right hand side parameter of the operator - `double`

  returns: this÷a - `T`"
  ([^RealFieldElement this ^Double a]
    (-> this (.divide a))))

(defn add
  "'+' operator.

  a - right hand side parameter of the operator - `double`

  returns: this+a - `T`"
  ([^RealFieldElement this ^Double a]
    (-> this (.add a))))

(defn atanh
  "Inverse hyperbolic  tangent operation.

  returns: atanh(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.atanh))))

(defn sinh
  "Hyperbolic sine operation.

  returns: sinh(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.sinh))))

(defn asinh
  "Inverse hyperbolic sine operation.

  returns: asin(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.asinh))))

(defn round
  "Get the closest long to instance value.

  returns: closest long to getReal() - `long`"
  (^Long [^RealFieldElement this]
    (-> this (.round))))

(defn asin
  "Arc sine operation.

  returns: asin(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.asin))))

(defn tanh
  "Hyperbolic tangent operation.

  returns: tanh(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.tanh))))

(defn rint
  "Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.

  returns: a double number r such that r is an integer r - 0.5 ≤ this ≤ r  0.5 - `T`"
  ([^RealFieldElement this]
    (-> this (.rint))))

(defn signum
  "Compute the signum of the instance.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `T`"
  ([^RealFieldElement this]
    (-> this (.signum))))

(defn linear-combination
  "Compute a linear combination.

  a-1 - first factor of the first term - `T`
  b-1 - second factor of the first term - `T`
  a-2 - first factor of the second term - `T`
  b-2 - second factor of the second term - `T`
  a-3 - first factor of the third term - `T`
  b-3 - second factor of the third term - `T`
  a-4 - first factor of the third term - `T`
  b-4 - second factor of the third term - `T`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `T`"
  ([^RealFieldElement this a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4)))
  ([^RealFieldElement this a-1 b-1 a-2 b-2 a-3 b-3]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3)))
  ([^RealFieldElement this a-1 b-1 a-2 b-2]
    (-> this (.linearCombination a-1 b-1 a-2 b-2)))
  ([^RealFieldElement this a b]
    (-> this (.linearCombination a b))))

(defn acos
  "Arc cosine operation.

  returns: acos(this) - `T`"
  ([^RealFieldElement this]
    (-> this (.acos))))

