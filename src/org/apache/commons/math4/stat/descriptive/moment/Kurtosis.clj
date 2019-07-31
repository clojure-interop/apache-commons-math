(ns org.apache.commons.math4.stat.descriptive.moment.Kurtosis
  "Computes the Kurtosis of the available values.

  We use the following (unbiased) formula to define kurtosis:

  kurtosis = { [n(n+1) / (n -1)(n - 2)(n-3)] sum[(x_i - mean)^4] / std^4 } - [3(n-1)^2 / (n-2)(n-3)]

  where n is the number of values, mean is the Mean and std is the
  StandardDeviation

  Note that this statistic is undefined for n < 4.  Double.Nan
  is returned when there is not sufficient data to compute the statistic.
  Note that Double.NaN may also be returned if the input includes NaN
  and / or infinite values.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment Kurtosis]))

(defn ->kurtosis
  "Constructor.

  Construct a Kurtosis from an external moment.

  m-4 - external Moment - `org.apache.commons.math4.stat.descriptive.moment.FourthMoment`"
  (^Kurtosis [^org.apache.commons.math4.stat.descriptive.moment.FourthMoment m-4]
    (new Kurtosis m-4))
  (^Kurtosis []
    (new Kurtosis )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Kurtosis to copy - `org.apache.commons.math4.stat.descriptive.moment.Kurtosis`
  dest - Kurtosis to copy to - `org.apache.commons.math4.stat.descriptive.moment.Kurtosis`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.Kurtosis source ^org.apache.commons.math4.stat.descriptive.moment.Kurtosis dest]
    (Kurtosis/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.
   Note that when Kurtosis(FourthMoment) is used to
   create a Variance, this method does nothing. In that case, the
   FourthMoment should be incremented directly.

  d - the new value. - `double`"
  ([^Kurtosis this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Kurtosis this]
    (-> this (.getResult))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Kurtosis this]
    (-> this (.clear))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Kurtosis this]
    (-> this (.getN))))

(defn evaluate
  "Returns the kurtosis of the entries in the specified portion of the
   input array.

   See Kurtosis for details on the computing algorithm.

   Throws IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the kurtosis of the values or Double.NaN if length is less than 4 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the input array is null or the array index parameters are not valid"
  (^Double [^Kurtosis this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.Kurtosis`"
  (^org.apache.commons.math4.stat.descriptive.moment.Kurtosis [^Kurtosis this]
    (-> this (.copy))))

