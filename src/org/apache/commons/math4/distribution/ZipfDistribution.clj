(ns org.apache.commons.math4.distribution.ZipfDistribution
  "Implementation of the Zipf distribution.

  Parameters:
  For a random variable X whose values are distributed according to this
  distribution, the probability mass function is given by


    P(X = k) = H(N,s) * 1 / k^s    for  k = 1,2,...,N.
  H(N,s) is the normalizing constant
  which corresponds to the generalized harmonic number of order N of s.


  N is the number of elements
  s is the exponent"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution ZipfDistribution]))

(defn ->zipf-distribution
  "Constructor.

  Creates a distribution.

  number-of-elements - Number of elements. - `int`
  exponent - Exponent. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numberOfElements <= 0 or exponent <= 0."
  (^ZipfDistribution [^Integer number-of-elements ^Double exponent]
    (new ZipfDistribution number-of-elements exponent)))

(defn get-number-of-elements
  "Get the number of elements (e.g. corpus size) for the distribution.

  returns: the number of elements - `int`"
  (^Integer [^ZipfDistribution this]
    (-> this (.getNumberOfElements))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.IntegerDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.IntegerDistribution$Sampler [^ZipfDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^ZipfDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-exponent
  "Get the exponent characterizing the distribution.

  returns: the exponent - `double`"
  (^Double [^ZipfDistribution this]
    (-> this (.getExponent))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For number of elements N and exponent s, the mean is
   (Hs2 / Hs) - (Hs1^2 / Hs^2), where

    Hs2 = generalizedHarmonic(N, s - 2),
    Hs1 = generalizedHarmonic(N, s - 1),
    Hs = generalizedHarmonic(N, s).

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^ZipfDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^ZipfDistribution this]
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
  (^Double [^ZipfDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is always 1 no matter the parameters.

  returns: lower bound of the support (always 1) - `int`"
  (^Integer [^ZipfDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is the number of elements.

  returns: upper bound of the support - `int`"
  (^Integer [^ZipfDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For number of elements N and exponent s, the mean is
   Hs1 / Hs, where

    Hs1 = generalizedHarmonic(N, s - 1),
    Hs = generalizedHarmonic(N, s).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^ZipfDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^ZipfDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

