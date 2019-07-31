(ns org.apache.commons.math4.dfp.Dfp
  "Decimal floating point library for Java

   Another floating point class.  This one is built using radix 10000
   which is 104, so its almost decimal.

   The design goals here are:

     Decimal math, or close to it
     Settable precision (but no mix between numbers using different settings)
     Portability.  Code should be kept as portable as possible.
     Performance
     Accuracy  - Results should always be /- 1 ULP for basic
          algebraic operation
     Comply with IEEE 854-1987 as much as possible.
          (See IEEE 854-1987 notes below)


   Trade offs:

     Memory foot print.  I'm using more memory than necessary to
          represent numbers to get better performance.
     Digits are bigger, so rounding is a greater loss.  So, if you
          really need 12 decimal digits, better use 4 base 10000 digits
          there can be one partially filled.


   Numbers are represented  in the following form:


   n  =  sign × mant × (radix)exp;
   where sign is ±1, mantissa represents a fractional number between
   zero and one.  mant[0] is the least significant digit.
   exp is in the range of -32767 to 32768

   IEEE 854-1987  Notes and differences

   IEEE 854 requires the radix to be either 2 or 10.  The radix here is
   10000, so that requirement is not met, but  it is possible that a
   subclassed can be made to make it behave as a radix 10
   number.  It is my opinion that if it looks and behaves as a radix
   10 number then it is one and that requirement would be met.

   The radix of 10000 was chosen because it should be faster to operate
   on 4 decimal digits at once instead of one at a time.  Radix 10 behavior
   can be realized by adding an additional rounding step to ensure that
   the number of decimal digits represented is constant.

   The IEEE standard specifically leaves out internal data encoding,
   so it is reasonable to conclude that such a subclass of this radix
   10000 system is merely an encoding of a radix 10 system.

   IEEE 854 also specifies the existence of \"sub-normal\" numbers.  This
   class does not contain any such entities.  The most significant radix
   10000 digit is always non-zero.  Instead, we support \"gradual underflow\"
   by raising the underflow flag for numbers less with exponent less than
   expMin, but don't flush to zero until the exponent reaches MIN_EXP-digits.
   Thus the smallest number we can represent would be:
   1E(-(MIN_EXP-digits-1)*4),  eg, for digits=5, MIN_EXP=-32767, that would
   be 1e-131092.

   IEEE 854 defines that the implied radix point lies just to the right
   of the most significant digit and to the left of the remaining digits.
   This implementation puts the implied radix point to the left of all
   digits including the most significant one.  The most significant digit
   here is the one just to the right of the radix point.  This is a fine
   detail and is really only a matter of definition.  Any side effects of
   this can be rendered invisible by a subclass."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.dfp Dfp]))

(defn ->dfp
  "Constructor.

  Copy constructor.

  d - instance to copy - `org.apache.commons.math4.dfp.Dfp`"
  (^Dfp [^org.apache.commons.math4.dfp.Dfp d]
    (new Dfp d)))

(def *-radix
  "Static Constant.

  The radix, or base of this system.  Set to 10000

  type: int"
  Dfp/RADIX)

(def *-min-exp
  "Static Constant.

  The minimum exponent before underflow is signaled.  Flush to zero
    occurs at minExp-DIGITS

  type: int"
  Dfp/MIN_EXP)

(def *-max-exp
  "Static Constant.

  The maximum exponent before overflow is signaled and results flushed
    to infinity

  type: int"
  Dfp/MAX_EXP)

(def *-err-scale
  "Static Constant.

  The amount under/overflows are scaled by before going to trap handler

  type: int"
  Dfp/ERR_SCALE)

(def *-finite
  "Static Constant.

  Indicator value for normal finite numbers.

  type: byte"
  Dfp/FINITE)

(def *-infinite
  "Static Constant.

  Indicator value for Infinity.

  type: byte"
  Dfp/INFINITE)

(def *-snan
  "Static Constant.

  Indicator value for signaling NaN.

  type: byte"
  Dfp/SNAN)

(def *-qnan
  "Static Constant.

  Indicator value for quiet NaN.

  type: byte"
  Dfp/QNAN)

(defn *copysign
  "Creates an instance that is the same as x except that it has the sign of y.
   abs(x) = dfp.copysign(x, dfp.one)

  x - number to get the value from - `org.apache.commons.math4.dfp.Dfp`
  y - number to get the sign from - `org.apache.commons.math4.dfp.Dfp`

  returns: a number with the value of x and the sign of y - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp x ^org.apache.commons.math4.dfp.Dfp y]
    (Dfp/copysign x y)))

(defn negative-or-null
  "Check if instance is less than or equal to 0.

  returns: true if instance is not NaN and less than or equal to 0, false otherwise - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.negativeOrNull))))

(defn floor
  "Round to an integer using the round floor mode.
   That is, round toward -Infinity

  returns: rounded value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.floor))))

(defn log-1p
  "Shifted natural logarithm.

  returns: logarithm of one plus the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.log1p))))

(defn ceil
  "Round to an integer using the round ceil mode.
   That is, round toward Infinity

  returns: rounded value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.ceil))))

(defn cosh
  "Hyperbolic cosine operation.

  returns: cosh(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.cosh))))

(defn positive-or-null
  "Check if instance is greater than or equal to 0.

  returns: true if instance is not NaN and greater than or equal to 0, false otherwise - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.positiveOrNull))))

(defn strictly-negative
  "Check if instance is strictly less than 0.

  returns: true if instance is not NaN and less than or equal to 0, false otherwise - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.strictlyNegative))))

(defn new-instance
  "Creates an instance with a non-finite value.

  sig - sign of the Dfp to create - `byte`
  code - code of the value, must be one of INFINITE, SNAN, QNAN - `byte`

  returns: a new instance with a non-finite value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Byte sig ^Byte code]
    (-> this (.newInstance sig code)))
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Byte x]
    (-> this (.newInstance x)))
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.newInstance))))

(defn zero?
  "Check if instance is equal to zero.

  returns: true if instance is equal to zero - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.isZero))))

(defn greater-than
  "Check if instance is greater than x.

  x - number to check instance against - `org.apache.commons.math4.dfp.Dfp`

  returns: true if instance is greater than x and neither are NaN, false otherwise - `boolean`"
  (^Boolean [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.greaterThan x))))

(defn multiply
  "Multiply this by x.

  x - multiplicand - `org.apache.commons.math4.dfp.Dfp`

  returns: product of this and x - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.multiply x))))

(defn root-n
  "Nth root.

  n - order of the root - `int`

  returns: nth root of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Integer n]
    (-> this (.rootN n))))

(defn power-10-k
  "Get the specified  power of 10000.

  e - desired power - `int`

  returns: 10000e - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Integer e]
    (-> this (.power10K e))))

(defn atan-2
  "Two arguments arc tangent operation.

  x - second argument of the arc tangent - `org.apache.commons.math4.dfp.Dfp`

  returns: atan2(this, x) - `org.apache.commons.math4.dfp.Dfp`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.atan2 x))))

(defn negate
  "Returns a number that is this number with the sign bit reversed.

  returns: the opposite of this - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.negate))))

(defn strictly-positive
  "Check if instance is strictly greater than 0.

  returns: true if instance is not NaN and greater than or equal to 0, false otherwise - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.strictlyPositive))))

(defn to-double
  "Convert the instance into a double.

  returns: a double approximating the instance - `double`"
  (^Double [^Dfp this]
    (-> this (.toDouble))))

(defn cbrt
  "Cubic root.

  returns: cubic root of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.cbrt))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.reciprocal))))

(defn pow
  "Power operation.

  p - power to apply - `double`

  returns: thisp - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Double p]
    (-> this (.pow p))))

(defn copy-sign
  "Returns the instance with the sign of the argument.
   A NaN sign argument is treated as positive.

  s - the sign for the returned value - `org.apache.commons.math4.dfp.Dfp`

  returns: the instance with the same sign as the sign argument - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp s]
    (-> this (.copySign s))))

(defn to-string
  "Get a string representation of the instance.

  returns: string representation of the instance - `java.lang.String`"
  (^java.lang.String [^Dfp this]
    (-> this (.toString))))

(defn atan
  "Arc tangent operation.

  returns: atan(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.atan))))

(defn log
  "Natural logarithm.

  returns: logarithm of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.log))))

(defn acosh
  "Inverse hyperbolic cosine operation.

  returns: acosh(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.acosh))))

(defn unequal
  "Check if instance is not equal to x.

  x - number to check instance against - `org.apache.commons.math4.dfp.Dfp`

  returns: true if instance is not equal to x and neither are NaN, false otherwise - `boolean`"
  (^Boolean [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.unequal x))))

(defn power-10
  "Return the specified  power of 10.

  e - desired power - `int`

  returns: 10e - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Integer e]
    (-> this (.power10 e))))

(defn sin
  "Sine operation.

  returns: sin(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.sin))))

(defn log-10-k
  "Get the exponent of the greatest power of 10000 that is
    less than or equal to the absolute value of this.  I.E.  if
    this is 106 then log10K would return 1.

  returns: integer base 10000 logarithm - `int`"
  (^Integer [^Dfp this]
    (-> this (.log10K))))

(defn scalb
  "Multiply the instance by a power of 2.

  n - power of 2 - `int`

  returns: this × 2n - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Integer n]
    (-> this (.scalb n))))

(defn infinite?
  "Check if instance is infinite.

  returns: true if instance is infinite - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.isInfinite))))

(defn hypot
  "Returns the hypotenuse of a triangle with sides this and y
   - sqrt(this2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  y - a value - `org.apache.commons.math4.dfp.Dfp`

  returns: sqrt(this2 y2) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp y]
    (-> this (.hypot y))))

(defn int-log-10
  "Get the exponent of the greatest power of 10 that is less than or equal to abs(this).

  returns: integer base 10 logarithm - `int`"
  (^Integer [^Dfp this]
    (-> this (.intLog10))))

(defn classify
  "Returns the type - one of FINITE, INFINITE, SNAN, QNAN.

  returns: type of the number - `int`"
  (^Integer [^Dfp this]
    (-> this (.classify))))

(defn get-radix-digits
  "Get the number of radix digits of the instance.

  returns: number of radix digits - `int`"
  (^Integer [^Dfp this]
    (-> this (.getRadixDigits))))

(defn remainder
  "Returns the IEEE remainder.

  d - divisor - `org.apache.commons.math4.dfp.Dfp`

  returns: this less n × d, where n is the integer closest to this/d - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp d]
    (-> this (.remainder d))))

(defn exp
  "Exponential.

  returns: exponential of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.exp))))

(defn subtract
  "Subtract x from this.

  x - number to subtract - `org.apache.commons.math4.dfp.Dfp`

  returns: difference of this and a - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.subtract x))))

(defn get-field
  "Get the Field (really a DfpField) to which the instance belongs.

   The field is linked to the number of digits and acts as a factory
   for Dfp instances.

  returns: Field (really a DfpField) to which the instance belongs - `org.apache.commons.math4.dfp.DfpField`"
  (^org.apache.commons.math4.dfp.DfpField [^Dfp this]
    (-> this (.getField))))

(defn log-10
  "Base 10 logarithm.

  returns: base 10 logarithm of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.log10))))

(defn sqrt
  "Compute the square root.

  returns: square root of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.sqrt))))

(defn dotrap
  "Raises a trap.  This does not set the corresponding flag however.

  type - the trap type - `int`
  what - - name of routine trap occurred in - `java.lang.String`
  oper - - input operator to function - `org.apache.commons.math4.dfp.Dfp`
  result - - the result computed prior to the trap - `org.apache.commons.math4.dfp.Dfp`

  returns: The suggested return value from the trap handler - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^Integer type ^java.lang.String what ^org.apache.commons.math4.dfp.Dfp oper ^org.apache.commons.math4.dfp.Dfp result]
    (-> this (.dotrap type what oper result))))

(defn tan
  "Tangent operation.

  returns: tan(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.tan))))

(defn cos
  "Cosine operation.

  returns: cos(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.cos))))

(defn less-than
  "Check if instance is less than x.

  x - number to check instance against - `org.apache.commons.math4.dfp.Dfp`

  returns: true if instance is less than x and neither are NaN, false otherwise - `boolean`"
  (^Boolean [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.lessThan x))))

(defn get-real
  "Get the real value of the number.

  returns: real value - `double`"
  (^Double [^Dfp this]
    (-> this (.getReal))))

(defn abs
  "Get the absolute value of instance.

  returns: absolute value of instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.abs))))

(defn na-n?
  "Check if instance is not a number.

  returns: true if instance is not a number - `boolean`"
  (^Boolean [^Dfp this]
    (-> this (.isNaN))))

(defn int-value
  "Convert this to an integer.
   If greater than 2147483647, it returns 2147483647. If less than -2147483648 it returns -2147483648.

  returns: converted number - `int`"
  (^Integer [^Dfp this]
    (-> this (.intValue))))

(defn expm-1
  "Exponential minus 1.

  returns: exponential minus one of the instance - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.expm1))))

(defn next-after
  "Returns the next number greater than this one in the direction of x.
   If this==x then simply returns this.

  x - direction where to look at - `org.apache.commons.math4.dfp.Dfp`

  returns: closest number next to instance in the direction of x - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.nextAfter x))))

(defn get-one
  "Get the constant 1.

  returns: a Dfp with value one - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.getOne))))

(defn divide
  "Divide this by divisor.

  divisor - divisor - `org.apache.commons.math4.dfp.Dfp`

  returns: quotient of this by divisor - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp divisor]
    (-> this (.divide divisor))))

(defn to-split-double
  "Convert the instance into a split double.

  returns: an array of two doubles which sum represent the instance - `double[]`"
  ([^Dfp this]
    (-> this (.toSplitDouble))))

(defn hash-code
  "Gets a hashCode for the instance.

  returns: a hash code value for this object - `int`"
  (^Integer [^Dfp this]
    (-> this (.hashCode))))

(defn add
  "Add x to this.

  x - number to add - `org.apache.commons.math4.dfp.Dfp`

  returns: sum of this and x - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.add x))))

(defn atanh
  "Inverse hyperbolic  tangent operation.

  returns: atanh(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.atanh))))

(defn get-two
  "Get the constant 2.

  returns: a Dfp with value two - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.getTwo))))

(defn sinh
  "Hyperbolic sine operation.

  returns: sinh(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.sinh))))

(defn asinh
  "Inverse hyperbolic sine operation.

  returns: asin(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.asinh))))

(defn round
  "Get the closest long to instance value.

  returns: closest long to RealFieldElement.getReal() - `long`"
  (^Long [^Dfp this]
    (-> this (.round))))

(defn asin
  "Arc sine operation.

  returns: asin(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.asin))))

(defn equals
  "Check if instance is equal to x.

  other - object to check instance against - `java.lang.Object`

  returns: true if instance is equal to x and neither are NaN, false otherwise - `boolean`"
  (^Boolean [^Dfp this ^java.lang.Object other]
    (-> this (.equals other))))

(defn tanh
  "Hyperbolic tangent operation.

  returns: tanh(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.tanh))))

(defn rint
  "Round to nearest integer using the round-half-even method.
    That is round to nearest integer unless both are equidistant.
    In which case round to the even one.

  returns: rounded value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.rint))))

(defn get-zero
  "Get the constant 0.

  returns: a Dfp with value zero - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.getZero))))

(defn signum
  "Compute the signum of the instance.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.signum))))

(defn linear-combination
  "Compute a linear combination.

  a-1 - first factor of the first term - `org.apache.commons.math4.dfp.Dfp`
  b-1 - second factor of the first term - `org.apache.commons.math4.dfp.Dfp`
  a-2 - first factor of the second term - `org.apache.commons.math4.dfp.Dfp`
  b-2 - second factor of the second term - `org.apache.commons.math4.dfp.Dfp`
  a-3 - first factor of the third term - `org.apache.commons.math4.dfp.Dfp`
  b-3 - second factor of the third term - `org.apache.commons.math4.dfp.Dfp`
  a-4 - first factor of the third term - `org.apache.commons.math4.dfp.Dfp`
  b-4 - second factor of the third term - `org.apache.commons.math4.dfp.Dfp`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp a-1 ^org.apache.commons.math4.dfp.Dfp b-1 ^org.apache.commons.math4.dfp.Dfp a-2 ^org.apache.commons.math4.dfp.Dfp b-2 ^org.apache.commons.math4.dfp.Dfp a-3 ^org.apache.commons.math4.dfp.Dfp b-3 ^org.apache.commons.math4.dfp.Dfp a-4 ^org.apache.commons.math4.dfp.Dfp b-4]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4)))
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp a-1 ^org.apache.commons.math4.dfp.Dfp b-1 ^org.apache.commons.math4.dfp.Dfp a-2 ^org.apache.commons.math4.dfp.Dfp b-2 ^org.apache.commons.math4.dfp.Dfp a-3 ^org.apache.commons.math4.dfp.Dfp b-3]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3)))
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this ^org.apache.commons.math4.dfp.Dfp a-1 ^org.apache.commons.math4.dfp.Dfp b-1 ^org.apache.commons.math4.dfp.Dfp a-2 ^org.apache.commons.math4.dfp.Dfp b-2]
    (-> this (.linearCombination a-1 b-1 a-2 b-2)))
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this a b]
    (-> this (.linearCombination a b))))

(defn acos
  "Arc cosine operation.

  returns: acos(this) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^Dfp this]
    (-> this (.acos))))

