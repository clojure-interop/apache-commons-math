(ns org.apache.commons.math4.ml.distance.ManhattanDistance
  "Calculates the L1 (sum of abs) distance between two points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.distance ManhattanDistance]))

(defn ->manhattan-distance
  "Constructor."
  (^ManhattanDistance []
    (new ManhattanDistance )))

(defn compute
  "Compute the distance between two n-dimensional vectors.

   The two vectors are required to have the same dimension.

  a - the first vector - `double[]`
  b - the second vector - `double[]`

  returns: the distance between the two vectors - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [^ManhattanDistance this a b]
    (-> this (.compute a b))))

