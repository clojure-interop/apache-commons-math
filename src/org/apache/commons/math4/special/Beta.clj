(ns org.apache.commons.math4.special.Beta
  " This is a utility class that provides computation methods related to the
  Beta family of functions.


  Implementation of logBeta(double, double) is based on the
  algorithms described in

  Didonato and Morris
      (1986), Computation of the Incomplete Gamma Function Ratios
      and their Inverse, TOMS 12(4), 377-393,
  Didonato and Morris
      (1992), Algorithm 708: Significant Digit Computation of the
      Incomplete Beta Function Ratios, TOMS 18(3), 360-373,

  and implemented in the
  NSWC Library of Mathematical Functions,
  available
  here.
  This library is \"approved for public release\", and the
  Copyright guidance
  indicates that unless otherwise stated in the code, all FORTRAN functions in
  this library are license free. Since no such notice appears in the code these
  functions can safely be ported to Commons-Math."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.special Beta]))

(defn *regularized-beta
  "Returns the regularized beta function I(x, a, b).

   The implementation of this method is based on:



   Regularized Beta Function.


   Regularized Beta Function.

  x - the value. - `double`
  a - Parameter a. - `double`
  b - Parameter b. - `double`
  epsilon - When the absolute value of the nth item in the series is less than epsilon the approximation ceases to calculate further elements in the series. - `double`
  max-iterations - Maximum number of \"iterations\" to complete. - `int`

  returns: the regularized beta function I(x, a, b) - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the algorithm fails to converge."
  (^Double [^Double x ^Double a ^Double b ^Double epsilon ^Integer max-iterations]
    (Beta/regularizedBeta x a b epsilon max-iterations))
  (^Double [^Double x ^Double a ^Double b ^Double epsilon]
    (Beta/regularizedBeta x a b epsilon))
  (^Double [^Double x ^Double a ^Double b]
    (Beta/regularizedBeta x a b)))

(defn *log-beta
  "Returns the value of log B(p, q) for 0 ≤ x ≤ 1 and p, q > 0. Based on the
   NSWC Library of Mathematics Subroutines implementation,
   DBETLN.

  p - First argument. - `double`
  q - Second argument. - `double`

  returns: the value of log(Beta(p, q)), NaN if
   p <= 0 or q <= 0. - `double`"
  (^Double [^Double p ^Double q]
    (Beta/logBeta p q)))

