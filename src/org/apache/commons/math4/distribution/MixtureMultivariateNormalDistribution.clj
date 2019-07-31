(ns org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution
  "Multivariate normal mixture distribution.
  This class is mainly syntactic sugar."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution MixtureMultivariateNormalDistribution]))

(defn ->mixture-multivariate-normal-distribution
  "Constructor.

  Creates a multivariate normal mixture distribution.

  weights - Weights of each component. - `double[]`
  means - Mean vector for each component. - `double[][]`
  covariances - Covariance matrix for each component. - `double[][][]`

  throws: org.apache.commons.math4.exception.NotPositiveException - if any of the weights is negative."
  (^MixtureMultivariateNormalDistribution [weights means covariances]
    (new MixtureMultivariateNormalDistribution weights means covariances))
  (^MixtureMultivariateNormalDistribution [^java.util.List components]
    (new MixtureMultivariateNormalDistribution components)))

