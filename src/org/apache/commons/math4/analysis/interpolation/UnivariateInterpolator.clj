(ns org.apache.commons.math4.analysis.interpolation.UnivariateInterpolator
  "Interface representing a univariate real interpolating function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation UnivariateInterpolator]))

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - Arguments for the interpolation points. - `double[]`
  yval - Values for the interpolation points. - `double[]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.UnivariateFunction`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arguments violate assumptions made by the interpolation algorithm."
  (^org.apache.commons.math4.analysis.UnivariateFunction [^UnivariateInterpolator this xval yval]
    (-> this (.interpolate xval yval))))

