(ns org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D
  "This class is a re-implementation of Vector3D using RealFieldElement.
  Instance of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed FieldVector3D]))

(defn ->field-vector-3-d
  "Constructor.

  Linear constructor
   Build a vector from four other ones and corresponding scale factors.
   The vector built will be a1 * u1  a2 * u2  a3 * u3  a4 * u4

  a-1 - first scale factor - `T`
  u-1 - first base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  a-2 - second scale factor - `T`
  u-2 - second base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  a-3 - third scale factor - `T`
  u-3 - third base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  a-4 - fourth scale factor - `T`
  u-4 - fourth base (unscaled) vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`"
  (^FieldVector3D [a-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-1 a-2 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-2 a-3 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-3 a-4 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-4]
    (new FieldVector3D a-1 u-1 a-2 u-2 a-3 u-3 a-4 u-4))
  (^FieldVector3D [a-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-1 a-2 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-2 a-3 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-3]
    (new FieldVector3D a-1 u-1 a-2 u-2 a-3 u-3))
  (^FieldVector3D [a-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-1 a-2 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-2]
    (new FieldVector3D a-1 u-1 a-2 u-2))
  (^FieldVector3D [x y z]
    (new FieldVector3D x y z))
  (^FieldVector3D [alpha delta]
    (new FieldVector3D alpha delta))
  (^FieldVector3D [v]
    (new FieldVector3D v)))

(defn *angle
  "Compute the angular separation between two vectors.
   This method computes the angular separation between two
   vectors using the dot product for well separated vectors and the
   cross product for almost aligned vectors. This allows to have a
   good accuracy in all cases, even for vectors very close to each
   other.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: angular separation between v1 and v2 - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if either vector has a null norm"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/angle v-1 v-2)))

(defn *dot-product
  "Compute the dot-product of two vectors.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the dot product v1.v2 - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/dotProduct v-1 v-2)))

(defn *cross-product
  "Compute the cross-product of two vectors.

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the cross product v1 ^ v2 as a new Vector - `<T extends org.apache.commons.math4.RealFieldElement<T>> org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/crossProduct v-1 v-2)))

(defn *distance-1
  "Compute the distance between two vectors according to the L1 norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNorm1() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between v1 and v2 according to the L1 norm - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/distance1 v-1 v-2)))

(defn *distance
  "Compute the distance between two vectors according to the L2 norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNorm() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between v1 and v2 according to the L2 norm - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/distance v-1 v-2)))

(defn *distance-inf
  "Compute the distance between two vectors according to the L∞ norm.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNormInf() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between v1 and v2 according to the L∞ norm - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/distanceInf v-1 v-2)))

(defn *distance-sq
  "Compute the square of the distance between two vectors.
   Calling this method is equivalent to calling:
   v1.subtract(v2).getNormSq() except that no intermediate
   vector is built

  v-1 - first vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`
  v-2 - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the square of the distance between v1 and v2 - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (FieldVector3D/distanceSq v-1 v-2)))

(defn cross-product
  "Compute the cross-product of the instance with another vector.

  v - other vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the cross product this ^ v as a new Vector3D - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
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

  returns: a new normalized vector orthogonal to the instance - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm of the instance is null"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this]
    (-> this (.orthogonal))))

(defn distance-sq
  "Compute the square of the distance between the instance and another vector.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormSq() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the square of the distance between the instance and p - `T`"
  ([^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.distanceSq v))))

(defn normalize
  "Get a normalized vector aligned with the instance.

  returns: a new normalized vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this]
    (-> this (.normalize))))

(defn to-vector-3-d
  "Convert to a constant vector without derivatives.

  returns: a constant vector - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^FieldVector3D this]
    (-> this (.toVector3D))))

(defn scalar-multiply
  "Multiply the instance by a scalar.

  a - scalar - `T`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this a]
    (-> this (.scalarMultiply a))))

(defn distance-inf
  "Compute the distance between the instance and another vector according to the L∞ norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormInf() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between the instance and p according to the L∞ norm - `T`"
  ([^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.distanceInf v))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this]
    (-> this (.negate))))

(defn get-z
  "Get the height of the vector.

  returns: height of the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getZ))))

(defn dot-product
  "Compute the dot-product of the instance and another vector.

   The implementation uses specific multiplication and addition
   algorithms to preserve accuracy and reduce cancellation effects.
   It should be very accurate even for nearly orthogonal vectors.

  v - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the dot product this.v - `T`"
  ([^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.dotProduct v))))

(defn distance-1
  "Compute the distance between the instance and another vector according to the L1 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm1() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between the instance and p according to the L1 norm - `T`"
  ([^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.distance1 v))))

(defn get-norm-1
  "Get the L1 norm for the vector.

  returns: L1 norm for the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getNorm1))))

(defn to-string
  "Get a string representation of this vector.

  format - the custom format for components - `java.text.NumberFormat`

  returns: a string representation of this vector - `java.lang.String`"
  (^java.lang.String [^FieldVector3D this ^java.text.NumberFormat format]
    (-> this (.toString format)))
  (^java.lang.String [^FieldVector3D this]
    (-> this (.toString))))

(defn get-alpha
  "Get the azimuth of the vector.

  returns: azimuth (α) of the vector, between -π and π - `T`"
  ([^FieldVector3D this]
    (-> this (.getAlpha))))

(defn get-norm-sq
  "Get the square of the norm for the vector.

  returns: square of the Euclidean norm for the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getNormSq))))

(defn infinite?
  "Returns true if any coordinate of this vector is infinite and none are NaN;
   false otherwise

  returns: true if any coordinate of this vector is infinite and none are NaN;
   false otherwise - `boolean`"
  (^Boolean [^FieldVector3D this]
    (-> this (.isInfinite))))

(defn get-y
  "Get the ordinate of the vector.

  returns: ordinate of the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getY))))

(defn subtract
  "Subtract a scaled vector from the instance.

  factor - scale factor to apply to v before subtracting it - `T`
  v - vector to subtract - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this factor ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.subtract factor v)))
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.subtract v))))

(defn distance
  "Compute the distance between the instance and another vector according to the L2 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: the distance between the instance and p according to the L2 norm - `T`"
  ([^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.distance v))))

(defn get-x
  "Get the abscissa of the vector.

  returns: abscissa of the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getX))))

(defn get-norm-inf
  "Get the L∞ norm for the vector.

  returns: L∞ norm for the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getNormInf))))

(defn get-norm
  "Get the L2 norm for the vector.

  returns: Euclidean norm for the vector - `T`"
  ([^FieldVector3D this]
    (-> this (.getNorm))))

(defn na-n?
  "Returns true if any coordinate of this vector is NaN; false otherwise

  returns: true if any coordinate of this vector is NaN; false otherwise - `boolean`"
  (^Boolean [^FieldVector3D this]
    (-> this (.isNaN))))

(defn hash-code
  "Get a hashCode for the 3D vector.

   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^FieldVector3D this]
    (-> this (.hashCode))))

(defn add
  "Add a scaled vector to the instance.

  factor - scale factor to apply to v before adding it - `T`
  v - vector to add - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: a new vector - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this factor ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.add factor v)))
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldVector3D this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v]
    (-> this (.add v))))

(defn to-array
  "Get the vector coordinates as a dimension 3 array.

  returns: vector coordinates - `T[]`"
  ([^FieldVector3D this]
    (-> this (.toArray))))

(defn get-delta
  "Get the elevation of the vector.

  returns: elevation (δ) of the vector, between -π/2 and π/2 - `T`"
  ([^FieldVector3D this]
    (-> this (.getDelta))))

(defn equals
  "Test for the equality of two 3D vectors.

   If all coordinates of two 3D vectors are exactly the same, and none of their
   real part are NaN, the
   two 3D vectors are considered to be equal.


   NaN coordinates are considered to affect globally the vector
   and be equals to each other - i.e, if either (or all) real part of the
   coordinates of the 3D vector are NaN, the 3D vector is NaN.

  other - Object to test for equality to this - `java.lang.Object`

  returns: true if two 3D vector objects are equal, false if
           object is null, not an instance of Vector3D, or
           not equal to this Vector3D instance - `boolean`"
  (^Boolean [^FieldVector3D this ^java.lang.Object other]
    (-> this (.equals other))))

