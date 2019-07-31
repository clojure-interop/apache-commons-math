(ns org.apache.commons.math4.complex.Complex
  "Representation of a Complex number, i.e. a number which has both a
  real and imaginary part.

  Implementations of arithmetic operations handle NaN and
  infinite values according to the rules for Double, i.e.
  equals(java.lang.Object) is an equivalence relation for all instances that have
  a NaN in either real or imaginary part, e.g. the following are
  considered equal:

   1  NaNi
   NaN  i
   NaN  NaNi

  Note that this contradicts the IEEE-754 standard for floating
  point numbers (according to which the test x == x must fail if
  x is NaN). The method
  equals for primitive double in Precision
  conforms with IEEE-754 while this class conforms with the standard behavior
  for Java object types."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.complex Complex]))

(defn ->complex
  "Constructor.

  Create a complex number given the real and imaginary parts.

  real - Real part. - `double`
  imaginary - Imaginary part. - `double`"
  (^Complex [^Double real ^Double imaginary]
    (new Complex real imaginary))
  (^Complex [^Double real]
    (new Complex real)))

(def *-i
  "Static Constant.

  The square root of -1. A number representing \"0.0  1.0i\"

  type: org.apache.commons.math4.complex.Complex"
  Complex/I)

(def *-na-n
  "Static Constant.

  A complex number representing \"NaN  NaNi\"

  type: org.apache.commons.math4.complex.Complex"
  Complex/NaN)

(def *-inf
  "Static Constant.

  A complex number representing \"+INF  INFi\"

  type: org.apache.commons.math4.complex.Complex"
  Complex/INF)

(def *-one
  "Static Constant.

  A complex number representing \"1.0  0.0i\"

  type: org.apache.commons.math4.complex.Complex"
  Complex/ONE)

(def *-zero
  "Static Constant.

  A complex number representing \"0.0  0.0i\"

  type: org.apache.commons.math4.complex.Complex"
  Complex/ZERO)

(defn *equals
  "Test for the floating-point equality between Complex objects.
   It returns true if both arguments are equal or within the
   range of allowed error (inclusive).

  x - First value (cannot be null). - `org.apache.commons.math4.complex.Complex`
  y - Second value (cannot be null). - `org.apache.commons.math4.complex.Complex`
  max-ulps - (maxUlps - 1) is the number of floating point values between the real (resp. imaginary) parts of x and y. - `int`

  returns: true if there are fewer than maxUlps floating
   point values between the real (resp. imaginary) parts of x
   and y. - `boolean`"
  (^Boolean [^org.apache.commons.math4.complex.Complex x ^org.apache.commons.math4.complex.Complex y ^Integer max-ulps]
    (Complex/equals x y max-ulps))
  (^Boolean [^org.apache.commons.math4.complex.Complex x ^org.apache.commons.math4.complex.Complex y]
    (Complex/equals x y)))

(defn *equals-with-relative-tolerance
  "Returns true if, both for the real part and for the imaginary
   part, there is no double value strictly between the arguments or the
   relative difference between them is smaller or equal to the given
   tolerance. Returns false if either of the arguments is NaN.

  x - First value (cannot be null). - `org.apache.commons.math4.complex.Complex`
  y - Second value (cannot be null). - `org.apache.commons.math4.complex.Complex`
  eps - Amount of allowed relative error. - `double`

  returns: true if the values are two adjacent floating point
   numbers or they are within range of each other. - `boolean`"
  (^Boolean [^org.apache.commons.math4.complex.Complex x ^org.apache.commons.math4.complex.Complex y ^Double eps]
    (Complex/equalsWithRelativeTolerance x y eps)))

(defn *value-of
  "Create a complex number given the real and imaginary parts.

  real-part - Real part. - `double`
  imaginary-part - Imaginary part. - `double`

  returns: a Complex instance. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Double real-part ^Double imaginary-part]
    (Complex/valueOf real-part imaginary-part))
  (^org.apache.commons.math4.complex.Complex [^Double real-part]
    (Complex/valueOf real-part)))

(defn cosh
  "Compute the

   hyperbolic cosine of this complex number.
   Implements the formula:


     cosh(a  bi) = cosh(a)cos(b)  sinh(a)sin(b)i
   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double),
   FastMath.cosh(double) and FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     cosh(1 ± INFINITY i) = NaN  NaN i
     cosh(±INFINITY  i) = INFINITY ± INFINITY i
     cosh(±INFINITY ± INFINITY i) = NaN  NaN i

  returns: the hyperbolic cosine of this complex number. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.cosh))))

(defn multiply
  "Returns a Complex whose value is this * factor.
   Implements preliminary checks for NaN and infinity followed by
   the definitional formula:

     (a  bi)(c  di) = (ac - bd)  (ad  bc)i

   Returns NaN if either this or factor has one or
   more NaN parts.

   Returns INF if neither this nor factor has one
   or more NaN parts and if either this or factor
   has one or more infinite parts (same result is returned regardless of
   the sign of the components).

   Returns finite values in components of the result per the definitional
   formula in all remaining cases.

  factor - value to be multiplied by this Complex. - `org.apache.commons.math4.complex.Complex`

  returns: this * factor. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.NullArgumentException - if factor is null."
  (^org.apache.commons.math4.complex.Complex [^Complex this ^org.apache.commons.math4.complex.Complex factor]
    (-> this (.multiply factor))))

(defn negate
  "Returns a Complex whose value is (-this).
   Returns NaN if either real or imaginary
   part of this Complex number is Double.NaN.

  returns: -this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.negate))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.reciprocal))))

(defn pow
  "Returns of value of this complex number raised to the power of x.
   Implements the formula:


     yx = exp(x·log(y))
   where exp and log are exp() and
   log(), respectively.

   Returns NaN if either real or imaginary part of the
   input argument is NaN or infinite, or if y
   equals ZERO.

  x - exponent to which this Complex is to be raised. - `org.apache.commons.math4.complex.Complex`

  returns: thisx. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.NullArgumentException - if x is null."
  (^org.apache.commons.math4.complex.Complex [^Complex this ^org.apache.commons.math4.complex.Complex x]
    (-> this (.pow x))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Complex this]
    (-> this (.toString))))

(defn conjugate
  "Returns the conjugate of this complex number.
   The conjugate of a  bi is a - bi.

   NaN is returned if either the real or imaginary
   part of this Complex number equals Double.NaN.

   If the imaginary part is infinite, and the real part is not
   NaN, the returned value has infinite imaginary part
   of the opposite sign, e.g. the conjugate of
   1  POSITIVE_INFINITY i is 1 - NEGATIVE_INFINITY i.

  returns: the conjugate of this Complex object. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.conjugate))))

(defn get-imaginary
  "Access the imaginary part.

  returns: the imaginary part. - `double`"
  (^Double [^Complex this]
    (-> this (.getImaginary))))

(defn atan
  "Compute the

   inverse tangent of this complex number.
   Implements the formula:

   atan(z) = (i/2) log((i  z)/(i - z))

   Returns NaN if either real or imaginary part of the
   input argument is NaN or infinite.

  returns: the inverse tangent of this complex number - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.atan))))

(defn log
  "Compute the

   natural logarithm of this complex number.
   Implements the formula:


     log(a  bi) = ln(|a  bi|)  arg(a  bi)i
   where ln on the right hand side is FastMath.log(double),
   |a  bi| is the modulus, abs(),  and
   arg(a  bi) = FastMath.atan2(double, double)(b, a).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite (or critical) values in real or imaginary parts of the input may
   result in infinite or NaN values returned in parts of the result.


    Examples:

     log(1 ± INFINITY i) = INFINITY ± (π/2)i
     log(INFINITY  i) = INFINITY  0i
     log(-INFINITY  i) = INFINITY  πi
     log(INFINITY ± INFINITY i) = INFINITY ± (π/4)i
     log(-INFINITY ± INFINITY i) = INFINITY ± (3π/4)i
     log(0  0i) = -INFINITY  0i

  returns: the value ln   this, the natural logarithm
   of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.log))))

(defn sin
  "Compute the

   sine
   of this complex number.
   Implements the formula:


     sin(a  bi) = sin(a)cosh(b) - cos(a)sinh(b)i
   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double),
   FastMath.cosh(double) and FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     sin(1 ± INFINITY i) = 1 ± INFINITY i
     sin(±INFINITY  i) = NaN  NaN i
     sin(±INFINITY ± INFINITY i) = NaN  NaN i

  returns: the sine of this complex number. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.sin))))

(defn infinite?
  "Checks whether either the real or imaginary part of this complex number
   takes an infinite value (either Double.POSITIVE_INFINITY or
   Double.NEGATIVE_INFINITY) and neither part
   is NaN.

  returns: true if one or both parts of this complex number are infinite
   and neither part is NaN. - `boolean`"
  (^Boolean [^Complex this]
    (-> this (.isInfinite))))

(defn exp
  "Compute the

   exponential function of this complex number.
   Implements the formula:


     exp(a  bi) = exp(a)cos(b)  exp(a)sin(b)i
   where the (real) functions on the right-hand side are
   FastMath.exp(double), FastMath.cos(double), and
   FastMath.sin(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     exp(1 ± INFINITY i) = NaN  NaN i
     exp(INFINITY  i) = INFINITY  INFINITY i
     exp(-INFINITY  i) = 0  0i
     exp(±INFINITY ± INFINITY i) = NaN  NaN i

  returns: ethis. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.exp))))

(defn subtract
  "Returns a Complex whose value is
   (this - subtrahend).
   Uses the definitional formula

    (a  bi) - (c  di) = (a-c)  (b-d)i

   If either this or subtrahend has a NaN] value in either part,
   NaN is returned; otherwise infinite and NaN values are
   returned in the parts of the result according to the rules for
   Double arithmetic.

  subtrahend - value to be subtracted from this Complex. - `org.apache.commons.math4.complex.Complex`

  returns: this - subtrahend. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.NullArgumentException - if subtrahend is null."
  (^org.apache.commons.math4.complex.Complex [^Complex this ^org.apache.commons.math4.complex.Complex subtrahend]
    (-> this (.subtract subtrahend))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.complex.ComplexField`"
  (^org.apache.commons.math4.complex.ComplexField [^Complex this]
    (-> this (.getField))))

(defn sqrt
  "Compute the

   square root of this complex number.
   Implements the following algorithm to compute sqrt(a  bi):
   Let t = sqrt((|a|  |a  bi|) / 2)


  if   a &#8805; 0 return  t  (b/2t)i
    else return  |b|/2t  sign(b)t i

   where
   |a| = FastMath.abs(int)(a)
   |a  bi| = abs()(a  bi)
   sign(b) =  copySign(1d, b)


   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     sqrt(1 ± INFINITY i) = INFINITY  NaN i
     sqrt(INFINITY  i) = INFINITY  0i
     sqrt(-INFINITY  i) = 0  INFINITY i
     sqrt(INFINITY ± INFINITY i) = INFINITY  NaN i
     sqrt(-INFINITY ± INFINITY i) = NaN ± INFINITY i

  returns: the square root of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.sqrt))))

(defn nth-root
  "Computes the n-th roots of this complex number.
   The nth roots are defined by the formula:


     zk = abs1/n (cos(phi  2πk/n)  i (sin(phi  2πk/n))
   for k=0, 1, ..., n-1, where abs and phi
   are respectively the modulus and
   argument of this complex number.

   If one or both parts of this complex number is NaN, a list with just
   one element, NaN is returned.
   if neither part is NaN, but at least one part is infinite, the result
   is a one-element list containing INF.

  n - Degree of root. - `int`

  returns: a List of all n-th roots of this. - `java.util.List<org.apache.commons.math4.complex.Complex>`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n <= 0."
  (^java.util.List [^Complex this ^Integer n]
    (-> this (.nthRoot n))))

(defn tan
  "Compute the

   tangent of this complex number.
   Implements the formula:


     tan(a  bi) = sin(2a)/(cos(2a)+cosh(2b))  [sinh(2b)/(cos(2a)+cosh(2b))]i
   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double), FastMath.cosh(double) and
   FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite (or critical) values in real or imaginary parts of the input may
   result in infinite or NaN values returned in parts of the result.


    Examples:

     tan(a ± INFINITY i) = 0 ± i
     tan(±INFINITY  bi) = NaN  NaN i
     tan(±INFINITY ± INFINITY i) = NaN  NaN i
     tan(±π/2  0 i) = ±INFINITY  NaN i

  returns: the tangent of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.tan))))

(defn cos
  "Compute the

   cosine of this complex number.
   Implements the formula:

    cos(a  bi) = cos(a)cosh(b) - sin(a)sinh(b)i

   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double),
   FastMath.cosh(double) and FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     cos(1 ± INFINITY i) = 1 ∓ INFINITY i
     cos(±INFINITY  i) = NaN  NaN i
     cos(±INFINITY ± INFINITY i) = NaN  NaN i

  returns: the cosine of this complex number. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.cos))))

(defn get-real
  "Access the real part.

  returns: the real part. - `double`"
  (^Double [^Complex this]
    (-> this (.getReal))))

(defn abs
  "Return the absolute value of this complex number.
   Returns NaN if either real or imaginary part is NaN
   and Double.POSITIVE_INFINITY if neither part is NaN,
   but at least one part is infinite.

  returns: the absolute value. - `double`"
  (^Double [^Complex this]
    (-> this (.abs))))

(defn na-n?
  "Checks whether either or both parts of this complex number is
   NaN.

  returns: true if either or both parts of this complex number is
   NaN; false otherwise. - `boolean`"
  (^Boolean [^Complex this]
    (-> this (.isNaN))))

(defn divide
  "Returns a Complex whose value is
   (this / divisor).
   Implements the definitional formula


      a  bi          ac  bd  (bc - ad)i
      ----------- = -------------------------
      c  di         c2  d2
   but uses

   prescaling of operands to limit the effects of overflows and
   underflows in the computation.

   Infinite and NaN values are handled according to the
   following rules, applied in the order presented:

    If either this or divisor has a NaN value
     in either part, NaN is returned.

    If divisor equals ZERO, NaN is returned.

    If this and divisor are both infinite,
     NaN is returned.

    If this is finite (i.e., has no Infinite or
     NaN parts) and divisor is infinite (one or both parts
     infinite), ZERO is returned.

    If this is infinite and divisor is finite,
     NaN values are returned in the parts of the result if the
     Double rules applied to the definitional formula
     force NaN results.

  divisor - Value by which this Complex is to be divided. - `org.apache.commons.math4.complex.Complex`

  returns: this / divisor. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.NullArgumentException - if divisor is null."
  (^org.apache.commons.math4.complex.Complex [^Complex this ^org.apache.commons.math4.complex.Complex divisor]
    (-> this (.divide divisor))))

(defn hash-code
  "Get a hashCode for the complex number.
   Any Double.NaN value in real or imaginary part produces
   the same hash code 7.

  returns: a hash code value for this object. - `int`"
  (^Integer [^Complex this]
    (-> this (.hashCode))))

(defn add
  "Returns a Complex whose value is
   (this  addend).
   Uses the definitional formula

     (a  bi)  (c  di) = (a+c)  (b+d)i

   If either this or addend has a NaN value in
   either part, NaN is returned; otherwise Infinite
   and NaN values are returned in the parts of the result
   according to the rules for Double arithmetic.

  addend - Value to be added to this Complex. - `org.apache.commons.math4.complex.Complex`

  returns: this  addend. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.NullArgumentException - if addend is null."
  (^org.apache.commons.math4.complex.Complex [^Complex this ^org.apache.commons.math4.complex.Complex addend]
    (-> this (.add addend))))

(defn sqrt-1z
  "Compute the

   square root of 1 - this2 for this complex
   number.
   Computes the result directly as
   sqrt(ONE.subtract(z.multiply(z))).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.

  returns: the square root of 1 - this2. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.sqrt1z))))

(defn sinh
  "Compute the

   hyperbolic sine of this complex number.
   Implements the formula:


     sinh(a  bi) = sinh(a)cos(b))  cosh(a)sin(b)i
   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double),
   FastMath.cosh(double) and FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     sinh(1 ± INFINITY i) = NaN  NaN i
     sinh(±INFINITY  i) = ± INFINITY  INFINITY i
     sinh(±INFINITY ± INFINITY i) = NaN  NaN i

  returns: the hyperbolic sine of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.sinh))))

(defn get-argument
  "Compute the argument of this complex number.
   The argument is the angle phi between the positive real axis and
   the point representing this number in the complex plane.
   The value returned is between -PI (not inclusive)
   and PI (inclusive), with negative values returned for numbers with
   negative imaginary parts.

   If either real or imaginary part (or both) is NaN, NaN is returned.
   Infinite parts are handled as Math.atan2 handles them,
   essentially treating finite parts as zero in the presence of an
   infinite coordinate and returning a multiple of pi/4 depending on
   the signs of the infinite parts.
   See the javadoc for Math.atan2 for full details.

  returns: the argument of this. - `double`"
  (^Double [^Complex this]
    (-> this (.getArgument))))

(defn asin
  "Compute the

   inverse sine of this complex number.
   Implements the formula:

    asin(z) = -i (log(sqrt(1 - z<sup>2</sup>)  iz))

   Returns NaN if either real or imaginary part of the
   input argument is NaN or infinite.

  returns: the inverse sine of this complex number. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.asin))))

(defn equals
  "Test for equality with another object.
   If both the real and imaginary parts of two complex numbers
   are exactly the same, and neither is Double.NaN, the two
   Complex objects are considered to be equal.
   The behavior is the same as for JDK's Double:

    All NaN values are considered to be equal,
     i.e, if either (or both) real and imaginary parts of the complex
     number are equal to Double.NaN, the complex number is equal
     to NaN.


     Instances constructed with different representations of zero (i.e.
     either \"0\" or \"-0\") are not considered to be equal.

  other - Object to test for equality with this instance. - `java.lang.Object`

  returns: true if the objects are equal, false if object
   is null, not an instance of Complex, or not equal to
   this instance. - `boolean`"
  (^Boolean [^Complex this ^java.lang.Object other]
    (-> this (.equals other))))

(defn tanh
  "Compute the

   hyperbolic tangent of this complex number.
   Implements the formula:


     tan(a  bi) = sinh(2a)/(cosh(2a)+cos(2b))  [sin(2b)/(cosh(2a)+cos(2b))]i
   where the (real) functions on the right-hand side are
   FastMath.sin(double), FastMath.cos(double), FastMath.cosh(double) and
   FastMath.sinh(double).

   Returns NaN if either real or imaginary part of the
   input argument is NaN.

   Infinite values in real or imaginary parts of the input may result in
   infinite or NaN values returned in parts of the result.


    Examples:

     tanh(a ± INFINITY i) = NaN  NaN i
     tanh(±INFINITY  bi) = ±1  0 i
     tanh(±INFINITY ± INFINITY i) = NaN  NaN i
     tanh(0  (π/2)i) = NaN  INFINITY i

  returns: the hyperbolic tangent of this. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.tanh))))

(defn acos
  "Compute the

   inverse cosine of this complex number.
   Implements the formula:

    acos(z) = -i (log(z  i (sqrt(1 - z<sup>2</sup>))))

   Returns NaN if either real or imaginary part of the
   input argument is NaN or infinite.

  returns: the inverse cosine of this complex number. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^Complex this]
    (-> this (.acos))))

