(ns org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics
  "Implementation of
  DescriptiveStatistics that
  is safe to use in a multithreaded environment.  Multiple threads can safely
  operate on a single instance without causing runtime exceptions due to race
  conditions.  In effect, this implementation makes modification and access
  methods atomic operations for a single instance.  That is to say, as one
  thread is computing a statistic from the instance, no other thread can modify
  the instance nor compute another statistic."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive SynchronizedDescriptiveStatistics]))

(defn ->synchronized-descriptive-statistics
  "Constructor.

  Construct an instance with finite window

  window - the finite window size. - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if window size is less than 1 but not equal to DescriptiveStatistics.INFINITE_WINDOW"
  (^SynchronizedDescriptiveStatistics [^Integer window]
    (new SynchronizedDescriptiveStatistics window))
  (^SynchronizedDescriptiveStatistics []
    (new SynchronizedDescriptiveStatistics )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.
   Acquires synchronization lock on source, then dest before copying.

  source - SynchronizedDescriptiveStatistics to copy - `org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics`
  dest - SynchronizedDescriptiveStatistics to copy to - `org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics source ^org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics dest]
    (SynchronizedDescriptiveStatistics/copy source dest)))

(defn copy
  "Returns a copy of this SynchronizedDescriptiveStatistics instance with the
   same internal state.

  returns: a copy of this - `org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics`"
  (^org.apache.commons.math4.stat.descriptive.SynchronizedDescriptiveStatistics [^SynchronizedDescriptiveStatistics this]
    (-> this (.copy))))

(defn get-values
  "Returns the current set of values in an array of double primitives.
   The order of addition is preserved.  The returned array is a fresh
   copy of the underlying data -- i.e., it is not a reference to the
   stored data.

  returns: returns the current set of numbers in the order in which they
           were added to this set - `double[]`"
  ([^SynchronizedDescriptiveStatistics this]
    (-> this (.getValues))))

(defn get-window-size
  "Returns the maximum number of values that can be stored in the
   dataset, or INFINITE_WINDOW (-1) if there is no limit.

  returns: The current window size or -1 if its Infinite. - `int`"
  (^Integer [^SynchronizedDescriptiveStatistics this]
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

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if window size is less than 1 but not equal to DescriptiveStatistics.INFINITE_WINDOW"
  ([^SynchronizedDescriptiveStatistics this ^Integer window-size]
    (-> this (.setWindowSize window-size))))

(defn get-element
  "Returns the element at the specified index

  index - The Index of the element - `int`

  returns: return the element at the specified index - `double`"
  (^Double [^SynchronizedDescriptiveStatistics this ^Integer index]
    (-> this (.getElement index))))

(defn to-string
  "Generates a text report displaying univariate statistics from values
   that have been added.  Each statistic is displayed on a separate
   line.

  returns: String with line feeds displaying statistics - `java.lang.String`"
  (^java.lang.String [^SynchronizedDescriptiveStatistics this]
    (-> this (.toString))))

(defn apply
  "Apply the given statistic to the data associated with this set of statistics.

  stat - the statistic to apply - `org.apache.commons.math4.stat.descriptive.UnivariateStatistic`

  returns: the computed value of the statistic. - `double`"
  (^Double [^SynchronizedDescriptiveStatistics this ^org.apache.commons.math4.stat.descriptive.UnivariateStatistic stat]
    (-> this (.apply stat))))

(defn get-standard-deviation
  "Returns the standard deviation of the available values.

  returns: The standard deviation, Double.NaN if no values have been added
   or 0.0 for a single value set. - `double`"
  (^Double [^SynchronizedDescriptiveStatistics this]
    (-> this (.getStandardDeviation))))

(defn clear
  "Resets all statistics and storage"
  ([^SynchronizedDescriptiveStatistics this]
    (-> this (.clear))))

(defn add-value
  "Adds the value to the dataset. If the dataset is at the maximum size
   (i.e., the number of stored elements equals the currently configured
   windowSize), the first (oldest) element in the dataset is discarded
   to make room for the new value.

  v - the value to be added - `double`"
  ([^SynchronizedDescriptiveStatistics this ^Double v]
    (-> this (.addValue v))))

(defn get-quadratic-mean
  "Returns the quadratic mean, a.k.a.

   root-mean-square of the available values

  returns: The quadratic mean or Double.NaN if no values
   have been added. - `double`"
  (^Double [^SynchronizedDescriptiveStatistics this]
    (-> this (.getQuadraticMean))))

(defn get-n
  "Returns the number of available values

  returns: The number of available values - `long`"
  (^Long [^SynchronizedDescriptiveStatistics this]
    (-> this (.getN))))

