(ns org.apache.commons.math4.stat.descriptive.DescriptiveStatistics
  "Maintains a dataset of values of a single variable and computes descriptive
  statistics based on stored data.

  The windowSize
  property sets a limit on the number of values that can be stored in the
  dataset. The default value, INFINITE_WINDOW, puts no limit on the size of
  the dataset. This value should be used with caution, as the backing store
  will grow without bound in this case.  For very large datasets,
  SummaryStatistics, which does not store the dataset, should be used
  instead of this class. If windowSize is not INFINITE_WINDOW and
  more values are added than can be stored in the dataset, new values are
  added in a \"rolling\" manner, with new values replacing the \"oldest\" values
  in the dataset.

  Note: this class is not threadsafe.  Use
  SynchronizedDescriptiveStatistics if concurrent access from multiple
  threads is required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive DescriptiveStatistics]))

(defn ->descriptive-statistics
  "Constructor.

  Construct a DescriptiveStatistics instance with the specified window.

  window - the window size. - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if window size is less than 1 but not equal to INFINITE_WINDOW"
  (^DescriptiveStatistics [^Integer window]
    (new DescriptiveStatistics window))
  (^DescriptiveStatistics []
    (new DescriptiveStatistics )))

(def *-infinite-window
  "Static Constant.

  Represents an infinite window size.  When the getWindowSize()
   returns this value, there is no limit to the number of data values
   that can be stored in the dataset.

  type: int"
  DescriptiveStatistics/INFINITE_WINDOW)

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - DescriptiveStatistics to copy - `org.apache.commons.math4.stat.descriptive.DescriptiveStatistics`
  dest - DescriptiveStatistics to copy to - `org.apache.commons.math4.stat.descriptive.DescriptiveStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.DescriptiveStatistics source ^org.apache.commons.math4.stat.descriptive.DescriptiveStatistics dest]
    (DescriptiveStatistics/copy source dest)))

(defn replace-most-recent-value
  "Replaces the most recently stored value with the given value.
   There must be at least one element stored to call this method.

  v - the value to replace the most recent stored value - `double`

  returns: replaced value - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if there are no elements stored"
  (^Double [^DescriptiveStatistics this ^Double v]
    (-> this (.replaceMostRecentValue v))))

(defn get-skewness
  "Returns the skewness of the available values. Skewness is a
   measure of the asymmetry of a given distribution.

  returns: The skewness, Double.NaN if less than 3 values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getSkewness))))

(defn get-kurtosis
  "Returns the Kurtosis of the available values. Kurtosis is a
   measure of the \"peakedness\" of a distribution.

  returns: The kurtosis, Double.NaN if less than 4 values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getKurtosis))))

(defn set-skewness-impl
  "Sets the implementation for the skewness.

  skewness-impl - the UnivariateStatistic instance to use for computing the skewness - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic skewness-impl]
    (-> this (.setSkewnessImpl skewness-impl))))

(defn get-percentile
  "Returns an estimate for the pth percentile of the stored values.

   The implementation provided here follows the first estimation procedure presented
   here.

   Preconditions:
   0 < p ≤ 100 (otherwise an
   MathIllegalArgumentException is thrown)
   at least one value must be stored (returns Double.NaN
        otherwise)

  p - the requested percentile (scaled from 0 - 100) - `double`

  returns: An estimate for the pth percentile of the stored data - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if percentile implementation has been overridden and the supplied implementation does not support setQuantile"
  (^Double [^DescriptiveStatistics this ^Double p]
    (-> this (.getPercentile p))))

(defn copy
  "Returns a copy of this DescriptiveStatistics instance with the same internal state.

  returns: a copy of this - `org.apache.commons.math4.stat.descriptive.DescriptiveStatistics`"
  (^org.apache.commons.math4.stat.descriptive.DescriptiveStatistics [^DescriptiveStatistics this]
    (-> this (.copy))))

(defn get-max-impl
  "Returns the currently configured maximum implementation.

  returns: the UnivariateStatistic implementing the maximum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getMaxImpl))))

(defn get-variance
  "Returns the (sample) variance of the available values.

   This method returns the bias-corrected sample variance (using n - 1 in
   the denominator).  Use getPopulationVariance() for the non-bias-corrected
   population variance.

  returns: The variance, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getVariance))))

(defn get-values
  "Returns the current set of values in an array of double primitives.
   The order of addition is preserved.  The returned array is a fresh
   copy of the underlying data -- i.e., it is not a reference to the
   stored data.

  returns: returns the current set of numbers in the order in which they
           were added to this set - `double[]`"
  ([^DescriptiveStatistics this]
    (-> this (.getValues))))

(defn get-sum
  "Returns the sum of the values that have been added to Univariate.

  returns: The sum or Double.NaN if no values have been added - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getSum))))

(defn get-min
  "Returns the minimum of the available values

  returns: The min or Double.NaN if no values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getMin))))

(defn get-sumsq-impl
  "Returns the currently configured sum of squares implementation.

  returns: the UnivariateStatistic implementing the sum of squares - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getSumsqImpl))))

(defn set-geometric-mean-impl
  "Sets the implementation for the geometric mean.

  geometric-mean-impl - the UnivariateStatistic instance to use for computing the geometric mean - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic geometric-mean-impl]
    (-> this (.setGeometricMeanImpl geometric-mean-impl))))

(defn get-window-size
  "Returns the maximum number of values that can be stored in the
   dataset, or INFINITE_WINDOW (-1) if there is no limit.

  returns: The current window size or -1 if its Infinite. - `int`"
  (^Integer [^DescriptiveStatistics this]
    (-> this (.getWindowSize))))

(defn set-window-size
  "WindowSize controls the number of values that contribute to the
   reported statistics.  For example, if windowSize is set to 3 and the
   values {1,2,3,4,5} have been added  in that order then
   the available values are {3,4,5} and all reported statistics will
   be based on these values. If windowSize is decreased as a result
   of this call and there are more than the new value of elements in the
   current dataset, values from the front of the array are discarded to
   reduce the dataset to windowSize elements.

  window-size - sets the size of the window. - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if window size is less than 1 but not equal to INFINITE_WINDOW"
  ([^DescriptiveStatistics this ^Integer window-size]
    (-> this (.setWindowSize window-size))))

(defn remove-most-recent-value
  "Removes the most recent value from the dataset.

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if there are no elements stored"
  ([^DescriptiveStatistics this]
    (-> this (.removeMostRecentValue))))

(defn get-element
  "Returns the element at the specified index

  index - The Index of the element - `int`

  returns: return the element at the specified index - `double`"
  (^Double [^DescriptiveStatistics this ^Integer index]
    (-> this (.getElement index))))

(defn get-max
  "Returns the maximum of the available values

  returns: The max or Double.NaN if no values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getMax))))

(defn set-kurtosis-impl
  "Sets the implementation for the kurtosis.

  kurtosis-impl - the UnivariateStatistic instance to use for computing the kurtosis - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic kurtosis-impl]
    (-> this (.setKurtosisImpl kurtosis-impl))))

(defn set-max-impl
  "Sets the implementation for the maximum.

  max-impl - the UnivariateStatistic instance to use for computing the maximum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic max-impl]
    (-> this (.setMaxImpl max-impl))))

(defn get-mean
  "Returns the
   arithmetic mean  of the available values

  returns: The mean or Double.NaN if no values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getMean))))

(defn to-string
  "Generates a text report displaying univariate statistics from values
   that have been added.  Each statistic is displayed on a separate
   line.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^DescriptiveStatistics this]
    (-> this (.toString))))

(defn get-skewness-impl
  "Returns the currently configured skewness implementation.

  returns: the UnivariateStatistic implementing the skewness - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getSkewnessImpl))))

(defn set-percentile-impl
  "Sets the implementation to be used by getPercentile(double).
   The supplied UnivariateStatistic must provide a
   setQuantile(double) method; otherwise
   IllegalArgumentException is thrown.

  percentile-impl - the percentileImpl to set - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the supplied implementation does not provide a setQuantile method"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic percentile-impl]
    (-> this (.setPercentileImpl percentile-impl))))

(defn get-mean-impl
  "Returns the currently configured mean implementation.

  returns: the UnivariateStatistic implementing the mean - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getMeanImpl))))

(defn get-geometric-mean
  "Returns the
   geometric mean  of the available values.

   See GeometricMean for details on the computing algorithm.

  returns: The geometricMean, Double.NaN if no values have been added,
   or if any negative values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getGeometricMean))))

(defn apply
  "Apply the given statistic to the data associated with this set of statistics.

  stat - the statistic to apply - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`

  returns: the computed value of the statistic. - `double`"
  (^Double [^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic stat]
    (-> this (.apply stat))))

(defn get-population-variance
  "Returns the
   population variance of the available values.

  returns: The population variance, Double.NaN if no values have been added,
   or 0.0 for a single value set. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getPopulationVariance))))

(defn set-mean-impl
  "Sets the implementation for the mean.

  mean-impl - the UnivariateStatistic instance to use for computing the mean - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic mean-impl]
    (-> this (.setMeanImpl mean-impl))))

(defn get-geometric-mean-impl
  "Returns the currently configured geometric mean implementation.

  returns: the UnivariateStatistic implementing the geometric mean - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getGeometricMeanImpl))))

(defn get-sumsq
  "Returns the sum of the squares of the available values.

  returns: The sum of the squares or Double.NaN if no
   values have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getSumsq))))

(defn set-variance-impl
  "Sets the implementation for the variance.

  variance-impl - the UnivariateStatistic instance to use for computing the variance - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic variance-impl]
    (-> this (.setVarianceImpl variance-impl))))

(defn get-variance-impl
  "Returns the currently configured variance implementation.

  returns: the UnivariateStatistic implementing the variance - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getVarianceImpl))))

(defn get-sum-impl
  "Returns the currently configured sum implementation.

  returns: the UnivariateStatistic implementing the sum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getSumImpl))))

(defn get-standard-deviation
  "Returns the standard deviation of the available values.

  returns: The standard deviation, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getStandardDeviation))))

(defn set-sumsq-impl
  "Sets the implementation for the sum of squares.

  sumsq-impl - the UnivariateStatistic instance to use for computing the sum of squares - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic sumsq-impl]
    (-> this (.setSumsqImpl sumsq-impl))))

(defn get-percentile-impl
  "Returns the currently configured percentile implementation.

  returns: the UnivariateStatistic implementing the percentile - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getPercentileImpl))))

(defn get-kurtosis-impl
  "Returns the currently configured kurtosis implementation.

  returns: the UnivariateStatistic implementing the kurtosis - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getKurtosisImpl))))

(defn set-min-impl
  "Sets the implementation for the minimum.

  min-impl - the UnivariateStatistic instance to use for computing the minimum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic min-impl]
    (-> this (.setMinImpl min-impl))))

(defn set-sum-impl
  "Sets the implementation for the sum.

  sum-impl - the UnivariateStatistic instance to use for computing the sum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  ([^DescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic sum-impl]
    (-> this (.setSumImpl sum-impl))))

(defn clear
  "Resets all statistics and storage"
  ([^DescriptiveStatistics this]
    (-> this (.clear))))

(defn add-value
  "Adds the value to the dataset. If the dataset is at the maximum size
   (i.e., the number of stored elements equals the currently configured
   windowSize), the first (oldest) element in the dataset is discarded
   to make room for the new value.

  v - the value to be added - `double`"
  ([^DescriptiveStatistics this ^Double v]
    (-> this (.addValue v))))

(defn get-quadratic-mean
  "Returns the quadratic mean, a.k.a.

   root-mean-square of the available values

  returns: The quadratic mean or Double.NaN if no values
   have been added. - `double`"
  (^Double [^DescriptiveStatistics this]
    (-> this (.getQuadraticMean))))

(defn get-min-impl
  "Returns the currently configured minimum implementation.

  returns: the UnivariateStatistic implementing the minimum - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`"
  (^org.apache.commons.math4.stat.descriptive.UnivariateStatistic [^DescriptiveStatistics this]
    (-> this (.getMinImpl))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^DescriptiveStatistics this]
    (-> this (.getN))))

(defn get-sorted-values
  "Returns the current set of values in an array of double primitives,
   sorted in ascending order.  The returned array is a fresh
   copy of the underlying data -- i.e., it is not a reference to the
   stored data.

  returns: returns the current set of
   numbers sorted in ascending order - `double[]`"
  ([^DescriptiveStatistics this]
    (-> this (.getSortedValues))))

