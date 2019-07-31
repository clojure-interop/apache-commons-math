(ns org.apache.commons.math4.geometry.euclidean.twod.SubLine
  "This class represents a sub-hyperplane for Line."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod SubLine]))

(defn ->sub-line
  "Constructor.

  Create a sub-line from two endpoints.

  start - start point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  end - end point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  tolerance - tolerance below which points are considered identical - `double`"
  (^SubLine [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D start ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D end ^Double tolerance]
    (new SubLine start end tolerance))
  (^SubLine [^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane ^org.apache.commons.math4.geometry.partitioning.Region remaining-region]
    (new SubLine hyperplane remaining-region))
  (^SubLine [^org.apache.commons.math4.geometry.euclidean.twod.Segment segment]
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

  returns: list of segments endpoints - `java.util.List<org.apache.commons.math4.geometry.euclidean.twod.Segment>`"
  (^java.util.List [^SubLine this]
    (-> this (.getSegments))))

(defn intersection
  "Get the intersection of the instance and another sub-line.

   This method is related to the intersection method in the Line class, but in addition
   to compute the point along infinite lines, it also checks the point
   lies on both sub-line ranges.

  sub-line - other sub-line which may intersect instance - `org.apache.commons.math4.geometry.euclidean.twod.SubLine`
  include-end-points - if true, endpoints are considered to belong to instance (i.e. they are closed sets) and may be returned, otherwise endpoints are considered to not belong to instance (i.e. they are open sets) and intersection occurring on endpoints lead to null being returned - `boolean`

  returns: the intersection point if there is one, null if the sub-lines don't intersect - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^SubLine this ^org.apache.commons.math4.geometry.euclidean.twod.SubLine sub-line ^Boolean include-end-points]
    (-> this (.intersection sub-line include-end-points))))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyperplane - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the hyperplane and the part of the
   instance on the minus side of the hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^SubLine this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.split hyperplane))))

