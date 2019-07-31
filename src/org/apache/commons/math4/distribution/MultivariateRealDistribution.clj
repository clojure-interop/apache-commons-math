(ns org.apache.commons.math4.distribution.MultivariateRealDistribution
  "Base interface for multivariate distributions on the reals.

  This is based largely on the RealDistribution interface, but cumulative
  distribution functions are not required because they are often quite
  difficult to compute for multivariate distributions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution MultivariateRealDistribution]))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is the
   derivative of the cumulative distribution function. If the derivative
   does not exist at x, then an appropriate replacement should be
   returned, e.g. Double.POSITIVE_INFINITY, Double.NaN, or
   the limit inferior or limit superior of the difference quotient.

  x - Point at which the PDF is evaluated. - `double[]`

  returns: the value of the probability density function at point x. - `double`"
  (^Double [^MultivariateRealDistribution this x]
    (-> this (.density x))))

(defn get-dimension
  "Gets the number of random variables of the distribution.
   It is the size of the array returned by the sample
   method.

  returns: the number of variables. - `int`"
  (^Integer [^MultivariateRealDistribution this]
    (-> this (.getDimension))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler [^MultivariateRealDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

