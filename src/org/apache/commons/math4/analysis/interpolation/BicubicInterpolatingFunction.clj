(ns org.apache.commons.math4.analysis.interpolation.BicubicInterpolatingFunction
  "Function that implements the

  bicubic spline interpolation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation BicubicInterpolatingFunction]))

(defn ->bicubic-interpolating-function
  "Constructor.

  x - Sample values of the x-coordinate, in increasing order. - `double[]`
  y - Sample values of the y-coordinate, in increasing order. - `double[]`
  f - Values of the function on every grid point. - `double[][]`
  d-fd-x - Values of the partial derivative of function with respect to x on every grid point. - `double[][]`
  d-fd-y - Values of the partial derivative of function with respect to y on every grid point. - `double[][]`
  d-2-fd-xd-y - Values of the cross partial derivative of function on every grid point. - `double[][]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the various arrays do not contain the expected number of elements."
  (^BicubicInterpolatingFunction [x y f d-fd-x d-fd-y d-2-fd-xd-y]
    (new BicubicInterpolatingFunction x y f d-fd-x d-fd-y d-2-fd-xd-y)))

(defn value
  "Compute the value for the function.

  x - Abscissa for which the function value should be computed. - `double`
  y - Ordinate for which the function value should be computed. - `double`

  returns: the value. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException"
  (^Double [^BicubicInterpolatingFunction this ^Double x ^Double y]
    (-> this (.value x y))))

(defn valid-point?
  "Indicates whether a point is within the interpolation range.

  x - First coordinate. - `double`
  y - Second coordinate. - `double`

  returns: true if (x, y) is a valid point. - `boolean`"
  (^Boolean [^BicubicInterpolatingFunction this ^Double x ^Double y]
    (-> this (.isValidPoint x y))))

