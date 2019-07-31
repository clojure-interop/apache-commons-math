(ns org.apache.commons.math4.distribution.NakagamiDistribution
  "This class implements the Nakagami distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution NakagamiDistribution]))

(defn ->nakagami-distribution
  "Constructor.

  Creates a distribution.

  mu - shape parameter - `double`
  omega - scale parameter (must be positive) - `double`
  inverse-absolute-accuracy - the maximum absolute error in inverse cumulative probability estimates (defaults to DEFAULT_INVERSE_ABSOLUTE_ACCURACY). - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if mu < 0.5"
  (^NakagamiDistribution [^Double mu ^Double omega ^Double inverse-absolute-accuracy]
    (new NakagamiDistribution mu omega inverse-absolute-accuracy))
  (^NakagamiDistribution [^Double mu ^Double omega]
    (new NakagamiDistribution mu omega)))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  NakagamiDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^NakagamiDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^NakagamiDistribution this]
    (-> this (.isSupportConnected))))

(defn get-scale
  "Access the scale parameter, omega.

  returns: the scale parameter. - `double`"
  (^Double [^NakagamiDistribution this]
    (-> this (.getScale))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

  returns: lower bound of the support (might be
   Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^NakagamiDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-shape
  "Access the shape parameter, mu.

  returns: the shape parameter. - `double`"
  (^Double [^NakagamiDistribution this]
    (-> this (.getShape))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (might be
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^NakagamiDistribution this]
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
  (^Double [^NakagamiDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^NakagamiDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^NakagamiDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

