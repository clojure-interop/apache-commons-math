(ns org.apache.commons.math4.analysis.interpolation.TricubicInterpolatingFunction
  "Function that implements the

  tricubic spline interpolation, as proposed in

   Tricubic interpolation in three dimensions
   F. Lekien and J. Marsden
   Int. J. Numer. Meth. Eng 2005; 63:455-471"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation TricubicInterpolatingFunction]))

(defn ->tricubic-interpolating-function
  "Constructor.

  x - Sample values of the x-coordinate, in increasing order. - `double[]`
  y - Sample values of the y-coordinate, in increasing order. - `double[]`
  z - Sample values of the y-coordinate, in increasing order. - `double[]`
  f - Values of the function on every grid point. - `double[][][]`
  d-fd-x - Values of the partial derivative of function with respect to x on every grid point. - `double[][][]`
  d-fd-y - Values of the partial derivative of function with respect to y on every grid point. - `double[][][]`
  d-fd-z - Values of the partial derivative of function with respect to z on every grid point. - `double[][][]`
  d-2-fd-xd-y - Values of the cross partial derivative of function on every grid point. - `double[][][]`
  d-2-fd-xd-z - Values of the cross partial derivative of function on every grid point. - `double[][][]`
  d-2-fd-yd-z - Values of the cross partial derivative of function on every grid point. - `double[][][]`
  d-3-fd-xd-yd-z - Values of the cross partial derivative of function on every grid point. - `double[][][]`

  throws: org.apache.commons.math4.exception.NoDataException - if any of the arrays has zero length."
  (^TricubicInterpolatingFunction [x y z f d-fd-x d-fd-y d-fd-z d-2-fd-xd-y d-2-fd-xd-z d-2-fd-yd-z d-3-fd-xd-yd-z]
    (new TricubicInterpolatingFunction x y z f d-fd-x d-fd-y d-fd-z d-2-fd-xd-y d-2-fd-xd-z d-2-fd-yd-z d-3-fd-xd-yd-z)))

(defn value
  "Compute the value for the function.

  x - x-coordinate for which the function value should be computed. - `double`
  y - y-coordinate for which the function value should be computed. - `double`
  z - z-coordinate for which the function value should be computed. - `double`

  returns: the value. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if any of the variables is outside its interpolation range."
  (^Double [^TricubicInterpolatingFunction this ^Double x ^Double y ^Double z]
    (-> this (.value x y z))))

(defn valid-point?
  "Indicates whether a point is within the interpolation range.

  x - First coordinate. - `double`
  y - Second coordinate. - `double`
  z - Third coordinate. - `double`

  returns: true if (x, y, z) is a valid point. - `boolean`"
  (^Boolean [^TricubicInterpolatingFunction this ^Double x ^Double y ^Double z]
    (-> this (.isValidPoint x y z))))

