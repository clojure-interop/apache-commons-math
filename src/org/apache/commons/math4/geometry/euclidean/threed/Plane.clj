(ns org.apache.commons.math4.geometry.euclidean.threed.Plane
  "The class represent planes in a three dimensional space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Plane]))

(defn ->plane
  "Constructor.

  Build a plane from three points.
   The plane is oriented in the direction of
   (p2-p1) ^ (p3-p1)

  p-1 - first point belonging to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  p-2 - second point belonging to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  p-3 - third point belonging to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  tolerance - tolerance below which points are considered identical - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the points do not constitute a plane"
  (^Plane [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-2 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p-3 ^Double tolerance]
    (new Plane p-1 p-2 p-3 tolerance))
  (^Plane [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D normal ^Double tolerance]
    (new Plane p normal tolerance))
  (^Plane [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D normal ^Double tolerance]
    (new Plane normal tolerance))
  (^Plane [^org.apache.commons.math4.geometry.euclidean.threed.Plane plane]
    (new Plane plane)))

(defn *intersection
  "Get the intersection point of three planes.

  plane-1 - first plane1 - `org.apache.commons.math4.geometry.euclidean.threed.Plane`
  plane-2 - second plane2 - `org.apache.commons.math4.geometry.euclidean.threed.Plane`
  plane-3 - third plane2 - `org.apache.commons.math4.geometry.euclidean.threed.Plane`

  returns: intersection point of three planes, null if some planes are parallel - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^org.apache.commons.math4.geometry.euclidean.threed.Plane plane-1 ^org.apache.commons.math4.geometry.euclidean.threed.Plane plane-2 ^org.apache.commons.math4.geometry.euclidean.threed.Plane plane-3]
    (Plane/intersection plane-1 plane-2 plane-3)))

(defn revert-self
  "Revert the plane.
   Replace the instance by a similar plane with opposite orientation.
   The new plane frame is chosen in such a way that a 3D point that had
   (x, y) in-plane coordinates and z offset with
   respect to the plane and is unaffected by the change will have
   (y, x) in-plane coordinates and -z offset with
   respect to the new plane. This means that the u and v
   vectors returned by the getU() and getV() methods are exchanged,
   and the w vector returned by the getNormal() method is
   reversed."
  ([^Plane this]
    (-> this (.revertSelf))))

(defn similar-to?
  "Check if the instance is similar to another plane.
   Planes are considered similar if they contain the same
   points. This does not mean they are equal since they can have
   opposite normals.

  plane - plane to which the instance is compared - `org.apache.commons.math4.geometry.euclidean.threed.Plane`

  returns: true if the planes are similar - `boolean`"
  (^Boolean [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Plane plane]
    (-> this (.isSimilarTo plane))))

(defn translate
  "Translate the plane by the specified amount.
   The instance is not modified, a new instance is created.

  translation - translation to apply - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: a new plane - `org.apache.commons.math4.geometry.euclidean.threed.Plane`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Plane [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D translation]
    (-> this (.translate translation))))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for immutable objects).

  returns: a new hyperplane, copy of the instance - `org.apache.commons.math4.geometry.euclidean.threed.Plane`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Plane [^Plane this]
    (-> this (.copySelf))))

(defn contains
  "Check if the instance contains a point.

  p - point to check - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: true if p belongs to the plane - `boolean`"
  (^Boolean [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p]
    (-> this (.contains p))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D>`"
  (^org.apache.commons.math4.geometry.Point [^Plane this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn get-point-at
  "Get one point from the 3D-space.

  in-plane - desired in-plane coordinates for the point in the plane - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  offset - desired offset for the point - `double`

  returns: one point in the 3D-space, with given coordinates and offset
   relative to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D in-plane ^Double offset]
    (-> this (.getPointAt in-plane offset))))

(defn reset
  "Reset the instance as if built from a point and a normal.

  p - point belonging to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  normal - normal direction to the plane - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the normal norm is too small"
  ([^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D p ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D normal]
    (-> this (.reset p normal)))
  ([^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Plane original]
    (-> this (.reset original))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance (really a PolyhedronsSet instance) - `org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet`"
  (^org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet [^Plane this]
    (-> this (.wholeSpace))))

(defn to-space
  "Transform a sub-space point into a space point.

  vector - (n-1)-dimension point of the sub-space - `org.apache.commons.math4.geometry.Vector`

  returns: n-dimension point of the space corresponding to the
   specified sub-space point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSpace vector))))

(defn same-orientation-as
  "Check if the instance has the same orientation as another hyperplane.

  other - other hyperplane to check against the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if the instance and the other hyperplane have
   the same orientation - `boolean`"
  (^Boolean [^Plane this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^Plane this]
    (-> this (.getTolerance))))

(defn get-origin
  "Get the origin point of the plane frame.
   The point returned is the orthogonal projection of the
   3D-space origin in the plane.

  returns: the origin point of the plane frame (point closest to the
   3D-space origin) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this]
    (-> this (.getOrigin))))

(defn get-v
  "Get the plane second canonical vector.
   The frame defined by (getU, getV,
   getNormal) is a rigth-handed orthonormalized
   frame).

  returns: normalized second canonical vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this]
    (-> this (.getV))))

(defn get-offset
  "Get the offset (oriented distance) of a parallel plane.
   This method should be called only for parallel planes otherwise
   the result is not meaningful.
   The offset is 0 if both planes are the same, it is
   positive if the plane is on the plus side of the instance and
   negative if it is on the minus side, according to its natural
   orientation.

  plane - plane to check - `org.apache.commons.math4.geometry.euclidean.threed.Plane`

  returns: offset of the plane - `double`"
  (^Double [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Plane plane]
    (-> this (.getOffset plane))))

(defn intersection
  "Get the intersection of a line with the instance.

  line - line intersecting the instance - `org.apache.commons.math4.geometry.euclidean.threed.Line`

  returns: intersection point between between the line and the
   instance (null if the line is parallel to the instance) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (-> this (.intersection line))))

(defn whole-hyperplane
  "Build a region covering the whole hyperplane.

  returns: a region covering the whole hyperplane - `org.apache.commons.math4.geometry.euclidean.threed.SubPlane`"
  (^org.apache.commons.math4.geometry.euclidean.threed.SubPlane [^Plane this]
    (-> this (.wholeHyperplane))))

(defn get-u
  "Get the plane first canonical vector.
   The frame defined by (getU, getV,
   getNormal) is a rigth-handed orthonormalized
   frame).

  returns: normalized first canonical vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this]
    (-> this (.getU))))

(defn to-sub-space
  "Transform a space point into a sub-space point.

  vector - n-dimension point of the space - `org.apache.commons.math4.geometry.Vector`

  returns: (n-1)-dimension point of the sub-space corresponding to
   the specified space point - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Plane this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.toSubSpace vector))))

(defn get-normal
  "Get the normalized normal vector.
   The frame defined by (getU, getV,
   getNormal) is a rigth-handed orthonormalized
   frame).

  returns: normalized normal vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Plane this]
    (-> this (.getNormal))))

(defn rotate
  "Rotate the plane around the specified point.
   The instance is not modified, a new instance is created.

  center - rotation center - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  rotation - vectorial rotation operator - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`

  returns: a new plane - `org.apache.commons.math4.geometry.euclidean.threed.Plane`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Plane [^Plane this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D center ^org.apache.commons.math4.geometry.euclidean.threed.Rotation rotation]
    (-> this (.rotate center rotation))))

