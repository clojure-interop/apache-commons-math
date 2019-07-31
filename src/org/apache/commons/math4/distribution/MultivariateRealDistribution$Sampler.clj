(ns org.apache.commons.math4.distribution.MultivariateRealDistribution$Sampler
  "Sampling functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution MultivariateRealDistribution$Sampler]))

(defn sample
  "Generates a random value vector sampled from this distribution.

  returns: a random value vector. - `double[]`"
  ([^MultivariateRealDistribution$Sampler this]
    (-> this (.sample))))

