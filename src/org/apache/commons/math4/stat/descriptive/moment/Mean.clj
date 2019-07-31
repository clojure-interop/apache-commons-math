(ns org.apache.commons.math4.stat.descriptive.moment.Mean
  "Computes the arithmetic mean of a set of values. Uses the definitional
  formula:

  mean = sum(x_i) / n

  where n is the number of observations.

  When increment(double) is used to add data incrementally from a
  stream of (unstored) values, the value of the statistic that
  getResult() returns is computed using the following recursive
  updating algorithm:

  Initialize m =  the first value
  For each additional value, update using
    m = m  (new value - m) / (number of observations)

   If AbstractStorelessUnivariateStatistic.evaluate(double[]) is used to compute the mean of an array
  of stored values, a two-pass, corrected algorithm is used, starting with
  the definitional formula computed using the array of stored values and then
  correcting this by adding the mean deviation of the data values from the
  arithmetic mean. See, e.g. \"Comparison of Several Algorithms for Computing
  Sample Means and Variances,\" Robert F. Ling, Journal of the American
  Statistical Association, Vol. 69, No. 348 (Dec., 1974), pp. 859-866.

   Returns Double.NaN if the dataset is empty. Note that
   Double.NaN may also be returned if the input includes NaN and / or infinite
   values.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment Mean]))

(defn ->mean
  "Constructor.

  Constructs a Mean with an External Moment.

  m-1 - the moment - `org.apache.commons.math4.stat.descriptive.moment.FirstMoment`"
  (^Mean [^org.apache.commons.math4.stat.descriptive.moment.FirstMoment m-1]
    (new Mean m-1))
  (^Mean []
    (new Mean )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Mean to copy - `org.apache.commons.math4.stat.descriptive.moment.Mean`
  dest - Mean to copy to - `org.apache.commons.math4.stat.descriptive.moment.Mean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.Mean source ^org.apache.commons.math4.stat.descriptive.moment.Mean dest]
    (Mean/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.
   Note that when Mean(FirstMoment) is used to
   create a Mean, this method does nothing. In that case, the
   FirstMoment should be incremented directly.

  d - the new value. - `double`"
  ([^Mean this ^Double d]
    (-> this (.increment d))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Mean this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Mean this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Mean this]
    (-> this (.getN))))

(defn evaluate
  "Returns the weighted arithmetic mean of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws IllegalArgumentException if either array is null.

   See Mean for details on the computing algorithm. The two-pass algorithm
   described above is used here, with weights applied in computing both the original
   estimate and the correction factor.

   Throws IllegalArgumentException if any of the following are true:
   the values array is null
       the weights array is null
       the weights array does not have the same length as the values array
       the weights array contains one or more infinite values
       the weights array contains one or more NaN values
       the weights array contains negative values
       the start and length arguments do not determine a valid array

  values - the input array - `double[]`
  weights - the weights array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the mean of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid"
  (^Double [^Mean this values weights ^Integer begin ^Integer length]
    (-> this (.evaluate values weights begin length)))
  (^Double [^Mean this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^Mean this values weights]
    (-> this (.evaluate values weights))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.Mean`"
  (^org.apache.commons.math4.stat.descriptive.moment.Mean [^Mean this]
    (-> this (.copy))))

