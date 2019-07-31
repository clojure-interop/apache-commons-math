(ns org.apache.commons.math4.stat.descriptive.StatisticalSummary
  "Reporting interface for basic univariate statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive StatisticalSummary]))

(defn get-mean
  "Returns the
   arithmetic mean  of the available values

  returns: The mean or Double.NaN if no values have been added. - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getMean))))

(defn get-variance
  "Returns the variance of the available values.

  returns: The variance, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getVariance))))

(defn get-standard-deviation
  "Returns the standard deviation of the available values.

  returns: The standard deviation, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getStandardDeviation))))

(defn get-max
  "Returns the maximum of the available values

  returns: The max or Double.NaN if no values have been added. - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getMax))))

(defn get-min
  "Returns the minimum of the available values

  returns: The min or Double.NaN if no values have been added. - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getMin))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^StatisticalSummary this]
    (-> this (.getN))))

(defn get-sum
  "Returns the sum of the values that have been added to Univariate.

  returns: The sum or Double.NaN if no values have been added - `double`"
  (^Double [^StatisticalSummary this]
    (-> this (.getSum))))

