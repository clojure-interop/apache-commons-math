(ns org.apache.commons.math4.distribution.ChiSquaredDistribution
  "Implementation of the chi-squared distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution ChiSquaredDistribution]))

(defn ->chi-squared-distribution
  "Constructor.

  Creates a distribution with the given degrees of freedom and
   inverse cumulative probability accuracy.

  degrees-of-freedom - Degrees of freedom. - `double`
  inverse-cum-accuracy - the maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`"
  (^ChiSquaredDistribution [^Double degrees-of-freedom ^Double inverse-cum-accuracy]
    (new ChiSquaredDistribution degrees-of-freedom inverse-cum-accuracy))
  (^ChiSquaredDistribution [^Double degrees-of-freedom]
    (new ChiSquaredDistribution degrees-of-freedom)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy

  type: double"
  ChiSquaredDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: 2 * k, where k is the number of degrees of freedom. - `double`"
  (^Double [^ChiSquaredDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^ChiSquaredDistribution this]
    (-> this (.isSupportConnected))))

(defn get-degrees-of-freedom
  "Access the number of degrees of freedom.

  returns: the degrees of freedom. - `double`"
  (^Double [^ChiSquaredDistribution this]
    (-> this (.getDegreesOfFreedom))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the
   degrees of freedom.

  returns: zero. - `double`"
  (^Double [^ChiSquaredDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is always positive infinity no matter the
   degrees of freedom.

  returns: Double.POSITIVE_INFINITY. - `double`"
  (^Double [^ChiSquaredDistribution this]
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
  (^Double [^ChiSquaredDistribution this ^Double x]
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
  (^Double [^ChiSquaredDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For k degrees of freedom, the mean is k.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^ChiSquaredDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^ChiSquaredDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

