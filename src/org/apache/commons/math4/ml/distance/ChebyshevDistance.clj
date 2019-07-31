(ns org.apache.commons.math4.ml.distance.ChebyshevDistance
  "Calculates the L∞ (max of abs) distance between two points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.distance ChebyshevDistance]))

(defn ->chebyshev-distance
  "Constructor."
  (^ChebyshevDistance []
    (new ChebyshevDistance )))

(defn compute
  "Compute the distance between two n-dimensional vectors.

   The two vectors are required to have the same dimension.

  a - the first vector - `double[]`
  b - the second vector - `double[]`

  returns: the distance between the two vectors - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [^ChebyshevDistance this a b]
    (-> this (.compute a b))))

