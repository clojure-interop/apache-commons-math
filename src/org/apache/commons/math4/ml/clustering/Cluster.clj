(ns org.apache.commons.math4.ml.clustering.Cluster
  "Cluster holding a set of Clusterable points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering Cluster]))

(defn ->cluster
  "Constructor.

  Build a cluster centered at a specified point."
  (^Cluster []
    (new Cluster )))

(defn add-point
  "Add a point to this cluster.

  point - point to add - `T`"
  ([^Cluster this point]
    (-> this (.addPoint point))))

(defn get-points
  "Get the points contained in the cluster.

  returns: points contained in the cluster - `java.util.List<T>`"
  (^java.util.List [^Cluster this]
    (-> this (.getPoints))))

