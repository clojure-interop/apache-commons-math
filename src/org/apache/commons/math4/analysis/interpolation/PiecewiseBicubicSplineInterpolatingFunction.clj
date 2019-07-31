(ns org.apache.commons.math4.analysis.interpolation.PiecewiseBicubicSplineInterpolatingFunction
  "Function that implements the
  bicubic spline
  interpolation.
  This implementation currently uses AkimaSplineInterpolator as the
  underlying one-dimensional interpolator, which requires 5 sample points;
  insufficient data will raise an exception when the
  value method is called."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation PiecewiseBicubicSplineInterpolatingFunction]))

(defn ->piecewise-bicubic-spline-interpolating-function
  "Constructor.

  x - Sample values of the x-coordinate, in increasing order. - `double[]`
  y - Sample values of the y-coordinate, in increasing order. - `double[]`
  f - Values of the function on every grid point. the expected number of elements. - `double[][]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if x or y are not strictly increasing."
  (^PiecewiseBicubicSplineInterpolatingFunction [x y f]
    (new PiecewiseBicubicSplineInterpolatingFunction x y f)))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException"
  (^Double [^PiecewiseBicubicSplineInterpolatingFunction this ^Double x ^Double y]
    (-> this (.value x y))))

(defn valid-point?
  "Indicates whether a point is within the interpolation range.

  x - First coordinate. - `double`
  y - Second coordinate. - `double`

  returns: true if (x, y) is a valid point. - `boolean`"
  (^Boolean [^PiecewiseBicubicSplineInterpolatingFunction this ^Double x ^Double y]
    (-> this (.isValidPoint x y))))

