(ns org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer
  "Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering KMeansPlusPlusClusterer]))

(defn ->k-means-plus-plus-clusterer
  "Constructor.

  Build a clusterer.

  k - the number of clusters to split the data into - `int`
  max-iterations - the maximum number of iterations to run the algorithm for. If negative, no maximum will be used. - `int`
  measure - the distance measure to use - `org.apache.commons.math4.ml.distance.DistanceMeasure`
  random - random generator to use for choosing initial centers - `org.apache.commons.rng.UniformRandomProvider`
  empty-strategy - strategy to use for handling empty clusters that may appear during algorithm iterations - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy`"
  (^KMeansPlusPlusClusterer [^Integer k ^Integer max-iterations ^org.apache.commons.math4.ml.distance.DistanceMeasure measure ^org.apache.commons.rng.UniformRandomProvider random ^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy empty-strategy]
    (new KMeansPlusPlusClusterer k max-iterations measure random empty-strategy))
  (^KMeansPlusPlusClusterer [^Integer k ^Integer max-iterations ^org.apache.commons.math4.ml.distance.DistanceMeasure measure ^org.apache.commons.rng.UniformRandomProvider random]
    (new KMeansPlusPlusClusterer k max-iterations measure random))
  (^KMeansPlusPlusClusterer [^Integer k ^Integer max-iterations ^org.apache.commons.math4.ml.distance.DistanceMeasure measure]
    (new KMeansPlusPlusClusterer k max-iterations measure))
  (^KMeansPlusPlusClusterer [^Integer k ^Integer max-iterations]
    (new KMeansPlusPlusClusterer k max-iterations))
  (^KMeansPlusPlusClusterer [^Integer k]
    (new KMeansPlusPlusClusterer k)))

(defn get-k
  "Return the number of clusters this instance will use.

  returns: the number of clusters - `int`"
  (^Integer [^KMeansPlusPlusClusterer this]
    (-> this (.getK))))

(defn get-max-iterations
  "Returns the maximum number of iterations this instance will use.

  returns: the maximum number of iterations, or -1 if no maximum is set - `int`"
  (^Integer [^KMeansPlusPlusClusterer this]
    (-> this (.getMaxIterations))))

(defn get-random-generator
  "Returns the random generator this instance will use.

  returns: the random generator - `org.apache.commons.rng.UniformRandomProvider`"
  (^org.apache.commons.rng.UniformRandomProvider [^KMeansPlusPlusClusterer this]
    (-> this (.getRandomGenerator))))

(defn get-empty-cluster-strategy
  "Returns the KMeansPlusPlusClusterer.EmptyClusterStrategy used by this instance.

  returns: the KMeansPlusPlusClusterer.EmptyClusterStrategy - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy`"
  (^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy [^KMeansPlusPlusClusterer this]
    (-> this (.getEmptyClusterStrategy))))

(defn cluster
  "Runs the K-means++ clustering algorithm.

  points - the points to cluster - `java.util.Collection`

  returns: a list of clusters containing the points - `java.util.List<org.apache.commons.math4.ml.clustering.CentroidCluster<T>>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the data points are null or the number of clusters is larger than the number of data points"
  (^java.util.List [^KMeansPlusPlusClusterer this ^java.util.Collection points]
    (-> this (.cluster points))))

