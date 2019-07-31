(ns org.apache.commons.math4.stat.descriptive.summary.SumOfLogs
  "Returns the sum of the natural logs for this collection of values.

  Uses FastMath.log(double) to compute the logs.
  Therefore,

  If any of values are < 0, the result is NaN.
  If all values are non-negative and less than
  Double.POSITIVE_INFINITY,  but at least one value is 0, the
  result is Double.NEGATIVE_INFINITY.
  If both Double.POSITIVE_INFINITY and
  Double.NEGATIVE_INFINITY are among the values, the result is
  NaN.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.summary SumOfLogs]))

(defn ->sum-of-logs
  "Constructor.

  Copy constructor, creates a new SumOfLogs identical
   to the original.

  original - the SumOfLogs instance to copy - `org.apache.commons.math4.stat.descriptive.summary.SumOfLogs`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^SumOfLogs [^org.apache.commons.math4.stat.descriptive.summary.SumOfLogs original]
    (new SumOfLogs original))
  (^SumOfLogs []
    (new SumOfLogs )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - SumOfLogs to copy - `org.apache.commons.math4.stat.descriptive.summary.SumOfLogs`
  dest - SumOfLogs to copy to - `org.apache.commons.math4.stat.descriptive.summary.SumOfLogs`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.summary.SumOfLogs source ^org.apache.commons.math4.stat.descriptive.summary.SumOfLogs dest]
    (SumOfLogs/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^SumOfLogs this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^SumOfLogs this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^SumOfLogs this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^SumOfLogs this]
    (-> this (.clear))))

(defn evaluate
  "Returns the sum of the natural logs of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if the array is null.

   See SumOfLogs.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the natural logs of the values or 0 if
   length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^SumOfLogs this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.summary.SumOfLogs`"
  (^org.apache.commons.math4.stat.descriptive.summary.SumOfLogs [^SumOfLogs this]
    (-> this (.copy))))

