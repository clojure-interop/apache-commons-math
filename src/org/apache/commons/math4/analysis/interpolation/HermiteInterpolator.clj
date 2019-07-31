(ns org.apache.commons.math4.analysis.interpolation.HermiteInterpolator
  "Polynomial interpolator using both sample values and sample derivatives.

  The interpolation polynomials match all sample points, including both values
  and provided derivatives. There is one polynomial for each component of
  the values vector. All polynomials have the same degree. The degree of the
  polynomials depends on the number of points and number of derivatives at each
  point. For example the interpolation polynomials for n sample points without
  any derivatives all have degree n-1. The interpolation polynomials for n
  sample points with the two extreme points having value and first derivative
  and the remaining points having value only all have degree n+1. The
  interpolation polynomial for n sample points with value, first and second
  derivative for all points all have degree 3n-1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation HermiteInterpolator]))

(defn ->hermite-interpolator
  "Constructor.

  Create an empty interpolator."
  (^HermiteInterpolator []
    (new HermiteInterpolator )))

(defn add-sample-point
  "Add a sample point.

   This method must be called once for each sample point. It is allowed to
   mix some calls with values only with calls with values and first
   derivatives.


   The point abscissae for all calls must be different.

  x - abscissa of the sample point - `double`
  value - value and derivatives of the sample point (if only one row is passed, it is the value, if two rows are passed the first one is the value and the second the derivative and so on) - `double[]`

  throws: org.apache.commons.math4.exception.ZeroException - if the abscissa difference between added point and a previous point is zero (i.e. the two points are at same abscissa)"
  ([^HermiteInterpolator this ^Double x value]
    (-> this (.addSamplePoint x value))))

(defn get-polynomials
  "Compute the interpolation polynomials.

  returns: interpolation polynomials array - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction[]`

  throws: org.apache.commons.math4.exception.NoDataException - if sample is empty"
  ([^HermiteInterpolator this]
    (-> this (.getPolynomials))))

(defn value
  "Interpolate value at a specified abscissa.

   Calling this method is equivalent to call the value methods of all polynomials returned by getPolynomials,
   except it does not build the intermediate polynomials, so this method is faster and
   numerically more stable.

  x - interpolation abscissa - `double`

  returns: interpolated value - `double[]`

  throws: org.apache.commons.math4.exception.NoDataException - if sample is empty"
  ([^HermiteInterpolator this ^Double x]
    (-> this (.value x))))

