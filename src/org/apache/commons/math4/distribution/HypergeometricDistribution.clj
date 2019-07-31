(ns org.apache.commons.math4.distribution.HypergeometricDistribution
  "Implementation of the hypergeometric distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution HypergeometricDistribution]))

(defn ->hypergeometric-distribution
  "Constructor.

  Creates a new hypergeometric distribution.

  population-size - Population size. - `int`
  number-of-successes - Number of successes in the population. - `int`
  sample-size - Sample size. - `int`

  throws: org.apache.commons.math4.exception.NotPositiveException - if numberOfSuccesses < 0."
  (^HypergeometricDistribution [^Integer population-size ^Integer number-of-successes ^Integer sample-size]
    (new HypergeometricDistribution population-size number-of-successes sample-size)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^HypergeometricDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For population size N, number of successes m, and sample
   size n, the variance is
   [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)].

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^HypergeometricDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^HypergeometricDistribution this]
    (-> this (.isSupportConnected))))

(defn log-probability
  "For a random variable X whose values are distributed according to
   this distribution, this method returns log(P(X = x)), where
   log is the natural logarithm. In other words, this method
   represents the logarithm of the probability mass function (PMF) for the
   distribution. Note that due to the floating point precision and
   under/overflow issues, this method will for some distributions be more
   precise and faster than computing the logarithm of
   IntegerDistribution.probability(int).

   The default implementation simply computes the logarithm of probability(x).

  x - the point at which the PMF is evaluated - `int`

  returns: the logarithm of the value of the probability mass function at x - `double`"
  (^Double [^HypergeometricDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   For population size N, number of successes m, and sample
   size n, the lower bound of the support is
   max(0, n  m - N).

  returns: lower bound of the support - `int`"
  (^Integer [^HypergeometricDistribution this]
    (-> this (.getSupportLowerBound))))

(defn upper-cumulative-probability
  "For this distribution, X, this method returns P(X >= x).

  x - Value at which the CDF is evaluated. - `int`

  returns: the upper tail CDF for this distribution. - `double`"
  (^Double [^HypergeometricDistribution this ^Integer x]
    (-> this (.upperCumulativeProbability x))))

(defn get-sample-size
  "Access the sample size.

  returns: the sample size. - `int`"
  (^Integer [^HypergeometricDistribution this]
    (-> this (.getSampleSize))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   For number of successes m and sample size n, the upper
   bound of the support is min(m, n).

  returns: upper bound of the support - `int`"
  (^Integer [^HypergeometricDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-population-size
  "Access the population size.

  returns: the population size. - `int`"
  (^Integer [^HypergeometricDistribution this]
    (-> this (.getPopulationSize))))

(defn get-number-of-successes
  "Access the number of successes.

  returns: the number of successes. - `int`"
  (^Integer [^HypergeometricDistribution this]
    (-> this (.getNumberOfSuccesses))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For population size N, number of successes m, and sample
   size n, the mean is n * m / N.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^HypergeometricDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^HypergeometricDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

