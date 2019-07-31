(ns org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHull2D
  "This class represents a convex hull in an two-dimensional euclidean space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod.hull ConvexHull2D]))

(defn ->convex-hull-2-d
  "Constructor.

  Simple constructor.

  vertices - the vertices of the convex hull, must be ordered - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D[]`
  tolerance - tolerance below which points are considered identical - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the vertices do not form a convex hull"
  (^ConvexHull2D [vertices ^Double tolerance]
    (new ConvexHull2D vertices tolerance)))

(defn get-vertices
  "Get the vertices of the convex hull.

  returns: vertices of the convex hull - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D[]`"
  ([^ConvexHull2D this]
    (-> this (.getVertices))))

(defn get-line-segments
  "Get the line segments of the convex hull, ordered.

  returns: the line segments of the convex hull - `org.apache.commons.math4.geometry.euclidean.twod.Segment[]`"
  ([^ConvexHull2D this]
    (-> this (.getLineSegments))))

(defn create-region
  "Returns a new region that is enclosed by the convex hull.

  returns: the region enclosed by the convex hull - `org.apache.commons.math4.geometry.partitioning.Region<org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D>`

  throws: org.apache.commons.math4.exception.InsufficientDataException - if the number of vertices is not enough to build a region in the respective space"
  (^org.apache.commons.math4.geometry.partitioning.Region [^ConvexHull2D this]
    (-> this (.createRegion))))

