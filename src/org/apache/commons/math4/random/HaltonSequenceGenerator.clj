(ns org.apache.commons.math4.random.HaltonSequenceGenerator
  "Implementation of a Halton sequence.

  A Halton sequence is a low-discrepancy sequence generating points in the interval [0, 1] according to


    H(n) = d_0 / b  d_1 / b^2 .... d_j / b^j+1

    with

    n = d_j * b^j-1  ... d_1 * b  d_0 * b^0
  For higher dimensions, subsequent prime numbers are used as base, e.g. { 2, 3, 5 } for a Halton sequence in R^3.

  Halton sequences are known to suffer from linear correlation for larger prime numbers, thus the individual digits
  are usually scrambled. This implementation already comes with support for up to 40 dimensions with optimal weight
  numbers from
  H. Chi: Scrambled quasirandom sequences and their applications.

  The generator supports two modes:

    sequential generation of points: nextVector()
    random access to the i-th point in the sequence: skipTo(int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random HaltonSequenceGenerator]))

(defn ->halton-sequence-generator
  "Constructor.

  Construct a new Halton sequence generator with the given base numbers and weights for each dimension.
   The length of the bases array defines the space dimension and is required to be > 0.

  dimension - the space dimension - `int`
  bases - the base number for each dimension, entries should be (pairwise) prime, may not be null - `int[]`
  weights - the weights used during scrambling, may be null in which case no scrambling will be performed - `int[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if base is null"
  (^HaltonSequenceGenerator [^Integer dimension bases weights]
    (new HaltonSequenceGenerator dimension bases weights))
  (^HaltonSequenceGenerator [^Integer dimension]
    (new HaltonSequenceGenerator dimension)))

(defn next-vector
  "Generate a random vector.

  returns: a random vector as an array of double. - `double[]`"
  ([^HaltonSequenceGenerator this]
    (-> this (.nextVector))))

(defn skip-to
  "Skip to the i-th point in the Halton sequence.

   This operation can be performed in O(1).

  index - the index in the sequence to skip to - `int`

  returns: the i-th point in the Halton sequence - `double[]`

  throws: org.apache.commons.math4.exception.NotPositiveException - if index < 0"
  ([^HaltonSequenceGenerator this ^Integer index]
    (-> this (.skipTo index))))

(defn get-next-index
  "Returns the index i of the next point in the Halton sequence that will be returned
   by calling nextVector().

  returns: the index of the next point - `int`"
  (^Integer [^HaltonSequenceGenerator this]
    (-> this (.getNextIndex))))

