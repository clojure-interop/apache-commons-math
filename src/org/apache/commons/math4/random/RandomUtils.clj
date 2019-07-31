(ns org.apache.commons.math4.random.RandomUtils
  "Factory for creating generators of miscellaneous data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random RandomUtils]))

(defn *create-data-generator
  "Wraps an instance of the JDK's Random class.
   The actual generation of random numbers will be delegated to that
   instance.

   If cryptographically secure data is required, one can use this
   factory method, with an instance of the SecureRandom
   class as the argument.
   Note that data generation will be much slower in this case.

  rng - Underlying generator. Reference is copied so the RNG is shared with the caller. - `java.util.Random`

  returns: a data generator. - `org.apache.commons.math4.random.RandomUtils$DataGenerator`"
  (^org.apache.commons.math4.random.RandomUtils$DataGenerator [^java.util.Random rng]
    (RandomUtils/createDataGenerator rng)))

(defn *as-uniform-random-provider
  "Wraps a Random instance.

  rng - JDK Random instance to which the random number generation is delegated. Reference is copied so the RNG is shared with the caller. - `java.util.Random`

  returns: a UniformRandomProvider instance. - `org.apache.commons.rng.UniformRandomProvider`"
  (^org.apache.commons.rng.UniformRandomProvider [^java.util.Random rng]
    (RandomUtils/asUniformRandomProvider rng)))

