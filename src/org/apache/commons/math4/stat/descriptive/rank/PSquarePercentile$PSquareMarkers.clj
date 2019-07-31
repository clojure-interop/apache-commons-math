(ns org.apache.commons.math4.stat.descriptive.rank.PSquarePercentile$PSquareMarkers
  "An interface that encapsulates abstractions of the
  P-square algorithm markers as is explained in the original works. This
  interface is exposed with protected access to help in testability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank PSquarePercentile$PSquareMarkers]))

(defn get-percentile-value
  "Returns Percentile value computed thus far.

  returns: percentile - `double`"
  (^Double [^PSquarePercentile$PSquareMarkers this]
    (-> this (.getPercentileValue))))

(defn clone
  "A clone function to clone the current instance. It's created as an
   interface method as well for convenience though Cloneable is just a
   marker interface.

  returns: clone of this instance - `java.lang.Object`"
  (^java.lang.Object [^PSquarePercentile$PSquareMarkers this]
    (-> this (.clone))))

(defn height
  "Returns the marker height (or percentile) of a given marker index.

  marker-index - is the index of marker in the marker array - `int`

  returns: percentile value of the marker index passed - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - in case the index is not within [1-5]"
  (^Double [^PSquarePercentile$PSquareMarkers this ^Integer marker-index]
    (-> this (.height marker-index))))

(defn process-data-point
  "Process a data point by moving the marker heights based on estimator.

  input-data-point - is the data point passed - `double`

  returns: computed percentile - `double`"
  (^Double [^PSquarePercentile$PSquareMarkers this ^Double input-data-point]
    (-> this (.processDataPoint input-data-point))))

(defn estimate
  "An Estimate of the percentile value of a given Marker

  index - the marker's index in the array of markers - `int`

  returns: percentile estimate - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - in case if index is not within [1-5]"
  (^Double [^PSquarePercentile$PSquareMarkers this ^Integer index]
    (-> this (.estimate index))))

