(ns org.apache.commons.math4.ml.clustering.evaluation.SumOfClusterVariances
  "Computes the sum of intra-cluster distance variances according to the formula:


  \\( score = \\sum\\limits_{i=1}^n \\sigma_i^2 \\)
  where n is the number of clusters and \\( \\sigma_i^2 \\) is the variance of
  intra-cluster distances of cluster \\( c_i \\)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering.evaluation SumOfClusterVariances]))

(defn ->sum-of-cluster-variances
  "Constructor.

  measure - the distance measure to use - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^SumOfClusterVariances [^org.apache.commons.math4.ml.distance.DistanceMeasure measure]
    (new SumOfClusterVariances measure)))

(defn score
  "Computes the evaluation score for the given list of clusters.

  clusters - the clusters to evaluate - `java.util.List`

  returns: the computed score - `double`"
  (^Double [^SumOfClusterVariances this ^java.util.List clusters]
    (-> this (.score clusters))))

