(ns org.apache.commons.math4.distribution.MixtureMultivariateRealDistribution
  "Class for representing
  mixture model distributions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution MixtureMultivariateRealDistribution]))

(defn ->mixture-multivariate-real-distribution
  "Constructor.

  Creates a mixture model from a list of distributions and their
   associated weights.

  components - Distributions from which to sample. - `java.util.List`

  throws: org.apache.commons.math4.exception.NotPositiveException - if any of the weights is negative."
  (^MixtureMultivariateRealDistribution [^java.util.List components]
    (new MixtureMultivariateRealDistribution components)))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is the
   derivative of the cumulative distribution function. If the derivative
   does not exist at x, then an appropriate replacement should be
   returned, e.g. Double.POSITIVE_INFINITY, Double.NaN, or
   the limit inferior or limit superior of the difference quotient.

  values - Point at which the PDF is evaluated. - `double[]`

  returns: the value of the probability density function at point x. - `double`"
  (^Double [^MixtureMultivariateRealDistribution this values]
    (-> this (.density values))))

(defn get-components
  "Gets the distributions that make up the mixture model.

  returns: the component distributions and associated weights. - `java.util.List<org.apache.commons.math4.util.Pair<java.lang.Double,T>>`"
  (^java.util.List [^MixtureMultivariateRealDistribution this]
    (-> this (.getComponents))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler [^MixtureMultivariateRealDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

