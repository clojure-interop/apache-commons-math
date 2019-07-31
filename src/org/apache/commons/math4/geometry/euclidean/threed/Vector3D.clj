(ns org.apache.commons.math4.geometry.euclidean.threed.Vector3D
  "This class implements vectors in a three-dimensional space.
  Instance of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Vector3D]))

(defn ->vector-3-d
  "Constructor.

  Linear constructor
   Build a vector from four other ones and corresponding scale factors.
   The vector built will be a1 * u1  a2 * u2  a3 * u3  a4 * u4

  a-1 - first scale factor - `double`
  u-1 - first base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  a-2 - second scale factor - `double`
  u-2 - second base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  a-3 - third scale factor - `double`
  u-3 - third base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  a-4 - fourth scale factor - `double`
  u-4 - fourth base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^Vector3D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-3 ^Double a-4 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-4]
    (new Vector3D a-1 u-1 a-2 u-2 a-3 u-3 a-4 u-4))
  (^Vector3D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-2 ^Double a-3 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-3]
    (new Vector3D a-1 u-1 a-2 u-2 a-3 u-3))
  (^Vector3D [^Double a-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-1 ^Double a-2 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-2]
    (new Vector3D a-1 u-1 a-2 u-2))
  (^Vector3D [^Double x ^Double y ^Double z]
    (new Vector3D x y z))
  (^Vector3D [^Double alpha ^Double delta]
    (new Vector3D alpha delta))
  (^Vector3D [v]
    (new Vector3D v)))

(def *-zero
  "Static Constant.

  Null vector (coordinates: 0, 0, 0).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/ZERO)

(def *-plus-i
  "Static Constant.

  First canonical vector (coordinates: 1, 0, 0).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/PLUS_I)

(def *-minus-i
  "Static Constant.

  Opposite of the first canonical vector (coordinates: -1, 0, 0).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/MINUS_I)

(def *-plus-j
  "Static Constant.

  Second canonical vector (coordinates: 0, 1, 0).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/PLUS_J)

(def *-minus-j
  "Static Constant.

  Opposite of the second canonical vector (coordinates: 0, -1, 0).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/MINUS_J)

(def *-plus-k
  "Static Constant.

  Third canonical vector (coordinates: 0, 0, 1).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/PLUS_K)

(def *-minus-k
  "Static Constant.

  Opposite of the third canonical vector (coordinates: 0, 0, -1).

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/MINUS_K)

(def *-na-n
  "Static Constant.

  A vector with all coordinates set to NaN.

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/NaN)

(def *-positive-infinity
  "Static Constant.

  A vector with all coordinates set to positive infinity.

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/POSITIVE_INFINITY)

(def *-negative-infinity
  "Static Constant.

  A vector with all coordinates set to negative infinity.

  type: org.apache.commons.math4.geometry.euclidean.threed.Vector3D"
  Vector3D/NEGATIVE_INFINITY)

(defn *angle
  "Compute the angular separation between two vectors.
   This method computes the angular separation between two
   vectors using the dot product for well separated vectors and the
   cross product for almost aligned vectors. This allows to have a
   good accuracy in all cases, even for vectors very close to each
   other.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: angular separation between v1 and v2 - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if either vector has a null norm"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/angle v-1 v-2)))

(defn *dot-product
  "Compute the dot-product of two vectors.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the dot product v1.v2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/dotProduct v-1 v-2)))

(defn *cross-product
  "Compute the cross-product of two vectors.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the cross product v1 ^ v2 as a new Vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/crossProduct v-1 v-2)))

(defn *distance-1
  "Compute the distance between two vectors according to the L1 norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNorm1() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the distance between v1 and v2 according to the L1 norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/distance1 v-1 v-2)))

(defn *distance
  "Compute the distance between two vectors according to the L2 norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNorm() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the distance between v1 and v2 according to the L2 norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/distance v-1 v-2)))

(defn *distance-inf
  "Compute the distance between two vectors according to the L∞ norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNormInf() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the distance between v1 and v2 according to the L∞ norm - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/distanceInf v-1 v-2)))

(defn *distance-sq
  "Compute the square of the distance between two vectors.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNormSq() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: the square of the distance between v1 and v2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (Vector3D/distanceSq v-1 v-2)))

(defn cross-product
  "Compute the cross-product of the instance with another vector.

  v - other vector - `org.apache.commons.math4.geometry.Vector`

  returns: the cross product this ^ v as a new Vector3D - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.crossProduct v))))

(defn orthogonal
  "Get a vector orthogonal to the instance.
   There are an infinite number of normalized vectors orthogonal
   to the instance. This method picks up one of them almost
   arbitrarily. It is useful when one needs to compute a reference
   frame with one of the axes in a predefined direction. The
   following example shows how to build a frame having the k axis
   aligned with the known vector u :


     Vector3D k = u.normalize();
     Vector3D i = k.orthogonal();
     Vector3D j = Vector3D.crossProduct(k, i);

  returns: a new normalized vector orthogonal to the instance - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm of the instance is null"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this]
    (-> this (.orthogonal))))

(defn distance-sq
  "Compute the square of the distance between the instance and another vector.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormSq() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the square of the distance between the instance and p - `double`"
  (^Double [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distanceSq v))))

(defn normalize
  "Get a normalized vector aligned with the instance.

  returns: a new normalized vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this]
    (-> this (.normalize))))

(defn scalar-multiply
  "Multiply the instance by a scalar.

  a - scalar - `double`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^Double a]
    (-> this (.scalarMultiply a))))

(defn distance-inf
  "Compute the distance between the instance and another vector according to the L∞ norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormInf() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L∞ norm - `double`"
  (^Double [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distanceInf v))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this]
    (-> this (.negate))))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^Vector3D this]
    (-> this (.getSpace))))

(defn get-z
  "Get the height of the vector.

  returns: height of the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getZ))))

(defn dot-product
  "Compute the dot-product of the instance and another vector.

   The implementation uses specific multiplication and addition
   algorithms to preserve accuracy and reduce cancellation effects.
   It should be very accurate even for nearly orthogonal vectors.

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the dot product this.v - `double`"
  (^Double [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.dotProduct v))))

(defn distance-1
  "Compute the distance between the instance and another vector according to the L1 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm1() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L1 norm - `double`"
  (^Double [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distance1 v))))

(defn get-norm-1
  "Get the L1 norm for the vector.

  returns: L1 norm for the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getNorm1))))

(defn to-string
  "Get a string representation of this vector.

  format - the custom format for components - `java.text.NumberFormat`

  returns: a string representation of this vector - `java.lang.String`"
  (^java.lang.String [^Vector3D this ^java.text.NumberFormat format]
    (-> this (.toString format)))
  (^java.lang.String [^Vector3D this]
    (-> this (.toString))))

(defn get-alpha
  "Get the azimuth of the vector.

  returns: azimuth (α) of the vector, between -π and π - `double`"
  (^Double [^Vector3D this]
    (-> this (.getAlpha))))

(defn get-norm-sq
  "Get the square of the norm for the vector.

  returns: square of the Euclidean norm for the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getNormSq))))

(defn infinite?
  "Returns true if any coordinate of this vector is infinite and none are NaN;
   false otherwise

  returns: true if any coordinate of this vector is infinite and none are NaN;
   false otherwise - `boolean`"
  (^Boolean [^Vector3D this]
    (-> this (.isInfinite))))

(defn get-y
  "Get the ordinate of the vector.

  returns: ordinate of the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getY))))

(defn subtract
  "Subtract a scaled vector from the instance.

  factor - scale factor to apply to v before subtracting it - `double`
  v - vector to subtract - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract factor v)))
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract v))))

(defn distance
  "Compute the distance between the instance and another point.

  v - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^Vector3D this ^org.apache.commons.math4.geometry.Point v]
    (-> this (.distance v))))

(defn get-x
  "Get the abscissa of the vector.

  returns: abscissa of the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getX))))

(defn get-norm-inf
  "Get the L∞ norm for the vector.

  returns: L∞ norm for the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getNormInf))))

(defn get-norm
  "Get the L2 norm for the vector.

  returns: Euclidean norm for the vector - `double`"
  (^Double [^Vector3D this]
    (-> this (.getNorm))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^Vector3D this]
    (-> this (.isNaN))))

(defn hash-code
  "Get a hashCode for the 3D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^Vector3D this]
    (-> this (.hashCode))))

(defn add
  "Add a scaled vector to the instance.

  factor - scale factor to apply to v before adding it - `double`
  v - vector to add - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add factor v)))
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add v))))

(defn to-array
  "Get the vector coordinates as a dimension 3 array.

  returns: vector coordinates - `double[]`"
  ([^Vector3D this]
    (-> this (.toArray))))

(defn get-delta
  "Get the elevation of the vector.

  returns: elevation (δ) of the vector, between -π/2 and π/2 - `double`"
  (^Double [^Vector3D this]
    (-> this (.getDelta))))

(defn equals
  "Test for the equality of two 3D vectors.

   If all coordinates of two 3D vectors are exactly the same, and none are
   Double.NaN, the two 3D vectors are considered to be equal.


   NaN coordinates are considered to affect globally the vector
   and be equals to each other - i.e, if either (or all) coordinates of the
   3D vector are equal to Double.NaN, the 3D vector is equal to
   NaN.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two 3D vector objects are equal, false if
           object is null, not an instance of Vector3D, or
           not equal to this Vector3D instance - `boolean`"
  (^Boolean [^Vector3D this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-zero
  "Get the null vector of the vectorial space or origin point of the affine space.

  returns: null vector of the vectorial space or origin point of the affine space - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Vector3D this]
    (-> this (.getZero))))

