(ns org.apache.commons.math4.geometry.spherical.twod.S2Point
  "This class represents a point on the 2-sphere.

  We use the mathematical convention to use the azimuthal angle \\( \\theta \\)
  in the x-y plane as the first coordinate, and the polar angle \\( \\varphi \\)
  as the second coordinate (see Spherical
  Coordinates in MathWorld).

  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod S2Point]))

(defn ->s-2-point
  "Constructor.

  Simple constructor.
   Build a vector from its spherical coordinates

  theta - azimuthal angle \\( \\theta \\) in the x-y plane - `double`
  phi - polar angle \\( \\varphi \\) - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if \\( \\varphi \\) is not in the [\\( 0; \\pi \\)] range"
  (^S2Point [^Double theta ^Double phi]
    (new S2Point theta phi))
  (^S2Point [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D vector]
    (new S2Point vector)))

(def *-plus-i
  "Static Constant.

  +I (coordinates: \\( \\theta = 0, \\varphi = \\pi/2 \\)).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/PLUS_I)

(def *-plus-j
  "Static Constant.

  +J (coordinates: \\( \\theta = \\pi/2, \\varphi = \\pi/2 \\))).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/PLUS_J)

(def *-plus-k
  "Static Constant.

  +K (coordinates: \\( \\theta = any angle, \\varphi = 0 \\)).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/PLUS_K)

(def *-minus-i
  "Static Constant.

  -I (coordinates: \\( \\theta = \\pi, \\varphi = \\pi/2 \\)).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/MINUS_I)

(def *-minus-j
  "Static Constant.

  -J (coordinates: \\( \\theta = 3\\pi/2, \\varphi = \\pi/2 \\)).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/MINUS_J)

(def *-minus-k
  "Static Constant.

  -K (coordinates: \\( \\theta = any angle, \\varphi = \\pi \\)).

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/MINUS_K)

(def *-na-n
  "Static Constant.

  A vector with all coordinates set to NaN.

  type: org.apache.commons.math4.geometry.spherical.twod.S2Point"
  S2Point/NaN)

(defn *distance
  "Compute the distance (angular separation) between two points.

  p-1 - first vector - `org.apache.commons.math4.geometry.spherical.twod.S2Point`
  p-2 - second vector - `org.apache.commons.math4.geometry.spherical.twod.S2Point`

  returns: the angular separation between p1 and p2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.spherical.twod.S2Point p-1 ^org.apache.commons.math4.geometry.spherical.twod.S2Point p-2]
    (S2Point/distance p-1 p-2)))

(defn get-phi
  "Get the polar angle \\( \\varphi \\).

  returns: polar angle \\( \\varphi \\) - `double`"
  (^Double [^S2Point this]
    (-> this (.getPhi))))

(defn get-vector
  "Get the corresponding normalized vector in the 3D euclidean space.

  returns: normalized vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^S2Point this]
    (-> this (.getVector))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.spherical.twod.S2Point`"
  (^org.apache.commons.math4.geometry.spherical.twod.S2Point [^S2Point this]
    (-> this (.negate))))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^S2Point this]
    (-> this (.getSpace))))

(defn get-theta
  "Get the azimuthal angle \\( \\theta \\) in the x-y plane.

  returns: azimuthal angle \\( \\theta \\) in the x-y plane - `double`"
  (^Double [^S2Point this]
    (-> this (.getTheta))))

(defn distance
  "Compute the distance between the instance and another point.

  point - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^S2Point this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.distance point))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^S2Point this]
    (-> this (.isNaN))))

(defn hash-code
  "Get a hashCode for the 2D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^S2Point this]
    (-> this (.hashCode))))

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
  (^Boolean [^S2Point this ^java.lang.Object other]
    (-> this (.equals other))))

