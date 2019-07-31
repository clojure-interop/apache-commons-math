(ns org.apache.commons.math4.distribution.RealDistribution$Sampler
  "Sampling functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution RealDistribution$Sampler]))

(defn sample
  "Generates a random value sampled from this distribution.

  returns: a random value. - `double`"
  (^Double [^RealDistribution$Sampler this]
    (-> this (.sample))))

