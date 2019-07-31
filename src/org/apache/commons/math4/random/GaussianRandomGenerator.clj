(ns org.apache.commons.math4.random.GaussianRandomGenerator
  "Random generator that generates normally distributed samples."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random GaussianRandomGenerator]))

(defn ->gaussian-random-generator
  "Constructor.

  Creates a new generator.

  generator - Underlying random generator. - `org.apache.commons.rng.UniformRandomProvider`"
  (^GaussianRandomGenerator [^org.apache.commons.rng.UniformRandomProvider generator]
    (new GaussianRandomGenerator generator)))

(defn next-normalized-double
  "Generates a random scalar with zero mean and unit standard deviation.

  returns: a random value sampled from a normal distribution. - `double`"
  (^Double [^GaussianRandomGenerator this]
    (-> this (.nextNormalizedDouble))))

