(ns org.apache.commons.math4.random.JDKRandomAdaptor
  "Extension of Random that delegates the number
  generation to a UniformRandomProvider.


  This class allows usage of JDK utilities that take an instance
  of type Random as argument.

  Other than for this specific purpose, usage of this class
  is best avoided; indeed, because of the following limitations:


    MathUnsupportedOperationException will be raised if
    serialization is attempted.


    Reseeding is not supported.


  an instance of this class cannot be a substitute for an instance
  of the parent class if those functionalities are required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random JDKRandomAdaptor]))

(defn ->jdk-random-adaptor
  "Constructor.

  Creates an adaptor.

  rng - Generator. - `org.apache.commons.rng.UniformRandomProvider`"
  (^JDKRandomAdaptor [^org.apache.commons.rng.UniformRandomProvider rng]
    (new JDKRandomAdaptor rng)))

(defn next-boolean
  "returns: `boolean`"
  (^Boolean [^JDKRandomAdaptor this]
    (-> this (.nextBoolean))))

(defn next-bytes
  "bytes - `byte[]`"
  ([^JDKRandomAdaptor this bytes]
    (-> this (.nextBytes bytes))))

(defn next-double
  "returns: `double`"
  (^Double [^JDKRandomAdaptor this]
    (-> this (.nextDouble))))

(defn next-float
  "returns: `float`"
  (^Float [^JDKRandomAdaptor this]
    (-> this (.nextFloat))))

(defn next-gaussian
  "returns: `double`"
  (^Double [^JDKRandomAdaptor this]
    (-> this (.nextGaussian))))

(defn next-int
  "n - `int`

  returns: `int`"
  (^Integer [^JDKRandomAdaptor this ^Integer n]
    (-> this (.nextInt n)))
  (^Integer [^JDKRandomAdaptor this]
    (-> this (.nextInt))))

(defn next-long
  "returns: `long`"
  (^Long [^JDKRandomAdaptor this]
    (-> this (.nextLong))))

(defn set-seed
  "Seeding is not supported.

  seed - Ignored. - `long`"
  ([^JDKRandomAdaptor this ^Long seed]
    (-> this (.setSeed seed))))

