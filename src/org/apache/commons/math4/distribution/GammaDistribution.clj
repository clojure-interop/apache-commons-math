(ns org.apache.commons.math4.distribution.GammaDistribution
  "Implementation of the Gamma distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution GammaDistribution]))

(defn ->gamma-distribution
  "Constructor.

  Creates a distribution.

  shape - the shape parameter - `double`
  scale - the scale parameter - `double`
  inverse-cum-accuracy - the maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if shape <= 0 or scale <= 0."
  (^GammaDistribution [^Double shape ^Double scale ^Double inverse-cum-accuracy]
    (new GammaDistribution shape scale inverse-cum-accuracy))
  (^GammaDistribution [^Double shape ^Double scale]
    (new GammaDistribution shape scale)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  GammaDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn create-sampler
  "Creates a sampler.


   Sampling algorithms:


     For 0 < shape < 1:

      Ahrens, J. H. and Dieter, U.,
      Computer methods for sampling from gamma, beta, Poisson and binomial distributions,
      Computing, 12, 223-246, 1974.



    For shape >= 1:

     Marsaglia and Tsang, A Simple Method for Generating
     Gamma Variables. ACM Transactions on Mathematical Software,
     Volume 26 Issue 3, September, 2000.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^GammaDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For shape parameter alpha and scale parameter beta, the
   variance is alpha * beta^2.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^GammaDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^GammaDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Returns the scale parameter of this distribution.

  returns: the scale parameter - `double`"
  (^Double [^GammaDistribution this]
    (-> this (.getScale))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `double`"
  (^Double [^GammaDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-shape
  "Returns the shape parameter of this distribution.

  returns: the shape parameter - `double`"
  (^Double [^GammaDistribution this]
    (-> this (.getShape))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity
   no matter the parameters.

  returns: upper bound of the support (always Double.POSITIVE_INFINITY) - `double`"
  (^Double [^GammaDistribution this]
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
  (^Double [^GammaDistribution this ^Double x]
    (-> this (.logDensity x))))

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
  (^Double [^GammaDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For shape parameter alpha and scale parameter beta, the
   mean is alpha * beta.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^GammaDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   The implementation of this method is based on:



      Chi-Squared Distribution, equation (9).

    Casella, G., & Berger, R. (1990). Statistical Inference.
      Belmont, CA: Duxbury Press.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^GammaDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

