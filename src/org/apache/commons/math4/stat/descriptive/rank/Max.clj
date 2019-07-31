(ns org.apache.commons.math4.stat.descriptive.rank.Max
  "Returns the maximum of the available values.


  The result is NaN iff all values are NaN
  (i.e. NaN values have no impact on the value of the statistic).
  If any of the values equals Double.POSITIVE_INFINITY,
  the result is Double.POSITIVE_INFINITY.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank Max]))

(defn ->max
  "Constructor.

  Copy constructor, creates a new Max identical
   to the original.

  original - the Max instance to copy - `org.apache.commons.math4.stat.descriptive.rank.Max`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^Max [^org.apache.commons.math4.stat.descriptive.rank.Max original]
    (new Max original))
  (^Max []
    (new Max )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Max to copy - `org.apache.commons.math4.stat.descriptive.rank.Max`
  dest - Max to copy to - `org.apache.commons.math4.stat.descriptive.rank.Max`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.rank.Max source ^org.apache.commons.math4.stat.descriptive.rank.Max dest]
    (Max/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^Max this ^Double d]
    (-> this (.increment d))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Max this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Max this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Max this]
    (-> this (.getN))))

(defn evaluate
  "Returns the maximum of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if the array is null or
   the array index parameters are not valid.


   The result is NaN iff all values are NaN
   (i.e. NaN values have no impact on the value of the statistic).
   If any of the values equals Double.POSITIVE_INFINITY,
   the result is Double.POSITIVE_INFINITY.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the maximum of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^Max this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.rank.Max`"
  (^org.apache.commons.math4.stat.descriptive.rank.Max [^Max this]
    (-> this (.copy))))

