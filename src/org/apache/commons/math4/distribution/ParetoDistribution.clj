(ns org.apache.commons.math4.distribution.ParetoDistribution
  "Implementation of the Pareto distribution.


  Parameters:
  The probability distribution function of X is given by (for x >= k):


   α * k^α / x^(α  1)


  k is the scale parameter: this is the minimum possible value of X,
  α is the shape parameter: this is the Pareto index"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution ParetoDistribution]))

(defn ->pareto-distribution
  "Constructor.

  Creates a Pareto distribution.

  scale - Scale parameter of this distribution. - `double`
  shape - Shape parameter of this distribution. - `double`
  inverse-cum-accuracy - Inverse cumulative probability accuracy. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if scale <= 0 or shape <= 0."
  (^ParetoDistribution [^Double scale ^Double shape ^Double inverse-cum-accuracy]
    (new ParetoDistribution scale shape inverse-cum-accuracy))
  (^ParetoDistribution [^Double scale ^Double shape]
    (new ParetoDistribution scale shape))
  (^ParetoDistribution []
    (new ParetoDistribution )))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  ParetoDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^ParetoDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For scale k and shape α, the variance is given by

   ∞ if 1 < α <= 2,
   k^2 * α / ((α - 1)^2 * (α - 2)) otherwise.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^ParetoDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^ParetoDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Returns the scale parameter of this distribution.

  returns: the scale parameter - `double`"
  (^Double [^ParetoDistribution this]
    (-> this (.getScale))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is equal to the scale parameter k.

  returns: lower bound of the support - `double`"
  (^Double [^ParetoDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-shape
  "Returns the shape parameter of this distribution.

  returns: the shape parameter - `double`"
  (^Double [^ParetoDistribution this]
    (-> this (.getShape))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity no matter the parameters.

  returns: upper bound of the support (always Double.POSITIVE_INFINITY) - `double`"
  (^Double [^ParetoDistribution this]
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
  (^Double [^ParetoDistribution this ^Double x]
    (-> this (.logDensity x))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

   For scale k, and shape α of this distribution, the PDF
   is given by

   0 if x < k,
   α * k^α / x^(α  1) otherwise.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^ParetoDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For scale k and shape α, the mean is given by

   ∞ if α <= 1,
   α * k / (α - 1) otherwise.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^ParetoDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   For scale k, and shape α of this distribution, the CDF is given by

   0 if x < k,
   1 - (k / x)^α otherwise.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^ParetoDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

