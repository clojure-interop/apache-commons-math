(ns org.apache.commons.math4.analysis.interpolation.MultivariateInterpolator
  "Interface representing a univariate real interpolating function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation MultivariateInterpolator]))

(defn interpolate
  "Computes an interpolating function for the data set.

  xval - the arguments for the interpolation points. xval[i][0] is the first component of interpolation point i, xval[i][1] is the second component, and so on until xval[i][d-1], the last component of that interpolation point (where d is thus the dimension of the space). - `double[][]`
  yval - the values for the interpolation points - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.MultivariateFunction`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arguments violate assumptions made by the interpolation algorithm."
  (^org.apache.commons.math4.analysis.MultivariateFunction [^MultivariateInterpolator this xval yval]
    (-> this (.interpolate xval yval))))

