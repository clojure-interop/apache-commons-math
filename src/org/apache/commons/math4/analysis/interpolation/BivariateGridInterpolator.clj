(ns org.apache.commons.math4.analysis.interpolation.BivariateGridInterpolator
  "Interface representing a bivariate real interpolating function where the
  sample points must be specified on a regular grid."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation BivariateGridInterpolator]))

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - All the x-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  yval - All the y-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  fval - The values of the interpolation points on all the grid knots: fval[i][j] = f(xval[i], yval[j]). - `double[][]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.BivariateFunction`

  throws: org.apache.commons.math4.exception.NoDataException - if any of the arrays has zero length."
  (^org.apache.commons.math4.analysis.BivariateFunction [^BivariateGridInterpolator this xval yval fval]
    (-> this (.interpolate xval yval fval))))

