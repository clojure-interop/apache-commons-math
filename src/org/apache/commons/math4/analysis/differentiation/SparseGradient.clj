(ns org.apache.commons.math4.analysis.differentiation.SparseGradient
  "First derivative computation with large number of variables.

  This class plays a similar role to DerivativeStructure, with
  a focus on efficiency when dealing with large number of independent variables
  and most computation depend only on a few of them, and when only first derivative
  is desired. When these conditions are met, this class should be much faster than
  DerivativeStructure and use less memory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation SparseGradient]))

(defn *create-constant
  "Factory method creating a constant.

  value - value of the constant - `double`

  returns: a new instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^Double value]
    (SparseGradient/createConstant value)))

(defn *create-variable
  "Factory method creating an independent variable.

  idx - index of the variable - `int`
  value - value of the variable - `double`

  returns: a new instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^Integer idx ^Double value]
    (SparseGradient/createVariable idx value)))

(defn *hypot
  "Returns the hypotenuse of a triangle with sides x and y
   - sqrt(x2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  x - a value - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  y - a value - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: sqrt(x2 y2) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^org.apache.commons.math4.analysis.differentiation.SparseGradient x ^org.apache.commons.math4.analysis.differentiation.SparseGradient y]
    (SparseGradient/hypot x y)))

(defn *pow
  "Compute ax where a is a double and x a SparseGradient

  a - number to exponentiate - `double`
  x - power to apply - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: ax - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^Double a ^org.apache.commons.math4.analysis.differentiation.SparseGradient x]
    (SparseGradient/pow a x)))

(defn *atan-2
  "Two arguments arc tangent operation.

  y - first argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  x - second argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: atan2(y, x) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^org.apache.commons.math4.analysis.differentiation.SparseGradient y ^org.apache.commons.math4.analysis.differentiation.SparseGradient x]
    (SparseGradient/atan2 y x)))

(defn floor
  "Get the largest whole number smaller than instance.

  returns: floor(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.floor))))

(defn log-1p
  "Shifted natural logarithm.

  returns: logarithm of one plus the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.log1p))))

(defn ceil
  "Get the smallest whole number larger than instance.

  returns: ceil(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.ceil))))

(defn cosh
  "Hyperbolic cosine operation.

  returns: cosh(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.cosh))))

(defn add-in-place
  "Add in place.

   This method is designed to be faster when used multiple times in a loop.


   The instance is changed here, in order to not change the
   instance the add(SparseGradient) method should
   be used.

  a - instance to add - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  ([^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.addInPlace a))))

(defn multiply
  "Compute this × a.

  a - element to multiply - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: a new element representing this × a - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.multiply a))))

(defn root-n
  "Nth root.

  n - order of the root - `int`

  returns: nth root of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^Integer n]
    (-> this (.rootN n))))

(defn atan-2
  "Two arguments arc tangent operation.

  x - second argument of the arc tangent - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: atan2(this, x) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient x]
    (-> this (.atan2 x))))

(defn negate
  "Returns the additive inverse of this element.

  returns: the opposite of this. - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.negate))))

(defn cbrt
  "Cubic root.

  returns: cubic root of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.cbrt))))

(defn taylor
  "Evaluate Taylor expansion of a sparse gradient.

  delta - parameters offsets (Δx, Δy, ...) - `double`

  returns: value of the Taylor expansion at x  Δx, y  Δy, ... - `double`"
  (^Double [^SparseGradient this ^Double delta]
    (-> this (.taylor delta))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.reciprocal))))

(defn pow
  "Power operation.

  p - power to apply - `double`

  returns: thisp - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^Double p]
    (-> this (.pow p))))

(defn copy-sign
  "Returns the instance with the sign of the argument.
   A NaN sign argument is treated as positive.

  sign - the sign for the returned value - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: the instance with the same sign as the sign argument - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient sign]
    (-> this (.copySign sign))))

(defn num-vars
  "Find the number of variables.

  returns: number of variables - `int`"
  (^Integer [^SparseGradient this]
    (-> this (.numVars))))

(defn atan
  "Arc tangent operation.

  returns: atan(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.atan))))

(defn get-value
  "Get the value of the function.

  returns: value of the function. - `double`"
  (^Double [^SparseGradient this]
    (-> this (.getValue))))

(defn log
  "Natural logarithm.

  returns: logarithm of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.log))))

(defn acosh
  "Inverse hyperbolic cosine operation.

  returns: acosh(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.acosh))))

(defn to-degrees
  "Convert radians to degrees, with error of less than 0.5 ULP

  returns: instance converted into degrees - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.toDegrees))))

(defn sin
  "Sine operation.

  returns: sin(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.sin))))

(defn scalb
  "Multiply the instance by a power of 2.

  n - power of 2 - `int`

  returns: this × 2n - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^Integer n]
    (-> this (.scalb n))))

(defn hypot
  "Returns the hypotenuse of a triangle with sides this and y
   - sqrt(this2 y2)
   avoiding intermediate overflow or underflow.


    If either argument is infinite, then the result is positive infinity.
    else, if either argument is NaN then the result is NaN.

  y - a value - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: sqrt(this2 y2) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient y]
    (-> this (.hypot y))))

(defn remainder
  "IEEE remainder operator.

  a - right hand side parameter of the operator - `double`

  returns: this - n × a where n is the closest integer to this/a
   (the even integer is chosen for n if this/a is halfway between two integers) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^Double a]
    (-> this (.remainder a))))

(defn exp
  "Exponential.

  returns: exponential of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.exp))))

(defn subtract
  "Compute this - a.

  a - element to subtract - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: a new element representing this - a - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.subtract a))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.Field<org.apache.commons.math4.analysis.differentiation.SparseGradient>`"
  (^org.apache.commons.math4.Field [^SparseGradient this]
    (-> this (.getField))))

(defn log-10
  "Base 10 logarithm.

  returns: base 10 logarithm of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.log10))))

(defn sqrt
  "Square root.

  returns: square root of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.sqrt))))

(defn tan
  "Tangent operation.

  returns: tan(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.tan))))

(defn cos
  "Cosine operation.

  returns: cos(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.cos))))

(defn compose
  "Compute composition of the instance by a univariate function.

  f-0 - value of the function at (i.e. f(getValue())) - `double`
  f-1 - first derivative of the function at the current point (i.e. f'(getValue())) - `double`

  returns: f(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^Double f-0 ^Double f-1]
    (-> this (.compose f-0 f-1))))

(defn get-real
  "Get the real value of the number.

  returns: real value - `double`"
  (^Double [^SparseGradient this]
    (-> this (.getReal))))

(defn abs
  "absolute value.

  returns: abs(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.abs))))

(defn expm-1
  "Exponential minus 1.

  returns: exponential minus one of the instance - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.expm1))))

(defn multiply-in-place
  "Multiply in place.

   This method is designed to be faster when used multiple times in a loop.


   The instance is changed here, in order to not change the
   instance the add(SparseGradient) method should
   be used.

  a - instance to multiply - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  ([^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.multiplyInPlace a))))

(defn divide
  "Compute this ÷ a.

  a - element to divide by - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: a new element representing this ÷ a - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.divide a))))

(defn hash-code
  "Get a hashCode for the derivative structure.

  returns: a hash code value for this object - `int`"
  (^Integer [^SparseGradient this]
    (-> this (.hashCode))))

(defn add
  "Compute this  a.

  a - element to add - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: a new element representing this  a - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a]
    (-> this (.add a))))

(defn atanh
  "Inverse hyperbolic  tangent operation.

  returns: atanh(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.atanh))))

(defn get-derivative
  "Get the derivative with respect to a particular index variable.

  index - index to differentiate with. - `int`

  returns: derivative with respect to a particular index variable - `double`"
  (^Double [^SparseGradient this ^Integer index]
    (-> this (.getDerivative index))))

(defn sinh
  "Hyperbolic sine operation.

  returns: sinh(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.sinh))))

(defn asinh
  "Inverse hyperbolic sine operation.

  returns: asin(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.asinh))))

(defn round
  "Get the closest long to instance value.

  returns: closest long to RealFieldElement.getReal() - `long`"
  (^Long [^SparseGradient this]
    (-> this (.round))))

(defn asin
  "Arc sine operation.

  returns: asin(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.asin))))

(defn equals
  "Test for the equality of two sparse gradients.

   Sparse gradients are considered equal if they have the same value
   and the same derivatives.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two sparse gradients are equal - `boolean`"
  (^Boolean [^SparseGradient this ^java.lang.Object other]
    (-> this (.equals other))))

(defn tanh
  "Hyperbolic tangent operation.

  returns: tanh(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.tanh))))

(defn to-radians
  "Convert degrees to radians, with error of less than 0.5 ULP

  returns: instance converted into radians - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.toRadians))))

(defn rint
  "Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.

  returns: a double number r such that r is an integer r - 0.5 ≤ this ≤ r  0.5 - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.rint))))

(defn signum
  "Compute the signum of the instance.
   The signum is -1 for negative numbers, 1 for positive numbers and 0 otherwise

  returns: -1.0, -0.0, 0.0, 1.0 or NaN depending on sign of a - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.signum))))

(defn linear-combination
  "Compute a linear combination.

  a-1 - first factor of the first term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  b-1 - second factor of the first term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  a-2 - first factor of the second term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  b-2 - second factor of the second term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  a-3 - first factor of the third term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  b-3 - second factor of the third term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  a-4 - first factor of the third term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`
  b-4 - second factor of the third term - `org.apache.commons.math4.analysis.differentiation.SparseGradient`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-2 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-2 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-3 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-3 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-4 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-4]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4)))
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-2 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-2 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-3 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-3]
    (-> this (.linearCombination a-1 b-1 a-2 b-2 a-3 b-3)))
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-1 ^org.apache.commons.math4.analysis.differentiation.SparseGradient a-2 ^org.apache.commons.math4.analysis.differentiation.SparseGradient b-2]
    (-> this (.linearCombination a-1 b-1 a-2 b-2)))
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this a b]
    (-> this (.linearCombination a b))))

(defn acos
  "Arc cosine operation.

  returns: acos(this) - `org.apache.commons.math4.analysis.differentiation.SparseGradient`"
  (^org.apache.commons.math4.analysis.differentiation.SparseGradient [^SparseGradient this]
    (-> this (.acos))))

