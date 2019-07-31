(ns org.apache.commons.math4.analysis.interpolation.TrivariateGridInterpolator
  "Interface representing a trivariate real interpolating function where the
  sample points must be specified on a regular grid."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation TrivariateGridInterpolator]))

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - All the x-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  yval - All the y-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  zval - All the z-coordinates of the interpolation points, sorted in increasing order. - `double[]`
  fval - the values of the interpolation points on all the grid knots: fval[i][j][k] = f(xval[i], yval[j], zval[k]). - `double[][][]`

  returns: a function that interpolates the data set. - `org.apache.commons.math4.analysis.TrivariateFunction`

  throws: org.apache.commons.math4.exception.NoDataException - if any of the arrays has zero length."
  (^org.apache.commons.math4.analysis.TrivariateFunction [^TrivariateGridInterpolator this xval yval zval fval]
    (-> this (.interpolate xval yval zval fval))))

