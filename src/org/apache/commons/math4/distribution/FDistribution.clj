(ns org.apache.commons.math4.distribution.FDistribution
  "Implementation of the F-distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution FDistribution]))

(defn ->f-distribution
  "Constructor.

  Creates a distribution.

  numerator-degrees-of-freedom - Numerator degrees of freedom. - `double`
  denominator-degrees-of-freedom - Denominator degrees of freedom. - `double`
  inverse-cum-accuracy - the maximum absolute error in inverse cumulative probability estimates. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numeratorDegreesOfFreedom <= 0 or denominatorDegreesOfFreedom <= 0."
  (^FDistribution [^Double numerator-degrees-of-freedom ^Double denominator-degrees-of-freedom ^Double inverse-cum-accuracy]
    (new FDistribution numerator-degrees-of-freedom denominator-degrees-of-freedom inverse-cum-accuracy))
  (^FDistribution [^Double numerator-degrees-of-freedom ^Double denominator-degrees-of-freedom]
    (new FDistribution numerator-degrees-of-freedom denominator-degrees-of-freedom)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  FDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-denominator-degrees-of-freedom
  "Access the denominator degrees of freedom.

  returns: the denominator degrees of freedom. - `double`"
  (^Double [^FDistribution this]
    (-> this (.getDenominatorDegreesOfFreedom))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For numerator degrees of freedom parameter a and denominator
   degrees of freedom parameter b, the variance is


      if b > 4 then
      [2 * b^2 * (a  b - 2)] / [a * (b - 2)^2 * (b - 4)],

    else undefined (Double.NaN).

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^FDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^FDistribution this]
    (-> this (.isSupportConnected))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the parameters.

  returns: lower bound of the support (always 0) - `double`"
  (^Double [^FDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-numerator-degrees-of-freedom
  "Access the numerator degrees of freedom.

  returns: the numerator degrees of freedom. - `double`"
  (^Double [^FDistribution this]
    (-> this (.getNumeratorDegreesOfFreedom))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity
   no matter the parameters.

  returns: upper bound of the support (always Double.POSITIVE_INFINITY) - `double`"
  (^Double [^FDistribution this]
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
  (^Double [^FDistribution this ^Double x]
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
  (^Double [^FDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For denominator degrees of freedom parameter b, the mean is

    if b > 2 then b / (b - 2),
    else undefined (Double.NaN).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^FDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   The implementation of this method is based on



     F-Distribution, equation (4).

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^FDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

