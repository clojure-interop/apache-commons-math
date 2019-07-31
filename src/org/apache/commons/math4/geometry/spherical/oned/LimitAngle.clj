(ns org.apache.commons.math4.geometry.spherical.oned.LimitAngle
  "This class represents a 1D oriented hyperplane on the circle.
  An hyperplane on the 1-sphere is an angle with an orientation.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned LimitAngle]))

(defn ->limit-angle
  "Constructor.

  Simple constructor.

  location - location of the hyperplane - `org.apache.commons.math4.geometry.spherical.oned.S1Point`
  direct - if true, the plus side of the hyperplane is towards angles greater than location - `boolean`
  tolerance - tolerance below which angles are considered identical - `double`"
  (^LimitAngle [^org.apache.commons.math4.geometry.spherical.oned.S1Point location ^Boolean direct ^Double tolerance]
    (new LimitAngle location direct tolerance)))

(defn get-location
  "Get the hyperplane location on the circle.

  returns: the hyperplane location - `org.apache.commons.math4.geometry.spherical.oned.S1Point`"
  (^org.apache.commons.math4.geometry.spherical.oned.S1Point [^LimitAngle this]
    (-> this (.getLocation))))

(defn copy-self
  "Copy the instance.
   Since instances are immutable, this method directly returns
   the instance.

  returns: the instance itself - `org.apache.commons.math4.geometry.spherical.oned.LimitAngle`"
  (^org.apache.commons.math4.geometry.spherical.oned.LimitAngle [^LimitAngle this]
    (-> this (.copySelf))))

(defn get-reverse
  "Get the reverse of the instance.
   Get a limit angle with reversed orientation with respect to the
   instance. A new object is built, the instance is untouched.

  returns: a new limit angle, with orientation opposite to the instance orientation - `org.apache.commons.math4.geometry.spherical.oned.LimitAngle`"
  (^org.apache.commons.math4.geometry.spherical.oned.LimitAngle [^LimitAngle this]
    (-> this (.getReverse))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<org.apache.commons.math4.geometry.spherical.oned.Sphere1D>`"
  (^org.apache.commons.math4.geometry.Point [^LimitAngle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance (really an IntervalsSet instance) - `org.apache.commons.math4.geometry.spherical.oned.ArcsSet`"
  (^org.apache.commons.math4.geometry.spherical.oned.ArcsSet [^LimitAngle this]
    (-> this (.wholeSpace))))

(defn same-orientation-as
  "Check if the instance has the same orientation as another hyperplane.
   This method is expected to be called on parallel hyperplanes. The
   method should not re-check for parallelism, only for
   orientation, typically by testing something like the sign of the
   dot-products of normals.

  other - other hyperplane to check against the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if the instance and the other hyperplane have
   the same orientation - `boolean`"
  (^Boolean [^LimitAngle this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^LimitAngle this]
    (-> this (.getTolerance))))

(defn get-offset
  "Get the offset (oriented distance) of a point.
   The offset is 0 if the point is on the underlying hyperplane,
   it is positive if the point is on one particular side of the
   hyperplane, and it is negative if the point is on the other side,
   according to the hyperplane natural orientation.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: offset of the point - `double`"
  (^Double [^LimitAngle this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.getOffset point))))

(defn whole-hyperplane
  "Build a region covering the whole hyperplane.
   Since this class represent zero dimension spaces which does
   not have lower dimension sub-spaces, this method returns a dummy
   implementation of a SubHyperplane.
   This implementation is only used to allow the SubHyperplane class implementation to work properly, it should
   not be used otherwise.

  returns: a dummy sub hyperplane - `org.apache.commons.math4.geometry.spherical.oned.SubLimitAngle`"
  (^org.apache.commons.math4.geometry.spherical.oned.SubLimitAngle [^LimitAngle this]
    (-> this (.wholeHyperplane))))

(defn direct?
  "Check if the hyperplane orientation is direct.

  returns: true if the plus side of the hyperplane is towards
   angles greater than hyperplane location - `boolean`"
  (^Boolean [^LimitAngle this]
    (-> this (.isDirect))))

