(ns org.apache.commons.math4.geometry.euclidean.threed.Segment
  "Simple container for a two-points segment."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Segment]))

(defn ->segment
  "Constructor.

  Build a segment.

  start - start point of the segment - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  end - end point of the segment - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  line - line containing the segment - `org.apache.commons.math4.geometry.euclidean.threed.Line`"
  (^Segment [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D start ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D end ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (new Segment start end line)))

(defn get-start
  "Get the start point of the segment.

  returns: start point of the segment - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Segment this]
    (-> this (.getStart))))

(defn get-end
  "Get the end point of the segment.

  returns: end point of the segment - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Segment this]
    (-> this (.getEnd))))

(defn get-line
  "Get the line containing the segment.

  returns: line containing the segment - `org.apache.commons.math4.geometry.euclidean.threed.Line`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Line [^Segment this]
    (-> this (.getLine))))

