(ns org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics
  "Implementation of
  SummaryStatistics that
  is safe to use in a multithreaded environment.  Multiple threads can safely
  operate on a single instance without causing runtime exceptions due to race
  conditions.  In effect, this implementation makes modification and access
  methods atomic operations for a single instance.  That is to say, as one
  thread is computing a statistic from the instance, no other thread can modify
  the instance nor compute another statistic."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive SynchronizedSummaryStatistics]))

(defn ->synchronized-summary-statistics
  "Constructor.

  A copy constructor. Creates a deep-copy of the original.

  original - the SynchronizedSummaryStatistics instance to copy - `org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^SynchronizedSummaryStatistics [^org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics original]
    (new SynchronizedSummaryStatistics original))
  (^SynchronizedSummaryStatistics []
    (new SynchronizedSummaryStatistics )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.
   Acquires synchronization lock on source, then dest before copying.

  source - SynchronizedSummaryStatistics to copy - `org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics`
  dest - SynchronizedSummaryStatistics to copy to - `org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics source ^org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics dest]
    (SynchronizedSummaryStatistics/copy source dest)))

(defn get-geo-mean-impl
  "Returns the currently configured geometric mean implementation

  returns: the StorelessUnivariateStatistic implementing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getGeoMeanImpl))))

(defn copy
  "Returns a copy of this SynchronizedSummaryStatistics instance with the
   same internal state.

  returns: a copy of this - `org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics`"
  (^org.apache.commons.math4.stat.descriptive.SynchronizedSummaryStatistics [^SynchronizedSummaryStatistics this]
    (-> this (.copy))))

(defn get-max-impl
  "Returns the currently configured maximum implementation

  returns: the StorelessUnivariateStatistic implementing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getMaxImpl))))

(defn get-variance
  "Returns the (sample) variance of the available values.

   This method returns the bias-corrected sample variance (using n - 1 in
   the denominator).  Use SummaryStatistics.getPopulationVariance() for the non-bias-corrected
   population variance.

   Double.NaN is returned if no values have been added.

  returns: the variance - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getVariance))))

(defn set-geo-mean-impl
  "Sets the implementation for the geometric mean.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  geo-mean-impl - the StorelessUnivariateStatistic instance to use for computing the geometric mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic geo-mean-impl]
    (-> this (.setGeoMeanImpl geo-mean-impl))))

(defn get-sum
  "Returns the sum of the values that have been added

  returns: The sum or Double.NaN if no values have been added - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns the minimum of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the minimum - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getMin))))

(defn get-sumsq-impl
  "Returns the currently configured sum of squares implementation

  returns: the StorelessUnivariateStatistic implementing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getSumsqImpl))))

(defn get-max
  "Returns the maximum of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the maximum - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getMax))))

(defn set-max-impl
  "Sets the implementation for the maximum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  max-impl - the StorelessUnivariateStatistic instance to use for computing the maximum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic max-impl]
    (-> this (.setMaxImpl max-impl))))

(defn get-mean
  "Returns the mean of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the mean - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying summary statistics from values that
   have been added.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^SynchronizedSummaryStatistics this]
    (-> this (.toString))))

(defn get-mean-impl
  "Returns the currently configured mean implementation

  returns: the StorelessUnivariateStatistic implementing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getMeanImpl))))

(defn get-geometric-mean
  "Returns the geometric mean of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the geometric mean - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getGeometricMean))))

(defn get-population-variance
  "Returns the
   population variance of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the population variance - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getPopulationVariance))))

(defn set-mean-impl
  "Sets the implementation for the mean.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  mean-impl - the StorelessUnivariateStatistic instance to use for computing the mean - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic mean-impl]
    (-> this (.setMeanImpl mean-impl))))

(defn get-sumsq
  "Returns the sum of the squares of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: The sum of squares - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getSumsq))))

(defn set-variance-impl
  "Sets the implementation for the variance.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  variance-impl - the StorelessUnivariateStatistic instance to use for computing the variance - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic variance-impl]
    (-> this (.setVarianceImpl variance-impl))))

(defn get-summary
  "Return a StatisticalSummaryValues instance reporting current
   statistics.

  returns: Current values of statistics - `org.apache.commons.math4.stat.descriptive.StatisticalSummary`"
  (^org.apache.commons.math4.stat.descriptive.StatisticalSummary [^SynchronizedSummaryStatistics this]
    (-> this (.getSummary))))

(defn get-variance-impl
  "Returns the currently configured variance implementation

  returns: the StorelessUnivariateStatistic implementing the variance - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getVarianceImpl))))

(defn get-sum-impl
  "Returns the currently configured Sum implementation

  returns: the StorelessUnivariateStatistic implementing the sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getSumImpl))))

(defn get-standard-deviation
  "Returns the standard deviation of the values that have been added.

   Double.NaN is returned if no values have been added.

  returns: the standard deviation - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getStandardDeviation))))

(defn set-sumsq-impl
  "Sets the implementation for the sum of squares.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sumsq-impl - the StorelessUnivariateStatistic instance to use for computing the sum of squares - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sumsq-impl]
    (-> this (.setSumsqImpl sumsq-impl))))

(defn get-sum-log-impl
  "Returns the currently configured sum of logs implementation

  returns: the StorelessUnivariateStatistic implementing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getSumLogImpl))))

(defn hash-code
  "Returns hash code based on values of statistics

  returns: hash code - `int`"
  (^Integer [^SynchronizedSummaryStatistics this]
    (-> this (.hashCode))))

(defn set-sum-log-impl
  "Sets the implementation for the sum of logs.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sum-log-impl - the StorelessUnivariateStatistic instance to use for computing the log sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sum-log-impl]
    (-> this (.setSumLogImpl sum-log-impl))))

(defn set-min-impl
  "Sets the implementation for the minimum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  min-impl - the StorelessUnivariateStatistic instance to use for computing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n > 0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic min-impl]
    (-> this (.setMinImpl min-impl))))

(defn set-sum-impl
  "Sets the implementation for the Sum.


   This method cannot be activated after data has been added - i.e.,
   after addValue has been used to add data.
   If it is activated after data has been added, an IllegalStateException
   will be thrown.

  sum-impl - the StorelessUnivariateStatistic instance to use for computing the Sum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if data has already been added (i.e if n >0)"
  ([^SynchronizedSummaryStatistics this ^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic sum-impl]
    (-> this (.setSumImpl sum-impl))))

(defn clear
  "Resets all statistics and storage"
  ([^SynchronizedSummaryStatistics this]
    (-> this (.clear))))

(defn add-value
  "Add a value to the data

  value - the value to add - `double`"
  ([^SynchronizedSummaryStatistics this ^Double value]
    (-> this (.addValue value))))

(defn get-quadratic-mean
  "Returns the quadratic mean, a.k.a.

   root-mean-square of the available values

  returns: The quadratic mean or Double.NaN if no values
   have been added. - `double`"
  (^Double [^SynchronizedSummaryStatistics this]
    (-> this (.getQuadraticMean))))

(defn equals
  "Returns true iff object is a
   SummaryStatistics instance and all statistics have the
   same values as this.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^SynchronizedSummaryStatistics this ^java.lang.Object object]
    (-> this (.equals object))))

(defn get-min-impl
  "Returns the currently configured minimum implementation

  returns: the StorelessUnivariateStatistic implementing the minimum - `org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.StorelessUnivariateStatistic [^SynchronizedSummaryStatistics this]
    (-> this (.getMinImpl))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^SynchronizedSummaryStatistics this]
    (-> this (.getN))))

