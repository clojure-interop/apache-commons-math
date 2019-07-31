(ns org.apache.commons.math4.stat.descriptive.moment.StandardDeviation
  "Computes the sample standard deviation.  The standard deviation
  is the positive square root of the variance.  This implementation wraps a
  Variance instance.  The isBiasCorrected property of the
  wrapped Variance instance is exposed, so that this class can be used to
  compute both the \"sample standard deviation\" (the square root of the
  bias-corrected \"sample variance\") or the \"population standard deviation\"
  (the square root of the non-bias-corrected \"population variance\"). See
  Variance for more information.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment StandardDeviation]))

(defn ->standard-deviation
  "Constructor.

  Constructs a StandardDeviation with the specified value for the
   isBiasCorrected property and the supplied external moment.
   If isBiasCorrected is set to true, the
   Variance used in computing results will use the bias-corrected,
   or \"sample\" formula.  See Variance for details.

  is-bias-corrected - whether or not the variance computation will use the bias-corrected formula - `boolean`
  m-2 - the external moment - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`"
  (^StandardDeviation [^Boolean is-bias-corrected ^org.apache.commons.math4.stat.descriptive.moment.SecondMoment m-2]
    (new StandardDeviation is-bias-corrected m-2))
  (^StandardDeviation [^org.apache.commons.math4.stat.descriptive.moment.SecondMoment m-2]
    (new StandardDeviation m-2))
  (^StandardDeviation []
    (new StandardDeviation )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - StandardDeviation to copy - `org.apache.commons.math4.stat.descriptive.moment.StandardDeviation`
  dest - StandardDeviation to copy to - `org.apache.commons.math4.stat.descriptive.moment.StandardDeviation`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.StandardDeviation source ^org.apache.commons.math4.stat.descriptive.moment.StandardDeviation dest]
    (StandardDeviation/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^StandardDeviation this ^Double d]
    (-> this (.increment d))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^StandardDeviation this]
    (-> this (.getN))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^StandardDeviation this]
    (-> this (.getResult))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^StandardDeviation this]
    (-> this (.clear))))

(defn evaluate
  "Returns the Standard Deviation of the entries in the specified portion of
   the input array, using the precomputed mean value.  Returns
   Double.NaN if the designated subarray is empty.

   Returns 0 for a single-value (i.e. length = 1) sample.

   The formula used assumes that the supplied mean value is the arithmetic
   mean of the sample data, not a known population parameter.  This method
   is supplied only to save computation when the mean has already been
   computed.

   Throws IllegalArgumentException if the array is null.

   Does not change the internal state of the statistic.

  values - the input array - `double[]`
  mean - the precomputed mean value - `double`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the standard deviation of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [^StandardDeviation this values ^Double mean ^Integer begin ^Integer length]
    (-> this (.evaluate values mean begin length)))
  (^Double [^StandardDeviation this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^StandardDeviation this values ^Double mean]
    (-> this (.evaluate values mean)))
  (^Double [^StandardDeviation this values]
    (-> this (.evaluate values))))

(defn bias-corrected?
  "returns: Returns the isBiasCorrected. - `boolean`"
  (^Boolean [^StandardDeviation this]
    (-> this (.isBiasCorrected))))

(defn set-bias-corrected
  "is-bias-corrected - The isBiasCorrected to set. - `boolean`"
  ([^StandardDeviation this ^Boolean is-bias-corrected]
    (-> this (.setBiasCorrected is-bias-corrected))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.StandardDeviation`"
  (^org.apache.commons.math4.stat.descriptive.moment.StandardDeviation [^StandardDeviation this]
    (-> this (.copy))))

