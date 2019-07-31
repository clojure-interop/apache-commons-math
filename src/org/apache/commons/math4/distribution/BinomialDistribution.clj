(ns org.apache.commons.math4.distribution.BinomialDistribution
  "Implementation of the binomial distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution BinomialDistribution]))

(defn ->binomial-distribution
  "Constructor.

  Creates a binomial distribution.

  trials - Number of trials. - `int`
  p - Probability of success. - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if trials < 0."
  (^BinomialDistribution [^Integer trials ^Double p]
    (new BinomialDistribution trials p)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^BinomialDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For n trials and probability parameter p, the variance is
   n * p * (1 - p).

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^BinomialDistribution this]
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
  (^Double [^BinomialDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn get-probability-of-success
  "Access the probability of success for this distribution.

  returns: the probability of success. - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getProbabilityOfSuccess))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is always 0 except for the probability
   parameter p = 1.

  returns: lower bound of the support (0 or the number of trials) - `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is the number of trials except for the
   probability parameter p = 0.

  returns: upper bound of the support (number of trials or 0) - `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-number-of-trials
  "Access the number of trials for this distribution.

  returns: the number of trials. - `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.getNumberOfTrials))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For n trials and probability parameter p, the mean is
   n * p.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^BinomialDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

