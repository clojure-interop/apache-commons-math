(ns org.apache.commons.math4.util.MathUtils
  "Miscellaneous utility functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MathUtils]))

(def *-two-pi
  "Static Constant.

  \\(2\\pi\\)

  type: double"
  MathUtils/TWO_PI)

(def *-pi-squared
  "Static Constant.

  \\(\\pi^2\\)

  type: double"
  MathUtils/PI_SQUARED)

(defn *min
  "Find the minimum of two field elements.

  e-1 - first element - `T`
  e-2 - second element - `T`

  returns: min(a1, e2) - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([e-1 e-2]
    (MathUtils/min e-1 e-2)))

(defn *check-not-null
  "Checks that an object is not null.

  o - Object to be checked. - `java.lang.Object`
  pattern - Message pattern. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments to replace the placeholders in pattern. - `java.lang.Object`

  throws: org.apache.commons.math4.exception.NullArgumentException - if o is null."
  ([^java.lang.Object o ^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (MathUtils/checkNotNull o pattern args))
  ([^java.lang.Object o]
    (MathUtils/checkNotNull o)))

(defn *hash
  "Returns an integer hash code representing the given double value.

  value - the value to be hashed - `double`

  returns: the hash code - `int`"
  (^Integer [^Double value]
    (MathUtils/hash value)))

(defn *max
  "Find the maximum of two field elements.

  e-1 - first element - `T`
  e-2 - second element - `T`

  returns: max(a1, e2) - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([e-1 e-2]
    (MathUtils/max e-1 e-2)))

(defn *copy-sign
  "Returns the first argument with the sign of the second argument.

  magnitude - Magnitude of the returned value. - `byte`
  sign - Sign of the returned value. - `byte`

  returns: a value with magnitude equal to magnitude and with the
   same sign as the sign argument. - `byte`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if magnitude == Byte.MIN_VALUE and sign >= 0."
  (^Byte [^Byte magnitude ^Byte sign]
    (MathUtils/copySign magnitude sign)))

(defn *check-finite
  "Check that the argument is a real number.

  x - Argument. - `double`

  throws: org.apache.commons.math4.exception.NotFiniteNumberException - if x is not a finite real number."
  ([^Double x]
    (MathUtils/checkFinite x)))

(defn *normalize-angle
  "Normalize an angle in a 2π wide interval around a center value.
   This method has three main uses:

     normalize an angle between 0 and 2π:
         a = MathUtils.normalizeAngle(a, FastMath.PI);
     normalize an angle between -π and π
         a = MathUtils.normalizeAngle(a, 0.0);
     compute the angle between two defining angular positions:
         angle = MathUtils.normalizeAngle(end, start) - start;

   Note that due to numerical accuracy and since π cannot be represented
   exactly, the result interval is closed, it cannot be half-closed
   as would be more satisfactory in a purely mathematical view.

  a - angle to normalize - `double`
  center - center of the desired 2π interval for the result - `double`

  returns: a-2kπ with integer k and center-π <= a-2kπ <= center+π - `double`"
  (^Double [^Double a ^Double center]
    (MathUtils/normalizeAngle a center)))

(defn *reduce
  "Reduce |a - offset| to the primary interval
   [0, |period|).

   Specifically, the value returned is
   a - |period| * floor((a - offset) / |period|) - offset.

   If any of the parameters are NaN or infinite, the result is
   NaN.

  a - Value to reduce. - `double`
  period - Period. - `double`
  offset - Value that will be mapped to 0. - `double`

  returns: the value, within the interval [0 |period|),
   that corresponds to a. - `double`"
  (^Double [^Double a ^Double period ^Double offset]
    (MathUtils/reduce a period offset)))

(defn *equals
  "Returns true if the values are equal according to semantics of
   Double.equals(Object).

  x - Value - `double`
  y - Value - `double`

  returns: new Double(x).equals(new Double(y)) - `boolean`"
  (^Boolean [^Double x ^Double y]
    (MathUtils/equals x y)))

