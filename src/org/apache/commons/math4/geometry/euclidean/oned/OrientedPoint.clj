(ns org.apache.commons.math4.geometry.euclidean.oned.OrientedPoint
  "This class represents a 1D oriented hyperplane.
  An hyperplane in 1D is a simple point, its orientation being a
  boolean.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned OrientedPoint]))

(defn ->oriented-point
  "Constructor.

  Simple constructor.

  location - location of the hyperplane - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  direct - if true, the plus side of the hyperplane is towards abscissas greater than location - `boolean`
  tolerance - tolerance below which points are considered to belong to the hyperplane - `double`"
  (^OrientedPoint [^org.apache.commons.math4.geometry.euclidean.oned.Vector1D location ^Boolean direct ^Double tolerance]
    (new OrientedPoint location direct tolerance)))

(defn get-location
  "Get the hyperplane location on the real line.

  returns: the hyperplane location - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^OrientedPoint this]
    (-> this (.getLocation))))

(defn revert-self
  "Revert the instance."
  ([^OrientedPoint this]
    (-> this (.revertSelf))))

(defn copy-self
  "Copy the instance.
   Since instances are immutable, this method directly returns
   the instance.

  returns: the instance itself - `org.apache.commons.math4.geometry.euclidean.oned.OrientedPoint`"
  (^org.apache.commons.math4.geometry.euclidean.oned.OrientedPoint [^OrientedPoint this]
    (-> this (.copySelf))))

(defn project
  "Project a point to the hyperplane.

  point - point to project - `org.apache.commons.math4.geometry.Point`

  returns: projected point - `org.apache.commons.math4.geometry.Point<org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D>`"
  (^org.apache.commons.math4.geometry.Point [^OrientedPoint this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.project point))))

(defn whole-space
  "Build a region covering the whole space.

  returns: a region containing the instance (really an IntervalsSet instance) - `org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet`"
  (^org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet [^OrientedPoint this]
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
  (^Boolean [^OrientedPoint this ^org.apache.commons.math4.geometry.partitioning.Hyperplane other]
    (-> this (.sameOrientationAs other))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to the hyperplane.

  returns: tolerance below which points are considered to belong to the hyperplane - `double`"
  (^Double [^OrientedPoint this]
    (-> this (.getTolerance))))

(defn get-offset
  "Get the offset (oriented distance) of a vector.

  vector - vector to check - `org.apache.commons.math4.geometry.Vector`

  returns: offset of the vector - `double`"
  (^Double [^OrientedPoint this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.getOffset vector))))

(defn whole-hyperplane
  "Build a region covering the whole hyperplane.
   Since this class represent zero dimension spaces which does
   not have lower dimension sub-spaces, this method returns a dummy
   implementation of a SubHyperplane.
   This implementation is only used to allow the SubHyperplane class implementation to work properly, it should
   not be used otherwise.

  returns: a dummy sub hyperplane - `org.apache.commons.math4.geometry.euclidean.oned.SubOrientedPoint`"
  (^org.apache.commons.math4.geometry.euclidean.oned.SubOrientedPoint [^OrientedPoint this]
    (-> this (.wholeHyperplane))))

(defn direct?
  "Check if the hyperplane orientation is direct.

  returns: true if the plus side of the hyperplane is towards
   abscissae greater than hyperplane location - `boolean`"
  (^Boolean [^OrientedPoint this]
    (-> this (.isDirect))))

