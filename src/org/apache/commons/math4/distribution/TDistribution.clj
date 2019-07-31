(ns org.apache.commons.math4.distribution.TDistribution
  "Implementation of Student's t-distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution TDistribution]))

(defn ->t-distribution
  "Constructor.

  Creates a distribution.

  degrees-of-freedom - Degrees of freedom. - `double`
  inverse-cum-accuracy - the maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if degreesOfFreedom <= 0"
  (^TDistribution [^Double degrees-of-freedom ^Double inverse-cum-accuracy]
    (new TDistribution degrees-of-freedom inverse-cum-accuracy))
  (^TDistribution [^Double degrees-of-freedom]
    (new TDistribution degrees-of-freedom)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  TDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For degrees of freedom parameter df, the variance is

    if df > 2 then df / (df - 2),
    if 1 < df <= 2 then positive infinity
    (Double.POSITIVE_INFINITY),
    else undefined (Double.NaN).

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^TDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^TDistribution this]
    (-> this (.isSupportConnected))))

(defn get-degrees-of-freedom
  "Access the degrees of freedom.

  returns: the degrees of freedom. - `double`"
  (^Double [^TDistribution this]
    (-> this (.getDegreesOfFreedom))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always negative infinity no matter the
   parameters.

  returns: lower bound of the support (always
   Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^TDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity no matter the
   parameters.

  returns: upper bound of the support (always
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^TDistribution this]
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
  (^Double [^TDistribution this ^Double x]
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
  (^Double [^TDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For degrees of freedom parameter df, the mean is

    if df > 1 then 0,
   else undefined (Double.NaN).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^TDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^TDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

