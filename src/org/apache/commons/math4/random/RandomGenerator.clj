(ns org.apache.commons.math4.random.RandomGenerator
  "Deprecated.
 As of 4.0.  Please use UniformRandomProvider instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random RandomGenerator]))

(defn set-seed
  "Deprecated.

  seed - the seed value - `int`"
  ([^RandomGenerator this ^Integer seed]
    (-> this (.setSeed seed))))

(defn next-bytes
  "Deprecated.

  bytes - the non-null byte array in which to put the random bytes - `byte[]`"
  ([^RandomGenerator this bytes]
    (-> this (.nextBytes bytes))))

(defn next-int
  "Deprecated.

  n - the bound on the random number to be returned. Must be positive. - `int`

  returns: a pseudorandom, uniformly distributed int
   value between 0 (inclusive) and n (exclusive). - `int`

  throws: java.lang.IllegalArgumentException - if n is not positive."
  (^Integer [^RandomGenerator this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^RandomGenerator this]
    (-> this (.nextInt))))

(defn next-long
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed long
  value from this random number generator's sequence - `long`"
  (^Long [^RandomGenerator this]
    (-> this (.nextLong))))

(defn next-boolean
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
   boolean value from this random number generator's
   sequence - `boolean`"
  (^Boolean [^RandomGenerator this]
    (-> this (.nextBoolean))))

(defn next-float
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed float
   value between 0.0 and 1.0 from this
   random number generator's sequence - `float`"
  (^Float [^RandomGenerator this]
    (-> this (.nextFloat))))

(defn next-double
  "Deprecated.

  returns: the next pseudorandom, uniformly distributed
    double value between 0.0 and
    1.0 from this random number generator's sequence - `double`"
  (^Double [^RandomGenerator this]
    (-> this (.nextDouble))))

(defn next-gaussian
  "Deprecated.

  returns: the next pseudorandom, Gaussian (\"normally\") distributed
   double value with mean 0.0 and
   standard deviation 1.0 from this random number
    generator's sequence - `double`"
  (^Double [^RandomGenerator this]
    (-> this (.nextGaussian))))

