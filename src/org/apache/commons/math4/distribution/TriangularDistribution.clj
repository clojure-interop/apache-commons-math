(ns org.apache.commons.math4.distribution.TriangularDistribution
  "Implementation of the triangular real distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution TriangularDistribution]))

(defn ->triangular-distribution
  "Constructor.

  Creates a distribution.

  a - Lower limit of this distribution (inclusive). - `double`
  c - Mode of this distribution. - `double`
  b - Upper limit of this distribution (inclusive). - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if a >= b or if c > b."
  (^TriangularDistribution [^Double a ^Double c ^Double b]
    (new TriangularDistribution a c b)))

(defn get-mode
  "Returns the mode c of this distribution.

  returns: the mode c of this distribution - `double`"
  (^Double [^TriangularDistribution this]
    (-> this (.getMode))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For lower limit a, upper limit b, and mode c,
   the variance is (a^2  b^2  c^2 - a * b - a * c - b * c) / 18.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^TriangularDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^TriangularDistribution this]
    (-> this (.isSupportConnected))))

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
  (^Double [^TriangularDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

   The lower bound of the support is equal to the lower limit parameter
   a of the distribution.

  returns: lower bound of the support - `double`"
  (^Double [^TriangularDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is equal to the upper limit parameter
   b of the distribution.

  returns: upper bound of the support - `double`"
  (^Double [^TriangularDistribution this]
    (-> this (.getSupportUpperBound))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

   For lower limit a, upper limit b and mode c, the
   PDF is given by

   2 * (x - a) / [(b - a) * (c - a)] if a <= x < c,
   2 / (b - a) if x = c,
   2 * (b - x) / [(b - a) * (b - c)] if c < x <= b,
   0 otherwise.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^TriangularDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For lower limit a, upper limit b, and mode c,
   the mean is (a  b  c) / 3.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^TriangularDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   For lower limit a, upper limit b and mode c, the
   CDF is given by

   0 if x < a,
   (x - a)^2 / [(b - a) * (c - a)] if a <= x < c,
   (c - a) / (b - a) if x = c,
   1 - (b - x)^2 / [(b - a) * (b - c)] if c < x <= b,
   1 if x > b.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^TriangularDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

