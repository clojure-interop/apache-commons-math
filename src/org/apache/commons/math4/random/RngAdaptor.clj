(ns org.apache.commons.math4.random.RngAdaptor
  "Deprecated.
 As of 4.0. This class is made available for testing
  the new RNG implementations in existing
  applications.
  It will be removed in the next major release."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random RngAdaptor]))

(defn ->rng-adaptor
  "Constructor.

  Deprecated.

  source - Source of randomness. - `org.apache.commons.rng.RandomSource`
  seed - Seed. Can be null. - `java.lang.Object`"
  (^RngAdaptor [^org.apache.commons.rng.RandomSource source ^java.lang.Object seed]
    (new RngAdaptor source seed))
  (^RngAdaptor [^org.apache.commons.rng.RandomSource source]
    (new RngAdaptor source)))

(defn set-seed
  "Deprecated.

  seed - the seed value - `int`"
  ([^RngAdaptor this ^Integer seed]
    (-> this (.setSeed seed))))

(defn next-boolean
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
   boolean value from this random number generator's
   sequence - `boolean`"
  (^Boolean [^RngAdaptor this]
    (-> this (.nextBoolean))))

(defn next-bytes
  "Deprecated.

  bytes - the non-null byte array in which to put the random bytes - `byte[]`"
  ([^RngAdaptor this bytes]
    (-> this (.nextBytes bytes))))

(defn next-double
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
    double value between 0.0 and
    1.0 from this random number generator's sequence - `double`"
  (^Double [^RngAdaptor this]
    (-> this (.nextDouble))))

(defn next-float
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed float
   value between 0.0 and 1.0 from this
   random number generator's sequence - `float`"
  (^Float [^RngAdaptor this]
    (-> this (.nextFloat))))

(defn next-gaussian
  "Deprecated.

  returns: the next pseudorandom, Gaussian (\"normally\") distributed
   double value with mean 0.0 and
   standard deviation 1.0 from this random number
    generator's sequence - `double`"
  (^Double [^RngAdaptor this]
    (-> this (.nextGaussian))))

(defn next-int
  "Deprecated.

  n - the bound on the random number to be returned. Must be positive. - `int`

  returns: a pseudorandom, uniformly distributed int
   value between 0 (inclusive) and n (exclusive). - `int`"
  (^Integer [^RngAdaptor this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^RngAdaptor this]
    (-> this (.nextInt))))

(defn next-long
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^RngAdaptor this]
    (-> this (.nextLong))))

