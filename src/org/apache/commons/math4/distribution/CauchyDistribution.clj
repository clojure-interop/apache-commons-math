(ns org.apache.commons.math4.distribution.CauchyDistribution
  "Implementation of the Cauchy distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution CauchyDistribution]))

(defn ->cauchy-distribution
  "Constructor.

  Creates a distribution.

  median - Median for this distribution. - `double`
  scale - Scale parameter for this distribution. - `double`
  inverse-cum-accuracy - Maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if scale <= 0."
  (^CauchyDistribution [^Double median ^Double scale ^Double inverse-cum-accuracy]
    (new CauchyDistribution median scale inverse-cum-accuracy))
  (^CauchyDistribution [^Double median ^Double scale]
    (new CauchyDistribution median scale))
  (^CauchyDistribution []
    (new CauchyDistribution )))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  CauchyDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   The variance is always undefined no matter the parameters.

  returns: variance (always Double.NaN) - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^CauchyDistribution this]
    (-> this (.isSupportConnected))))

(defn get-median
  "Access the median.

  returns: the median for this distribution. - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getMedian))))

(defn get-scale
  "Access the scale parameter.

  returns: the scale parameter for this distribution. - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getScale))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution. For a random
   variable X distributed according to this distribution, the
   returned value is

   inf{x in R | P(X<=x) >= p} for 0 < p <= 1,
   inf{x in R | P(X<=x) > 0} for p = 0.


   The default implementation returns

   RealDistribution.getSupportLowerBound() for p = 0,
   RealDistribution.getSupportUpperBound() for p = 1.


   Returns Double.NEGATIVE_INFINITY when p == 0
   and Double.POSITIVE_INFINITY when p == 1.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^CauchyDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always negative infinity no matter
   the parameters.

  returns: lower bound of the support (always Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity no matter
   the parameters.

  returns: upper bound of the support (always Double.POSITIVE_INFINITY) - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getSupportUpperBound))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^CauchyDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   The mean is always undefined no matter the parameters.

  returns: mean (always Double.NaN) - `double`"
  (^Double [^CauchyDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^CauchyDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

