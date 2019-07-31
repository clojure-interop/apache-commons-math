(ns org.apache.commons.math4.util.FastMath
  "Faster, more accurate, portable alternative to Math and
  StrictMath for large scale computation.

  FastMath is a drop-in replacement for both Math and StrictMath. This
  means that for any method in Math (say Math.sin(x) or
  Math.cbrt(y)), user can directly change the class and use the
  methods as is (using FastMath.sin(x) or FastMath.cbrt(y)
  in the previous example).


  FastMath speed is achieved by relying heavily on optimizing compilers
  to native code present in many JVMs today and use of large tables.
  The larger tables are lazily initialized on first use, so that the setup
  time does not penalize methods that don't need them.


  Note that FastMath is
  extensively used inside Apache Commons Math, so by calling some algorithms,
  the overhead when the the tables need to be initialized will occur
  regardless of the end-user calling FastMath methods directly or not.
  Performance figures for a specific JVM and hardware can be evaluated by
  running the FastMathTestPerformance tests in the test directory of the source
  distribution.


  FastMath accuracy should be mostly independent of the JVM as it relies only
  on IEEE-754 basic operations and on embedded tables. Almost all operations
  are accurate to about 0.5 ulp throughout the domain range. This statement,
  of course is only a rough global observed behavior, it is not a
  guarantee for every double numbers input (see William Kahan's Table
  Maker's Dilemma).


  FastMath additionally implements the following methods not found in Math/StrictMath:

  asinh(double)
  acosh(double)
  atanh(double)

  The following methods are found in Math/StrictMath since 1.6 only, they are provided
  by FastMath even in 1.5 Java virtual machines

  copySign(double, double)
  getExponent(double)
  nextAfter(double,double)
  nextUp(double)
  scalb(double, int)
  copySign(float, float)
  getExponent(float)
  nextAfter(float,double)
  nextUp(float)
  scalb(float, int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util FastMath]))

(def *-pi
  "Static Constant.

  Archimede's constant PI, ratio of circle circumference to diameter.

  type: double"
  FastMath/PI)

(def *-e
  "Static Constant.

  Napier's constant e, base of the natural logarithm.

  type: double"
  FastMath/E)

(defn *floor
  "Get the largest whole number smaller than x.

  x - number from which floor is requested - `double`

  returns: a double number f such that f is an integer f <= x < f  1.0 - `double`"
  (^Double [^Double x]
    (FastMath/floor x)))

(defn *log-1p
  "Computes log(1  x).

  x - Number. - `double`

  returns: log(1  x). - `double`"
  (^Double [^Double x]
    (FastMath/log1p x)))

(defn *ceil
  "Get the smallest whole number larger than x.

  x - number from which ceil is requested - `double`

  returns: a double number c such that c is an integer c - 1.0 < x <= c - `double`"
  (^Double [^Double x]
    (FastMath/ceil x)))

(defn *ulp
  "Compute least significant bit (Unit in Last Position) for a number.

  x - number from which ulp is requested - `double`

  returns: ulp(x) - `double`"
  (^Double [^Double x]
    (FastMath/ulp x)))

(defn *multiply-exact
  "Multiply two numbers, detecting overflows.

  a - first number to multiply - `int`
  b - second number to multiply - `int`

  returns: a*b if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if an overflow occurs"
  (^Integer [^Integer a ^Integer b]
    (FastMath/multiplyExact a b)))

(defn *next-down
  "Compute next number towards negative infinity.

  a - number to which neighbor should be computed - `double`

  returns: neighbor of a towards negative infinity - `double`"
  (^Double [^Double a]
    (FastMath/nextDown a)))

(defn *random
  "Returns a pseudo-random number between 0.0 and 1.0.
   Note: this implementation currently delegates to Math.random()

  returns: a random number between 0.0 and 1.0 - `double`"
  (^Double []
    (FastMath/random )))

(defn *cosh
  "Compute the hyperbolic cosine of a number.

  x - number on which evaluation is done - `double`

  returns: hyperbolic cosine of x - `double`"
  (^Double [^Double x]
    (FastMath/cosh x)))

(defn *min
  "Compute the minimum of two values

  a - first value - `int`
  b - second value - `int`

  returns: a if a is lesser or equal to b, b otherwise - `int`"
  (^Integer [^Integer a ^Integer b]
    (FastMath/min a b)))

(defn *atan-2
  "Two arguments arctangent function

  y - ordinate - `double`
  x - abscissa - `double`

  returns: phase angle of point (x,y) between -PI and PI - `double`"
  (^Double [^Double y ^Double x]
    (FastMath/atan2 y x)))

(defn *add-exact
  "Add two numbers, detecting overflows.

  a - first number to add - `int`
  b - second number to add - `int`

  returns: a+b if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if an overflow occurs"
  (^Integer [^Integer a ^Integer b]
    (FastMath/addExact a b)))

(defn *cbrt
  "Compute the cubic root of a number.

  x - number on which evaluation is done - `double`

  returns: cubic root of x - `double`"
  (^Double [^Double x]
    (FastMath/cbrt x)))

(defn *get-exponent
  "Return the exponent of a double number, removing the bias.

   For double numbers of the form 2x, the unbiased
   exponent is exactly x.

  d - number from which exponent is requested - `double`

  returns: exponent for d in IEEE754 representation, without bias - `int`"
  (^Integer [^Double d]
    (FastMath/getExponent d)))

(defn *max
  "Compute the maximum of two values

  a - first value - `int`
  b - second value - `int`

  returns: b if a is lesser or equal to b, a otherwise - `int`"
  (^Integer [^Integer a ^Integer b]
    (FastMath/max a b)))

(defn *floor-div
  "Finds q such that a = q b  r with 0 <= r < b if b > 0 and b < r <= 0 if b < 0.

   This methods returns the same value as integer division when
   a and b are same signs, but returns a different value when
   they are opposite (i.e. q is negative).

  a - dividend - `int`
  b - divisor - `int`

  returns: q such that a = q b  r with 0 <= r < b if b > 0 and b < r <= 0 if b < 0 - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if b == 0"
  (^Integer [^Integer a ^Integer b]
    (FastMath/floorDiv a b)))

(defn *pow
  "Power function.  Compute x^y.

  x - a double - `double`
  y - a double - `double`

  returns: double - `double`"
  (^Double [^Double x ^Double y]
    (FastMath/pow x y)))

(defn *copy-sign
  "Returns the first argument with the sign of the second argument.
   A NaN sign argument is treated as positive.

  magnitude - the value to return - `double`
  sign - the sign for the returned value - `double`

  returns: the magnitude with the same sign as the sign argument - `double`"
  (^Double [^Double magnitude ^Double sign]
    (FastMath/copySign magnitude sign)))

(defn *atan
  "Arctangent function

  x - a number - `double`

  returns: atan(x) - `double`"
  (^Double [^Double x]
    (FastMath/atan x)))

(defn *next-up
  "Compute next number towards positive infinity.

  a - number to which neighbor should be computed - `double`

  returns: neighbor of a towards positive infinity - `double`"
  (^Double [^Double a]
    (FastMath/nextUp a)))

(defn *log
  "Computes the
   logarithm in a given base.

   Returns NaN if either argument is negative.
   If base is 0 and x is positive, 0 is returned.
   If base is positive and x is 0,
   Double.NEGATIVE_INFINITY is returned.
   If both arguments are 0, the result is NaN.

  base - Base of the logarithm, must be greater than 0. - `double`
  x - Argument, must be greater than 0. - `double`

  returns: the value of the logarithm, i.e. the number y such that
   basey = x. - `double`"
  (^Double [^Double base ^Double x]
    (FastMath/log base x))
  (^Double [^Double x]
    (FastMath/log x)))

(defn *acosh
  "Compute the inverse hyperbolic cosine of a number.

  a - number on which evaluation is done - `double`

  returns: inverse hyperbolic cosine of a - `double`"
  (^Double [^Double a]
    (FastMath/acosh a)))

(defn *to-degrees
  "Convert radians to degrees, with error of less than 0.5 ULP

  x - angle in radians - `double`

  returns: x converted into degrees - `double`"
  (^Double [^Double x]
    (FastMath/toDegrees x)))

(defn *sin
  "Sine function.

  x - Argument. - `double`

  returns: sin(x) - `double`"
  (^Double [^Double x]
    (FastMath/sin x)))

(defn *scalb
  "Multiply a double number by a power of 2.

  d - number to multiply - `double`
  n - power of 2 - `int`

  returns: d × 2n - `double`"
  (^Double [^Double d ^Integer n]
    (FastMath/scalb d n)))

(defn *hypot
  "Returns the hypotenuse of a triangle with sides x and y
   - sqrt(x2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  x - a value - `double`
  y - a value - `double`

  returns: sqrt(x2 y2) - `double`"
  (^Double [^Double x ^Double y]
    (FastMath/hypot x y)))

(defn *main
  "Print out contents of arrays, and check the length.
   used to generate the preset arrays originally.

  a - unused - `java.lang.String[]`"
  ([a]
    (FastMath/main a)))

(defn *exp
  "Exponential function.

   Computes exp(x), function result is nearly rounded.   It will be correctly
   rounded to the theoretical value for 99.9% of input values, otherwise it will
   have a 1 ULP error.

   Method:
      Lookup intVal = exp(int(x))
      Lookup fracVal = exp(int(x-int(x) / 1024.0) * 1024.0 );
      Compute z as the exponential of the remaining bits by a polynomial minus one
      exp(x) = intVal * fracVal * (1  z)

   Accuracy:
      Calculation is done with 63 bits of precision, so result should be correctly
      rounded for 99.9% of input values, with less than 1 ULP error otherwise.

  x - a double - `double`

  returns: double ex - `double`"
  (^Double [^Double x]
    (FastMath/exp x)))

(defn *decrement-exact
  "Decrement a number, detecting overflows.

  n - number to decrement - `int`

  returns: n-1 if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if an overflow occurs"
  (^Integer [^Integer n]
    (FastMath/decrementExact n)))

(defn *log-10
  "Compute the base 10 logarithm.

  x - a number - `double`

  returns: log10(x) - `double`"
  (^Double [^Double x]
    (FastMath/log10 x)))

(defn *sqrt
  "Compute the square root of a number.
   Note: this implementation currently delegates to Math.sqrt(double)

  a - number on which evaluation is done - `double`

  returns: square root of a - `double`"
  (^Double [^Double a]
    (FastMath/sqrt a)))

(defn *floor-mod
  "Finds r such that a = q b  r with 0 <= r < b if b > 0 and b < r <= 0 if b < 0.

   This methods returns the same value as integer modulo when
   a and b are same signs, but returns a different value when
   they are opposite (i.e. q is negative).

  a - dividend - `int`
  b - divisor - `int`

  returns: r such that a = q b  r with 0 <= r < b if b > 0 and b < r <= 0 if b < 0 - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if b == 0"
  (^Integer [^Integer a ^Integer b]
    (FastMath/floorMod a b)))

(defn *tan
  "Tangent function.

  x - Argument. - `double`

  returns: tan(x) - `double`"
  (^Double [^Double x]
    (FastMath/tan x)))

(defn *cos
  "Cosine function.

  x - Argument. - `double`

  returns: cos(x) - `double`"
  (^Double [^Double x]
    (FastMath/cos x)))

(defn *subtract-exact
  "Subtract two numbers, detecting overflows.

  a - first number - `int`
  b - second number to subtract from a - `int`

  returns: a-b if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if an overflow occurs"
  (^Integer [^Integer a ^Integer b]
    (FastMath/subtractExact a b)))

(defn *abs
  "Absolute value.

  x - number from which absolute value is requested - `int`

  returns: abs(x) - `int`"
  (^Integer [^Integer x]
    (FastMath/abs x)))

(defn *expm-1
  "Compute exp(x) - 1

  x - number to compute shifted exponential - `double`

  returns: exp(x) - 1 - `double`"
  (^Double [^Double x]
    (FastMath/expm1 x)))

(defn *next-after
  "Get the next machine representable number after a number, moving
   in the direction of another number.

   The ordering is as follows (increasing):

   -INFINITY
   -MAX_VALUE
   -MIN_VALUE
   -0.0
   +0.0
   +MIN_VALUE
   +MAX_VALUE
   +INFINITY


   If arguments compare equal, then the second argument is returned.

   If direction is greater than d,
   the smallest machine representable number strictly greater than
   d is returned; if less, then the largest representable number
   strictly less than d is returned.

   If d is infinite and direction does not
   bring it back to finite numbers, it is returned unchanged.

  d - base number - `double`
  direction - (the only important thing is whether direction is greater or smaller than d) - `double`

  returns: the next machine representable number in the specified direction - `double`"
  (^Double [^Double d ^Double direction]
    (FastMath/nextAfter d direction)))

(defn *to-int-exact
  "Convert a long to interger, detecting overflows

  n - number to convert to int - `long`

  returns: integer with same valie as n if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if n cannot fit into an int"
  (^Integer [^Long n]
    (FastMath/toIntExact n)))

(defn *increment-exact
  "Increment a number, detecting overflows.

  n - number to increment - `int`

  returns: n+1 if no overflows occur - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if an overflow occurs"
  (^Integer [^Integer n]
    (FastMath/incrementExact n)))

(defn *atanh
  "Compute the inverse hyperbolic tangent of a number.

  a - number on which evaluation is done - `double`

  returns: inverse hyperbolic tangent of a - `double`"
  (^Double [^Double a]
    (FastMath/atanh a)))

(defn *iee-eremainder
  "Computes the remainder as prescribed by the IEEE 754 standard.
   The remainder value is mathematically equal to x - y*n
   where n is the mathematical integer closest to the exact mathematical value
   of the quotient x/y.
   If two mathematical integers are equally close to x/y then
   n is the integer that is even.


   If either operand is NaN, the result is NaN.
   If the result is not NaN, the sign of the result equals the sign of the dividend.
   If the dividend is an infinity, or the divisor is a zero, or both, the result is NaN.
   If the dividend is finite and the divisor is an infinity, the result equals the dividend.
   If the dividend is a zero and the divisor is finite, the result equals the dividend.

  dividend - the number to be divided - `double`
  divisor - the number by which to divide - `double`

  returns: the remainder, rounded - `double`"
  (^Double [^Double dividend ^Double divisor]
    (FastMath/IEEEremainder dividend divisor)))

(defn *sinh
  "Compute the hyperbolic sine of a number.

  x - number on which evaluation is done - `double`

  returns: hyperbolic sine of x - `double`"
  (^Double [^Double x]
    (FastMath/sinh x)))

(defn *asinh
  "Compute the inverse hyperbolic sine of a number.

  a - number on which evaluation is done - `double`

  returns: inverse hyperbolic sine of a - `double`"
  (^Double [^Double a]
    (FastMath/asinh a)))

(defn *round
  "Get the closest long to x.

  x - number from which closest long is requested - `double`

  returns: closest long to x - `long`"
  (^Long [^Double x]
    (FastMath/round x)))

(defn *asin
  "Compute the arc sine of a number.

  x - number on which evaluation is done - `double`

  returns: arc sine of x - `double`"
  (^Double [^Double x]
    (FastMath/asin x)))

(defn *tanh
  "Compute the hyperbolic tangent of a number.

  x - number on which evaluation is done - `double`

  returns: hyperbolic tangent of x - `double`"
  (^Double [^Double x]
    (FastMath/tanh x)))

(defn *to-radians
  "Convert degrees to radians, with error of less than 0.5 ULP

  x - angle in degrees - `double`

  returns: x converted into radians - `double`"
  (^Double [^Double x]
    (FastMath/toRadians x)))

(defn *rint
  "Get the whole number that is the nearest to x, or the even one if x is exactly half way between two integers.

  x - number from which nearest whole number is requested - `double`

  returns: a double number r such that r is an integer r - 0.5 <= x <= r  0.5 - `double`"
  (^Double [^Double x]
    (FastMath/rint x)))

(defn *signum
  "Compute the signum of a number.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  a - number on which evaluation is done - `double`

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `double`"
  (^Double [^Double a]
    (FastMath/signum a)))

(defn *acos
  "Compute the arc cosine of a number.

  x - number on which evaluation is done - `double`

  returns: arc cosine of x - `double`"
  (^Double [^Double x]
    (FastMath/acos x)))

