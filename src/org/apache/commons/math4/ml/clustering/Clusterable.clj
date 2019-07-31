(ns org.apache.commons.math4.ml.clustering.Clusterable
  "Interface for n-dimensional points that can be clustered together."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering Clusterable]))

(defn get-point
  "Gets the n-dimensional point.

  returns: the point array - `double[]`"
  ([^Clusterable this]
    (-> this (.getPoint))))

