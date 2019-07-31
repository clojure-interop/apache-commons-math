(ns org.apache.commons.math4.util.Combinations
  "Utility to create
  combinations (n, k) of k elements in a set of
  n elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Combinations]))

(defn ->combinations
  "Constructor.

  Creates an instance whose range is the k-element subsets of
   {0, ..., n - 1} represented as int[] arrays.

   The iteration order is lexicographic: the arrays returned by the
   iterator are sorted in descending order and
   they are visited in lexicographic order with significance from
   right to left.
   For example, new Combinations(4, 2).iterator() returns
   an iterator that will generate the following sequence of arrays
   on successive calls to
   next():
   [0, 1], [0, 2], [1, 2], [0, 3], [1, 3], [2, 3]

   If k == 0 an iterator containing an empty array is returned;
   if k == n an iterator containing [0, ..., n - 1] is returned.

  n - Size of the set from which subsets are selected. - `int`
  k - Size of the subsets to be enumerated. - `int`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Combinations [^Integer n ^Integer k]
    (new Combinations n k)))

(defn get-n
  "Gets the size of the set from which combinations are drawn.

  returns: the size of the universe. - `int`"
  (^Integer [^Combinations this]
    (-> this (.getN))))

(defn get-k
  "Gets the number of elements in each combination.

  returns: the size of the subsets to be enumerated. - `int`"
  (^Integer [^Combinations this]
    (-> this (.getK))))

(defn iterator
  "returns: `java.util.Iterator<int[]>`"
  ([^Combinations this]
    (-> this (.iterator))))

(defn comparator
  "Defines a lexicographic ordering of combinations.
   The returned comparator allows to compare any two combinations
   that can be produced by this instance's iterator.
   Its compare(int[],int[]) method will throw exceptions if
   passed combinations that are inconsistent with this instance:

    DimensionMismatchException if the array lengths are not
        equal to k,
    OutOfRangeException if an element of the array is not
        within the interval [0, n).

  returns: a lexicographic comparator. - `java.util.Comparator<int[]>`"
  ([^Combinations this]
    (-> this (.comparator))))

