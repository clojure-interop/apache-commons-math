(ns org.apache.commons.math4.distribution.GeometricDistribution
  "Implementation of the geometric distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution GeometricDistribution]))

(defn ->geometric-distribution
  "Constructor.

  Creates a geometric distribution.

  p - Probability of success. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p <= 0 or p > 1."
  (^GeometricDistribution [^Double p]
    (new GeometricDistribution p)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^GeometricDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For probability parameter p, the variance is
   (1 - p) / (p * p).

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^GeometricDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^GeometricDistribution this]
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
  (^Double [^GeometricDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution.
   For a random variable X distributed according to this distribution,
   the returned value is

   inf{x in Z | P(X<=x) >= p} for 0 < p <= 1,
   inf{x in Z | P(X<=x) > 0} for p = 0.

   If the result exceeds the range of the data type int,
   then Integer.MIN_VALUE or Integer.MAX_VALUE is returned.

   The default implementation returns

   IntegerDistribution.getSupportLowerBound() for p = 0,
   IntegerDistribution.getSupportUpperBound() for p = 1, and
   AbstractIntegerDistribution.solveInverseCumulativeProbability(double, int, int) for
       0 < p < 1.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Integer [^GeometricDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-probability-of-success
  "Access the probability of success for this distribution.

  returns: the probability of success. - `double`"
  (^Double [^GeometricDistribution this]
    (-> this (.getProbabilityOfSuccess))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is always 0.

  returns: lower bound of the support (always 0) - `int`"
  (^Integer [^GeometricDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is infinite (which we approximate as
   Integer.MAX_VALUE).

  returns: upper bound of the support (always Integer.MAX_VALUE) - `int`"
  (^Integer [^GeometricDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For probability parameter p, the mean is (1 - p) / p.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^GeometricDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^GeometricDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

