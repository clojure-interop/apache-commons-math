(ns org.apache.commons.math4.stat.descriptive.StatisticalMultivariateSummary
  "Reporting interface for basic multivariate statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive StatisticalMultivariateSummary]))

(defn get-covariance
  "Returns the covariance of the available values.

  returns: The covariance, null if no multivariate sample
   have been added or a zeroed matrix for a single value set. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^StatisticalMultivariateSummary this]
    (-> this (.getCovariance))))

(defn get-sum
  "Returns an array whose ith entry is the
   sum of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component sums - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getSum))))

(defn get-min
  "Returns an array whose ith entry is the
   minimum of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component minima - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getMin))))

(defn get-sum-sq
  "Returns an array whose ith entry is the
   sum of squares of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component sums of squares - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getSumSq))))

(defn get-sum-log
  "Returns an array whose ith entry is the
   sum of logs of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component log sums - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getSumLog))))

(defn get-max
  "Returns an array whose ith entry is the
   maximum of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component maxima - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getMax))))

(defn get-mean
  "Returns an array whose ith entry is the
   mean of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component means - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getMean))))

(defn get-geometric-mean
  "Returns an array whose ith entry is the
   geometric mean of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component geometric means - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getGeometricMean))))

(defn get-dimension
  "Returns the dimension of the data

  returns: The dimension of the data - `int`"
  (^Integer [^StatisticalMultivariateSummary this]
    (-> this (.getDimension))))

(defn get-standard-deviation
  "Returns an array whose ith entry is the
   standard deviation of the ith entries of the arrays
   that correspond to each multivariate sample

  returns: the array of component standard deviations - `double[]`"
  ([^StatisticalMultivariateSummary this]
    (-> this (.getStandardDeviation))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^StatisticalMultivariateSummary this]
    (-> this (.getN))))

