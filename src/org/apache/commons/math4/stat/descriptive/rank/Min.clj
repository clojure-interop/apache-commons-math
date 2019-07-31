(ns org.apache.commons.math4.stat.descriptive.rank.Min
  "Returns the minimum of the available values.


  The result is NaN iff all values are NaN
  (i.e. NaN values have no impact on the value of the statistic).
  If any of the values equals Double.NEGATIVE_INFINITY,
  the result is Double.NEGATIVE_INFINITY.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank Min]))

(defn ->min
  "Constructor.

  Copy constructor, creates a new Min identical
   to the original.

  original - the Min instance to copy - `org.apache.commons.math4.stat.descriptive.rank.Min`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^Min [^org.apache.commons.math4.stat.descriptive.rank.Min original]
    (new Min original))
  (^Min []
    (new Min )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Min to copy - `org.apache.commons.math4.stat.descriptive.rank.Min`
  dest - Min to copy to - `org.apache.commons.math4.stat.descriptive.rank.Min`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.rank.Min source ^org.apache.commons.math4.stat.descriptive.rank.Min dest]
    (Min/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^Min this ^Double d]
    (-> this (.increment d))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Min this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Min this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Min this]
    (-> this (.getN))))

(defn evaluate
  "Returns the minimum of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if the array is null or
   the array index parameters are not valid.


   The result is NaN iff all values are NaN
   (i.e. NaN values have no impact on the value of the statistic).
   If any of the values equals Double.NEGATIVE_INFINITY,
   the result is Double.NEGATIVE_INFINITY.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the minimum of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^Min this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.rank.Min`"
  (^org.apache.commons.math4.stat.descriptive.rank.Min [^Min this]
    (-> this (.copy))))

