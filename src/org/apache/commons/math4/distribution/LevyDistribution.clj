(ns org.apache.commons.math4.distribution.LevyDistribution
  "This class implements the
  Lévy distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution LevyDistribution]))

(defn ->levy-distribution
  "Constructor.

  Creates a distribution.

  mu - location - `double`
  c - scale parameter - `double`"
  (^LevyDistribution [^Double mu ^Double c]
    (new LevyDistribution mu c)))

(defn get-location
  "Get the location parameter of the distribution.

  returns: location parameter of the distribution - `double`"
  (^Double [^LevyDistribution this]
    (-> this (.getLocation))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^LevyDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^LevyDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Get the scale parameter of the distribution.

  returns: scale parameter of the distribution - `double`"
  (^Double [^LevyDistribution this]
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
  (^Double [^LevyDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

  returns: lower bound of the support (might be
   Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^LevyDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (might be
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^LevyDistribution this]
    (-> this (.getSupportUpperBound))))

(defn log-density
  "Returns the natural logarithm of the probability density function
   (PDF) of this distribution evaluated at the specified point x.
   In general, the PDF is the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate replacement
   should be returned, e.g. Double.POSITIVE_INFINITY, Double.NaN,
   or the limit inferior or limit superior of the difference quotient. Note that
   due to the floating point precision and under/overflow issues, this method will
   for some distributions be more precise and faster than computing the logarithm of
   RealDistribution.density(double).

   The default implementation simply computes the logarithm of density(x).

   See documentation of density(double) for computation details.

  x - the point at which the PDF is evaluated - `double`

  returns: the logarithm of the value of the probability density function at point x - `double`"
  (^Double [^LevyDistribution this ^Double x]
    (-> this (.logDensity x))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

   From Wikipedia: The probability density function of the Lévy distribution
   over the domain is



   f(x; μ, c) = √(c / 2π) * e-c / 2 (x - μ) / (x - μ)3/2

   For this distribution, X, this method returns P(X < x).
   If x is less than location parameter μ, Double.NaN is
   returned, as in these cases the distribution is not defined.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^LevyDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^LevyDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   From Wikipedia: the cumulative distribution function is



   f(x; u, c) = erfc (√ (c / 2 (x - u )))

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^LevyDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

