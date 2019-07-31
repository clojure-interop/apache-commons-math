(ns org.apache.commons.math4.random.SobolSequenceGenerator
  "Implementation of a Sobol sequence.

  A Sobol sequence is a low-discrepancy sequence with the property that for all values of N,
  its subsequence (x1, ... xN) has a low discrepancy. It can be used to generate pseudo-random
  points in a space S, which are equi-distributed.

  The implementation already comes with support for up to 1000 dimensions with direction numbers
  calculated from Stephen Joe and Frances Kuo.

  The generator supports two modes:

    sequential generation of points: nextVector()
    random access to the i-th point in the sequence: skipTo(int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random SobolSequenceGenerator]))

(defn ->sobol-sequence-generator
  "Constructor.

  Construct a new Sobol sequence generator for the given space dimension with
   direction vectors loaded from the given stream.

   The expected format is identical to the files available from
   Stephen Joe and Frances Kuo.
   The first line will be ignored as it is assumed to contain only the column headers.
   The columns are:

    d: the dimension
    s: the degree of the primitive polynomial
    a: the number representing the coefficients
    m: the list of initial direction numbers

   Example:


   d       s       a       m_i
   2       1       0       1
   3       2       1       1 3

   The input stream must be an ASCII text containing one valid direction vector per line.

  dimension - the space dimension - `int`
  is - the stream to read the direction vectors from - `java.io.InputStream`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if the space dimension is < 1"
  (^SobolSequenceGenerator [^Integer dimension ^java.io.InputStream is]
    (new SobolSequenceGenerator dimension is))
  (^SobolSequenceGenerator [^Integer dimension]
    (new SobolSequenceGenerator dimension)))

(defn next-vector
  "Generate a random vector.

  returns: a random vector as an array of double. - `double[]`"
  ([^SobolSequenceGenerator this]
    (-> this (.nextVector))))

(defn skip-to
  "Skip to the i-th point in the Sobol sequence.

   This operation can be performed in O(1).

  index - the index in the sequence to skip to - `int`

  returns: the i-th point in the Sobol sequence - `double[]`

  throws: org.apache.commons.math4.exception.NotPositiveException - if index < 0"
  ([^SobolSequenceGenerator this ^Integer index]
    (-> this (.skipTo index))))

(defn get-next-index
  "Returns the index i of the next point in the Sobol sequence that will be returned
   by calling nextVector().

  returns: the index of the next point - `int`"
  (^Integer [^SobolSequenceGenerator this]
    (-> this (.getNextIndex))))

