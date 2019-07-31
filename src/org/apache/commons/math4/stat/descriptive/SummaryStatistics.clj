(ns org.apache.commons.math4.stat.descriptive.SummaryStatistics
  " Computes summary statistics for a stream of data values added using the
  addValue method. The data values are not stored in
  memory, so this class can be used to compute statistics for very large data
  streams.


  The StorelessUnivariateStatistic instances used to maintain summary
  state and compute statistics are configurable via setters. For example, the
  default implementation for the variance can be overridden by calling
  setVarianceImpl(StorelessUnivariateStatistic). Actual parameters to
  these methods must implement the StorelessUnivariateStatistic
  interface and configuration must be completed before addValue
  is called. No configuration is necessary to use the default, commons-math
  provided implementations.


  Note: This class is not thread-safe. Use
  SynchronizedSummaryStatistics if concurrent access from multiple
  threads is required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive SummaryStatistics]))

(defn ->summary-statistics
  "Constructor.

  A copy constructor. Creates a deep-copy of the original.

  original - the SummaryStatistics instance to copy - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^SummaryStatistics [^org.apache.commons.math4.stat.descriptive.SummaryStatistics original]
    (new SummaryStatistics original))
  (^SummaryStatistics []
    (new SummaryStatistics )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - SummaryStatistics to copy - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`
  dest - SummaryStatistics to copy to - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.SummaryStatistics source ^org.apache.commons.math4.stat.descriptive.SummaryStatistics dest]
    (SummaryStatistics/copy source dest)))

(defn get-second-moment
  "Returns a statistic related to the Second Central Moment.  Specifically,
   what is returned is the sum of squared deviations from the sample mean
   among the values that have been added.

   Returns Double.NaN if no data values have been added and
   returns 0 if there is just one value in the data set.

  returns: second central moment statistic - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getSecondMoment))))

(defn get-geo-mean-impl
  "Returns the currently configured geometric mean implementation

  returns: the StorelessUnivariateStatistic implementing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getGeoMeanImpl))))

(defn copy
  "Returns a copy of this SummaryStatistics instance with the same internal state.

  returns: a copy of this - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`"
  (^org.apache.commons.math4.stat.descriptive.SummaryStatistics [^SummaryStatistics this]
    (-> this (.copy))))

(defn get-max-impl
  "Returns the currently configured maximum implementation

  returns: the StorelessUnivariateStatistic implementing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getMaxImpl))))

(defn get-variance
  "Returns the (sample) variance of the available values.

   This method returns the bias-corrected sample variance (using n - 1 in
   the denominator).  Use getPopulationVariance() for the non-bias-corrected
   population variance.

   Double.NaN is returned if no values have been added.

  returns: the variance - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getVariance))))

(defn set-geo-mean-impl
  "Sets the implementation for the geometric mean.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  geo-mean-impl - the StorelessUnivariateStatistic instance to use for computing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic geo-mean-impl]
    (-> this (.setGeoMeanImpl geo-mean-impl))))

(defn get-sum
  "Returns the sum of the values that have been added

  returns: The sum or Double.NaN if no values have been added - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns the minimum of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the minimum - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getMin))))

(defn get-sumsq-impl
  "Returns the currently configured sum of squares implementation

  returns: the StorelessUnivariateStatistic implementing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getSumsqImpl))))

(defn get-max
  "Returns the maximum of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the maximum - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getMax))))

(defn set-max-impl
  "Sets the implementation for the maximum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  max-impl - the StorelessUnivariateStatistic instance to use for computing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic max-impl]
    (-> this (.setMaxImpl max-impl))))

(defn get-mean
  "Returns the mean of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the mean - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying summary statistics from values that
   have been added.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^SummaryStatistics this]
    (-> this (.toString))))

(defn get-mean-impl
  "Returns the currently configured mean implementation

  returns: the StorelessUnivariateStatistic implementing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getMeanImpl))))

(defn get-geometric-mean
  "Returns the geometric mean of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the geometric mean - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getGeometricMean))))

(defn get-population-variance
  "Returns the
   population variance of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the population variance - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getPopulationVariance))))

(defn set-mean-impl
  "Sets the implementation for the mean.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  mean-impl - the StorelessUnivariateStatistic instance to use for computing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic mean-impl]
    (-> this (.setMeanImpl mean-impl))))

(defn get-sumsq
  "Returns the sum of the squares of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: The sum of squares - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getSumsq))))

(defn set-variance-impl
  "Sets the implementation for the variance.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  variance-impl - the StorelessUnivariateStatistic instance to use for computing the variance - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic variance-impl]
    (-> this (.setVarianceImpl variance-impl))))

(defn get-summary
  "Return a StatisticalSummaryValues instance reporting current
   statistics.

  returns: Current values of statistics - `org.apache.commons.math4.stat.descriptive.StatisticalSummary`"
  (^org.apache.commons.math4.stat.descriptive.StatisticalSummary [^SummaryStatistics this]
    (-> this (.getSummary))))

(defn get-variance-impl
  "Returns the currently configured variance implementation

  returns: the StorelessUnivariateStatistic implementing the variance - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getVarianceImpl))))

(defn get-sum-impl
  "Returns the currently configured Sum implementation

  returns: the StorelessUnivariateStatistic implementing the sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getSumImpl))))

(defn get-standard-deviation
  "Returns the standard deviation of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the standard deviation - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getStandardDeviation))))

(defn set-sumsq-impl
  "Sets the implementation for the sum of squares.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sumsq-impl - the StorelessUnivariateStatistic instance to use for computing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sumsq-impl]
    (-> this (.setSumsqImpl sumsq-impl))))

(defn get-sum-log-impl
  "Returns the currently configured sum of logs implementation

  returns: the StorelessUnivariateStatistic implementing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getSumLogImpl))))

(defn hash-code
  "Returns hash code based on values of statistics

  returns: hash code - `int`"
  (^Integer [^SummaryStatistics this]
    (-> this (.hashCode))))

(defn set-sum-log-impl
  "Sets the implementation for the sum of logs.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sum-log-impl - the StorelessUnivariateStatistic instance to use for computing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sum-log-impl]
    (-> this (.setSumLogImpl sum-log-impl))))

(defn set-min-impl
  "Sets the implementation for the minimum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  min-impl - the StorelessUnivariateStatistic instance to use for computing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic min-impl]
    (-> this (.setMinImpl min-impl))))

(defn set-sum-impl
  "Sets the implementation for the Sum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sum-impl - the StorelessUnivariateStatistic instance to use for computing the Sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n >0)"
  ([^SummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sum-impl]
    (-> this (.setSumImpl sum-impl))))

(defn clear
  "Resets all statistics and storage"
  ([^SummaryStatistics this]
    (-> this (.clear))))

(defn add-value
  "Add a value to the data

  value - the value to add - `double`"
  ([^SummaryStatistics this ^Double value]
    (-> this (.addValue value))))

(defn get-quadratic-mean
  "Returns the quadratic mean, a.k.a.

   root-mean-square of the available values

  returns: The quadratic mean or Double.NaN if no values
   have been added. - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getQuadraticMean))))

(defn equals
  "Returns true iff object is a
   SummaryStatistics instance and all statistics have the
   same values as this.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^SummaryStatistics this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-min-impl
  "Returns the currently configured minimum implementation

  returns: the StorelessUnivariateStatistic implementing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SummaryStatistics this]
    (-> this (.getMinImpl))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^SummaryStatistics this]
    (-> this (.getN))))

(defn get-sum-of-logs
  "Returns the sum of the logs of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the sum of logs - `double`"
  (^Double [^SummaryStatistics this]
    (-> this (.getSumOfLogs))))

