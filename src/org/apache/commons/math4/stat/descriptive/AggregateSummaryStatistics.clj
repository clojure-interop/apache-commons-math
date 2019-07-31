(ns org.apache.commons.math4.stat.descriptive.AggregateSummaryStatistics
  " An aggregator for SummaryStatistics from several data sets or
  data set partitions.  In its simplest usage mode, the client creates an
  instance via the zero-argument constructor, then uses
  createContributingStatistics() to obtain a SummaryStatistics
  for each individual data set / partition.  The per-set statistics objects
  are used as normal, and at any time the aggregate statistics for all the
  contributors can be obtained from this object.

  Clients with specialized requirements can use alternative constructors to
  control the statistics implementations and initial values used by the
  contributing and the internal aggregate SummaryStatistics objects.

  A static aggregate(Collection) method is also included that computes
  aggregate statistics directly from a Collection of SummaryStatistics instances.

  When createContributingStatistics() is used to create SummaryStatistics
  instances to be aggregated concurrently, the created instances'
  SummaryStatistics.addValue(double) methods must synchronize on the aggregating
  instance maintained by this class.  In multithreaded environments, if the functionality
  provided by aggregate(Collection) is adequate, that method should be used
  to avoid unnecessary computation and synchronization delays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive AggregateSummaryStatistics]))

(defn ->aggregate-summary-statistics
  "Constructor.

  Initializes a new AggregateSummaryStatistics with the specified statistics
   object as a prototype for contributing statistics and for the internal
   aggregate statistics.  This provides for different statistics implementations
   to be used by contributing and aggregate statistics and for an initial
   state to be supplied for the aggregate statistics.

  prototype-statistics - a SummaryStatistics serving as a prototype both for the internal aggregate statistics and for contributing statistics obtained via the createContributingStatistics() method. Being a prototype means that other objects are initialized by copying this object's state. If null, a new, default statistics object is used. Any statistic values in the prototype are propagated to contributing statistics objects, but not into these aggregate statistics. - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`
  initial-statistics - a SummaryStatistics to serve as the internal aggregate statistics object. If null, a new, default statistics object is used. - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`"
  (^AggregateSummaryStatistics [^org.apache.commons.math4.stat.descriptive.SummaryStatistics prototype-statistics ^org.apache.commons.math4.stat.descriptive.SummaryStatistics initial-statistics]
    (new AggregateSummaryStatistics prototype-statistics initial-statistics))
  (^AggregateSummaryStatistics [^org.apache.commons.math4.stat.descriptive.SummaryStatistics prototype-statistics]
    (new AggregateSummaryStatistics prototype-statistics))
  (^AggregateSummaryStatistics []
    (new AggregateSummaryStatistics )))

(defn *aggregate
  "Computes aggregate summary statistics. This method can be used to combine statistics
   computed over partitions or subsamples - i.e., the StatisticalSummaryValues returned
   should contain the same values that would have been obtained by computing a single
   StatisticalSummary over the combined dataset.

   Returns null if the collection is empty or null.

  statistics - collection of SummaryStatistics to aggregate - `java.util.Collection`

  returns: summary statistics for the combined dataset - `org.apache.commons.math4.stat.descriptive.StatisticalSummaryValues`"
  (^org.apache.commons.math4.stat.descriptive.StatisticalSummaryValues [^java.util.Collection statistics]
    (AggregateSummaryStatistics/aggregate statistics)))

(defn get-second-moment
  "Returns a statistic related to the Second Central Moment.  Specifically,
   what is returned is the sum of squared deviations from the sample mean
   among the all of the aggregated data.

  returns: second central moment statistic - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getSecondMoment))))

(defn get-variance
  "Returns the variance of the available values..  This version returns the variance of all the aggregated
   data.

  returns: The variance, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getVariance))))

(defn get-sum
  "Returns the sum of the values that have been added to Univariate..  This version returns a sum of all the aggregated data.

  returns: The sum or Double.NaN if no values have been added - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns the minimum of the available values.  This version returns the minimum over all the aggregated
   data.

  returns: The min or Double.NaN if no values have been added. - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getMin))))

(defn get-max
  "Returns the maximum of the available values.  This version returns the maximum over all the aggregated
   data.

  returns: The max or Double.NaN if no values have been added. - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getMax))))

(defn get-mean
  "Returns the
   arithmetic mean  of the available values.  This version returns the mean of all the aggregated data.

  returns: The mean or Double.NaN if no values have been added. - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getMean))))

(defn get-geometric-mean
  "Returns the geometric mean of all the aggregated data.

  returns: the geometric mean - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getGeometricMean))))

(defn get-sumsq
  "Returns the sum of the squares of all the aggregated data.

  returns: The sum of squares - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getSumsq))))

(defn get-summary
  "Return a StatisticalSummaryValues instance reporting current
   aggregate statistics.

  returns: Current values of aggregate statistics - `org.apache.commons.math4.stat.descriptive.StatisticalSummary`"
  (^org.apache.commons.math4.stat.descriptive.StatisticalSummary [^AggregateSummaryStatistics this]
    (-> this (.getSummary))))

(defn create-contributing-statistics
  "Creates and returns a SummaryStatistics whose data will be
   aggregated with those of this AggregateSummaryStatistics.

  returns: a SummaryStatistics whose data will be aggregated with
        those of this AggregateSummaryStatistics.  The initial state
        is a copy of the configured prototype statistics. - `org.apache.commons.math4.stat.descriptive.SummaryStatistics`"
  (^org.apache.commons.math4.stat.descriptive.SummaryStatistics [^AggregateSummaryStatistics this]
    (-> this (.createContributingStatistics))))

(defn get-standard-deviation
  "Returns the standard deviation of the available values..  This version returns the standard deviation of all the
   aggregated data.

  returns: The standard deviation, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getStandardDeviation))))

(defn get-n
  "Returns the number of available values.  This version returns a count of all the aggregated data.

  returns: The number of available values - `long`"
  (^Long [^AggregateSummaryStatistics this]
    (-> this (.getN))))

(defn get-sum-of-logs
  "Returns the sum of the logs of all the aggregated data.

  returns: the sum of logs - `double`"
  (^Double [^AggregateSummaryStatistics this]
    (-> this (.getSumOfLogs))))

