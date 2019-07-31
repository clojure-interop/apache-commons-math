(ns org.apache.commons.math4.geometry.euclidean.oned.Vector1D
  "This class represents a 1D vector.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned Vector1D]))

(defn ->vector-1-d
  "Constructor.

  Linear constructor
   Build a vector from four other ones and corresponding scale factors.
   The vector built will be a1 * u1  a2 * u2  a3 * u3  a4 * u4

  a-1 - first scale factor - `double`
  u-1 - first base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  a-2 - second scale factor - `double`
  u-2 - second base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  a-3 - third scale factor - `double`
  u-3 - third base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  a-4 - fourth scale factor - `double`
  u-4 - fourth base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^Vector1D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-3 ^Double a-4 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-4]
    (new Vector1D a-1 u-1 a-2 u-2 a-3 u-3 a-4 u-4))
  (^Vector1D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-3]
    (new Vector1D a-1 u-1 a-2 u-2 a-3 u-3))
  (^Vector1D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u-2]
    (new Vector1D a-1 u-1 a-2 u-2))
  (^Vector1D [^Double a ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D u]
    (new Vector1D a u))
  (^Vector1D [^Double x]
    (new Vector1D x)))

(def *-zero
  "Static Constant.

  Origin (coordinates: 0).

  type: org.apache.commons.math4.geometry.euclidean.oned.Vector1D"
  Vector1D/ZERO)

(def *-one
  "Static Constant.

  Unit (coordinates: 1).

  type: org.apache.commons.math4.geometry.euclidean.oned.Vector1D"
  Vector1D/ONE)

(def *-na-n
  "Static Constant.

  A vector with all coordinates set to NaN.

  type: org.apache.commons.math4.geometry.euclidean.oned.Vector1D"
  Vector1D/NaN)

(def *-positive-infinity
  "Static Constant.

  A vector with all coordinates set to positive infinity.

  type: org.apache.commons.math4.geometry.euclidean.oned.Vector1D"
  Vector1D/POSITIVE_INFINITY)

(def *-negative-infinity
  "Static Constant.

  A vector with all coordinates set to negative infinity.

  type: org.apache.commons.math4.geometry.euclidean.oned.Vector1D"
  Vector1D/NEGATIVE_INFINITY)

(defn *distance
  "Compute the distance between two vectors according to the L2 norm.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNorm() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`

  returns: the distance between p1 and p2 according to the L2 norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-2]
    (Vector1D/distance p-1 p-2)))

(defn *distance-inf
  "Compute the distance between two vectors according to the L∞ norm.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNormInf() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`

  returns: the distance between p1 and p2 according to the L∞ norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-2]
    (Vector1D/distanceInf p-1 p-2)))

(defn *distance-sq
  "Compute the square of the distance between two vectors.
   Calling this method is equivalent to calling:
   p1.subtract(p2).getNormSq() except that no intermediate
   vector is built

  p-1 - first vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`
  p-2 - second vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`

  returns: the square of the distance between p1 and p2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-1 ^org.apache.commons.math4.geometry.euclidean.oned.Vector1D p-2]
    (Vector1D/distanceSq p-1 p-2)))

(defn distance-sq
  "Compute the square of the distance between the instance and another vector.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormSq() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the square of the distance between the instance and p - `double`"
  (^Double [^Vector1D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distanceSq p))))

(defn normalize
  "Get a normalized vector aligned with the instance.

  returns: a new normalized vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this]
    (-> this (.normalize))))

(defn scalar-multiply
  "Multiply the instance by a scalar.

  a - scalar - `double`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this ^Double a]
    (-> this (.scalarMultiply a))))

(defn distance-inf
  "Compute the distance between the instance and another vector according to the L∞ norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormInf() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L∞ norm - `double`"
  (^Double [^Vector1D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distanceInf p))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this]
    (-> this (.negate))))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^Vector1D this]
    (-> this (.getSpace))))

(defn dot-product
  "Compute the dot-product of the instance and another vector.

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the dot product this.v - `double`"
  (^Double [^Vector1D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.dotProduct v))))

(defn distance-1
  "Compute the distance between the instance and another vector according to the L1 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm1() except that no intermediate
   vector is built

  p - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L1 norm - `double`"
  (^Double [^Vector1D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.distance1 p))))

(defn get-norm-1
  "Get the L1 norm for the vector.

  returns: L1 norm for the vector - `double`"
  (^Double [^Vector1D this]
    (-> this (.getNorm1))))

(defn to-string
  "Get a string representation of this vector.

  format - the custom format for components - `java.text.NumberFormat`

  returns: a string representation of this vector - `java.lang.String`"
  (^java.lang.String [^Vector1D this ^java.text.NumberFormat format]
    (-> this (.toString format)))
  (^java.lang.String [^Vector1D this]
    (-> this (.toString))))

(defn get-norm-sq
  "Get the square of the norm for the vector.

  returns: square of the Euclidean norm for the vector - `double`"
  (^Double [^Vector1D this]
    (-> this (.getNormSq))))

(defn infinite?
  "Returns true if any coordinate of this vector is infinite and none are NaN;
   false otherwise

  returns: true if any coordinate of this vector is infinite and none are NaN;
   false otherwise - `boolean`"
  (^Boolean [^Vector1D this]
    (-> this (.isInfinite))))

(defn subtract
  "Subtract a scaled vector from the instance.

  factor - scale factor to apply to v before subtracting it - `double`
  v - vector to subtract - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract factor v)))
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this ^org.apache.commons.math4.geometry.Vector p]
    (-> this (.subtract p))))

(defn distance
  "Compute the distance between the instance and another point.

  p - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^Vector1D this ^org.apache.commons.math4.geometry.Point p]
    (-> this (.distance p))))

(defn get-x
  "Get the abscissa of the vector.

  returns: abscissa of the vector - `double`"
  (^Double [^Vector1D this]
    (-> this (.getX))))

(defn get-norm-inf
  "Get the L∞ norm for the vector.

  returns: L∞ norm for the vector - `double`"
  (^Double [^Vector1D this]
    (-> this (.getNormInf))))

(defn get-norm
  "Get the L2 norm for the vector.

  returns: Euclidean norm for the vector - `double`"
  (^Double [^Vector1D this]
    (-> this (.getNorm))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^Vector1D this]
    (-> this (.isNaN))))

(defn hash-code
  "Get a hashCode for the 1D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^Vector1D this]
    (-> this (.hashCode))))

(defn add
  "Add a scaled vector to the instance.

  factor - scale factor to apply to v before adding it - `double`
  v - vector to add - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add factor v)))
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add v))))

(defn equals
  "Test for the equality of two 1D vectors.

   If all coordinates of two 1D vectors are exactly the same, and none are
   Double.NaN, the two 1D vectors are considered to be equal.


   NaN coordinates are considered to affect globally the vector
   and be equals to each other - i.e, if either (or all) coordinates of the
   1D vector are equal to Double.NaN, the 1D vector is equal to
   NaN.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two 1D vector objects are equal, false if
           object is null, not an instance of Vector1D, or
           not equal to this Vector1D instance - `boolean`"
  (^Boolean [^Vector1D this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-zero
  "Get the null vector of the vectorial space or origin point of the affine space.

  returns: null vector of the vectorial space or origin point of the affine space - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1D this]
    (-> this (.getZero))))

