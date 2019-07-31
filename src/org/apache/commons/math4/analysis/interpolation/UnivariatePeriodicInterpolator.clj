(ns org.apache.commons.math4.analysis.interpolation.UnivariatePeriodicInterpolator
  "Adapter for classes implementing the UnivariateInterpolator
  interface.
  The data to be interpolated is assumed to be periodic. Thus values that are
  outside of the range can be passed to the interpolation function: They will
  be wrapped into the initial range before being passed to the class that
  actually computes the interpolation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation UnivariatePeriodicInterpolator]))

(defn ->univariate-periodic-interpolator
  "Constructor.

  Builds an interpolator.

  interpolator - Interpolator. - `org.apache.commons.math4.analysis.interpolation.UnivariateInterpolator`
  period - Period. - `double`
  extend - Number of points to be appended at the beginning and end of the sample arrays in order to avoid interpolation failure at the (periodic) boundaries of the orginal interval. The value is the number of sample points which the original interpolator needs on each side of the interpolated point. - `int`"
  (^UnivariatePeriodicInterpolator [^org.apache.commons.math4.analysis.interpolation.UnivariateInterpolator interpolator ^Double period ^Integer extend]
    (new UnivariatePeriodicInterpolator interpolator period extend))
  (^UnivariatePeriodicInterpolator [^org.apache.commons.math4.analysis.interpolation.UnivariateInterpolator interpolator ^Double period]
    (new UnivariatePeriodicInterpolator interpolator period)))

(def *-default-extend
  "Static Constant.

  Default number of extension points of the samples array.

  type: int"
  UnivariatePeriodicInterpolator/DEFAULT_EXTEND)

(defn interpolate
  "Compute an interpolating function for the dataset.

  xval - Arguments for the interpolation points. - `double[]`
  yval - Values for the interpolation points. - `double[]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.UnivariateFunction`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the number of extension points is larger than the size of xval."
  (^org.apache.commons.math4.analysis.UnivariateFunction [^UnivariatePeriodicInterpolator this xval yval]
    (-> this (.interpolate xval yval))))

