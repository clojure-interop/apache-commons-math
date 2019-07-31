(ns org.apache.commons.math4.distribution.GumbelDistribution
  "This class implements the Gumbel distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution GumbelDistribution]))

(defn ->gumbel-distribution
  "Constructor.

  Creates a distribution.

  mu - location parameter - `double`
  beta - scale parameter (must be positive) - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if beta <= 0"
  (^GumbelDistribution [^Double mu ^Double beta]
    (new GumbelDistribution mu beta)))

(defn get-location
  "Access the location parameter, mu.

  returns: the location parameter. - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getLocation))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^GumbelDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Access the scale parameter, beta.

  returns: the scale parameter. - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getScale))))

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
  (^Double [^GumbelDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

  returns: lower bound of the support (might be
   Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (might be
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getSupportUpperBound))))

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
  (^Double [^GumbelDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^GumbelDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^GumbelDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

