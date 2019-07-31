(ns org.apache.commons.math4.ml.clustering.evaluation.ClusterEvaluator
  "Base class for cluster evaluation methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering.evaluation ClusterEvaluator]))

(defn ->cluster-evaluator
  "Constructor.

  Creates a new cluster evaluator with the given distance measure.

  measure - the distance measure to use - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^ClusterEvaluator [^org.apache.commons.math4.ml.distance.DistanceMeasure measure]
    (new ClusterEvaluator measure))
  (^ClusterEvaluator []
    (new ClusterEvaluator )))

(defn score
  "Computes the evaluation score for the given list of clusters.

  clusters - the clusters to evaluate - `java.util.List`

  returns: the computed score - `double`"
  (^Double [^ClusterEvaluator this ^java.util.List clusters]
    (-> this (.score clusters))))

(defn better-score?
  "Returns whether the first evaluation score is considered to be better
   than the second one by this evaluator.

   Specific implementations shall override this method if the returned scores
   do not follow the same ordering, i.e. smaller score is better.

  score-1 - the first score - `double`
  score-2 - the second score - `double`

  returns: true if the first score is considered to be better, false otherwise - `boolean`"
  (^Boolean [^ClusterEvaluator this ^Double score-1 ^Double score-2]
    (-> this (.isBetterScore score-1 score-2))))

