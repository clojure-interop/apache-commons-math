(ns org.apache.commons.math4.geometry.euclidean.twod.Segment
  "Simple container for a two-points segment."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod Segment]))

(defn ->segment
  "Constructor.

  Build a segment.

  start - start point of the segment - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  end - end point of the segment - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  line - line containing the segment - `org.apache.commons.math4.geometry.euclidean.twod.Line`"
  (^Segment [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D start ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D end ^org.apache.commons.math4.geometry.euclidean.twod.Line line]
    (new Segment start end line)))

(defn get-start
  "Get the start point of the segment.

  returns: start point of the segment - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Segment this]
    (-> this (.getStart))))

(defn get-end
  "Get the end point of the segment.

  returns: end point of the segment - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Segment this]
    (-> this (.getEnd))))

(defn get-line
  "Get the line containing the segment.

  returns: line containing the segment - `org.apache.commons.math4.geometry.euclidean.twod.Line`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Line [^Segment this]
    (-> this (.getLine))))

(defn distance
  "Calculates the shortest distance from a point to this line segment.

   If the perpendicular extension from the point to the line does not
   cross in the bounds of the line segment, the shortest distance to
   the two end points will be returned.


   Algorithm adapted from:

   Thread @ Codeguru

  p - to check - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: distance between the instance and the point - `double`"
  (^Double [^Segment this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p]
    (-> this (.distance p))))

