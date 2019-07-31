(ns org.apache.commons.math4.random.SynchronizedRandomGenerator
  "Deprecated.
 As of 4.0. No replacement."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random SynchronizedRandomGenerator]))

(defn ->synchronized-random-generator
  "Constructor.

  Deprecated.

  rng - Generator whose methods will be called through their corresponding overridden synchronized version. To ensure thread-safety, the wrapped generator must not be used directly. - `org.apache.commons.math4.random.RandomGenerator`"
  (^SynchronizedRandomGenerator [^org.apache.commons.math4.random.RandomGenerator rng]
    (new SynchronizedRandomGenerator rng)))

(defn set-seed
  "Deprecated.

  seed - the seed value - `int`"
  ([^SynchronizedRandomGenerator this ^Integer seed]
    (-> this (.setSeed seed))))

(defn next-bytes
  "Deprecated.

  bytes - the non-null byte array in which to put the random bytes - `byte[]`"
  ([^SynchronizedRandomGenerator this bytes]
    (-> this (.nextBytes bytes))))

(defn next-int
  "Deprecated.

  n - the bound on the random number to be returned. Must be positive. - `int`

  returns: a pseudorandom, uniformly distributed int
   value between 0 (inclusive) and n (exclusive). - `int`"
  (^Integer [^SynchronizedRandomGenerator this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^SynchronizedRandomGenerator this]
    (-> this (.nextInt))))

(defn next-long
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^SynchronizedRandomGenerator this]
    (-> this (.nextLong))))

(defn next-boolean
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
   boolean value from this random number generator's
   sequence - `boolean`"
  (^Boolean [^SynchronizedRandomGenerator this]
    (-> this (.nextBoolean))))

(defn next-float
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed float
   value between 0.0 and 1.0 from this
   random number generator's sequence - `float`"
  (^Float [^SynchronizedRandomGenerator this]
    (-> this (.nextFloat))))

(defn next-double
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
    double value between 0.0 and
    1.0 from this random number generator's sequence - `double`"
  (^Double [^SynchronizedRandomGenerator this]
    (-> this (.nextDouble))))

(defn next-gaussian
  "Deprecated.

  returns: the next pseudorandom, Gaussian (\"normally\") distributed
   double value with mean 0.0 and
   standard deviation 1.0 from this random number
    generator's sequence - `double`"
  (^Double [^SynchronizedRandomGenerator this]
    (-> this (.nextGaussian))))

