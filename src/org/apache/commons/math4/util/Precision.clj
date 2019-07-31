(ns org.apache.commons.math4.util.Precision
  "Utilities for comparing numbers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Precision]))

(def *-epsilon
  "Static Constant.

  Largest double-precision floating-point number such that
   1  EPSILON is numerically equal to 1. This value is an upper
   bound on the relative error due to rounding real numbers to double
   precision floating-point numbers.


   In IEEE 754 arithmetic, this is 2-53.

  type: double"
  Precision/EPSILON)

(def *-safe-min
  "Static Constant.

  Safe minimum, such that 1 / SAFE_MIN does not overflow.

   In IEEE 754 arithmetic, this is also the smallest normalized
   number 2-1022.

  type: double"
  Precision/SAFE_MIN)

(defn *compare-to
  "Compares two numbers given some amount of allowed error.

  x - the first number - `double`
  y - the second number - `double`
  eps - the amount of error to allow when checking for equality - `double`

  returns: 0 if  equals(x, y, eps)
         < 0 if !equals(x, y, eps) && x < y
         > 0 if !equals(x, y, eps) && x > y or
         either argument is NaN - `int`"
  (^Integer [^Double x ^Double y ^Double eps]
    (Precision/compareTo x y eps)))

(defn *equals
  "Returns true if the arguments are equal or within the range of allowed
   error (inclusive).  Returns false if either of the arguments
   is NaN.

  x - first value - `float`
  y - second value - `float`
  eps - the amount of absolute error to allow. - `float`

  returns: true if the values are equal or within range of each other. - `boolean`"
  (^Boolean [^Float x ^Float y ^Float eps]
    (Precision/equals x y eps))
  (^Boolean [^Float x ^Float y]
    (Precision/equals x y)))

(defn *equals-including-na-n
  "Returns true if the arguments are both NaN, are equal, or are within the range
   of allowed error (inclusive).

  x - first value - `float`
  y - second value - `float`
  eps - the amount of absolute error to allow. - `float`

  returns: true if the values are equal or within range of each other,
   or both are NaN. - `boolean`"
  (^Boolean [^Float x ^Float y ^Float eps]
    (Precision/equalsIncludingNaN x y eps))
  (^Boolean [^Float x ^Float y]
    (Precision/equalsIncludingNaN x y)))

(defn *equals-with-relative-tolerance
  "Returns true if there is no double value strictly between the
   arguments or the relative difference between them is less than or equal
   to the given tolerance. Returns false if either of the arguments
   is NaN.

  x - First value. - `double`
  y - Second value. - `double`
  eps - Amount of allowed relative error. - `double`

  returns: true if the values are two adjacent floating point
   numbers or they are within range of each other. - `boolean`"
  (^Boolean [^Double x ^Double y ^Double eps]
    (Precision/equalsWithRelativeTolerance x y eps)))

(defn *round
  "Rounds the given value to the specified number of decimal places.
   The value is rounded using the given method which is any method defined
   in BigDecimal.
   If x is infinite or NaN, then the value of x is
   returned unchanged, regardless of the other parameters.

  x - Value to round. - `double`
  scale - Number of digits to the right of the decimal point. - `int`
  rounding-method - Rounding method as defined in BigDecimal. - `int`

  returns: the rounded value. - `double`

  throws: java.lang.ArithmeticException - if roundingMethod == ROUND_UNNECESSARY and the specified scaling operation would require rounding."
  (^Double [^Double x ^Integer scale ^Integer rounding-method]
    (Precision/round x scale rounding-method))
  (^Double [^Double x ^Integer scale]
    (Precision/round x scale)))

(defn *representable-delta
  "Computes a number delta close to originalDelta with
   the property that

     x  delta - x
   is exactly machine-representable.
   This is useful when computing numerical derivatives, in order to reduce
   roundoff errors.

  x - Value. - `double`
  original-delta - Offset value. - `double`

  returns: a number delta so that x  delta and x
   differ by a representable floating number. - `double`"
  (^Double [^Double x ^Double original-delta]
    (Precision/representableDelta x original-delta)))

