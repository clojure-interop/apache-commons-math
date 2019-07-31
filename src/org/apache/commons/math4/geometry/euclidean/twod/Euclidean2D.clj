(ns org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D
  "This class implements a two-dimensional space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod Euclidean2D]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D []
    (Euclidean2D/getInstance )))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Euclidean2D this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

  returns: n-1 dimension sub-space of this space - `org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D [^Euclidean2D this]
    (-> this (.getSubSpace))))

