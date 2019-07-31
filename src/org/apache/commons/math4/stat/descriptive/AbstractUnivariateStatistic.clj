(ns org.apache.commons.math4.stat.descriptive.AbstractUnivariateStatistic
  "Abstract base class for implementations of the UnivariateStatistic interface.

  Provides a default implementation of evaluate(double[]),
  delegating to evaluate(double[], int, int) in the natural way."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive AbstractUnivariateStatistic]))

(defn ->abstract-univariate-statistic
  "Constructor."
  (^AbstractUnivariateStatistic []
    (new AbstractUnivariateStatistic )))

(defn evaluate
  "Returns the result of evaluating the statistic over the specified entries
   in the input array.

  values - the input array - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  returns: the value of the statistic applied to the included array entries - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if values is null or the indices are invalid"
  (^Double [^AbstractUnivariateStatistic this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^AbstractUnivariateStatistic this values]
    (-> this (.evaluate values)))
  (^Double [^AbstractUnivariateStatistic this]
    (-> this (.evaluate))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^AbstractUnivariateStatistic this]
    (-> this (.copy))))

(defn set-data
  "Set the data array.  The input array is copied, not referenced.

  values - data array to store - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if values is null or the indices are not valid"
  ([^AbstractUnivariateStatistic this values ^Integer begin ^Integer length]
    (-> this (.setData values begin length)))
  ([^AbstractUnivariateStatistic this values]
    (-> this (.setData values))))

(defn get-data
  "Get a copy of the stored data array.

  returns: copy of the stored data array (may be null) - `double[]`"
  ([^AbstractUnivariateStatistic this]
    (-> this (.getData))))

