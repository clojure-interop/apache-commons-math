(ns org.apache.commons.math4.stat.descriptive.moment.GeometricMean
  "Returns the
  geometric mean  of the available values.

  Uses a SumOfLogs instance to compute sum of logs and returns
   exp( 1/n  (sum of logs) ).  Therefore,

  If any of values are < 0, the result is NaN.
  If all values are non-negative and less than
  Double.POSITIVE_INFINITY,  but at least one value is 0, the
  result is 0.
  If both Double.POSITIVE_INFINITY and
  Double.NEGATIVE_INFINITY are among the values, the result is
  NaN.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment GeometricMean]))

(defn ->geometric-mean
  "Constructor.

  Copy constructor, creates a new GeometricMean identical
   to the original.

  original - the GeometricMean instance to copy - `org.apache.commons.math4.stat.descriptive.moment.GeometricMean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^GeometricMean [^org.apache.commons.math4.stat.descriptive.moment.GeometricMean original]
    (new GeometricMean original))
  (^GeometricMean []
    (new GeometricMean )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - GeometricMean to copy - `org.apache.commons.math4.stat.descriptive.moment.GeometricMean`
  dest - GeometricMean to copy to - `org.apache.commons.math4.stat.descriptive.moment.GeometricMean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.GeometricMean source ^org.apache.commons.math4.stat.descriptive.moment.GeometricMean dest]
    (GeometricMean/copy source dest)))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.GeometricMean`"
  (^org.apache.commons.math4.stat.descriptive.moment.GeometricMean [^GeometricMean this]
    (-> this (.copy))))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^GeometricMean this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^GeometricMean this]
    (-> this (.getResult))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^GeometricMean this]
    (-> this (.clear))))

(defn evaluate
  "Returns the geometric mean of the entries in the specified portion
   of the input array.

   See GeometricMean for details on the computing algorithm.

   Throws IllegalArgumentException if the array is null.

  values - input array containing the values - `double[]`
  begin - first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the geometric mean or Double.NaN if length = 0 or
   any of the values are <= 0. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the input array is null or the array index parameters are not valid"
  (^Double [^GeometricMean this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^GeometricMean this]
    (-> this (.getN))))

(defn set-sum-log-impl
  "Sets the implementation for the sum of logs.
   This method must be activated before any data has been added - i.e.,
   before increment has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sum-log-impl - the StorelessUnivariateStatistic instance to use for computing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^GeometricMean this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sum-log-impl]
    (-> this (.setSumLogImpl sum-log-impl))))

(defn get-sum-log-impl
  "Returns the currently configured sum of logs implementation.

  returns: the StorelessUnivariateStatistic implementing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^GeometricMean this]
    (-> this (.getSumLogImpl))))

