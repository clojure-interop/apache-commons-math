(ns org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D
  "This class implements a three-dimensional space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Euclidean3D]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D []
    (Euclidean3D/getInstance )))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Euclidean3D this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

  returns: n-1 dimension sub-space of this space - `org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D [^Euclidean3D this]
    (-> this (.getSubSpace))))

