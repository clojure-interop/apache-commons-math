(ns org.apache.commons.math4.stat.descriptive.rank.PSquarePercentile
  "A StorelessUnivariateStatistic estimating percentiles using the
  P2
  Algorithm as explained by Raj
  Jain and Imrich Chlamtac in
  P2 Algorithm
  for Dynamic Calculation of Quantiles and Histogram Without Storing
  Observations.

  Note: This implementation is not synchronized and produces an approximate
  result. For small samples, where data can be stored and processed in memory,
  Percentile should be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank PSquarePercentile]))

(defn ->p-square-percentile
  "Constructor.

  Constructs a PSquarePercentile with the specific percentile value.

  p - the percentile - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p is not greater than 0 and less than or equal to 100"
  (^PSquarePercentile [^Double p]
    (new PSquarePercentile p)))

(defn *new-markers
  "A creation method to build Markers

  initial-five - list of initial five elements - `java.util.List`
  p - the quantile desired - `double`

  returns: an instance of PSquareMarkers - `org.apache.commons.math4.stat.descriptive.rank.PSquarePercentile$PSquareMarkers`"
  (^org.apache.commons.math4.stat.descriptive.rank.PSquarePercentile$PSquareMarkers [^java.util.List initial-five ^Double p]
    (PSquarePercentile/newMarkers initial-five p)))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^PSquarePercentile this]
    (-> this (.copy))))

(defn to-string
  "Returns a string containing the last observation, the current estimate
   of the quantile and all markers.

  returns: string representation of state data - `java.lang.String`"
  (^java.lang.String [^PSquarePercentile this]
    (-> this (.toString))))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.The internal state updated due to the new value in this
   context is basically of the marker positions and computation of the
   approximate quantile.

  observation - the observation currently being added. - `double`"
  ([^PSquarePercentile this ^Double observation]
    (-> this (.increment observation))))

(defn quantile
  "Returns the quantile estimated by this statistic in the range [0.0-1.0]

  returns: quantile estimated by getResult() - `double`"
  (^Double [^PSquarePercentile this]
    (-> this (.quantile))))

(defn hash-code
  "Returns hash code based on getResult() and getN().

  returns: hash code - `int`"
  (^Integer [^PSquarePercentile this]
    (-> this (.hashCode))))

(defn clear
  "Clears the internal state of the Statistic. This basically clears all the markers, the
   initialFive list and sets countOfObservations to 0."
  ([^PSquarePercentile this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^PSquarePercentile this]
    (-> this (.getResult))))

(defn equals
  "Returns true iff o is a PSquarePercentile returning the
   same values as this for getResult() and getN() and also
   having equal markers

  o - object to compare - `java.lang.Object`

  returns: true if o is a PSquarePercentile with
   equivalent internal state - `boolean`"
  (^Boolean [^PSquarePercentile this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^PSquarePercentile this]
    (-> this (.getN))))

