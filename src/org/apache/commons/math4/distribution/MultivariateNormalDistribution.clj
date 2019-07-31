(ns org.apache.commons.math4.distribution.MultivariateNormalDistribution
  "Implementation of the multivariate normal (Gaussian) distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution MultivariateNormalDistribution]))

(defn ->multivariate-normal-distribution
  "Constructor.

  Creates a multivariate normal distribution with the given mean vector and
   covariance matrix.

   The number of dimensions is equal to the length of the mean vector
   and to the number of rows and columns of the covariance matrix.
   It is frequently written as \"p\" in formulae.

  means - Vector of means. - `double[]`
  covariances - Covariance matrix. - `double[][]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays length are inconsistent."
  (^MultivariateNormalDistribution [means covariances]
    (new MultivariateNormalDistribution means covariances)))

(defn get-means
  "Gets the mean vector.

  returns: the mean vector. - `double[]`"
  ([^MultivariateNormalDistribution this]
    (-> this (.getMeans))))

(defn get-covariances
  "Gets the covariance matrix.

  returns: the covariance matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^MultivariateNormalDistribution this]
    (-> this (.getCovariances))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is the
   derivative of the cumulative distribution function. If the derivative
   does not exist at x, then an appropriate replacement should be
   returned, e.g. Double.POSITIVE_INFINITY, Double.NaN, or
   the limit inferior or limit superior of the difference quotient.

  vals - Point at which the PDF is evaluated. - `double[]`

  returns: the value of the probability density function at point x. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Double [^MultivariateNormalDistribution this vals]
    (-> this (.density vals))))

(defn get-standard-deviations
  "Gets the square root of each element on the diagonal of the covariance
   matrix.

  returns: the standard deviations. - `double[]`"
  ([^MultivariateNormalDistribution this]
    (-> this (.getStandardDeviations))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler [^MultivariateNormalDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

