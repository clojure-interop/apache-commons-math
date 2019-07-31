(ns org.apache.commons.math4.stat.descriptive.summary.Sum
  "Returns the sum of the available values.

  If there are no values in the dataset, then 0 is returned.
  If any of the values are
  NaN, then NaN is returned.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.summary Sum]))

(defn ->sum
  "Constructor.

  Copy constructor, creates a new Sum identical
   to the original.

  original - the Sum instance to copy - `org.apache.commons.math4.stat.descriptive.summary.Sum`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^Sum [^org.apache.commons.math4.stat.descriptive.summary.Sum original]
    (new Sum original))
  (^Sum []
    (new Sum )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Sum to copy - `org.apache.commons.math4.stat.descriptive.summary.Sum`
  dest - Sum to copy to - `org.apache.commons.math4.stat.descriptive.summary.Sum`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.summary.Sum source ^org.apache.commons.math4.stat.descriptive.summary.Sum dest]
    (Sum/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^Sum this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Sum this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Sum this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Sum this]
    (-> this (.clear))))

(defn evaluate
  "The weighted sum of the entries in the specified portion of
   the input array, or 0 if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if any of the following are true:
   the values array is null
       the weights array is null
       the weights array does not have the same length as the values array
       the weights array contains one or more infinite values
       the weights array contains one or more NaN values
       the weights array contains negative values
       the start and length arguments do not determine a valid array


   Uses the formula,

      weighted sum = Σ(values[i] * weights[i])

  values - the input array - `double[]`
  weights - the weights array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the values or 0 if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid"
  (^Double [^Sum this values weights ^Integer begin ^Integer length]
    (-> this (.evaluate values weights begin length)))
  (^Double [^Sum this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^Sum this values weights]
    (-> this (.evaluate values weights))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.summary.Sum`"
  (^org.apache.commons.math4.stat.descriptive.summary.Sum [^Sum this]
    (-> this (.copy))))

