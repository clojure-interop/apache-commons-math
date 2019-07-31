(ns org.apache.commons.math4.distribution.IntegerDistribution$Sampler
  "Sampling functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution IntegerDistribution$Sampler]))

(defn sample
  "Generates a random value sampled from this distribution.

  returns: a random value. - `int`"
  (^Integer [^IntegerDistribution$Sampler this]
    (-> this (.sample))))

