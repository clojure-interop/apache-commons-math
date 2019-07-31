(ns org.apache.commons.math4.random.UniformRandomGenerator
  "This class implements a normalized uniform random generator.


  It generates values from a uniform distribution with mean
  equal to 0 and standard deviation equal to 1.
  Generated values fall in the range \\( [-\\sqrt{3}, \\sqrt{3}] \\)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random UniformRandomGenerator]))

(defn ->uniform-random-generator
  "Constructor.

  Creates a new generator.

  generator - Underlying random generator. - `org.apache.commons.rng.UniformRandomProvider`"
  (^UniformRandomGenerator [^org.apache.commons.rng.UniformRandomProvider generator]
    (new UniformRandomGenerator generator)))

(defn next-normalized-double
  "Generates a random scalar with zero mean and unit standard deviation.

  returns: a random scalar in the range \\( [-\\sqrt{3}, \\sqrt{3}] \\). - `double`"
  (^Double [^UniformRandomGenerator this]
    (-> this (.nextNormalizedDouble))))

