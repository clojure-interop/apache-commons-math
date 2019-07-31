(ns org.apache.commons.math4.ml.clustering.Clusterer
  "Base class for clustering algorithms."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering Clusterer]))

(defn cluster
  "Perform a cluster analysis on the given set of Clusterable instances.

  points - the set of Clusterable instances - `java.util.Collection`

  returns: a List of clusters - `java.util.List<? extends org.apache.commons.math4.ml.clustering.Cluster<T>>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if points are null or the number of data points is not compatible with this clusterer"
  ([^Clusterer this ^java.util.Collection points]
    (-> this (.cluster points))))

(defn get-distance-measure
  "Returns the DistanceMeasure instance used by this clusterer.

  returns: the distance measure - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^org.apache.commons.math4.ml.distance.DistanceMeasure [^Clusterer this]
    (-> this (.getDistanceMeasure))))

