(ns org.apache.commons.math4.ml.clustering.CentroidCluster
  "A Cluster used by centroid-based clustering algorithms.

  Defines additionally a cluster center which may not necessarily be a member
  of the original data set."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering CentroidCluster]))

(defn ->centroid-cluster
  "Constructor.

  Build a cluster centered at a specified point.

  center - the point which is to be the center of this cluster - `org.apache.commons.math4.ml.clustering.Clusterable`"
  (^CentroidCluster [^org.apache.commons.math4.ml.clustering.Clusterable center]
    (new CentroidCluster center)))

(defn get-center
  "Get the point chosen to be the center of this cluster.

  returns: chosen cluster center - `org.apache.commons.math4.ml.clustering.Clusterable`"
  (^org.apache.commons.math4.ml.clustering.Clusterable [^CentroidCluster this]
    (-> this (.getCenter))))

