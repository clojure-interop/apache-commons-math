(ns org.apache.commons.math4.analysis.interpolation.PiecewiseBicubicSplineInterpolator
  "Generates a piecewise-bicubic interpolating function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation PiecewiseBicubicSplineInterpolator]))

(defn ->piecewise-bicubic-spline-interpolator
  "Constructor."
  (^PiecewiseBicubicSplineInterpolator []
    (new PiecewiseBicubicSplineInterpolator )))

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - All the x-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  yval - All the y-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  fval - The values of the interpolation points on all the grid knots: fval[i][j] = f(xval[i], yval[j]). - `double[][]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.interpolation.PiecewiseBicubicSplineInterpolatingFunction`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths are inconsistent."
  (^org.apache.commons.math4.analysis.interpolation.PiecewiseBicubicSplineInterpolatingFunction [^PiecewiseBicubicSplineInterpolator this xval yval fval]
    (-> this (.interpolate xval yval fval))))

