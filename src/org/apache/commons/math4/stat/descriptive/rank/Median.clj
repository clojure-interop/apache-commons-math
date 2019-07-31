(ns org.apache.commons.math4.stat.descriptive.rank.Median
  "Returns the median of the available values.  This is the same as the 50th percentile.
  See Percentile for a description of the algorithm used.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank Median]))

(defn ->median
  "Constructor.

  Copy constructor, creates a new Median identical
   to the original

  original - the Median instance to copy - `org.apache.commons.math4.stat.descriptive.rank.Median`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^Median [^org.apache.commons.math4.stat.descriptive.rank.Median original]
    (new Median original))
  (^Median []
    (new Median )))

(defn with-estimation-type
  "Build a new instance similar to the current one except for the
   estimation type.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(kthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-estimation-type - estimation type for the new instance - `org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType`

  returns: a new instance, with changed estimation type - `org.apache.commons.math4.stat.descriptive.rank.Median`"
  (^org.apache.commons.math4.stat.descriptive.rank.Median [^Median this ^org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType new-estimation-type]
    (-> this (.withEstimationType new-estimation-type))))

(defn with-na-n-strategy
  "Build a new instance similar to the current one except for the
   NaN handling strategy.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(kthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-na-n-strategy - NaN strategy for the new instance - `org.apache.commons.math4.stat.ranking.NaNStrategy`

  returns: a new instance, with changed NaN handling strategy - `org.apache.commons.math4.stat.descriptive.rank.Median`"
  (^org.apache.commons.math4.stat.descriptive.rank.Median [^Median this ^org.apache.commons.math4.stat.ranking.NaNStrategy new-na-n-strategy]
    (-> this (.withNaNStrategy new-na-n-strategy))))

(defn with-kth-selector
  "Build a new instance similar to the current one except for the
   kthSelector instance specifically set.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(newKthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-kth-selector - KthSelector for the new instance - `org.apache.commons.math4.util.KthSelector`

  returns: a new instance, with changed KthSelector - `org.apache.commons.math4.stat.descriptive.rank.Median`"
  (^org.apache.commons.math4.stat.descriptive.rank.Median [^Median this ^org.apache.commons.math4.util.KthSelector new-kth-selector]
    (-> this (.withKthSelector new-kth-selector))))

