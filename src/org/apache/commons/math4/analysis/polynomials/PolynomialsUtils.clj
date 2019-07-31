(ns org.apache.commons.math4.analysis.polynomials.PolynomialsUtils
  "A collection of static methods that operate on or return polynomials."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialsUtils]))

(defn *create-chebyshev-polynomial
  "Create a Chebyshev polynomial of the first kind.
   Chebyshev
   polynomials of the first kind are orthogonal polynomials.
   They can be defined by the following recurrence relations:
   \\(
      T_0(x) = 1 \\\\
      T_1(x) = x \\\\
      T_{k+1}(x) = 2x T_k(x) - T_{k-1}(x)
   \\)

  degree - degree of the polynomial - `int`

  returns: Chebyshev polynomial of specified degree - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^Integer degree]
    (PolynomialsUtils/createChebyshevPolynomial degree)))

(defn *create-hermite-polynomial
  "Create a Hermite polynomial.
   Hermite
   polynomials are orthogonal polynomials.
   They can be defined by the following recurrence relations:
   \\(
    H_0(x) = 1 \\\\
    H_1(x) = 2x \\\\
    H_{k+1}(x) = 2x H_k(X) - 2k H_{k-1}(x)
   \\)

  degree - degree of the polynomial - `int`

  returns: Hermite polynomial of specified degree - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^Integer degree]
    (PolynomialsUtils/createHermitePolynomial degree)))

(defn *create-laguerre-polynomial
  "Create a Laguerre polynomial.
   Laguerre
   polynomials are orthogonal polynomials.
   They can be defined by the following recurrence relations:
   \\(
     L_0(x) = 1 \\\\
     L_1(x) = 1 - x \\\\
     (k+1) L_{k+1}(x) = (2k  1 - x) L_k(x) - k L_{k-1}(x)
   \\)

  degree - degree of the polynomial - `int`

  returns: Laguerre polynomial of specified degree - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^Integer degree]
    (PolynomialsUtils/createLaguerrePolynomial degree)))

(defn *create-legendre-polynomial
  "Create a Legendre polynomial.
   Legendre
   polynomials are orthogonal polynomials.
   They can be defined by the following recurrence relations:
   \\(
     P_0(x) = 1 \\\\
     P_1(x) = x \\\\
     (k+1) P_{k+1}(x) = (2k+1) x P_k(x) - k P_{k-1}(x)
   \\)

  degree - degree of the polynomial - `int`

  returns: Legendre polynomial of specified degree - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^Integer degree]
    (PolynomialsUtils/createLegendrePolynomial degree)))

(defn *create-jacobi-polynomial
  "Create a Jacobi polynomial.
   Jacobi
   polynomials are orthogonal polynomials.
   They can be defined by the following recurrence relations:
   \\(
      P_0^{vw}(x) = 1 \\\\
      P_{-1}^{vw}(x) = 0 \\\\
      2k(k  v  w)(2k  v  w - 2) P_k^{vw}(x) = \\\\
      (2k  v  w - 1)[(2k  v  w)(2k  v  w - 2) x  v^2 - w^2] P_{k-1}^{vw}(x) \\\\
    - 2(k  v - 1)(k  w - 1)(2k  v  w) P_{k-2}^{vw}(x)
   \\)

  degree - degree of the polynomial - `int`
  v - first exponent - `int`
  w - second exponent - `int`

  returns: Jacobi polynomial of specified degree - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^Integer degree ^Integer v ^Integer w]
    (PolynomialsUtils/createJacobiPolynomial degree v w)))

(defn *shift
  "Compute the coefficients of the polynomial \\(P_s(x)\\)
   whose values at point x will be the same as the those from the
   original polynomial \\(P(x)\\) when computed at x  shift.

   More precisely, let \\(\\Delta = \\) shift and let
   \\(P_s(x) = P(x  \\Delta)\\).  The returned array
   consists of the coefficients of \\(P_s\\).  So if \\(a_0, ..., a_{n-1}\\)
   are the coefficients of \\(P\\), then the returned array
   \\(b_0, ..., b_{n-1}\\) satisfies the identity
   \\(\\sum_{i=0}^{n-1} b_i x^i = \\sum_{i=0}^{n-1} a_i (x  \\Delta)^i\\) for all \\(x\\).

  coefficients - Coefficients of the original polynomial. - `double[]`
  shift - Shift value. - `double`

  returns: the coefficients \\(b_i\\) of the shifted
   polynomial. - `double[]`"
  ([coefficients ^Double shift]
    (PolynomialsUtils/shift coefficients shift)))

