(ns org.apache.commons.math4.analysis.interpolation.SplineInterpolator
  "Computes a natural (also known as \"free\", \"unclamped\") cubic spline interpolation for the data set.

  The interpolate(double[], double[]) method returns a PolynomialSplineFunction
  consisting of n cubic polynomials, defined over the subintervals determined by the x values,
  x[0] < x[i] ... < x[n].  The x values are referred to as \"knot points.\"

  The value of the PolynomialSplineFunction at a point x that is greater than or equal to the smallest
  knot point and strictly less than the largest knot point is computed by finding the subinterval to which
  x belongs and computing the value of the corresponding polynomial at x - x[i]  where
  i is the index of the subinterval.  See PolynomialSplineFunction for more details.


  The interpolating polynomials satisfy:
  The value of the PolynomialSplineFunction at each of the input x values equals the
   corresponding y value.
  Adjacent polynomials are equal through two derivatives at the knot points (i.e., adjacent polynomials
   \"match up\" at the knot points, as do their first and second derivatives).


  The cubic spline interpolation algorithm implemented is as described in R.L. Burden, J.D. Faires,
  Numerical Analysis, 4th Ed., 1989, PWS-Kent, ISBN 0-53491-585-X, pp 126-131."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation SplineInterpolator]))

(defn ->spline-interpolator
  "Constructor."
  (^SplineInterpolator []
    (new SplineInterpolator )))

(defn interpolate
  "Computes an interpolating function for the data set.

  x - the arguments for the interpolation points - `double[]`
  y - the values for the interpolation points - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if x and y have different sizes."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction [^SplineInterpolator this x y]
    (-> this (.interpolate x y))))

