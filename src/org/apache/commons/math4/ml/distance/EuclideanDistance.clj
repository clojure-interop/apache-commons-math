(ns org.apache.commons.math4.ml.distance.EuclideanDistance
  "Calculates the L2 (Euclidean) distance between two points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.distance EuclideanDistance]))

(defn ->euclidean-distance
  "Constructor."
  (^EuclideanDistance []
    (new EuclideanDistance )))

(defn compute
  "Compute the distance between two n-dimensional vectors.

   The two vectors are required to have the same dimension.

  a - the first vector - `double[]`
  b - the second vector - `double[]`

  returns: the distance between the two vectors - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [^EuclideanDistance this a b]
    (-> this (.compute a b))))

