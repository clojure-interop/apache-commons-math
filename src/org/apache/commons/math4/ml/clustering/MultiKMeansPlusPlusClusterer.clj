(ns org.apache.commons.math4.ml.clustering.MultiKMeansPlusPlusClusterer
  "A wrapper around a k-means++ clustering algorithm which performs multiple trials
  and returns the best solution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering MultiKMeansPlusPlusClusterer]))

(defn ->multi-k-means-plus-plus-clusterer
  "Constructor.

  Build a clusterer.

  clusterer - the k-means clusterer to use - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer`
  num-trials - number of trial runs - `int`
  evaluator - the cluster evaluator to use - `org.apache.commons.math4.ml.clustering.evaluation.ClusterEvaluator`"
  (^MultiKMeansPlusPlusClusterer [^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer clusterer ^Integer num-trials ^org.apache.commons.math4.ml.clustering.evaluation.ClusterEvaluator evaluator]
    (new MultiKMeansPlusPlusClusterer clusterer num-trials evaluator))
  (^MultiKMeansPlusPlusClusterer [^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer clusterer ^Integer num-trials]
    (new MultiKMeansPlusPlusClusterer clusterer num-trials)))

(defn get-clusterer
  "Returns the embedded k-means clusterer used by this instance.

  returns: the embedded clusterer - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer<T>`"
  (^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer [^MultiKMeansPlusPlusClusterer this]
    (-> this (.getClusterer))))

(defn get-num-trials
  "Returns the number of trials this instance will do.

  returns: the number of trials - `int`"
  (^Integer [^MultiKMeansPlusPlusClusterer this]
    (-> this (.getNumTrials))))

(defn get-cluster-evaluator
  "Returns the ClusterEvaluator used to determine the \"best\" clustering.

  returns: the used ClusterEvaluator - `org.apache.commons.math4.ml.clustering.evaluation.ClusterEvaluator<T>`"
  (^org.apache.commons.math4.ml.clustering.evaluation.ClusterEvaluator [^MultiKMeansPlusPlusClusterer this]
    (-> this (.getClusterEvaluator))))

(defn cluster
  "Runs the K-means++ clustering algorithm.

  points - the points to cluster - `java.util.Collection`

  returns: a list of clusters containing the points - `java.util.List<org.apache.commons.math4.ml.clustering.CentroidCluster<T>>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the data points are null or the number of clusters is larger than the number of data points"
  (^java.util.List [^MultiKMeansPlusPlusClusterer this ^java.util.Collection points]
    (-> this (.cluster points))))

