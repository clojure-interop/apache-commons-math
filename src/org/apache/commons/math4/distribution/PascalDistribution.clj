(ns org.apache.commons.math4.distribution.PascalDistribution
  " Implementation of the Pascal distribution. The Pascal distribution is a
  special case of the Negative Binomial distribution where the number of
  successes parameter is an integer.


  There are various ways to express the probability mass and distribution
  functions for the Pascal distribution. The present implementation represents
  the distribution of the number of failures before r successes occur.
  This is the convention adopted in e.g.
  MathWorld,
  but not in
  Wikipedia.


  For a random variable X whose values are distributed according to this
  distribution, the probability mass function is given by
  P(X = k) = C(k  r - 1, r - 1) * p^r * (1 - p)^k,
  where r is the number of successes, p is the probability of
  success, and X is the total number of failures. C(n, k) is
  the binomial coefficient (n choose k). The mean and variance
  of X are
  E(X) = (1 - p) * r / p, var(X) = (1 - p) * r / p^2.
  Finally, the cumulative distribution function is given by
  P(X <= k) = I(p, r, k  1),
  where I is the regularized incomplete Beta function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution PascalDistribution]))

(defn ->pascal-distribution
  "Constructor.

  Create a Pascal distribution with the given number of successes and
   probability of success.

  r - Number of successes. - `int`
  p - Probability of success. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if the number of successes is not positive"
  (^PascalDistribution [^Integer r ^Double p]
    (new PascalDistribution r p)))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^PascalDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For number of successes r and probability of success p,
   the variance is r * (1 - p) / p^2.

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^PascalDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^PascalDistribution this]
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
  (^Double [^PascalDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn get-probability-of-success
  "Access the probability of success for this distribution.

  returns: the probability of success. - `double`"
  (^Double [^PascalDistribution this]
    (-> this (.getProbabilityOfSuccess))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `int`"
  (^Integer [^PascalDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity no matter the
   parameters. Positive infinity is symbolized by Integer.MAX_VALUE.

  returns: upper bound of the support (always Integer.MAX_VALUE
   for positive infinity) - `int`"
  (^Integer [^PascalDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-number-of-successes
  "Access the number of successes for this distribution.

  returns: the number of successes. - `int`"
  (^Integer [^PascalDistribution this]
    (-> this (.getNumberOfSuccesses))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For number of successes r and probability of success p,
   the mean is r * (1 - p) / p.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^PascalDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^PascalDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

