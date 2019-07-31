(ns org.apache.commons.math4.analysis.interpolation.LoessInterpolator
  "Implements the
  Local Regression Algorithm (also Loess, Lowess) for interpolation of
  real univariate functions.

  For reference, see

  William S. Cleveland - Robust Locally Weighted Regression and Smoothing
  Scatterplots

  This class implements both the loess method and serves as an interpolation
  adapter to it, allowing one to build a spline on the obtained loess fit."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation LoessInterpolator]))

(defn ->loess-interpolator
  "Constructor.

  Construct a new LoessInterpolator
   with given bandwidth, number of robustness iterations and accuracy.

  bandwidth - when computing the loess fit at a particular point, this fraction of source points closest to the current point is taken into account for computing a least-squares regression. A sensible value is usually 0.25 to 0.5, the default value is DEFAULT_BANDWIDTH. - `double`
  robustness-iters - This many robustness iterations are done. A sensible value is usually 0 (just the initial fit without any robustness iterations) to 4, the default value is DEFAULT_ROBUSTNESS_ITERS. - `int`
  accuracy - If the median residual at a certain robustness iteration is less than this amount, no more iterations are done. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if bandwidth does not lie in the interval [0,1]."
  (^LoessInterpolator [^Double bandwidth ^Integer robustness-iters ^Double accuracy]
    (new LoessInterpolator bandwidth robustness-iters accuracy))
  (^LoessInterpolator [^Double bandwidth ^Integer robustness-iters]
    (new LoessInterpolator bandwidth robustness-iters))
  (^LoessInterpolator []
    (new LoessInterpolator )))

(def *-default-bandwidth
  "Static Constant.

  Default value of the bandwidth parameter.

  type: double"
  LoessInterpolator/DEFAULT_BANDWIDTH)

(def *-default-robustness-iters
  "Static Constant.

  Default value of the number of robustness iterations.

  type: int"
  LoessInterpolator/DEFAULT_ROBUSTNESS_ITERS)

(def *-default-accuracy
  "Static Constant.

  Default value for accuracy.

  type: double"
  LoessInterpolator/DEFAULT_ACCURACY)

(defn interpolate
  "Compute an interpolating function by performing a loess fit
   on the data at the original abscissae and then building a cubic spline
   with a
   SplineInterpolator
   on the resulting fit.

  xval - the arguments for the interpolation points - `double[]`
  yval - the values for the interpolation points - `double[]`

  returns: A cubic spline built upon a loess fit to the data at the original abscissae - `org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if xval not sorted in strictly increasing order."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction [^LoessInterpolator this xval yval]
    (-> this (.interpolate xval yval))))

(defn smooth
  "Compute a weighted loess fit on the data at the original abscissae.

  xval - Arguments for the interpolation points. - `double[]`
  yval - Values for the interpolation points. - `double[]`
  weights - point weights: coefficients by which the robustness weight of a point is multiplied. - `double[]`

  returns: the values of the loess fit at corresponding original abscissae. - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if xval not sorted in strictly increasing order."
  ([^LoessInterpolator this xval yval weights]
    (-> this (.smooth xval yval weights)))
  ([^LoessInterpolator this xval yval]
    (-> this (.smooth xval yval))))

