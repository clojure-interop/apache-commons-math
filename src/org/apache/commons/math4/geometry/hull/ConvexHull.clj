(ns org.apache.commons.math4.geometry.hull.ConvexHull
  "This class represents a convex hull."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.hull ConvexHull]))

(defn get-vertices
  "Get the vertices of the convex hull.

  returns: vertices of the convex hull - `P[]`"
  ([^ConvexHull this]
    (-> this (.getVertices))))

(defn create-region
  "Returns a new region that is enclosed by the convex hull.

  returns: the region enclosed by the convex hull - `org.apache.commons.math4.geometry.partitioning.Region<S>`

  throws: org.apache.commons.math4.exception.InsufficientDataException - if the number of vertices is not enough to build a region in the respective space"
  (^org.apache.commons.math4.geometry.partitioning.Region [^ConvexHull this]
    (-> this (.createRegion))))

