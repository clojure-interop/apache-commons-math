(ns org.apache.commons.math4.random.RandomUtils$DataGenerator
  "Various random data generation routines."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random RandomUtils$DataGenerator]))

(defn next-hex-string
  "Generates a random string of hex characters of length len.

   Algorithm Description: how hexadecimal strings are
   generated depends on the value of the useSha1 argument.


    If useSha1 == false, a 2-step process is used:


       len / 2  1 binary bytes are generated using the underlying
       generator.


       Each binary byte is translated into 2 hex digits.




     If useSha1 == true, hex strings are generated in 40-byte
     segments using a 3-step process:


       20 random bytes are generated using the underlying generator.


       SHA-1 hash is applied to yield a 20-byte binary digest.


       Each byte of the binary digest is converted to 2 hex digits.

  len - Length of the generated string. - `int`
  use-sha-1 - Whether to use a digest. If true (resp. false), the 3-step (resp. 2-step) process will be used. - `boolean`

  returns: the random string. - `java.lang.String`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if len <= 0."
  (^java.lang.String [^RandomUtils$DataGenerator this ^Integer len ^Boolean use-sha-1]
    (-> this (.nextHexString len use-sha-1))))

(defn next-long
  "Generates a uniformly distributed random long integer between lower
   and upper (endpoints included).

  lower - Lower bound for generated long integer. - `long`
  upper - Upper bound for generated long integer. - `long`

  returns: a random long integer greater than or equal to lower
   and less than or equal to upper - `long`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower >= upper"
  (^Long [^RandomUtils$DataGenerator this ^Long lower ^Long upper]
    (-> this (.nextLong lower upper))))

(defn next-uniform
  "Generates a uniformly distributed random value from the interval
   (lower, upper) or the interval [lower, upper). The lower
   bound is thus optionally included, while the upper bound is always
   excluded.

   Definition:

   Uniform Distribution lower and upper - lower are the

   location and scale parameters, respectively.

   Algorithm Description: if the lower bound is excluded,
   scales the output of \"nextDouble()\", but rejects 0 values (i.e. it
   will generate another random double if \"nextDouble()\" returns 0).
   This is necessary to provide a symmetric output interval (both
   endpoints excluded).

  lower - Lower bound of the support. - `double`
  upper - Exclusive upper bound of the support. - `double`
  lower-inclusive - true if the lower bound is inclusive. - `boolean`

  returns: a uniformly distributed random value in the (lower, upper)
   interval, if lowerInclusive is false, or in the
   [lower, upper) interval, if lowerInclusive is
   true. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower >= upper."
  (^Double [^RandomUtils$DataGenerator this ^Double lower ^Double upper ^Boolean lower-inclusive]
    (-> this (.nextUniform lower upper lower-inclusive)))
  (^Double [^RandomUtils$DataGenerator this ^Double lower ^Double upper]
    (-> this (.nextUniform lower upper))))

(defn next-permutation
  "Generates an integer array of length k whose entries are selected
   randomly, without repetition, from the integers 0, ..., n - 1
   (inclusive).

   Generated arrays represent permutations of n taken k at a
   time.


   This method calls MathArrays.shuffle in order to create a random shuffle of the set
   of natural numbers { 0, 1, ..., n - 1 }.

  n - Domain of the permutation. - `int`
  k - Size of the permutation. - `int`

  returns: a random k-permutation of n, as an array of
   integers. - `int[]`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if k > n."
  ([^RandomUtils$DataGenerator this ^Integer n ^Integer k]
    (-> this (.nextPermutation n k))))

(defn next-sample
  "Returns a list of k objects selected randomly from the
   given collection.


   Sampling is without replacement; but if collection contains
   identical objects, the sample may include repeats.  If all elements
   are distinct, the resulting object array represents a

   Simple Random Sample of size k from the elements of
   the collection.


   This method calls nextPermutation(c.size(), k)
   in order to sample the collection.

  collection - Collection to be sampled. - `java.util.Collection`
  k - Size of the sample. - `int`

  returns: a random sample of k elements from the collection. - `<T> java.util.List<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if k > collection.size()."
  ([^RandomUtils$DataGenerator this ^java.util.Collection collection ^Integer k]
    (-> this (.nextSample collection k))))

