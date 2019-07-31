(ns org.apache.commons.math4.stat.descriptive.UnivariateStatistic
  "Base interface implemented by all statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive UnivariateStatistic]))

(defn evaluate
  "Returns the result of evaluating the statistic over the specified entries
   in the input array.

  values - the input array - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  returns: the value of the statistic applied to the included array entries - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if values is null or the indices are invalid"
  (^Double [^UnivariateStatistic this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^UnivariateStatistic this values]
    (-> this (.evaluate values))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^UnivariateStatistic this]
    (-> this (.copy))))

