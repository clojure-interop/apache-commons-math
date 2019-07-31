(ns org.apache.commons.math4.geometry.spherical.oned.S1Point
  "This class represents a point on the 1-sphere.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned S1Point]))

(defn ->s-1-point
  "Constructor.

  Simple constructor.
   Build a vector from its coordinates

  alpha - azimuthal angle \\( \\alpha \\) - `double`"
  (^S1Point [^Double alpha]
    (new S1Point alpha)))

(def *-na-n
  "Static Constant.

  A vector with all coordinates set to NaN.

  type: org.apache.commons.math4.geometry.spherical.oned.S1Point"
  S1Point/NaN)

(defn *distance
  "Compute the distance (angular separation) between two points.

  p-1 - first vector - `org.apache.commons.math4.geometry.spherical.oned.S1Point`
  p-2 - second vector - `org.apache.commons.math4.geometry.spherical.oned.S1Point`

  returns: the angular separation between p1 and p2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.spherical.oned.S1Point p-1 ^org.apache.commons.math4.geometry.spherical.oned.S1Point p-2]
    (S1Point/distance p-1 p-2)))

(defn get-alpha
  "Get the azimuthal angle \\( \\alpha \\).

  returns: azimuthal angle \\( \\alpha \\) - `double`"
  (^Double [^S1Point this]
    (-> this (.getAlpha))))

(defn get-vector
  "Get the corresponding normalized vector in the 2D euclidean space.

  returns: normalized vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^S1Point this]
    (-> this (.getVector))))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^S1Point this]
    (-> this (.getSpace))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^S1Point this]
    (-> this (.isNaN))))

(defn distance
  "Compute the distance between the instance and another point.

  point - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^S1Point this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.distance point))))

(defn equals
  "Test for the equality of two points on the 2-sphere.

   If all coordinates of two points are exactly the same, and none are
   Double.NaN, the two points are considered to be equal.


   NaN coordinates are considered to affect globally the vector
   and be equals to each other - i.e, if either (or all) coordinates of the
   2D vector are equal to Double.NaN, the 2D vector is equal to
   NaN.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two points on the 2-sphere objects are equal, false if
           object is null, not an instance of S2Point, or
           not equal to this S2Point instance - `boolean`"
  (^Boolean [^S1Point this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "Get a hashCode for the 2D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^S1Point this]
    (-> this (.hashCode))))

