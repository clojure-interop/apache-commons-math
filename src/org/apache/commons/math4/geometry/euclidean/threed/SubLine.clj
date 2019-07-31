(ns org.apache.commons.math4.geometry.euclidean.threed.SubLine
  "This class represents a subset of a Line."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed SubLine]))

(defn ->sub-line
  "Constructor.

  Create a sub-line from two endpoints.

  start - start point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  end - end point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  tolerance - tolerance below which points are considered identical - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the points are equal"
  (^SubLine [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D start ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D end ^Double tolerance]
    (new SubLine start end tolerance))
  (^SubLine [^org.apache.commons.math4.geometry.euclidean.threed.Line line ^org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet remaining-region]
    (new SubLine line remaining-region))
  (^SubLine [^org.apache.commons.math4.geometry.euclidean.threed.Segment segment]
    (new SubLine segment)))

(defn get-segments
  "Get the endpoints of the sub-line.

   A subline may be any arbitrary number of disjoints segments, so the endpoints
   are provided as a list of endpoint pairs. Each element of the list represents
   one segment, and each segment contains a start point at index 0 and an end point
   at index 1. If the sub-line is unbounded in the negative infinity direction,
   the start point of the first segment will have infinite coordinates. If the
   sub-line is unbounded in the positive infinity direction, the end point of the
   last segment will have infinite coordinates. So a sub-line covering the whole
   line will contain just one row and both elements of this row will have infinite
   coordinates. If the sub-line is empty, the returned list will contain 0 segments.

  returns: list of segments endpoints - `java.util.List<org.apache.commons.math4.geometry.euclidean.threed.Segment>`"
  (^java.util.List [^SubLine this]
    (-> this (.getSegments))))

(defn intersection
  "Get the intersection of the instance and another sub-line.

   This method is related to the intersection method in the Line class, but in addition
   to compute the point along infinite lines, it also checks the point
   lies on both sub-line ranges.

  sub-line - other sub-line which may intersect instance - `org.apache.commons.math4.geometry.euclidean.threed.SubLine`
  include-end-points - if true, endpoints are considered to belong to instance (i.e. they are closed sets) and may be returned, otherwise endpoints are considered to not belong to instance (i.e. they are open sets) and intersection occurring on endpoints lead to null being returned - `boolean`

  returns: the intersection point if there is one, null if the sub-lines don't intersect - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^SubLine this ^org.apache.commons.math4.geometry.euclidean.threed.SubLine sub-line ^Boolean include-end-points]
    (-> this (.intersection sub-line include-end-points))))

