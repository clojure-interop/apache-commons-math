(ns org.apache.commons.math4.distribution.EnumeratedIntegerDistribution
  "Implementation of an integer-valued EnumeratedDistribution.

  Values with zero-probability are allowed but they do not extend the
  support.
  Duplicate values are allowed. Probabilities of duplicate values are combined
  when computing cumulative probabilities and statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution EnumeratedIntegerDistribution]))

(defn ->enumerated-integer-distribution
  "Constructor.

  Create a discrete distribution.

  singletons - array of random variable values. - `int[]`
  probabilities - array of probabilities. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if singletons.length != probabilities.length"
  (^EnumeratedIntegerDistribution [singletons probabilities]
    (new EnumeratedIntegerDistribution singletons probabilities))
  (^EnumeratedIntegerDistribution [data]
    (new EnumeratedIntegerDistribution data)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^EnumeratedIntegerDistribution this ^Integer x]
    (-> this (.probability x))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^EnumeratedIntegerDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: sum(singletons[i] * probabilities[i]) - `double`"
  (^Double [^EnumeratedIntegerDistribution this]
    (-> this (.getNumericalMean))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: sum((singletons[i] - mean) ^ 2 * probabilities[i]) - `double`"
  (^Double [^EnumeratedIntegerDistribution this]
    (-> this (.getNumericalVariance))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   Returns the lowest value with non-zero probability.

  returns: the lowest value with non-zero probability. - `int`"
  (^Integer [^EnumeratedIntegerDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   Returns the highest value with non-zero probability.

  returns: the highest value with non-zero probability. - `int`"
  (^Integer [^EnumeratedIntegerDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^EnumeratedIntegerDistribution this]
    (-> this (.isSupportConnected))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.IntegerDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.IntegerDistribution$Sampler [^EnumeratedIntegerDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

