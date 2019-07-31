(ns org.apache.commons.math4.ml.distance.DistanceMeasure
  "Interface for distance measures of n-dimensional vectors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.distance DistanceMeasure]))

(defn compute
  "Compute the distance between two n-dimensional vectors.

   The two vectors are required to have the same dimension.

  a - the first vector - `double[]`
  b - the second vector - `double[]`

  returns: the distance between the two vectors - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [^DistanceMeasure this a b]
    (-> this (.compute a b))))

