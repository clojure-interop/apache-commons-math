(ns org.apache.commons.math4.ml.clustering.DBSCANClusterer
  "DBSCAN (density-based spatial clustering of applications with noise) algorithm.

  The DBSCAN algorithm forms clusters based on the idea of density connectivity, i.e.
  a point p is density connected to another point q, if there exists a chain of
  points pi, with i = 1 .. n and p1 = p and pn = q,
  such that each pair <pi, pi+1> is directly density-reachable.
  A point q is directly density-reachable from point p if it is in the ε-neighborhood
  of this point.

  Any point that is not density-reachable from a formed cluster is treated as noise, and
  will thus not be present in the result.

  The algorithm requires two parameters:

    eps: the distance that defines the ε-neighborhood of a point
    minPoints: the minimum number of density-connected points required to form a cluster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering DBSCANClusterer]))

(defn ->dbscan-clusterer
  "Constructor.

  Creates a new instance of a DBSCANClusterer.

  eps - maximum radius of the neighborhood to be considered - `double`
  min-pts - minimum number of points needed for a cluster - `int`
  measure - the distance measure to use - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  throws: org.apache.commons.math4.exception.NotPositiveException - if eps < 0.0 or minPts < 0"
  (^DBSCANClusterer [^Double eps ^Integer min-pts ^org.apache.commons.math4.ml.distance.DistanceMeasure measure]
    (new DBSCANClusterer eps min-pts measure))
  (^DBSCANClusterer [^Double eps ^Integer min-pts]
    (new DBSCANClusterer eps min-pts)))

(defn get-eps
  "Returns the maximum radius of the neighborhood to be considered.

  returns: maximum radius of the neighborhood - `double`"
  (^Double [^DBSCANClusterer this]
    (-> this (.getEps))))

(defn get-min-pts
  "Returns the minimum number of points needed for a cluster.

  returns: minimum number of points needed for a cluster - `int`"
  (^Integer [^DBSCANClusterer this]
    (-> this (.getMinPts))))

(defn cluster
  "Performs DBSCAN cluster analysis.

  points - the points to cluster - `java.util.Collection`

  returns: the list of clusters - `java.util.List<org.apache.commons.math4.ml.clustering.Cluster<T>>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the data points are null"
  (^java.util.List [^DBSCANClusterer this ^java.util.Collection points]
    (-> this (.cluster points))))

