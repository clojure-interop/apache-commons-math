(ns org.apache.commons.math4.geometry.Vector
  "This interface represents a generic vector in a vectorial space or a point in an affine space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry Vector]))

(defn distance-sq
  "Compute the square of the distance between the instance and another vector.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormSq() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the square of the distance between the instance and p - `double`"
  (^Double [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distanceSq v))))

(defn normalize
  "Get a normalized vector aligned with the instance.

  returns: a new normalized vector - `org.apache.commons.math4.geometry.Vector<S>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero"
  (^org.apache.commons.math4.geometry.Vector [^Vector this]
    (-> this (.normalize))))

(defn scalar-multiply
  "Multiply the instance by a scalar.

  a - scalar - `double`

  returns: a new vector - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^Vector this ^Double a]
    (-> this (.scalarMultiply a))))

(defn distance-inf
  "Compute the distance between the instance and another vector according to the L∞ norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNormInf() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L∞ norm - `double`"
  (^Double [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distanceInf v))))

(defn negate
  "Get the opposite of the instance.

  returns: a new vector which is opposite to the instance - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^Vector this]
    (-> this (.negate))))

(defn dot-product
  "Compute the dot-product of the instance and another vector.

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the dot product this.v - `double`"
  (^Double [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.dotProduct v))))

(defn distance-1
  "Compute the distance between the instance and another vector according to the L1 norm.
   Calling this method is equivalent to calling:
   q.subtract(p).getNorm1() except that no intermediate
   vector is built

  v - second vector - `org.apache.commons.math4.geometry.Vector`

  returns: the distance between the instance and p according to the L1 norm - `double`"
  (^Double [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.distance1 v))))

(defn get-norm-1
  "Get the L1 norm for the vector.

  returns: L1 norm for the vector - `double`"
  (^Double [^Vector this]
    (-> this (.getNorm1))))

(defn to-string
  "Get a string representation of this vector.

  format - the custom format for components - `java.text.NumberFormat`

  returns: a string representation of this vector - `java.lang.String`"
  (^java.lang.String [^Vector this ^java.text.NumberFormat format]
    (-> this (.toString format))))

(defn get-norm-sq
  "Get the square of the norm for the vector.

  returns: square of the Euclidean norm for the vector - `double`"
  (^Double [^Vector this]
    (-> this (.getNormSq))))

(defn infinite?
  "Returns true if any coordinate of this vector is infinite and none are NaN;
   false otherwise

  returns: true if any coordinate of this vector is infinite and none are NaN;
   false otherwise - `boolean`"
  (^Boolean [^Vector this]
    (-> this (.isInfinite))))

(defn subtract
  "Subtract a scaled vector from the instance.

  factor - scale factor to apply to v before subtracting it - `double`
  v - vector to subtract - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^Vector this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract factor v)))
  (^org.apache.commons.math4.geometry.Vector [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.subtract v))))

(defn get-norm-inf
  "Get the L∞ norm for the vector.

  returns: L∞ norm for the vector - `double`"
  (^Double [^Vector this]
    (-> this (.getNormInf))))

(defn get-norm
  "Get the L2 norm for the vector.

  returns: Euclidean norm for the vector - `double`"
  (^Double [^Vector this]
    (-> this (.getNorm))))

(defn add
  "Add a scaled vector to the instance.

  factor - scale factor to apply to v before adding it - `double`
  v - vector to add - `org.apache.commons.math4.geometry.Vector`

  returns: a new vector - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^Vector this ^Double factor ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add factor v)))
  (^org.apache.commons.math4.geometry.Vector [^Vector this ^org.apache.commons.math4.geometry.Vector v]
    (-> this (.add v))))

(defn get-zero
  "Get the null vector of the vectorial space or origin point of the affine space.

  returns: null vector of the vectorial space or origin point of the affine space - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^Vector this]
    (-> this (.getZero))))

