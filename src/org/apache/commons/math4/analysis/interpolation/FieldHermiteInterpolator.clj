(ns org.apache.commons.math4.analysis.interpolation.FieldHermiteInterpolator
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
  (:import [org.apache.commons.math4.analysis.interpolation FieldHermiteInterpolator]))

(defn ->field-hermite-interpolator
  "Constructor.

  Create an empty interpolator."
  (^FieldHermiteInterpolator []
    (new FieldHermiteInterpolator )))

(defn add-sample-point
  "Add a sample point.

   This method must be called once for each sample point. It is allowed to
   mix some calls with values only with calls with values and first
   derivatives.


   The point abscissae for all calls must be different.

  x - abscissa of the sample point - `T`
  value - value and derivatives of the sample point (if only one row is passed, it is the value, if two rows are passed the first one is the value and the second the derivative and so on) - `T[]`

  throws: org.apache.commons.math4.exception.ZeroException - if the abscissa difference between added point and a previous point is zero (i.e. the two points are at same abscissa)"
  ([^FieldHermiteInterpolator this x value]
    (-> this (.addSamplePoint x value))))

(defn value
  "Interpolate value at a specified abscissa.

  x - interpolation abscissa - `T`

  returns: interpolated value - `T[]`

  throws: org.apache.commons.math4.exception.NoDataException - if sample is empty"
  ([^FieldHermiteInterpolator this x]
    (-> this (.value x))))

(defn derivatives
  "Interpolate value and first derivatives at a specified abscissa.

  x - interpolation abscissa - `T`
  order - maximum derivation order - `int`

  returns: interpolated value and derivatives (value in row 0,
   1st derivative in row 1, ... nth derivative in row n) - `T[][]`

  throws: org.apache.commons.math4.exception.NoDataException - if sample is empty"
  ([^FieldHermiteInterpolator this x ^Integer order]
    (-> this (.derivatives x order))))

