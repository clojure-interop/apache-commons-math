(ns org.apache.commons.math4.analysis.interpolation.BicubicInterpolator
  "Generates a bicubic interpolating
  function.

   Caveat: Because the interpolation scheme requires that derivatives be
   specified at the sample points, those are approximated with finite
   differences (using the 2-points symmetric formulae).
   Since their values are undefined at the borders of the provided
   interpolation ranges, the interpolated values will be wrong at the
   edges of the patch.
   The interpolate method will return a function that overrides
   BicubicInterpolatingFunction.isValidPoint(double,double) to
   indicate points where the interpolation will be inaccurate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation BicubicInterpolator]))

(defn ->bicubic-interpolator
  "Constructor."
  (^BicubicInterpolator []
    (new BicubicInterpolator )))

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - All the x-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  yval - All the y-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  fval - The values of the interpolation points on all the grid knots: fval[i][j] = f(xval[i], yval[j]). - `double[][]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.interpolation.BicubicInterpolatingFunction`

  throws: org.apache.commons.math4.exception.NoDataException - if any of the arrays has zero length."
  (^org.apache.commons.math4.analysis.interpolation.BicubicInterpolatingFunction [^BicubicInterpolator this xval yval fval]
    (-> this (.interpolate xval yval fval))))

