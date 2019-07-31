(ns org.apache.commons.math4.random.StableRandomGenerator
  "This class provides a stable normalized random generator. It samples from a stable
  distribution with location parameter 0 and scale 1.

  The implementation uses the Chambers-Mallows-Stuck method as described in
  Handbook of computational statistics: concepts and methods by
  James E. Gentle, Wolfgang Härdle, Yuichi Mori."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random StableRandomGenerator]))

(defn ->stable-random-generator
  "Constructor.

  Create a new generator.

  generator - Underlying random generator - `org.apache.commons.rng.UniformRandomProvider`
  alpha - Stability parameter. Must be in range (0, 2] - `double`
  beta - Skewness parameter. Must be in range [-1, 1] - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if generator is null"
  (^StableRandomGenerator [^org.apache.commons.rng.UniformRandomProvider generator ^Double alpha ^Double beta]
    (new StableRandomGenerator generator alpha beta)))

(defn next-normalized-double
  "Generate a random scalar with zero location and unit scale.

  returns: a random scalar with zero location and unit scale - `double`"
  (^Double [^StableRandomGenerator this]
    (-> this (.nextNormalizedDouble))))

