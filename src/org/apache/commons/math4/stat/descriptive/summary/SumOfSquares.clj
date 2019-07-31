(ns org.apache.commons.math4.stat.descriptive.summary.SumOfSquares
  "Returns the sum of the squares of the available values.

  If there are no values in the dataset, then 0 is returned.
  If any of the values are
  NaN, then NaN is returned.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.summary SumOfSquares]))

(defn ->sum-of-squares
  "Constructor.

  Copy constructor, creates a new SumOfSquares identical
   to the original.

  original - the SumOfSquares instance to copy - `org.apache.commons.math4.stat.descriptive.summary.SumOfSquares`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^SumOfSquares [^org.apache.commons.math4.stat.descriptive.summary.SumOfSquares original]
    (new SumOfSquares original))
  (^SumOfSquares []
    (new SumOfSquares )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - SumOfSquares to copy - `org.apache.commons.math4.stat.descriptive.summary.SumOfSquares`
  dest - SumOfSquares to copy to - `org.apache.commons.math4.stat.descriptive.summary.SumOfSquares`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.summary.SumOfSquares source ^org.apache.commons.math4.stat.descriptive.summary.SumOfSquares dest]
    (SumOfSquares/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^SumOfSquares this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^SumOfSquares this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^SumOfSquares this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^SumOfSquares this]
    (-> this (.clear))))

(defn evaluate
  "Returns the sum of the squares of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the squares of the values or 0 if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^SumOfSquares this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.summary.SumOfSquares`"
  (^org.apache.commons.math4.stat.descriptive.summary.SumOfSquares [^SumOfSquares this]
    (-> this (.copy))))

