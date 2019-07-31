(ns org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHullGenerator2D
  "Interface for convex hull generators in the two-dimensional euclidean space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod.hull ConvexHullGenerator2D]))

(defn generate
  "Builds the convex hull from the set of input points.

  points - the set of input points - `java.util.Collection`

  returns: the convex hull - `org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHull2D`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the input collection is null"
  (^org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHull2D [^ConvexHullGenerator2D this ^java.util.Collection points]
    (-> this (.generate points))))

