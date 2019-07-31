(ns org.apache.commons.math4.random.UncorrelatedRandomVectorGenerator
  "A RandomVectorGenerator that generates vectors with uncorrelated
  components. Components of generated vectors follow (independent) Gaussian
  distributions, with parameters supplied in the constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random UncorrelatedRandomVectorGenerator]))

(defn ->uncorrelated-random-vector-generator
  "Constructor.

  Simple constructor.
   Build an uncorrelated random vector generator from
   its mean and standard deviation vectors.

  mean - expected mean values for each component - `double[]`
  standard-deviation - standard deviation for each component - `double[]`
  generator - underlying generator for uncorrelated normalized components - `org.apache.commons.math4.random.NormalizedRandomGenerator`"
  (^UncorrelatedRandomVectorGenerator [mean standard-deviation ^org.apache.commons.math4.random.NormalizedRandomGenerator generator]
    (new UncorrelatedRandomVectorGenerator mean standard-deviation generator))
  (^UncorrelatedRandomVectorGenerator [^Integer dimension ^org.apache.commons.math4.random.NormalizedRandomGenerator generator]
    (new UncorrelatedRandomVectorGenerator dimension generator)))

(defn next-vector
  "Generate an uncorrelated random vector.

  returns: a random vector as a newly built array of double - `double[]`"
  ([^UncorrelatedRandomVectorGenerator this]
    (-> this (.nextVector))))

