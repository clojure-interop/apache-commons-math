(ns org.apache.commons.math4.analysis.polynomials.PolynomialFunctionLagrangeForm
  "Implements the representation of a real polynomial function in

  Lagrange Form. For reference, see Introduction to Numerical
  Analysis, ISBN 038795452X, chapter 2.

  The approximated function should be smooth enough for Lagrange polynomial
  to work well. Otherwise, consider using splines instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialFunctionLagrangeForm]))

(defn ->polynomial-function-lagrange-form
  "Constructor.

  Construct a Lagrange polynomial with the given abscissas and function
   values. The order of interpolating points are not important.

   The constructor makes copy of the input arrays and assigns them.

  x - interpolating points - `double[]`
  y - function values at interpolating points - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths are different."
  (^PolynomialFunctionLagrangeForm [x y]
    (new PolynomialFunctionLagrangeForm x y)))

(defn *evaluate
  "Evaluate the Lagrange polynomial using

   Neville's Algorithm. It takes O(n^2) time.

  x - Interpolating points array. - `double[]`
  y - Interpolating values array. - `double[]`
  z - Point at which the function value is to be computed. - `double`

  returns: the function value. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if x and y have different lengths."
  (^Double [x y ^Double z]
    (PolynomialFunctionLagrangeForm/evaluate x y z)))

(defn *verify-interpolation-array
  "Check that the interpolation arrays are valid.
   The arrays features checked by this method are that both arrays have the
   same length and this length is at least 2.

  x - Interpolating points array. - `double[]`
  y - Interpolating values array. - `double[]`
  abort - Whether to throw an exception if x is not sorted. - `boolean`

  returns: false if the x is not sorted in increasing order,
   true otherwise. - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths are different."
  (^Boolean [x y ^Boolean abort]
    (PolynomialFunctionLagrangeForm/verifyInterpolationArray x y abort)))

(defn value
  "Calculate the function value at the given point.

  z - Point at which the function value is to be computed. - `double`

  returns: the function value. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if x and y have different lengths."
  (^Double [^PolynomialFunctionLagrangeForm this ^Double z]
    (-> this (.value z))))

(defn degree
  "Returns the degree of the polynomial.

  returns: the degree of the polynomial - `int`"
  (^Integer [^PolynomialFunctionLagrangeForm this]
    (-> this (.degree))))

(defn get-interpolating-points
  "Returns a copy of the interpolating points array.

   Changes made to the returned copy will not affect the polynomial.

  returns: a fresh copy of the interpolating points array - `double[]`"
  ([^PolynomialFunctionLagrangeForm this]
    (-> this (.getInterpolatingPoints))))

(defn get-interpolating-values
  "Returns a copy of the interpolating values array.

   Changes made to the returned copy will not affect the polynomial.

  returns: a fresh copy of the interpolating values array - `double[]`"
  ([^PolynomialFunctionLagrangeForm this]
    (-> this (.getInterpolatingValues))))

(defn get-coefficients
  "Returns a copy of the coefficients array.

   Changes made to the returned copy will not affect the polynomial.

   Note that coefficients computation can be ill-conditioned. Use with caution
   and only when it is necessary.

  returns: a fresh copy of the coefficients array - `double[]`"
  ([^PolynomialFunctionLagrangeForm this]
    (-> this (.getCoefficients))))

