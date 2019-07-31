(ns org.apache.commons.math4.dfp.DfpMath
  "Mathematical routines for use with Dfp.
  The constants are defined in DfpField"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.dfp DfpMath]))

(defn *pow
  "Raises base to the power a by successive squaring.

  base - number to raise - `org.apache.commons.math4.dfp.Dfp`
  a - power - `int`

  returns: basea - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp base ^Integer a]
    (DfpMath/pow base a)))

(defn *atan
  "computes the arc tangent of the argument

    Uses the typical taylor series

    but may reduce arguments using the following identity
   tan(x+y) = (tan(x)  tan(y)) / (1 - tan(x)*tan(y))

   since tan(PI/8) = sqrt(2)-1,

   atan(x) = atan( (x - sqrt(2)  1) / (1+x*sqrt(2) - x)  PI/8.0

  a - number from which arc-tangent is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: atan(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/atan a)))

(defn *log
  "Returns the natural logarithm of a.
   a is first split into three parts such that  a = (10000^h)(2^j)k.
   ln(a) is computed by ln(a) = ln(5)*h  ln(2)*(h+j)  ln(k)
   k is in the range 2/3 < k <4/3 and is passed on to a series expansion.

  a - number from which logarithm is requested - `org.apache.commons.math4.dfp.Dfp`

  returns: log(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/log a)))

(defn *sin
  "computes the sine of the argument.

  a - number from which sine is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: sin(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/sin a)))

(defn *exp
  "Computes e to the given power.
   a is broken into two parts, such that a = n+m  where n is an integer.
   We use pow() to compute en and a Taylor series to compute
   em.  We return e*n × em

  a - power at which e should be raised - `org.apache.commons.math4.dfp.Dfp`

  returns: ea - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/exp a)))

(defn *tan
  "computes the tangent of the argument.

  a - number from which tangent is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: tan(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/tan a)))

(defn *cos
  "computes the cosine of the argument.

  a - number from which cosine is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: cos(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/cos a)))

(defn *asin
  "computes the arc-sine of the argument.

  a - number from which arc-sine is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: asin(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/asin a)))

(defn *acos
  "computes the arc-cosine of the argument.

  a - number from which arc-cosine is desired - `org.apache.commons.math4.dfp.Dfp`

  returns: acos(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a]
    (DfpMath/acos a)))

