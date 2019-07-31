(ns org.apache.commons.math4.geometry.partitioning.BoundaryProjection
  "Class holding the result of point projection on region boundary.
  This class is a simple placeholder, it does not provide any
  processing methods.
  Instances of this class are guaranteed to be immutable"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BoundaryProjection]))

(defn ->boundary-projection
  "Constructor.

  Constructor from raw elements.

  original - original point - `org.apache.commons.math4.geometry.Point`
  projected - projected point - `org.apache.commons.math4.geometry.Point`
  offset - offset of the point with respect to the boundary it is projected on - `double`"
  (^BoundaryProjection [^org.apache.commons.math4.geometry.Point original ^org.apache.commons.math4.geometry.Point projected ^Double offset]
    (new BoundaryProjection original projected offset)))

(defn get-original
  "Get the original point.

  returns: original point - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^BoundaryProjection this]
    (-> this (.getOriginal))))

(defn get-projected
  "Projected point.

  returns: projected point, or null if there are no boundary - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^BoundaryProjection this]
    (-> this (.getProjected))))

(defn get-offset
  "Offset of the point with respect to the boundary it is projected on.

   The offset with respect to the boundary is negative if the original point is inside the region, and positive otherwise.


   If there are no boundary, the value is set to either Double.POSITIVE_INFINITY if the region is empty (i.e. all points are
   outside of the region) or Double.NEGATIVE_INFINITY if the region
   covers the whole space (i.e. all points are inside of the region).

  returns: offset of the point with respect to the boundary it is projected on - `double`"
  (^Double [^BoundaryProjection this]
    (-> this (.getOffset))))

