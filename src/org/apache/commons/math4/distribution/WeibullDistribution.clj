(ns org.apache.commons.math4.distribution.WeibullDistribution
  "Implementation of the Weibull distribution. This implementation uses the
  two parameter form of the distribution defined by

  Weibull Distribution, equations (1) and (2)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution WeibullDistribution]))

(defn ->weibull-distribution
  "Constructor.

  Creates a distribution.

  alpha - Shape parameter. - `double`
  beta - Scale parameter. - `double`
  inverse-cum-accuracy - Maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if alpha <= 0 or beta <= 0."
  (^WeibullDistribution [^Double alpha ^Double beta ^Double inverse-cum-accuracy]
    (new WeibullDistribution alpha beta inverse-cum-accuracy))
  (^WeibullDistribution [^Double alpha ^Double beta]
    (new WeibullDistribution alpha beta)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  WeibullDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   The variance is scale^2 * Gamma(1  (2 / shape)) - mean^2
   where Gamma() is the Gamma-function.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^WeibullDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^WeibullDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Access the scale parameter, beta.

  returns: the scale parameter, beta. - `double`"
  (^Double [^WeibullDistribution this]
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


   Returns 0 when p == 0 and
   Double.POSITIVE_INFINITY when p == 1.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `double`"
  (^Double [^WeibullDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `double`"
  (^Double [^WeibullDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-shape
  "Access the shape parameter, alpha.

  returns: the shape parameter, alpha. - `double`"
  (^Double [^WeibullDistribution this]
    (-> this (.getShape))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity
   no matter the parameters.

  returns: upper bound of the support (always
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^WeibullDistribution this]
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

  x - the point at which the PDF is evaluated - `double`

  returns: the logarithm of the value of the probability density function at point x - `double`"
  (^Double [^WeibullDistribution this ^Double x]
    (-> this (.logDensity x))))

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
  (^Double [^WeibullDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   The mean is scale * Gamma(1  (1 / shape)), where Gamma()
   is the Gamma-function.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^WeibullDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^WeibullDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

