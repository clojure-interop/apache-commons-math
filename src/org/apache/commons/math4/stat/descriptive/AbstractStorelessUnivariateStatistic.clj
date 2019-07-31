(ns org.apache.commons.math4.stat.descriptive.AbstractStorelessUnivariateStatistic
  "Abstract base class for implementations of the
  StorelessUnivariateStatistic interface.

  Provides default evaluate(double[],...) and incrementAll(double[])
  implementations.

  Note that these implementations are not synchronized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive AbstractStorelessUnivariateStatistic]))

(defn ->abstract-storeless-univariate-statistic
  "Constructor."
  (^AbstractStorelessUnivariateStatistic []
    (new AbstractStorelessUnivariateStatistic )))

(defn evaluate
  "This default implementation creates a copy of this StorelessUnivariateStatistic
   instance, calls clear() on it, then calls incrementAll(double[]) with the specified
   portion of the input array, and then uses getResult() to compute the return value.

   Note that this implementation does not change the internal state of the statistic.

   Implementations may override this method with a more efficient and possibly more
   accurate implementation that works directly with the input array.

   If the array is null or the index parameters are not valid, an
   MathIllegalArgumentException is thrown.

  values - the input array - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  returns: the value of the statistic applied to the included array entries - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the indices are not valid"
  (^Double [^AbstractStorelessUnivariateStatistic this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^AbstractStorelessUnivariateStatistic this values]
    (-> this (.evaluate values))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^AbstractStorelessUnivariateStatistic this]
    (-> this (.copy))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^AbstractStorelessUnivariateStatistic this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^AbstractStorelessUnivariateStatistic this]
    (-> this (.getResult))))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^AbstractStorelessUnivariateStatistic this ^Double d]
    (-> this (.increment d))))

(defn increment-all
  "This default implementation just calls increment(double) in a loop over
   the specified portion of the input array.

   Throws IllegalArgumentException if the input values array is null.

  values - array holding values to add - `double[]`
  begin - index of the first array element to add - `int`
  length - number of array elements to add - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if values is null"
  ([^AbstractStorelessUnivariateStatistic this values ^Integer begin ^Integer length]
    (-> this (.incrementAll values begin length)))
  ([^AbstractStorelessUnivariateStatistic this values]
    (-> this (.incrementAll values))))

(defn equals
  "Returns true iff object is the same type of
   StorelessUnivariateStatistic (the object's class equals this
   instance) returning the same values as this for getResult()
   and getN().

  object - object to test equality against. - `java.lang.Object`

  returns: true if object returns the same value as this - `boolean`"
  (^Boolean [^AbstractStorelessUnivariateStatistic this ^java.lang.Object object]
    (-> this (.equals object))))

(defn hash-code
  "Returns hash code based on getResult() and getN().

  returns: hash code - `int`"
  (^Integer [^AbstractStorelessUnivariateStatistic this]
    (-> this (.hashCode))))

