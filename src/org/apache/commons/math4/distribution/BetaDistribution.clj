(ns org.apache.commons.math4.distribution.BetaDistribution
  "Implements the Beta distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution BetaDistribution]))

(defn ->beta-distribution
  "Constructor.

  Creates a new instance.

  alpha - First shape parameter (must be positive). - `double`
  beta - Second shape parameter (must be positive). - `double`
  inverse-cum-accuracy - Maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`"
  (^BetaDistribution [^Double alpha ^Double beta ^Double inverse-cum-accuracy]
    (new BetaDistribution alpha beta inverse-cum-accuracy))
  (^BetaDistribution [^Double alpha ^Double beta]
    (new BetaDistribution alpha beta)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  BetaDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn create-sampler
  "Creates a sampler.

   Sampling is performed using Cheng's algorithm:



   R. C. H. Cheng,
   \"Generating beta variates with nonintegral shape parameters\",
   Communications of the ACM, 21, 317-322, 1978.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^BetaDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For first shape parameter alpha and second shape parameter
   beta, the variance is
   (alpha * beta) / [(alpha  beta)^2 * (alpha  beta  1)].

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^BetaDistribution this]
    (-> this (.getNumericalVariance))))

(defn get-alpha
  "Access the first shape parameter, alpha.

  returns: the first shape parameter. - `double`"
  (^Double [^BetaDistribution this]
    (-> this (.getAlpha))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^BetaDistribution this]
    (-> this (.isSupportConnected))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `double`"
  (^Double [^BetaDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always 1 no matter the parameters.

  returns: upper bound of the support (always 1) - `double`"
  (^Double [^BetaDistribution this]
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

  x - the point at which the PDF is evaluated - `double`

  returns: the logarithm of the value of the probability density function at point x - `double`"
  (^Double [^BetaDistribution this ^Double x]
    (-> this (.logDensity x))))

(defn get-beta
  "Access the second shape parameter, beta.

  returns: the second shape parameter. - `double`"
  (^Double [^BetaDistribution this]
    (-> this (.getBeta))))

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
  (^Double [^BetaDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For first shape parameter alpha and second shape parameter
   beta, the mean is alpha / (alpha  beta).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^BetaDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^BetaDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

