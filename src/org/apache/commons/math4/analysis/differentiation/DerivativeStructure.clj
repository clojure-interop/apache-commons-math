(ns org.apache.commons.math4.analysis.differentiation.DerivativeStructure
  "Class representing both the value and the differentials of a function.
  This class is the workhorse of the differentiation package.
  This class is an implementation of the extension to Rall's
  numbers described in Dan Kalman's paper Doubly
  Recursive Multivariate Automatic Differentiation, Mathematics Magazine, vol. 75,
  no. 3, June 2002. Rall's numbers are an extension to the real numbers used
  throughout mathematical expressions; they hold the derivative together with the
  value of a function. Dan Kalman's derivative structures hold all partial derivatives
  up to any specified order, with respect to any number of free parameters. Rall's
  numbers therefore can be seen as derivative structures for order one derivative and
  one free parameter, and real numbers can be seen as derivative structures with zero
  order derivative and no free parameters.
  DerivativeStructure instances can be used directly thanks to
  the arithmetic operators to the mathematical functions provided as
  methods by this class (+, -, *, /, %, sin, cos ...).
  Implementing complex expressions by hand using these classes is
  a tedious and error-prone task but has the advantage of having no limitation
  on the derivation order despite not requiring users to compute the derivatives by
  themselves. Implementing complex expression can also be done by developing computation
  code using standard primitive double values and to use differentiators to create the DerivativeStructure-based instances. This method is simpler but may be limited in
  the accuracy and derivation orders and may be computationally intensive (this is
  typically the case for finite differences
  differentiator.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation DerivativeStructure]))

(defn ->derivative-structure
  "Constructor.

  Linear combination constructor.
   The derivative structure built will be a1 * ds1  a2 * ds2  a3 * ds3  a4 * ds4

  a-1 - first scale factor - `double`
  ds-1 - first base (unscaled) derivative structure - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-2 - second scale factor - `double`
  ds-2 - second base (unscaled) derivative structure - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-3 - third scale factor - `double`
  ds-3 - third base (unscaled) derivative structure - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-4 - fourth scale factor - `double`
  ds-4 - fourth base (unscaled) derivative structure - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  (^DerivativeStructure [^Double a-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-1 ^Double a-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-2 ^Double a-3 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-3 ^Double a-4 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-4]
    (new DerivativeStructure a-1 ds-1 a-2 ds-2 a-3 ds-3 a-4 ds-4))
  (^DerivativeStructure [^Double a-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-1 ^Double a-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-2 ^Double a-3 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure ds-3]
    (new DerivativeStructure a-1 ds-1 a-2 ds-2 a-3 ds-3))
  (^DerivativeStructure [^Integer parameters ^Integer order ^Integer index ^Double value]
    (new DerivativeStructure parameters order index value))
  (^DerivativeStructure [^Integer parameters ^Integer order ^Double value]
    (new DerivativeStructure parameters order value))
  (^DerivativeStructure [^Integer parameters ^Integer order]
    (new DerivativeStructure parameters order)))

(defn *hypot
  "Returns the hypotenuse of a triangle with sides x and y
   - sqrt(x2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  x - a value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  y - a value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: sqrt(x2 y2) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders do not match"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^org.apache.commons.math4.analysis.differentiation.DerivativeStructure x ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure y]
    (DerivativeStructure/hypot x y)))

(defn *pow
  "Compute ax where a is a double and x a DerivativeStructure

  a - number to exponentiate - `double`
  x - power to apply - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: ax - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^Double a ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure x]
    (DerivativeStructure/pow a x)))

(defn *atan-2
  "Two arguments arc tangent operation.

  y - first argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  x - second argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: atan2(y, x) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders do not match"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^org.apache.commons.math4.analysis.differentiation.DerivativeStructure y ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure x]
    (DerivativeStructure/atan2 y x)))

(defn floor
  "Get the largest whole number smaller than instance.

  returns: floor(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.floor))))

(defn log-1p
  "Shifted natural logarithm.

  returns: logarithm of one plus the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.log1p))))

(defn ceil
  "Get the smallest whole number larger than instance.

  returns: ceil(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.ceil))))

(defn cosh
  "Hyperbolic cosine operation.

  returns: cosh(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.cosh))))

(defn multiply
  "Compute n × this. Multiplication by an integer number is defined
   as the following sum

   n × this = ∑i=1n this.

  n - Number of times this must be added to itself. - `int`

  returns: A new element representing n × this. - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Integer n]
    (-> this (.multiply n))))

(defn root-n
  "Nth root.

  n - order of the root - `int`

  returns: nth root of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Integer n]
    (-> this (.rootN n))))

(defn atan-2
  "Two arguments arc tangent operation.

  x - second argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: atan2(this, x) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure x]
    (-> this (.atan2 x))))

(defn negate
  "Returns the additive inverse of this element.

  returns: the opposite of this. - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.negate))))

(defn get-partial-derivative
  "Get a partial derivative.

  orders - derivation orders with respect to each variable (if all orders are 0, the value is returned) - `int`

  returns: partial derivative - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the numbers of variables does not match the instance"
  (^Double [^DerivativeStructure this ^Integer orders]
    (-> this (.getPartialDerivative orders))))

(defn cbrt
  "Cubic root.

  returns: cubic root of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.cbrt))))

(defn taylor
  "Evaluate Taylor expansion a derivative structure.

  delta - parameters offsets (Δx, Δy, ...) - `double`

  returns: value of the Taylor expansion at x  Δx, y  Δy, ... - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if factorials becomes too large"
  (^Double [^DerivativeStructure this ^Double delta]
    (-> this (.taylor delta))))

(defn get-exponent
  "Return the exponent of the instance value, removing the bias.

   For double numbers of the form 2x, the unbiased
   exponent is exactly x.

  returns: exponent for instance in IEEE754 representation, without bias - `int`"
  (^Integer [^DerivativeStructure this]
    (-> this (.getExponent))))

(defn get-free-parameters
  "Get the number of free parameters.

  returns: number of free parameters - `int`"
  (^Integer [^DerivativeStructure this]
    (-> this (.getFreeParameters))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.reciprocal))))

(defn pow
  "Power operation.

  p - power to apply - `double`

  returns: thisp - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double p]
    (-> this (.pow p))))

(defn copy-sign
  "Returns the instance with the sign of the argument.
   A NaN sign argument is treated as positive.

  sign - the sign for the returned value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: the instance with the same sign as the sign argument - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure sign]
    (-> this (.copySign sign))))

(defn get-order
  "Get the derivation order.

  returns: derivation order - `int`"
  (^Integer [^DerivativeStructure this]
    (-> this (.getOrder))))

(defn atan
  "Arc tangent operation.

  returns: atan(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.atan))))

(defn create-constant
  "Create a constant compatible with instance order and number of parameters.

   This method is a convenience factory method, it simply calls
   new DerivativeStructure(getFreeParameters(), getOrder(), c)

  c - value of the constant - `double`

  returns: a constant compatible with instance order and number of parameters - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double c]
    (-> this (.createConstant c))))

(defn get-value
  "Get the value part of the derivative structure.

  returns: value part of the derivative structure - `double`"
  (^Double [^DerivativeStructure this]
    (-> this (.getValue))))

(defn log
  "Natural logarithm.

  returns: logarithm of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.log))))

(defn acosh
  "Inverse hyperbolic cosine operation.

  returns: acosh(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.acosh))))

(defn to-degrees
  "Convert radians to degrees, with error of less than 0.5 ULP

  returns: instance converted into degrees - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.toDegrees))))

(defn sin
  "Sine operation.

  returns: sin(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.sin))))

(defn scalb
  "Multiply the instance by a power of 2.

  n - power of 2 - `int`

  returns: this × 2n - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Integer n]
    (-> this (.scalb n))))

(defn hypot
  "Returns the hypotenuse of a triangle with sides this and y
   - sqrt(this2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  y - a value - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: sqrt(this2 y2) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders do not match"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure y]
    (-> this (.hypot y))))

(defn remainder
  "IEEE remainder operator.

  a - right hand side parameter of the operator - `double`

  returns: this - n × a where n is the closest integer to this/a
   (the even integer is chosen for n if this/a is halfway between two integers) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double a]
    (-> this (.remainder a))))

(defn exp
  "Exponential.

  returns: exponential of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.exp))))

(defn subtract
  "'-' operator.

  a - right hand side parameter of the operator - `double`

  returns: this-a - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double a]
    (-> this (.subtract a))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.Field<org.apache.commons.math4.analysis.differentiation.DerivativeStructure>`"
  (^org.apache.commons.math4.Field [^DerivativeStructure this]
    (-> this (.getField))))

(defn log-10
  "Base 10 logarithm.

  returns: base 10 logarithm of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.log10))))

(defn sqrt
  "Square root.

  returns: square root of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.sqrt))))

(defn tan
  "Tangent operation.

  returns: tan(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.tan))))

(defn cos
  "Cosine operation.

  returns: cos(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.cos))))

(defn compose
  "Compute composition of the instance by a univariate function.

  f - array of value and derivatives of the function at the current point (i.e. [f(getValue()), f'(getValue()), f''(getValue())...]). - `double`

  returns: f(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of derivatives in the array is not equal to order 1"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double f]
    (-> this (.compose f))))

(defn get-real
  "Get the real value of the number.

  returns: real value - `double`"
  (^Double [^DerivativeStructure this]
    (-> this (.getReal))))

(defn abs
  "absolute value.

  returns: abs(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.abs))))

(defn get-all-derivatives
  "Get all partial derivatives.

  returns: a fresh copy of partial derivatives, in an array sorted according to
   DSCompiler.getPartialDerivativeIndex(int...) - `double[]`"
  ([^DerivativeStructure this]
    (-> this (.getAllDerivatives))))

(defn expm-1
  "Exponential minus 1.

  returns: exponential minus one of the instance - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.expm1))))

(defn divide
  "'÷' operator.

  a - right hand side parameter of the operator - `double`

  returns: this÷a - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double a]
    (-> this (.divide a))))

(defn hash-code
  "Get a hashCode for the derivative structure.

  returns: a hash code value for this object - `int`"
  (^Integer [^DerivativeStructure this]
    (-> this (.hashCode))))

(defn add
  "'+' operator.

  a - right hand side parameter of the operator - `double`

  returns: this+a - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^Double a]
    (-> this (.add a))))

(defn atanh
  "Inverse hyperbolic  tangent operation.

  returns: atanh(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.atanh))))

(defn sinh
  "Hyperbolic sine operation.

  returns: sinh(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.sinh))))

(defn asinh
  "Inverse hyperbolic sine operation.

  returns: asin(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.asinh))))

(defn round
  "Get the closest long to instance value.

  returns: closest long to RealFieldElement.getReal() - `long`"
  (^Long [^DerivativeStructure this]
    (-> this (.round))))

(defn asin
  "Arc sine operation.

  returns: asin(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.asin))))

(defn equals
  "Test for the equality of two derivative structures.

   Derivative structures are considered equal if they have the same number
   of free parameters, the same derivation order, and the same derivatives.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two derivative structures are equal - `boolean`"
  (^Boolean [^DerivativeStructure this ^java.lang.Object other]
    (-> this (.equals other))))

(defn tanh
  "Hyperbolic tangent operation.

  returns: tanh(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.tanh))))

(defn to-radians
  "Convert degrees to radians, with error of less than 0.5 ULP

  returns: instance converted into radians - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.toRadians))))

(defn rint
  "Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.

  returns: a double number r such that r is an integer r - 0.5 ≤ this ≤ r  0.5 - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.rint))))

(defn signum
  "Compute the signum of the instance.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.signum))))

(defn linear-combination
  "Compute a linear combination.

  a-1 - first factor of the first term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  b-1 - second factor of the first term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-2 - first factor of the second term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  b-2 - second factor of the second term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-3 - first factor of the third term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  b-3 - second factor of the third term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  a-4 - first factor of the third term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`
  b-4 - second factor of the third term - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders do not match"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-3 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-3 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-4 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-4]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4)))
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-3 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-3]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3)))
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-1 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure a-2 ^org.apache.commons.math4.analysis.differentiation.DerivativeStructure b-2]
    (-> this (.linearCombination a-1 b-1 a-2 b-2)))
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this a b]
    (-> this (.linearCombination a b))))

(defn acos
  "Arc cosine operation.

  returns: acos(this) - `org.apache.commons.math4.analysis.differentiation.DerivativeStructure`"
  (^org.apache.commons.math4.analysis.differentiation.DerivativeStructure [^DerivativeStructure this]
    (-> this (.acos))))

