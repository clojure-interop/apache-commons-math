(ns org.apache.commons.math4.distribution.EnumeratedRealDistribution
  "Implementation of a real-valued EnumeratedDistribution.

  Values with zero-probability are allowed but they do not extend the
  support.
  Duplicate values are allowed. Probabilities of duplicate values are combined
  when computing cumulative probabilities and statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution EnumeratedRealDistribution]))

(defn ->enumerated-real-distribution
  "Constructor.

  Create a discrete real-valued distribution using the given random number generator
   and probability mass function enumeration.

  singletons - array of random variable values. - `double[]`
  probabilities - array of probabilities. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if singletons.length != probabilities.length"
  (^EnumeratedRealDistribution [singletons probabilities]
    (new EnumeratedRealDistribution singletons probabilities))
  (^EnumeratedRealDistribution [data]
    (new EnumeratedRealDistribution data)))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^EnumeratedRealDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `double`

  returns: zero. - `double`"
  (^Double [^EnumeratedRealDistribution this ^Double x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: sum((singletons[i] - mean) ^ 2 * probabilities[i]) - `double`"
  (^Double [^EnumeratedRealDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^EnumeratedRealDistribution this]
    (-> this (.isSupportConnected))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution. For a random
   variable X distributed according to this distribution, the
   returned value is

   inf{x in R | P(X<=x) >= p} for 0 < p <= 1,
   inf{x in R | P(X<=x) > 0} for p = 0.


   The default implementation returns

   RealDistribution.getSupportLowerBound() for p = 0,
   RealDistribution.getSupportUpperBound() for p = 1.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^EnumeratedRealDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   Returns the lowest value with non-zero probability.

  returns: the lowest value with non-zero probability. - `double`"
  (^Double [^EnumeratedRealDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   Returns the highest value with non-zero probability.

  returns: the highest value with non-zero probability. - `double`"
  (^Double [^EnumeratedRealDistribution this]
    (-> this (.getSupportUpperBound))))

(defn density
  "For a random variable X whose values are distributed according to
   this distribution, this method returns P(X = x). In other words,
   this method represents the probability mass function (PMF) for the
   distribution.

  x - the point at which the PMF is evaluated - `double`

  returns: the value of the probability mass function at point x - `double`"
  (^Double [^EnumeratedRealDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: sum(singletons[i] * probabilities[i]) - `double`"
  (^Double [^EnumeratedRealDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^EnumeratedRealDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

