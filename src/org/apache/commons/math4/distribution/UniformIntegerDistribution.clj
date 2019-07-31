(ns org.apache.commons.math4.distribution.UniformIntegerDistribution
  "Implementation of the uniform integer distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution UniformIntegerDistribution]))

(defn ->uniform-integer-distribution
  "Constructor.

  Creates a new uniform integer distribution using the given lower and
   upper bounds (both inclusive).

  lower - Lower bound (inclusive) of this distribution. - `int`
  upper - Upper bound (inclusive) of this distribution. - `int`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower > upper."
  (^UniformIntegerDistribution [^Integer lower ^Integer upper]
    (new UniformIntegerDistribution lower upper)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^UniformIntegerDistribution this ^Integer x]
    (-> this (.probability x))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^UniformIntegerDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For lower bound lower and upper bound upper, the mean is
   0.5 * (lower  upper).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^UniformIntegerDistribution this]
    (-> this (.getNumericalMean))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For lower bound lower and upper bound upper, and
   n = upper - lower  1, the variance is (n^2 - 1) / 12.

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^UniformIntegerDistribution this]
    (-> this (.getNumericalVariance))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is equal to the lower bound parameter
   of the distribution.

  returns: lower bound of the support - `int`"
  (^Integer [^UniformIntegerDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is equal to the upper bound parameter
   of the distribution.

  returns: upper bound of the support - `int`"
  (^Integer [^UniformIntegerDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^UniformIntegerDistribution this]
    (-> this (.isSupportConnected))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.IntegerDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.IntegerDistribution$Sampler [^UniformIntegerDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

