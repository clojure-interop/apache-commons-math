(ns org.apache.commons.math4.stat.descriptive.StatisticalSummaryValues
  "Value object representing the results of a univariate statistical summary."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive StatisticalSummaryValues]))

(defn ->statistical-summary-values
  "Constructor.

  Constructor

  mean - the sample mean - `double`
  variance - the sample variance - `double`
  n - the number of observations in the sample - `long`
  max - the maximum value - `double`
  min - the minimum value - `double`
  sum - the sum of the values - `double`"
  (^StatisticalSummaryValues [^Double mean ^Double variance ^Long n ^Double max ^Double min ^Double sum]
    (new StatisticalSummaryValues mean variance n max min sum)))

(defn get-variance
  "Description copied from interface: StatisticalSummary

  returns: Returns the variance. - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getVariance))))

(defn get-sum
  "Description copied from interface: StatisticalSummary

  returns: Returns the sum. - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getSum))))

(defn get-min
  "Description copied from interface: StatisticalSummary

  returns: Returns the min. - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getMin))))

(defn get-max
  "Description copied from interface: StatisticalSummary

  returns: Returns the max. - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getMax))))

(defn get-mean
  "Description copied from interface: StatisticalSummary

  returns: Returns the mean. - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying values of statistics.
   Each statistic is displayed on a separate line.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^StatisticalSummaryValues this]
    (-> this (.toString))))

(defn get-standard-deviation
  "Description copied from interface: StatisticalSummary

  returns: Returns the standard deviation - `double`"
  (^Double [^StatisticalSummaryValues this]
    (-> this (.getStandardDeviation))))

(defn hash-code
  "Returns hash code based on values of statistics

  returns: hash code - `int`"
  (^Integer [^StatisticalSummaryValues this]
    (-> this (.hashCode))))

(defn equals
  "Returns true iff object is a
   StatisticalSummaryValues instance and all statistics have
    the same values as this.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^StatisticalSummaryValues this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-n
  "Description copied from interface: StatisticalSummary

  returns: Returns the number of values. - `long`"
  (^Long [^StatisticalSummaryValues this]
    (-> this (.getN))))

