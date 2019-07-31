(ns org.apache.commons.math4.geometry.euclidean.twod.Vector2D
  "This class represents a 2D vector.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod Vector2D]))

(defn ->vector-2-d
  "Constructor.

  Linear constructor
   Build a vector from four other ones and corresponding scale factors.
   The vector built will be a1 * u1  a2 * u2  a3 * u3  a4 * u4

  a-1 - first scale factor - `double`
  u-1 - first base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  a-2 - second scale factor - `double`
  u-2 - second base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  a-3 - third scale factor - `double`
  u-3 - third base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  a-4 - fourth scale factor - `double`
  u-4 - fourth base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^Vector2D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-3 ^Double a-4 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-4]
    (new Vector2D a-1 u-1 a-2 u-2 a-3 u-3 a-4 u-4))
  (^Vector2D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-3]
    (new Vector2D a-1 u-1 a-2 u-2 a-3 u-3))
  (^Vector2D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D u-2]
    (new Vector2D a-1 u-1 a-2 u-2))
  (^Vector2D [^Double x ^Double y]
    (new Vector2D x y))
  (^Vector2D [v]
    (new Vector2D v)))

(def *-zero
  "Static Constant.

  Origin (coordinates: 0, 0).

  type: org.apache.commons.math4.geometry.euclidean.twod.Vector2D"
  Vector2D/ZERO)

(def *-na-n
  "Static Constant.

  A vector with all coordinates set to NaN.

  type: org.apache.commons.math4.geometry.euclidean.twod.Vector2D"
  Vector2D/NaN)

(def *-positive-infinity
  "Static Constant.

  A vector with all coordinates set to positive infinity.

  type: org.apache.commons.math4.geometry.euclidean.twod.Vector2D"
  Vector2D/POSITIVE_INFINITY)

(def *-negative-infinity
  "Static Constant.

  A vector with all coordinates set to negative infinity.

  type: org.apache.commons.math4.geometry.euclidean.twod.Vector2D"
  Vector2D/NEGATIVE_INFINITY)

(defn *angle
  "Compute the angular separation between two vectors.
   This method computes the angular separation between two
   vectors using the dot product for well separated vectors and the
   cross product for almost aligned vectors. This allows to have a
   good accuracy in all cases, even for vectors very close to each
   other.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: angular separation between v1 and v2 - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if either vector has a null norm"
  (^Double [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D v-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D v-2]
    (Vector2D/angle v-1 v-2)))

(defn *distance
  "Compute the distance between two vectors according to the L2 norm.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNorm() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: the distance between p1 and p2 according to the L2 norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2]
    (Vector2D/distance p-1 p-2)))

(defn *distance-inf
  "Compute the distance between two vectors according to the L∞ norm.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNormInf() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: the distance between p1 and p2 according to the L∞ norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2]
    (Vector2D/distanceInf p-1 p-2)))

(defn *distance-sq
  "Compute the square of the distance between two vectors.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNormSq() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: the square of the distance between p1 and p2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2]
    (Vector2D/distanceSq p-1 p-2)))

(defn cross-product
  "Compute the cross-product of the instance and the given points.

   The cross product can be used to determine the location of a point
   with regard to the line formed by (p1, p2) and is calculated as:
   \\[
      P = (x_2 - x_1)(y_3 - y_1) - (y_2 - y_1)(x_3 - x_1)
   \\]
   with \\(p3 = (x_3, y_3)\\) being this instance.

   If the result is 0, the points are collinear, i.e. lie on a single straight line L;
   if it is positive, this point lies to the left, otherwise to the right of the line
   formed by (p1, p2).

  p-1 - first point of the line - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`
  p-2 - second point of the line - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  returns: the cross-product - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-1 ^org.apache.commons.math4.geometry.euclidean.twod.Vector2D p-2]
    (-> this (.crossProduct p-1 p-2))))

(defn distance-sq
  "Compute the square of the distance between the instance and another vector.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormSq() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the square of the distance between the instance and p - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distanceSq p))))

(defn normalize
  "Get a normalized vector aligned with the instance.

  returns: a new normalized vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this]
    (-> this (.normalize))))

(defn scalar-multiply
  "Multiply the instance by a scalar.

  a - scalar - `double`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this ^Double a]
    (-> this (.scalarMultiply a))))

(defn distance-inf
  "Compute the distance between the instance and another vector according to the L∞ norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormInf() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L∞ norm - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distanceInf p))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this]
    (-> this (.negate))))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^Vector2D this]
    (-> this (.getSpace))))

(defn dot-product
  "Compute the dot-product of the instance and another vector.

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the dot product this.v - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.dotProduct v))))

(defn distance-1
  "Compute the distance between the instance and another vector according to the L1 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm1() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L1 norm - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distance1 p))))

(defn get-norm-1
  "Get the L1 norm for the vector.

  returns: L1 norm for the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getNorm1))))

(defn to-string
  "Get a string representation of this vector.

  format - the custom format for components - `java.text.NumberFormat`

  returns: a string representation of this vector - `java.lang.String`"
  (^java.lang.String [^Vector2D this ^java.text.NumberFormat format]
    (-> this (.toString format)))
  (^java.lang.String [^Vector2D this]
    (-> this (.toString))))

(defn get-norm-sq
  "Get the square of the norm for the vector.

  returns: square of the Euclidean norm for the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getNormSq))))

(defn infinite?
  "Returns true if any coordinate of this vector is infinite and none are NaN;
   false otherwise

  returns: true if any coordinate of this vector is infinite and none are NaN;
   false otherwise - `boolean`"
  (^Boolean [^Vector2D this]
    (-> this (.isInfinite))))

(defn get-y
  "Get the ordinate of the vector.

  returns: ordinate of the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getY))))

(defn subtract
  "Subtract a scaled vector from the instance.

  factor - scale factor to apply to v before subtracting it - `double`
  v - vector to subtract - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract factor v)))
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.subtract p))))

(defn distance
  "Compute the distance between the instance and another point.

  p - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^Vector2D this ^org.apache.commons.math4.geometry.Point p]
    (-> this (.distance p))))

(defn get-x
  "Get the abscissa of the vector.

  returns: abscissa of the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getX))))

(defn get-norm-inf
  "Get the L∞ norm for the vector.

  returns: L∞ norm for the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getNormInf))))

(defn get-norm
  "Get the L2 norm for the vector.

  returns: Euclidean norm for the vector - `double`"
  (^Double [^Vector2D this]
    (-> this (.getNorm))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^Vector2D this]
    (-> this (.isNaN))))

(defn hash-code
  "Get a hashCode for the 2D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^Vector2D this]
    (-> this (.hashCode))))

(defn add
  "Add a scaled vector to the instance.

  factor - scale factor to apply to v before adding it - `double`
  v - vector to add - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add factor v)))
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add v))))

(defn to-array
  "Get the vector coordinates as a dimension 2 array.

  returns: vector coordinates - `double[]`"
  ([^Vector2D this]
    (-> this (.toArray))))

(defn equals
  "Test for the equality of two 2D vectors.

   If all coordinates of two 2D vectors are exactly the same, and none are
   Double.NaN, the two 2D vectors are considered to be equal.


   NaN coordinates are considered to affect globally the vector
   and be equals to each other - i.e, if either (or all) coordinates of the
   2D vector are equal to Double.NaN, the 2D vector is equal to
   NaN.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two 2D vector objects are equal, false if
           object is null, not an instance of Vector2D, or
           not equal to this Vector2D instance - `boolean`"
  (^Boolean [^Vector2D this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-zero
  "Get the null vector of the vectorial space or origin point of the affine space.

  returns: null vector of the vectorial space or origin point of the affine space - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D`"
  (^org.apache.commons.math4.geometry.euclidean.twod.Vector2D [^Vector2D this]
    (-> this (.getZero))))

