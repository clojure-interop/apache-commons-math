(ns org.apache.commons.math4.geometry.euclidean.threed.Line
  "The class represent lines in a three dimensional space.

  Each oriented line is intrinsically associated with an abscissa
  which is a coordinate on the line. The point at abscissa 0 is the
  orthogonal projection of the origin on the line, another equivalent
  way to express this is to say that it is the point of the line
  which is closest to the origin. Abscissa increases in the line
  direction."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Line]))

(defn ->line
  "Constructor.

  Build a line from two points.

  p-1 - first point belonging to the line (this can be any point) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  p-2 - second point belonging to the line (this can be any point, different from p1) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  tolerance - tolerance below which points are considered identical - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the points are equal"
  (^Line [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-2 ^Double tolerance]
    (new Line p-1 p-2 tolerance))
  (^Line [^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (new Line line)))

(defn revert
  "Get a line with reversed direction.

  returns: a new instance, with reversed direction - `org.apache.commons.math4.geometry.euclidean.threed.Line`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Line [^Line this]
    (-> this (.revert))))

(defn similar-to?
  "Check if the instance is similar to another line.
   Lines are considered similar if they contain the same
   points. This does not mean they are equal since they can have
   opposite directions.

  line - line to which instance should be compared - `org.apache.commons.math4.geometry.euclidean.threed.Line`

  returns: true if the lines are similar - `boolean`"
  (^Boolean [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (-> this (.isSimilarTo line))))

(defn contains
  "Check if the instance contains a point.

  p - point to check - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: true if p belongs to the line - `boolean`"
  (^Boolean [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p]
    (-> this (.contains p))))

(defn reset
  "Reset the instance as if built from two points.

  p-1 - first point belonging to the line (this can be any point) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  p-2 - second point belonging to the line (this can be any point, different from p1) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the points are equal"
  ([^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-2]
    (-> this (.reset p-1 p-2))))

(defn get-direction
  "Get the normalized direction vector.

  returns: normalized direction vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this]
    (-> this (.getDirection))))

(defn to-space
  "Transform a sub-space point into a space point.

  vector - (n-1)-dimension point of the sub-space - `org.apache.commons.math4.geometry.Vector`

  returns: n-dimension point of the space corresponding to the
   specified sub-space point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSpace vector))))

(defn get-tolerance
  "Get the tolerance below which points are considered identical.

  returns: tolerance below which points are considered identical - `double`"
  (^Double [^Line this]
    (-> this (.getTolerance))))

(defn get-origin
  "Get the line point closest to the origin.

  returns: line point closest to the origin - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this]
    (-> this (.getOrigin))))

(defn distance
  "Compute the distance between the instance and a point.

  p - to check - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: distance between the instance and the point - `double`"
  (^Double [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p]
    (-> this (.distance p))))

(defn intersection
  "Get the intersection point of the instance and another line.

  line - other line - `org.apache.commons.math4.geometry.euclidean.threed.Line`

  returns: intersection point of the instance and the other line
   or null if there are no intersection points - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (-> this (.intersection line))))

(defn point-at
  "Get one point from the line.

  abscissa - desired abscissa for the point - `double`

  returns: one point belonging to the line, at specified abscissa - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this ^Double abscissa]
    (-> this (.pointAt abscissa))))

(defn to-sub-space
  "Transform a space point into a sub-space point.

  vector - n-dimension point of the space - `org.apache.commons.math4.geometry.Vector`

  returns: (n-1)-dimension point of the sub-space corresponding to
   the specified space point - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Line this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSubSpace vector))))

(defn whole-line
  "Build a sub-line covering the whole line.

  returns: a sub-line covering the whole line - `org.apache.commons.math4.geometry.euclidean.threed.SubLine`"
  (^org.apache.commons.math4.geometry.euclidean.threed.SubLine [^Line this]
    (-> this (.wholeLine))))

(defn get-abscissa
  "Get the abscissa of a point with respect to the line.
   The abscissa is 0 if the projection of the point and the
   projection of the frame origin on the line are the same
   point.

  point - point to check - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: abscissa of the point - `double`"
  (^Double [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D point]
    (-> this (.getAbscissa point))))

(defn closest-point
  "Compute the point of the instance closest to another line.

  line - line to check against the instance - `org.apache.commons.math4.geometry.euclidean.threed.Line`

  returns: point of the instance closest to another line - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Line this ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (-> this (.closestPoint line))))

