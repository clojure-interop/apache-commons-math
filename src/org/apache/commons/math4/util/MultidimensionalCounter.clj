(ns org.apache.commons.math4.util.MultidimensionalCounter
  "Converter between unidimensional storage structure and multidimensional
  conceptual structure.
  This utility will convert from indices in a multidimensional structure
  to the corresponding index in a one-dimensional array. For example,
  assuming that the ranges (in 3 dimensions) of indices are 2, 4 and 3,
  the following correspondences, between 3-tuples indices and unidimensional
  indices, will hold:

   (0, 0, 0) corresponds to 0
   (0, 0, 1) corresponds to 1
   (0, 0, 2) corresponds to 2
   (0, 1, 0) corresponds to 3
   ...
   (1, 0, 0) corresponds to 12
   ...
   (1, 3, 2) corresponds to 23"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MultidimensionalCounter]))

(defn ->multidimensional-counter
  "Constructor.

  Create a counter.

  size - Counter sizes (number of slots in each dimension). - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if one of the sizes is negative or zero."
  (^MultidimensionalCounter [^Integer size]
    (new MultidimensionalCounter size)))

(defn iterator
  "Create an iterator over this counter.

  returns: the iterator. - `org.apache.commons.math4.util.MultidimensionalCounter$Iterator`"
  (^org.apache.commons.math4.util.MultidimensionalCounter$Iterator [^MultidimensionalCounter this]
    (-> this (.iterator))))

(defn get-dimension
  "Get the number of dimensions of the multidimensional counter.

  returns: the number of dimensions. - `int`"
  (^Integer [^MultidimensionalCounter this]
    (-> this (.getDimension))))

(defn get-counts
  "Convert to multidimensional counter.

  index - Index in unidimensional counter. - `int`

  returns: the multidimensional counts. - `int[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if index is not between 0 and the value returned by getSize() (excluded)."
  ([^MultidimensionalCounter this ^Integer index]
    (-> this (.getCounts index))))

(defn get-count
  "Convert to unidimensional counter.

  c - Indices in multidimensional counter. - `int`

  returns: the index within the unidimensionl counter. - `int`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the size of c does not match the size of the array given in the constructor."
  (^Integer [^MultidimensionalCounter this ^Integer c]
    (-> this (.getCount c))))

(defn get-size
  "Get the total number of elements.

  returns: the total size of the unidimensional counter. - `int`"
  (^Integer [^MultidimensionalCounter this]
    (-> this (.getSize))))

(defn get-sizes
  "Get the number of multidimensional counter slots in each dimension.

  returns: the sizes of the multidimensional counter in each dimension. - `int[]`"
  ([^MultidimensionalCounter this]
    (-> this (.getSizes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MultidimensionalCounter this]
    (-> this (.toString))))

