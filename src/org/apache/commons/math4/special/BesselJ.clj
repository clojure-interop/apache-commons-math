(ns org.apache.commons.math4.special.BesselJ
  "This class provides computation methods related to Bessel
  functions of the first kind. Detailed descriptions of these functions are
  available in Wikipedia, Abrabowitz and
  Stegun (Ch. 9-11), and DLMF (Ch. 10).

  This implementation is based on the rjbesl Fortran routine at
  Netlib.

  From the Fortran code:

  This program is based on a program written by David J. Sookne (2) that
  computes values of the Bessel functions J or I of real argument and integer
  order. Modifications include the restriction of the computation to the J
  Bessel function of non-negative real argument, the extension of the
  computation to arbitrary positive order, and the elimination of most
  underflow.

  References:

  \"A Note on Backward Recurrence Algorithms,\" Olver, F. W. J., and Sookne,
  D. J., Math. Comp. 26, 1972, pp 941-947.
  \"Bessel Functions of Real Argument and Integer Order,\" Sookne, D. J., NBS
  Jour. of Res. B. 77B, 1973, pp 125-132."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.special BesselJ]))

(defn ->bessel-j
  "Constructor.

  Create a new BesselJ with the given order.

  order - order of the function computed when using value(double). - `double`"
  (^BesselJ [^Double order]
    (new BesselJ order)))

(defn *value
  "Returns the first Bessel function, \\(J_{order}(x)\\).

  order - Order of the Bessel function - `double`
  x - Argument - `double`

  returns: Value of the Bessel function of the first kind, \\(J_{order}(x)\\) - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if x is too large relative to order"
  (^Double [^Double order ^Double x]
    (BesselJ/value order x)))

(defn *rj-besl
  "Calculates Bessel functions \\(J_{n+alpha}(x)\\) for
   non-negative argument x, and non-negative order n  alpha.

   Before using the output vector, the user should check that
   nVals = nb, i.e., all orders have been calculated to the desired accuracy.
   See BesselResult class javadoc for details on return values.

  x - non-negative real argument for which J's are to be calculated - `double`
  alpha - fractional part of order for which J's or exponentially scaled J's (\\(J\\cdot e^{x}\\)) are to be calculated. 0 <= alpha < 1.0. - `double`
  nb - integer number of functions to be calculated, nb > 0. The first function calculated is of order alpha, and the last is of order nb - 1 alpha. - `int`

  returns: BesselJResult a vector of the functions
   \\(J_{alpha}(x)\\) through \\(J_{nb-1+alpha}(x)\\), or the corresponding exponentially
   scaled functions and an integer output variable indicating possible errors - `org.apache.commons.math4.special.BesselJ$BesselJResult`"
  (^org.apache.commons.math4.special.BesselJ$BesselJResult [^Double x ^Double alpha ^Integer nb]
    (BesselJ/rjBesl x alpha nb)))

(defn value
  "Returns the value of the constructed Bessel function of the first kind,
   for the passed argument.

  x - Argument - `double`

  returns: Value of the Bessel function at x - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if x is too large relative to order"
  (^Double [^BesselJ this ^Double x]
    (-> this (.value x))))

