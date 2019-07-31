(ns org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic
  "Extends the definition of UnivariateStatistic with
  increment(double) and incrementAll(double[]) methods for adding
  values and updating internal state.

  This interface is designed to be used for calculating statistics that can be
  computed in one pass through the data without storing the full array of
  sample values.

  Note: unless otherwise stated, the UnivariateStatistic.evaluate(double[]) and
  UnivariateStatistic.evaluate(double[], int, int) methods do NOT alter the internal
  state of the respective statistic."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive StorelessUnivariateStatistic]))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^StorelessUnivariateStatistic this ^Double d]
    (-> this (.increment d))))

(defn increment-all
  "Updates the internal state of the statistic to reflect addition of
   the values in the designated portion of the values array.  Does not
   clear the statistic first -- i.e., the values are added
   incrementally to the dataset.

  values - array holding the new values to add - `double[]`
  start - the array index of the first value to add - `int`
  length - the number of elements to add - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the index"
  ([^StorelessUnivariateStatistic this values ^Integer start ^Integer length]
    (-> this (.incrementAll values start length)))
  ([^StorelessUnivariateStatistic this values]
    (-> this (.incrementAll values))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^StorelessUnivariateStatistic this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^StorelessUnivariateStatistic this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^StorelessUnivariateStatistic this]
    (-> this (.clear))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^StorelessUnivariateStatistic this]
    (-> this (.copy))))

