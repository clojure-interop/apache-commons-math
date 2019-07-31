(ns org.apache.commons.math4.special.Gamma
  " This is a utility class that provides computation methods related to the
  Γ (Gamma) family of functions.


  Implementation of invGamma1pm1(double) and
  logGamma1p(double) is based on the algorithms described in

  Didonato and Morris
  (1986), Computation of the Incomplete Gamma Function Ratios and
      their Inverse, TOMS 12(4), 377-393,
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
  (:import [org.apache.commons.math4.special Gamma]))

(def *-gamma
  "Static Constant.

  Euler-Mascheroni constant

  type: double"
  Gamma/GAMMA)

(def *-lanczos-g
  "Static Constant.

  Constant \\( g = \\frac{607}{128} \\) in the Lanczos approximation.

  type: double"
  Gamma/LANCZOS_G)

(defn *gamma
  "Computes the value of \\( \\Gamma(x) \\).

   Based on the NSWC Library of Mathematics Subroutines double
   precision implementation, DGAMMA.

  x - Argument. - `double`

  returns: \\( \\Gamma(x) \\) - `double`"
  (^Double [^Double x]
    (Gamma/gamma x)))

(defn *trigamma
  "Computes the trigamma function \\( \\psi_1(x) = \\frac{d^2}{dx^2} (\\ln \\Gamma(x)) \\).

   This function is the derivative of the digamma function.

  x - Argument. - `double`

  returns: \\( \\psi_1(x) \\) to within \\( 10^{-8} \\) relative or absolute
   error whichever is smaller - `double`"
  (^Double [^Double x]
    (Gamma/trigamma x)))

(defn *digamma
  "Computes the digamma function, defined as the logarithmic derivative
   of the \\( \\Gamma \\) function:
   \\( \\frac{d}{dx}(\\ln \\Gamma(x)) = \\frac{\\Gamma^\\prime(x)}{\\Gamma(x)} \\).

   This is an independently written implementation of the algorithm described in
   Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.
   A
   reflection formula is incorporated to improve performance on negative values.

   Some of the constants have been changed to increase accuracy at the moderate
   expense of run-time.  The result should be accurate to within \\( 10^{-8} \\)
   relative tolerance for \\( 0 < x < 10^{-5} \\) and within \\( 10^{-8} \\) absolute
   tolerance otherwise.

  x - Argument. - `double`

  returns: digamma(x) to within \\( 10^{-8} \\) relative or absolute error whichever is larger. - `double`"
  (^Double [^Double x]
    (Gamma/digamma x)))

(defn *inv-gamma-1pm-1
  "Computes the function \\( \\frac{1}{\\Gamma(1  x)} - 1 \\) for \\( -0.5 \\leq x \\leq 1.5 \\).

   This implementation is based on the double precision implementation in
   the NSWC Library of Mathematics Subroutines, DGAM1.

  x - Argument. - `double`

  returns: \\( \\frac{1}{\\Gamma(1  x)} - 1 \\) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if x < -0.5"
  (^Double [^Double x]
    (Gamma/invGamma1pm1 x)))

(defn *log-gamma
  "Computes the function \\( \\ln \\Gamma(x) \\) for \\( x > 0 \\).


   For \\( x \\leq 8 \\), the implementation is based on the double precision
   implementation in the NSWC Library of Mathematics Subroutines,
   DGAMLN. For \\( x \\geq 8 \\), the implementation is based on



   Gamma
       Function, equation (28).

       Lanczos Approximation, equations (1) through (5).
   Paul Godfrey, A note on
       the computation of the convergent Lanczos complex Gamma
       approximation

  x - Argument. - `double`

  returns: \\( \\ln \\Gamma(x) \\), or NaN if x <= 0. - `double`"
  (^Double [^Double x]
    (Gamma/logGamma x)))

(defn *regularized-gamma-p
  "Computes the regularized gamma function \\( P(a, x) \\).

   The implementation of this method is based on:



     Regularized Gamma Function, equation (1)



     Incomplete Gamma Function, equation (4).



     Confluent Hypergeometric Function of the First Kind, equation (1).

  a - Parameter \\( a \\). - `double`
  x - Argument. - `double`
  epsilon - When the absolute value of the nth item in the series is less than epsilon the approximation ceases to calculate further elements in the series. - `double`
  max-iterations - Maximum number of \"iterations\" to complete. - `int`

  returns: \\( P(a, x) \\) - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the algorithm fails to converge."
  (^Double [^Double a ^Double x ^Double epsilon ^Integer max-iterations]
    (Gamma/regularizedGammaP a x epsilon max-iterations))
  (^Double [^Double a ^Double x]
    (Gamma/regularizedGammaP a x)))

(defn *lanczos
  "Computes the Lanczos approximation used to compute the gamma function.


   The Lanczos approximation is related to the Gamma function by the
   following equation
   \\[
   \\Gamma(x) = \\sqrt{2\\pi} \\, \\frac{(g  x  \\frac{1}{2})^{x  \\frac{1}{2}} \\, e^{-(g  x  \\frac{1}{2})} \\, \\mathrm{lanczos}(x)}
                                   {x}
   \\]
   where \\(g\\) is the Lanczos constant.

  x - Argument. - `double`

  returns: The Lanczos approximation. - `double`"
  (^Double [^Double x]
    (Gamma/lanczos x)))

(defn *regularized-gamma-q
  "Computes the regularized gamma function \\( Q(a, x) = 1 - P(a, x) \\).

   The implementation of this method is based on:



     Regularized Gamma Function, equation (1).



     Regularized incomplete gamma function: Continued fraction representations
     (formula 06.08.10.0003)

  a - Parameter \\( a \\). - `double`
  x - Argument. - `double`
  epsilon - When the absolute value of the nth item in the series is less than epsilon the approximation ceases to calculate further elements in the series. - `double`
  max-iterations - Maximum number of \"iterations\" to complete. - `int`

  returns: \\( Q(a, x) \\) - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the algorithm fails to converge."
  (^Double [^Double a ^Double x ^Double epsilon ^Integer max-iterations]
    (Gamma/regularizedGammaQ a x epsilon max-iterations))
  (^Double [^Double a ^Double x]
    (Gamma/regularizedGammaQ a x)))

(defn *log-gamma-1p
  "Computes the function \\( \\ln \\Gamma(1  x) \\) for \\( -0.5 \\leq x \\leq 1.5 \\).

   This implementation is based on the double precision implementation in
   the NSWC Library of Mathematics Subroutines, DGMLN1.

  x - Argument. - `double`

  returns: \\( \\ln \\Gamma(1  x) \\) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if x < -0.5."
  (^Double [^Double x]
    (Gamma/logGamma1p x)))

