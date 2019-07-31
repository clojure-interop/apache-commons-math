(ns org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction
  "Represents a polynomial spline function.

  A polynomial spline function consists of a set of
  interpolating polynomials and an ascending array of domain
  knot points, determining the intervals over which the spline function
  is defined by the constituent polynomials.  The polynomials are assumed to
  have been computed to match the values of another function at the knot
  points.  The value consistency constraints are not currently enforced by
  PolynomialSplineFunction itself, but are assumed to hold among
  the polynomials and knot points passed to the constructor.

  N.B.:  The polynomials in the polynomials property must be
  centered on the knot points to compute the spline function values.
  See below.

  The domain of the polynomial spline function is
  [smallest knot, largest knot].  Attempts to evaluate the
  function at values outside of this range generate IllegalArgumentExceptions.


  The value of the polynomial spline function for an argument x
  is computed as follows:

  The knot array is searched to find the segment to which x
  belongs.  If x is less than the smallest knot point or greater
  than the largest one, an IllegalArgumentException
  is thrown.
   Let j be the index of the largest knot point that is less
  than or equal to x.  The value returned is
  polynomials[j](x - knot[j])"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialSplineFunction]))

(defn ->polynomial-spline-function
  "Constructor.

  Construct a polynomial spline function with the given segment delimiters
   and interpolating polynomials.
   The constructor copies both arrays and assigns the copies to the knots
   and polynomials properties, respectively.

  knots - Spline segment interval delimiters. - `double[]`
  polynomials - Polynomial functions that make up the spline. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either of the input arrays is null."
  (^PolynomialSplineFunction [knots polynomials]
    (new PolynomialSplineFunction knots polynomials)))

(defn value
  "Compute the value for the function.
   See PolynomialSplineFunction for details on the algorithm for
   computing the value of the function.

  v - Point for which the function value should be computed. - `double`

  returns: the value. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if v is outside of the domain of the spline function (smaller than the smallest knot point or larger than the largest knot point)."
  (^Double [^PolynomialSplineFunction this ^Double v]
    (-> this (.value v))))

(defn polynomial-spline-derivative
  "Get the derivative of the polynomial spline function.

  returns: the derivative function. - `org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction [^PolynomialSplineFunction this]
    (-> this (.polynomialSplineDerivative))))

(defn get-n
  "Get the number of spline segments.
   It is also the number of polynomials and the number of knot points - 1.

  returns: the number of spline segments. - `int`"
  (^Integer [^PolynomialSplineFunction this]
    (-> this (.getN))))

(defn get-polynomials
  "Get a copy of the interpolating polynomials array.
   It returns a fresh copy of the array. Changes made to the copy will
   not affect the polynomials property.

  returns: the interpolating polynomials. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction[]`"
  ([^PolynomialSplineFunction this]
    (-> this (.getPolynomials))))

(defn get-knots
  "Get an array copy of the knot points.
   It returns a fresh copy of the array. Changes made to the copy
   will not affect the knots property.

  returns: the knot points. - `double[]`"
  ([^PolynomialSplineFunction this]
    (-> this (.getKnots))))

(defn valid-point?
  "Indicates whether a point is within the interpolation range.

  x - Point. - `double`

  returns: true if x is a valid point. - `boolean`"
  (^Boolean [^PolynomialSplineFunction this ^Double x]
    (-> this (.isValidPoint x))))

