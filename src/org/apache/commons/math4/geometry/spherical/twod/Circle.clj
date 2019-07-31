(ns org.apache.commons.math4.geometry.spherical.twod.Circle
  "This class represents an oriented great circle on the 2-sphere.

  An oriented circle can be defined by a center point. The circle
  is the the set of points that are in the normal plan the center.

  Since it is oriented the two spherical caps at its two sides are
  unambiguously identified as a left cap and a right cap. This can be
  used to identify the interior and the exterior in a simple way by
  local properties only when part of a line is used to define part of
  a spherical polygon boundary."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod Circle]))

(defn ->circle
  "Constructor.

  Build a great circle from two non-aligned points.
   The circle is oriented from first to second point using the path smaller than \\( \\pi \\).

  first - first point contained in the great circle - `org.apache.commons.math4.geometry.spherical.twod.S2Point`
  second - second point contained in the great circle - `org.apache.commons.math4.geometry.spherical.twod.S2Point`
  tolerance - tolerance below which close sub-arcs are merged together - `double`"
  (^Circle [^org.apache.commons.math4.geometry.spherical.twod.S2Point first ^org.apache.commons.math4.geometry.spherical.twod.S2Point second ^Double tolerance]
    (new Circle first second tolerance))
  (^Circle [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D pole ^Double tolerance]
    (new Circle pole tolerance))
  (^Circle [^org.apache.commons.math4.geometry.spherical.twod.Circle circle]
    (new Circle circle)))

(defn *get-transform
  "Get a Transform embedding a 3D rotation.

  rotation - rotation to use - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`

  returns: a new transform that can be applied to either Point, Line or SubHyperplane instances - `org.apache.commons.math4.geometry.partitioning.Transform<org.apache.commons.math4.geometry.spherical.twod.Sphere2D,org.apache.commons.math4.geometry.spherical.oned.Sphere1D>`"
  (^org.apache.commons.math4.geometry.partitioning.Transform [^org.apache.commons.math4.geometry.euclidean.threed.Rotation rotation]
    (Circle/getTransform rotation)))

(defn get-x-axis
  "Get the X axis of the circle.

   This method returns the same value as getPointAt(0.0) but it does not do any computation and always
   return the same instance.

  returns: an arbitrary x axis on the circle - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Circle this]
    (-> this (.getXAxis))))

(defn revert-self
  "Revert the instance."
  ([^Circle this]
    (-> this (.revertSelf))))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for immutable objects).

  returns: a new hyperplane, copy of the instance - `org.apache.commons.math4.geometry.spherical.twod.Circle`"
  (^org.apache.commons.math4.geometry.spherical.twod.Circle [^Circle this]
    (-> this (.copySelf))))

(defn get-reverse
  "Get the reverse of the instance.
   Get a circle with reversed orientation with respect to the
   instance. A new object is built, the instance is untouched.

  returns: a new circle, with orientation opposite to the instance orientation - `org.apache.commons.math4.geometry.spherical.twod.Circle`"
  (^org.apache.commons.math4.geometry.spherical.twod.Circle [^Circle this]
    (-> this (.getReverse))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<org.apache.commons.math4.geometry.spherical.twod.Sphere2D>`"
  (^org.apache.commons.math4.geometry.Point [^Circle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn get-point-at
  "Get a circle point from its phase around the circle.

  alpha - phase around the circle - `double`

  returns: circle point on the sphere - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Circle this ^Double alpha]
    (-> this (.getPointAt alpha))))

(defn reset
  "Reset the instance as if built from a pole.
   The circle is oriented in the trigonometric direction around pole.

  new-pole - circle pole - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  ([^Circle this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D new-pole]
    (-> this (.reset new-pole))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance (really a SphericalPolygonsSet instance) - `org.apache.commons.math4.geometry.spherical.twod.SphericalPolygonsSet`"
  (^org.apache.commons.math4.geometry.spherical.twod.SphericalPolygonsSet [^Circle this]
    (-> this (.wholeSpace))))

(defn to-space
  "Transform a sub-space point into a space point.

  point - (n-1)-dimension point of the sub-space - `org.apache.commons.math4.geometry.Point`

  returns: n-dimension point of the space corresponding to the
   specified sub-space point - `org.apache.commons.math4.geometry.spherical.twod.S2Point`"
  (^org.apache.commons.math4.geometry.spherical.twod.S2Point [^Circle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.toSpace point))))

(defn same-orientation-as
  "Check if the instance has the same orientation as another hyperplane.
   This method is expected to be called on parallel hyperplanes. The
   method should not re-check for parallelism, only for
   orientation, typically by testing something like the sign of the
   dot-products of normals.

  other - other hyperplane to check against the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if the instance and the other hyperplane have
   the same orientation - `boolean`"
  (^Boolean [^Circle this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^Circle this]
    (-> this (.getTolerance))))

(defn get-phase
  "Get the phase angle of a direction.

   The direction may not belong to the circle as the
   phase is computed for the meridian plane between the circle
   pole and the direction.

  direction - direction for which phase is requested - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: phase angle of the direction around the circle - `double`"
  (^Double [^Circle this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D direction]
    (-> this (.getPhase direction))))

(defn get-offset
  "Get the offset (oriented distance) of a point.
   The offset is 0 if the point is on the underlying hyperplane,
   it is positive if the point is on one particular side of the
   hyperplane, and it is negative if the point is on the other side,
   according to the hyperplane natural orientation.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: offset of the point - `double`"
  (^Double [^Circle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.getOffset point))))

(defn get-inside-arc
  "Get the arc of the instance that lies inside the other circle.

  other - other circle - `org.apache.commons.math4.geometry.spherical.twod.Circle`

  returns: arc of the instance that lies inside the other circle - `org.apache.commons.math4.geometry.spherical.oned.Arc`"
  (^org.apache.commons.math4.geometry.spherical.oned.Arc [^Circle this ^org.apache.commons.math4.geometry.spherical.twod.Circle other]
    (-> this (.getInsideArc other))))

(defn whole-hyperplane
  "Build a sub-hyperplane covering the whole hyperplane.

  returns: a sub-hyperplane covering the whole hyperplane - `org.apache.commons.math4.geometry.spherical.twod.SubCircle`"
  (^org.apache.commons.math4.geometry.spherical.twod.SubCircle [^Circle this]
    (-> this (.wholeHyperplane))))

(defn get-pole
  "Get the pole of the circle.

   As the circle is a great circle, the pole does not
   belong to it.

  returns: pole of the circle - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Circle this]
    (-> this (.getPole))))

(defn to-sub-space
  "Transform a space point into a sub-space point.

  point - n-dimension point of the space - `org.apache.commons.math4.geometry.Point`

  returns: (n-1)-dimension point of the sub-space corresponding to
   the specified space point - `org.apache.commons.math4.geometry.spherical.oned.S1Point`"
  (^org.apache.commons.math4.geometry.spherical.oned.S1Point [^Circle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.toSubSpace point))))

(defn get-y-axis
  "Get the Y axis of the circle.

   This method returns the same value as getPointAt(0.5 * FastMath.PI) but it does not do any computation and always
   return the same instance.

  returns: an arbitrary y axis point on the circle - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Circle this]
    (-> this (.getYAxis))))

