(ns org.apache.commons.math4.ml.distance.EarthMoversDistance
  "Calculates the Earh Mover's distance (also known as Wasserstein metric) between two distributions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.distance EarthMoversDistance]))

(defn ->earth-movers-distance
  "Constructor."
  (^EarthMoversDistance []
    (new EarthMoversDistance )))

(defn compute
  "Compute the distance between two n-dimensional vectors.

   The two vectors are required to have the same dimension.

  a - the first vector - `double[]`
  b - the second vector - `double[]`

  returns: the distance between the two vectors - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [^EarthMoversDistance this a b]
    (-> this (.compute a b))))

