(ns org.apache.commons.math4.geometry.euclidean.twod.Line
  "This class represents an oriented line in the 2D plane.

  An oriented line can be defined either by prolongating a line
  segment between two points past these points, or by one point and
  an angular direction (in trigonometric orientation).

  Since it is oriented the two half planes at its two sides are
  unambiguously identified as a left half plane and a right half
  plane. This can be used to identify the interior and the exterior
  in a simple way by local properties only when part of a line is
  used to define part of a polygon boundary.

  A line can also be used to completely define a reference frame
  in the plane. It is sufficient to select one specific point in the
  line (the orthogonal projection of the original reference frame on
  the line) and to use the unit vector in the line direction and the
  orthogonal vector oriented from left half plane to right half
  plane. We define two coordinates by the process, the
  abscissa along the line, and the offset across
  the line. All points of the plane are uniquely identified by these
  two coordinates. The line is the set of points at zero offset, the
  left half plane is the set of points with negative offsets and the
  right half plane is the set of points with positive offsets."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod Line]))

(defn ->line
  "Constructor.

  Build a line from two points.
   The line is oriented from p1 to p2

  p-1 - first point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  tolerance - tolerance below which points are considered identical - `double`"
  (^Line [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2 ^Double tolerance]
    (new Line p-1 p-2 tolerance))
  (^Line [^org.apache.commons.math4.geometry.euclidean.twod.Line line]
    (new Line line)))

(defn *get-transform
  "Get a Transform embedding an affine transform.

  c-xx - transform factor between input abscissa and output abscissa - `double`
  c-yx - transform factor between input abscissa and output ordinate - `double`
  c-xy - transform factor between input ordinate and output abscissa - `double`
  c-yy - transform factor between input ordinate and output ordinate - `double`
  c-x-1 - transform addendum for output abscissa - `double`
  c-y-1 - transform addendum for output ordinate - `double`

  returns: a new transform that can be applied to either Vector2D, Line or SubHyperplane instances - `org.apache.commons.math4.geometry.partitioning.Transform<org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D,org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the transform is non invertible"
  (^org.apache.commons.math4.geometry.partitioning.Transform [^Double c-xx ^Double c-yx ^Double c-xy ^Double c-yy ^Double c-x-1 ^Double c-y-1]
    (Line/getTransform c-xx c-yx c-xy c-yy c-x-1 c-y-1)))

(defn revert-self
  "Revert the instance."
  ([^Line this]
    (-> this (.revertSelf))))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for immutable objects).

  returns: a new hyperplane, copy of the instance - `org.apache.commons.math4.geometry.euclidean.twod.Line`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Line [^Line this]
    (-> this (.copySelf))))

(defn get-reverse
  "Get the reverse of the instance.
   Get a line with reversed orientation with respect to the
   instance.

   As long as neither the instance nor its reverse are modified
   (i.e. as long as none of the reset(Vector2D, Vector2D),
   reset(Vector2D, double), revertSelf(),
   setAngle(double) or setOriginOffset(double)
   methods are called), then the line and its reverse remain linked
   together so that line.getReverse().getReverse() == line.
   When one of the line is modified, the link is deleted as both
   instance becomes independent.

  returns: a new line, with orientation opposite to the instance orientation - `org.apache.commons.math4.geometry.euclidean.twod.Line`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Line [^Line this]
    (-> this (.getReverse))))

(defn contains
  "Check if the line contains a point.

  p - point to check - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: true if p belongs to the line - `boolean`"
  (^Boolean [^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p]
    (-> this (.contains p))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D>`"
  (^org.apache.commons.math4.geometry.Point [^Line this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn translate-to-point
  "Translate the line to force it passing by a point.

  p - point by which the line should pass - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  ([^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p]
    (-> this (.translateToPoint p))))

(defn get-point-at
  "Get one point from the plane.

  abscissa - desired abscissa for the point - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  offset - desired offset for the point - `double`

  returns: one point in the plane, with given abscissa and offset
   relative to the line - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Line this ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D abscissa ^Double offset]
    (-> this (.getPointAt abscissa offset))))

(defn reset
  "Reset the instance as if built from two points.
   The line is oriented from p1 to p2

  p-1 - first point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  ([^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2]
    (-> this (.reset p-1 p-2))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance (really a PolygonsSet instance) - `org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet`"
  (^org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet [^Line this]
    (-> this (.wholeSpace))))

(defn to-space
  "Transform a sub-space point into a space point.

  vector - (n-1)-dimension point of the sub-space - `org.apache.commons.math4.geometry.Vector`

  returns: n-dimension point of the space corresponding to the
   specified sub-space point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Line this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSpace vector))))

(defn same-orientation-as
  "Check if the instance has the same orientation as another hyperplane.
   This method is expected to be called on parallel hyperplanes. The
   method should not re-check for parallelism, only for
   orientation, typically by testing something like the sign of the
   dot-products of normals.

  other - other hyperplane to check against the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if the instance and the other hyperplane have
   the same orientation - `boolean`"
  (^Boolean [^Line this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^Line this]
    (-> this (.getTolerance))))

(defn get-offset
  "Get the offset (oriented distance) of a parallel line.
   This method should be called only for parallel lines otherwise
   the result is not meaningful.
   The offset is 0 if both lines are the same, it is
   positive if the line is on the right side of the instance and
   negative if it is on the left side, according to its natural
   orientation.

  line - line to check - `org.apache.commons.math4.geometry.euclidean.twod.Line`

  returns: offset of the line - `double`"
  (^Double [^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Line line]
    (-> this (.getOffset line))))

(defn distance
  "Compute the distance between the instance and a point.
   This is a shortcut for invoking FastMath.abs(getOffset(p)),
   and provides consistency with what is in the
   org.apache.commons.math4.geometry.euclidean.threed.Line class.

  p - to check - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: distance between the instance and the point - `double`"
  (^Double [^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p]
    (-> this (.distance p))))

(defn set-origin-offset
  "Set the offset of the origin.

  offset - offset of the origin - `double`"
  ([^Line this ^Double offset]
    (-> this (.setOriginOffset offset))))

(defn intersection
  "Get the intersection point of the instance and another line.

  other - other line - `org.apache.commons.math4.geometry.euclidean.twod.Line`

  returns: intersection point of the instance and the other line
   or null if there are no intersection points - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Line other]
    (-> this (.intersection other))))

(defn get-angle
  "Get the angle of the line.

  returns: the angle of the line with respect to the abscissa axis - `double`"
  (^Double [^Line this]
    (-> this (.getAngle))))

(defn whole-hyperplane
  "Build a sub-hyperplane covering the whole hyperplane.

  returns: a sub-hyperplane covering the whole hyperplane - `org.apache.commons.math4.geometry.euclidean.twod.SubLine`"
  (^org.apache.commons.math4.geometry.euclidean.twod.SubLine [^Line this]
    (-> this (.wholeHyperplane))))

(defn to-sub-space
  "Transform a space point into a sub-space point.

  vector - n-dimension point of the space - `org.apache.commons.math4.geometry.Vector`

  returns: (n-1)-dimension point of the sub-space corresponding to
   the specified space point - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Line this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSubSpace vector))))

(defn get-origin-offset
  "Get the offset of the origin.

  returns: the offset of the origin - `double`"
  (^Double [^Line this]
    (-> this (.getOriginOffset))))

(defn parallel-to?
  "Check the instance is parallel to another line.

  line - other line to check - `org.apache.commons.math4.geometry.euclidean.twod.Line`

  returns: true if the instance is parallel to the other line
   (they can have either the same or opposite orientations) - `boolean`"
  (^Boolean [^Line this ^org.apache.commons.math4.geometry.euclidean.twod.Line line]
    (-> this (.isParallelTo line))))

(defn set-angle
  "Set the angle of the line.

  angle - new angle of the line with respect to the abscissa axis - `double`"
  ([^Line this ^Double angle]
    (-> this (.setAngle angle))))

