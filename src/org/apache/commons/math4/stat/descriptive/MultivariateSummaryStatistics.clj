(ns org.apache.commons.math4.stat.descriptive.MultivariateSummaryStatistics
  "Computes summary statistics for a stream of n-tuples added using the
  addValue method. The data values are not stored
  in memory, so this class can be used to compute statistics for very large
  n-tuple streams.

  The StorelessUnivariateStatistic instances used to maintain
  summary state and compute statistics are configurable via setters.
  For example, the default implementation for the mean can be overridden by
  calling setMeanImpl(StorelessUnivariateStatistic[]). Actual
  parameters to these methods must implement the
  StorelessUnivariateStatistic interface and configuration must be
  completed before addValue is called. No configuration is
  necessary to use the default, commons-math provided implementations.

  To compute statistics for a stream of n-tuples, construct a
  MultivariateStatistics instance with dimension n and then use
  addValue(double[]) to add n-tuples. The getXxx
  methods where Xxx is a statistic return an array of double
  values, where for i = 0,...,n-1 the ith array element is the
  value of the given statistic for data range consisting of the ith element of
  each of the input n-tuples.  For example, if addValue is called
  with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},
  getSum will return a three-element array with values
  {0+3+6, 1+4+7, 2+5+8}

  Note: This class is not thread-safe. Use
  SynchronizedMultivariateSummaryStatistics if concurrent access from multiple
  threads is required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive MultivariateSummaryStatistics]))

(defn ->multivariate-summary-statistics
  "Constructor.

  Construct a MultivariateSummaryStatistics instance

  k - dimension of the data - `int`
  is-covariance-bias-corrected - if true, the unbiased sample covariance is computed, otherwise the biased population covariance is computed - `boolean`"
  (^MultivariateSummaryStatistics [^Integer k ^Boolean is-covariance-bias-corrected]
    (new MultivariateSummaryStatistics k is-covariance-bias-corrected)))

(defn get-covariance
  "Returns the covariance matrix of the values that have been added.

  returns: the covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^MultivariateSummaryStatistics this]
    (-> this (.getCovariance))))

(defn get-geo-mean-impl
  "Returns the currently configured geometric mean implementation

  returns: the StorelessUnivariateStatistic implementing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getGeoMeanImpl))))

(defn get-max-impl
  "Returns the currently configured maximum implementation

  returns: the StorelessUnivariateStatistic implementing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMaxImpl))))

(defn set-geo-mean-impl
  "Sets the implementation for the geometric mean.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  geo-mean-impl - the StorelessUnivariateStatistic instance to use for computing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this geo-mean-impl]
    (-> this (.setGeoMeanImpl geo-mean-impl))))

(defn get-sum
  "Returns an array whose ith entry is the sum of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component sums - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns an array whose ith entry is the minimum of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component minima - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMin))))

(defn get-sumsq-impl
  "Returns the currently configured sum of squares implementation

  returns: the StorelessUnivariateStatistic implementing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSumsqImpl))))

(defn get-sum-sq
  "Returns an array whose ith entry is the sum of squares of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component sums of squares - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSumSq))))

(defn get-sum-log
  "Returns an array whose ith entry is the sum of logs of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component log sums - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSumLog))))

(defn get-max
  "Returns an array whose ith entry is the maximum of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component maxima - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMax))))

(defn set-max-impl
  "Sets the implementation for the maximum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  max-impl - the StorelessUnivariateStatistic instance to use for computing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this max-impl]
    (-> this (.setMaxImpl max-impl))))

(defn get-mean
  "Returns an array whose ith entry is the mean of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component means - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying
   summary statistics from values that
   have been added.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^MultivariateSummaryStatistics this]
    (-> this (.toString))))

(defn get-mean-impl
  "Returns the currently configured mean implementation

  returns: the StorelessUnivariateStatistic implementing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMeanImpl))))

(defn get-geometric-mean
  "Returns an array whose ith entry is the geometric mean of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component geometric means - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getGeometricMean))))

(defn get-dimension
  "Returns the dimension of the data

  returns: The dimension of the data - `int`"
  (^Integer [^MultivariateSummaryStatistics this]
    (-> this (.getDimension))))

(defn set-mean-impl
  "Sets the implementation for the mean.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  mean-impl - the StorelessUnivariateStatistic instance to use for computing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this mean-impl]
    (-> this (.setMeanImpl mean-impl))))

(defn get-sum-impl
  "Returns the currently configured Sum implementation

  returns: the StorelessUnivariateStatistic implementing the sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSumImpl))))

(defn get-standard-deviation
  "Returns an array whose ith entry is the standard deviation of the
   ith entries of the arrays that have been added using
   addValue(double[])

  returns: the array of component standard deviations - `double[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getStandardDeviation))))

(defn set-sumsq-impl
  "Sets the implementation for the sum of squares.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sumsq-impl - the StorelessUnivariateStatistic instance to use for computing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this sumsq-impl]
    (-> this (.setSumsqImpl sumsq-impl))))

(defn get-sum-log-impl
  "Returns the currently configured sum of logs implementation

  returns: the StorelessUnivariateStatistic implementing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getSumLogImpl))))

(defn hash-code
  "Returns hash code based on values of statistics

  returns: hash code - `int`"
  (^Integer [^MultivariateSummaryStatistics this]
    (-> this (.hashCode))))

(defn set-sum-log-impl
  "Sets the implementation for the sum of logs.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sum-log-impl - the StorelessUnivariateStatistic instance to use for computing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this sum-log-impl]
    (-> this (.setSumLogImpl sum-log-impl))))

(defn set-min-impl
  "Sets the implementation for the minimum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  min-impl - the StorelessUnivariateStatistic instance to use for computing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this min-impl]
    (-> this (.setMinImpl min-impl))))

(defn set-sum-impl
  "Sets the implementation for the Sum.
   This method must be activated before any data has been added - i.e.,
   before addValue has been used to add data;
   otherwise an IllegalStateException will be thrown.

  sum-impl - the StorelessUnivariateStatistic instance to use for computing the Sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array dimension does not match the one used at construction"
  ([^MultivariateSummaryStatistics this sum-impl]
    (-> this (.setSumImpl sum-impl))))

(defn clear
  "Resets all statistics and storage"
  ([^MultivariateSummaryStatistics this]
    (-> this (.clear))))

(defn add-value
  "Add an n-tuple to the data

  value - the n-tuple to add - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of the array does not match the one used at construction"
  ([^MultivariateSummaryStatistics this value]
    (-> this (.addValue value))))

(defn equals
  "Returns true iff object is a MultivariateSummaryStatistics
   instance and all statistics have the same values as this.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^MultivariateSummaryStatistics this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-min-impl
  "Returns the currently configured minimum implementation

  returns: the StorelessUnivariateStatistic implementing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic[]`"
  ([^MultivariateSummaryStatistics this]
    (-> this (.getMinImpl))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^MultivariateSummaryStatistics this]
    (-> this (.getN))))

