(ns org.apache.commons.math4.geometry.partitioning.Hyperplane
  "This interface represents an hyperplane of a space.

  The most prominent place where hyperplane appears in space
  partitioning is as cutters. Each partitioning node in a BSP tree has a cut sub-hyperplane
  which is either an hyperplane or a part of an hyperplane. In an
  n-dimensions euclidean space, an hyperplane is an (n-1)-dimensions
  hyperplane (for example a traditional plane in the 3D euclidean
  space). They can be more exotic objects in specific fields, for
  example a circle on the surface of the unit sphere.


  Note that this interface is not intended to be implemented
  by Apache Commons Math users, it is only intended to be implemented
  within the library itself. New methods may be added even for minor
  versions, which breaks compatibility for external implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Hyperplane]))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for immutable objects).

  returns: a new hyperplane, copy of the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Hyperplane [^Hyperplane this]
    (-> this (.copySelf))))

(defn get-offset
  "Get the offset (oriented distance) of a point.
   The offset is 0 if the point is on the underlying hyperplane,
   it is positive if the point is on one particular side of the
   hyperplane, and it is negative if the point is on the other side,
   according to the hyperplane natural orientation.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: offset of the point - `double`"
  (^Double [^Hyperplane this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.getOffset point))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^Hyperplane this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^Hyperplane this]
    (-> this (.getTolerance))))

(defn same-orientation-as
  "Check if the instance has the same orientation as another hyperplane.
   This method is expected to be called on parallel hyperplanes. The
   method should not re-check for parallelism, only for
   orientation, typically by testing something like the sign of the
   dot-products of normals.

  other - other hyperplane to check against the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if the instance and the other hyperplane have
   the same orientation - `boolean`"
  (^Boolean [^Hyperplane this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn whole-hyperplane
  "Build a sub-hyperplane covering the whole hyperplane.

  returns: a sub-hyperplane covering the whole hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^Hyperplane this]
    (-> this (.wholeHyperplane))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^Hyperplane this]
    (-> this (.wholeSpace))))

