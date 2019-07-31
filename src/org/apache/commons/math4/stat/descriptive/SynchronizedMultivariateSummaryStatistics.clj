(ns org.apache.commons.math4.stat.descriptive.SynchronizedMultivariateSummaryStatistics
  "Implementation of
  MultivariateSummaryStatistics that
  is safe to use in a multithreaded environment.  Multiple threads can safely
  operate on a single instance without causing runtime exceptions due to race
  conditions.  In effect, this implementation makes modification and access
  methods atomic operations for a single instance.  That is to say, as one
  thread is computing a statistic from the instance, no other thread can modify
  the instance nor compute another statistic."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive SynchronizedMultivariateSummaryStatistics]))

(defn ->synchronized-multivariate-summary-statistics
  "Constructor.

  Construct a SynchronizedMultivariateSummaryStatistics instance

  k - dimension of the data - `int`
  is-covariance-bias-corrected - if true, the unbiased sample covariance is computed, otherwise the biased population covariance is computed - `boolean`"
  (^SynchronizedMultivariateSummaryStatistics [^Integer k ^Boolean is-covariance-bias-corrected]
    (new SynchronizedMultivariateSummaryStatistics k is-covariance-bias-corrected)))

(defn get-covariance
  "Returns the covariance matrix of the values that have been added.

  returns: the covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getCovariance))))

(defn get-geo-mean-impl
  "Returns the currently configured geometric mean implementation

  returns: the StorelessUnivariateStatistic implementing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getGeoMeanImpl))))

(defn get-max-impl
  "Returns the currently configured maximum implementation

  returns: the StorelessUnivariateStatistic implementing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMaxImpl))))

(defn set-geo-mean-impl
  "Sets the implementation for the geometric mean.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  geo-mean-impl - the StorelessUnivariateStatistic instance to use for computing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this geo-mean-impl]
    (-> this (.setGeoMeanImpl geo-mean-impl))))

(defn get-sum
  "Returns an array whose ith entry is the sum of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component sums - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns an array whose ith entry is the minimum of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component minima - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMin))))

(defn get-sumsq-impl
  "Returns the currently configured sum of squares implementation

  returns: the StorelessUnivariateStatistic implementing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSumsqImpl))))

(defn get-sum-sq
  "Returns an array whose ith entry is the sum of squares of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component sums of squares - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSumSq))))

(defn get-sum-log
  "Returns an array whose ith entry is the sum of logs of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component log sums - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSumLog))))

(defn get-max
  "Returns an array whose ith entry is the maximum of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component maxima - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMax))))

(defn set-max-impl
  "Sets the implementation for the maximum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  max-impl - the StorelessUnivariateStatistic instance to use for computing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this max-impl]
    (-> this (.setMaxImpl max-impl))))

(defn get-mean
  "Returns an array whose ith entry is the mean of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component means - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying
   summary statistics from values that
   have been added.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.toString))))

(defn get-mean-impl
  "Returns the currently configured mean implementation

  returns: the StorelessUnivariateStatistic implementing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMeanImpl))))

(defn get-geometric-mean
  "Returns an array whose ith entry is the geometric mean of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component geometric means - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getGeometricMean))))

(defn get-dimension
  "Returns the dimension of the data

  returns: The dimension of the data - `int`"
  (^Integer [^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getDimension))))

(defn set-mean-impl
  "Sets the implementation for the mean.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  mean-impl - the StorelessUnivariateStatistic instance to use for computing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this mean-impl]
    (-> this (.setMeanImpl mean-impl))))

(defn get-sum-impl
  "Returns the currently configured Sum implementation

  returns: the StorelessUnivariateStatistic implementing the sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSumImpl))))

(defn get-standard-deviation
  "Returns an array whose ith entry is the standard deviation of the
   ith entries of the arrays that have been added using
   MultivariateSummaryStatistics.addValue(double[])

  returns: the array of component standard deviations - `double[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getStandardDeviation))))

(defn set-sumsq-impl
  "Sets the implementation for the sum of squares.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sumsq-impl - the StorelessUnivariateStatistic instance to use for computing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this sumsq-impl]
    (-> this (.setSumsqImpl sumsq-impl))))

(defn get-sum-log-impl
  "Returns the currently configured sum of logs implementation

  returns: the StorelessUnivariateStatistic implementing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getSumLogImpl))))

(defn hash-code
  "Returns hash code based on values of statistics

  returns: hash code - `int`"
  (^Integer [^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.hashCode))))

(defn set-sum-log-impl
  "Sets the implementation for the sum of logs.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sum-log-impl - the StorelessUnivariateStatistic instance to use for computing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this sum-log-impl]
    (-> this (.setSumLogImpl sum-log-impl))))

(defn set-min-impl
  "Sets the implementation for the minimum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  min-impl - the StorelessUnivariateStatistic instance to use for computing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this min-impl]
    (-> this (.setMinImpl min-impl))))

(defn set-sum-impl
  "Sets the implementation for the Sum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sum-impl - the StorelessUnivariateStatistic instance to use for computing the Sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this sum-impl]
    (-> this (.setSumImpl sum-impl))))

(defn clear
  "Resets all statistics and storage"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.clear))))

(defn add-value
  "Add an n-tuple to the data

  value - the n-tuple to add - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of the array does not match the one used at construction"
  ([^SynchronizedMultivariateSummaryStatistics this value]
    (-> this (.addValue value))))

(defn equals
  "Returns true iff object is a MultivariateSummaryStatistics
   instance and all statistics have the same values as this.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^SynchronizedMultivariateSummaryStatistics this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-min-impl
  "Returns the currently configured minimum implementation

  returns: the StorelessUnivariateStatistic implementing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getMinImpl))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^SynchronizedMultivariateSummaryStatistics this]
    (-> this (.getN))))

