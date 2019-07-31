(ns org.apache.commons.math4.stat.descriptive.moment.Skewness
  "Computes the skewness of the available values.

  We use the following (unbiased) formula to define skewness:

  skewness = [n / (n -1) (n - 2)] sum[(x_i - mean)^3] / std^3

  where n is the number of values, mean is the Mean and std is the
  StandardDeviation

  Note that this statistic is undefined for n < 3.  Double.Nan
  is returned when there is not sufficient data to compute the statistic.
  Double.NaN may also be returned if the input includes NaN and / or
  infinite values.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment Skewness]))

(defn ->skewness
  "Constructor.

  Constructs a Skewness with an external moment.

  m-3 - external moment - `org.apache.commons.math4.stat.descriptive.moment.ThirdMoment`"
  (^Skewness [^org.apache.commons.math4.stat.descriptive.moment.ThirdMoment m-3]
    (new Skewness m-3))
  (^Skewness []
    (new Skewness )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Skewness to copy - `org.apache.commons.math4.stat.descriptive.moment.Skewness`
  dest - Skewness to copy to - `org.apache.commons.math4.stat.descriptive.moment.Skewness`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.Skewness source ^org.apache.commons.math4.stat.descriptive.moment.Skewness dest]
    (Skewness/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.
   Note that when Skewness(ThirdMoment) is used to
   create a Skewness, this method does nothing. In that case, the
   ThirdMoment should be incremented directly.

  d - the new value. - `double`"
  ([^Skewness this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the value of the statistic based on the values that have been added.

   See Skewness for the definition used in the computation.

  returns: the skewness of the available values. - `double`"
  (^Double [^Skewness this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Skewness this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Skewness this]
    (-> this (.clear))))

(defn evaluate
  "Returns the Skewness of the entries in the specified portion of the
   input array.

   See Skewness for the definition used in the computation.

   Throws IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - the index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the skewness of the values or Double.NaN if length is less than 3 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^Skewness this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.Skewness`"
  (^org.apache.commons.math4.stat.descriptive.moment.Skewness [^Skewness this]
    (-> this (.copy))))

