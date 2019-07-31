(ns org.apache.commons.math4.distribution.LogNormalDistribution
  "Implementation of the log-normal (gaussian) distribution.


  Parameters:
  X is log-normally distributed if its natural logarithm log(X)
  is normally distributed. The probability distribution function of X
  is given by (for x > 0)


  exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)


  m is the scale parameter: this is the mean of the
  normally distributed natural logarithm of this distribution,
  s is the shape parameter: this is the standard
  deviation of the normally distributed natural logarithm of this
  distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution LogNormalDistribution]))

(defn ->log-normal-distribution
  "Constructor.

  Creates a log-normal distribution.

  scale - Scale parameter of this distribution. - `double`
  shape - Shape parameter of this distribution. - `double`
  inverse-cum-accuracy - Inverse cumulative probability accuracy. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if shape <= 0."
  (^LogNormalDistribution [^Double scale ^Double shape ^Double inverse-cum-accuracy]
    (new LogNormalDistribution scale shape inverse-cum-accuracy))
  (^LogNormalDistribution [^Double scale ^Double shape]
    (new LogNormalDistribution scale shape))
  (^LogNormalDistribution []
    (new LogNormalDistribution )))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  LogNormalDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^LogNormalDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(x0 < X <= x1).

  x-0 - Lower bound (excluded). - `double`
  x-1 - Upper bound (included). - `double`

  returns: the probability that a random variable with this distribution
   takes a value between x0 and x1, excluding the lower
   and including the upper endpoint. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if x0 > x1. The default implementation uses the identity P(x0 < X <= x1) = P(X <= x1) - P(X <= x0)"
  (^Double [^LogNormalDistribution this ^Double x-0 ^Double x-1]
    (-> this (.probability x-0 x-1))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For scale m and shape s, the variance is
   (exp(s^2) - 1) * exp(2 * m  s^2).

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^LogNormalDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Returns the scale parameter of this distribution.

  returns: the scale parameter - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getScale))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-shape
  "Returns the shape parameter of this distribution.

  returns: the shape parameter - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getShape))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity
   no matter the parameters.

  returns: upper bound of the support (always
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getSupportUpperBound))))

(defn log-density
  "Returns the natural logarithm of the probability density function
   (PDF) of this distribution evaluated at the specified point x.
   In general, the PDF is the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate replacement
   should be returned, e.g. Double.POSITIVE_INFINITY, Double.NaN,
   or the limit inferior or limit superior of the difference quotient. Note that
   due to the floating point precision and under/overflow issues, this method will
   for some distributions be more precise and faster than computing the logarithm of
   RealDistribution.density(double).

   The default implementation simply computes the logarithm of density(x).

   See documentation of density(double) for computation details.

  x - the point at which the PDF is evaluated - `double`

  returns: the logarithm of the value of the probability density function at point x - `double`"
  (^Double [^LogNormalDistribution this ^Double x]
    (-> this (.logDensity x))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

   For scale m, and shape s of this distribution, the PDF
   is given by

   0 if x <= 0,
   exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)
   otherwise.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^LogNormalDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For scale m and shape s, the mean is
   exp(m  s^2 / 2).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   For scale m, and shape s of this distribution, the CDF
   is given by

   0 if x <= 0,
   0 if ln(x) - m < 0 and m - ln(x) > 40 * s, as
   in these cases the actual value is within Double.MIN_VALUE of 0,
   1 if ln(x) - m >= 0 and ln(x) - m > 40 * s,
   as in these cases the actual value is within Double.MIN_VALUE of
   1,
   0.5  0.5 * erf((ln(x) - m) / (s * sqrt(2)) otherwise.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^LogNormalDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

