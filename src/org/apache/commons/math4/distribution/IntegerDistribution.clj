(ns org.apache.commons.math4.distribution.IntegerDistribution
  "Interface for distributions on the integers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution IntegerDistribution]))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.IntegerDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.IntegerDistribution$Sampler [^IntegerDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(x0 < X <= x1).

  x-0 - the exclusive lower bound - `int`
  x-1 - the inclusive upper bound - `int`

  returns: the probability that a random variable with this distribution
   will take a value between x0 and x1,
   excluding the lower and including the upper endpoint - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if x0 > x1"
  (^Double [^IntegerDistribution this ^Integer x-0 ^Integer x-1]
    (-> this (.probability x-0 x-1)))
  (^Double [^IntegerDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^IntegerDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^IntegerDistribution this]
    (-> this (.isSupportConnected))))

(defn log-probability
  "For a random variable X whose values are distributed according to
   this distribution, this method returns log(P(X = x)), where
   log is the natural logarithm. In other words, this method
   represents the logarithm of the probability mass function (PMF) for the
   distribution. Note that due to the floating point precision and
   under/overflow issues, this method will for some distributions be more
   precise and faster than computing the logarithm of
   probability(int).

  x - the point at which the PMF is evaluated - `int`

  returns: the logarithm of the value of the probability mass function at x - `double`"
  (^Double [^IntegerDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution.
   For a random variable X distributed according to this distribution,
   the returned value is

   inf{x in Z | P(X<=x) >= p} for 0 < p <= 1,
   inf{x in Z | P(X<=x) > 0} for p = 0.

   If the result exceeds the range of the data type int,
   then Integer.MIN_VALUE or Integer.MAX_VALUE is returned.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Integer [^IntegerDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

  returns: lower bound of the support (Integer.MIN_VALUE
   for negative infinity) - `int`"
  (^Integer [^IntegerDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (Integer.MAX_VALUE
   for positive infinity) - `int`"
  (^Integer [^IntegerDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^IntegerDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^IntegerDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

