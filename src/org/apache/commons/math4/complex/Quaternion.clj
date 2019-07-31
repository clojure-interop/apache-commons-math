(ns org.apache.commons.math4.complex.Quaternion
  "This class implements
  quaternions (Hamilton's hypercomplex numbers).

  Instance of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.complex Quaternion]))

(defn ->quaternion
  "Constructor.

  Builds a quaternion from its components.

  a - Scalar component. - `double`
  b - First vector component. - `double`
  c - Second vector component. - `double`
  d - Third vector component. - `double`"
  (^Quaternion [^Double a ^Double b ^Double c ^Double d]
    (new Quaternion a b c d))
  (^Quaternion [^Double scalar v]
    (new Quaternion scalar v))
  (^Quaternion [v]
    (new Quaternion v)))

(def *-identity
  "Static Constant.

  Identity quaternion.

  type: org.apache.commons.math4.complex.Quaternion"
  Quaternion/IDENTITY)

(def *-zero
  "Static Constant.

  Zero quaternion.

  type: org.apache.commons.math4.complex.Quaternion"
  Quaternion/ZERO)

(def *-i
  "Static Constant.

  i

  type: org.apache.commons.math4.complex.Quaternion"
  Quaternion/I)

(def *-j
  "Static Constant.

  j

  type: org.apache.commons.math4.complex.Quaternion"
  Quaternion/J)

(def *-k
  "Static Constant.

  k

  type: org.apache.commons.math4.complex.Quaternion"
  Quaternion/K)

(defn *multiply
  "Returns the Hamilton product of two quaternions.

  q-1 - First quaternion. - `org.apache.commons.math4.complex.Quaternion`
  q-2 - Second quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the product q1 and q2, in that order. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^org.apache.commons.math4.complex.Quaternion q-1 ^org.apache.commons.math4.complex.Quaternion q-2]
    (Quaternion/multiply q-1 q-2)))

(defn *add
  "Computes the sum of two quaternions.

  q-1 - Quaternion. - `org.apache.commons.math4.complex.Quaternion`
  q-2 - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the sum of q1 and q2. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^org.apache.commons.math4.complex.Quaternion q-1 ^org.apache.commons.math4.complex.Quaternion q-2]
    (Quaternion/add q-1 q-2)))

(defn *subtract
  "Subtracts two quaternions.

  q-1 - First Quaternion. - `org.apache.commons.math4.complex.Quaternion`
  q-2 - Second quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the difference between q1 and q2. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^org.apache.commons.math4.complex.Quaternion q-1 ^org.apache.commons.math4.complex.Quaternion q-2]
    (Quaternion/subtract q-1 q-2)))

(defn *dot-product
  "Computes the dot-product of two quaternions.

  q-1 - Quaternion. - `org.apache.commons.math4.complex.Quaternion`
  q-2 - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the dot product of q1 and q2. - `double`"
  (^Double [^org.apache.commons.math4.complex.Quaternion q-1 ^org.apache.commons.math4.complex.Quaternion q-2]
    (Quaternion/dotProduct q-1 q-2)))

(defn get-inverse
  "Returns the inverse of this instance.
   The norm of the quaternion must not be zero.

  returns: the inverse. - `org.apache.commons.math4.complex.Quaternion`

  throws: org.apache.commons.math4.exception.ZeroException - if the norm (squared) of the quaternion is zero."
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this]
    (-> this (.getInverse))))

(defn normalize
  "Computes the normalized quaternion (the versor of the instance).
   The norm of the quaternion must not be zero.

  returns: a normalized quaternion. - `org.apache.commons.math4.complex.Quaternion`

  throws: org.apache.commons.math4.exception.ZeroException - if the norm of the quaternion is zero."
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this]
    (-> this (.normalize))))

(defn get-q-3
  "Gets the fourth component of the quaternion (third component
   of the vector part).

  returns: the third component of the vector part. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getQ3))))

(defn multiply
  "Returns the Hamilton product of the instance by a quaternion.

  q - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the product of this instance with q, in that order. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this ^org.apache.commons.math4.complex.Quaternion q]
    (-> this (.multiply q))))

(defn pure-quaternion?
  "Checks whether the instance is a pure quaternion within a given
   tolerance.

  eps - Tolerance (absolute error). - `double`

  returns: true if the scalar part of the quaternion is zero. - `boolean`"
  (^Boolean [^Quaternion this ^Double eps]
    (-> this (.isPureQuaternion eps))))

(defn dot-product
  "Computes the dot-product of the instance by a quaternion.

  q - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the dot product of this instance and q. - `double`"
  (^Double [^Quaternion this ^org.apache.commons.math4.complex.Quaternion q]
    (-> this (.dotProduct q))))

(defn get-vector-part
  "Gets the three components of the vector part of the quaternion.

  returns: the vector part. - `double[]`"
  ([^Quaternion this]
    (-> this (.getVectorPart))))

(defn get-q-1
  "Gets the second component of the quaternion (first component
   of the vector part).

  returns: the first component of the vector part. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getQ1))))

(defn get-conjugate
  "Returns the conjugate quaternion of the instance.

  returns: the conjugate quaternion - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this]
    (-> this (.getConjugate))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Quaternion this]
    (-> this (.toString))))

(defn unit-quaternion?
  "Checks whether the instance is a unit quaternion within a given
   tolerance.

  eps - Tolerance (absolute error). - `double`

  returns: true if the norm is 1 within the given tolerance,
   false otherwise - `boolean`"
  (^Boolean [^Quaternion this ^Double eps]
    (-> this (.isUnitQuaternion eps))))

(defn get-q-0
  "Gets the first component of the quaternion (scalar part).

  returns: the scalar part. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getQ0))))

(defn get-scalar-part
  "Gets the scalar part of the quaternion.

  returns: the scalar part. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getScalarPart))))

(defn subtract
  "Subtracts a quaternion from the instance.

  q - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the difference between this instance and q. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this ^org.apache.commons.math4.complex.Quaternion q]
    (-> this (.subtract q))))

(defn get-norm
  "Computes the norm of the quaternion.

  returns: the norm. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getNorm))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Quaternion this]
    (-> this (.hashCode))))

(defn add
  "Computes the sum of the instance and another quaternion.

  q - Quaternion. - `org.apache.commons.math4.complex.Quaternion`

  returns: the sum of this instance and q - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this ^org.apache.commons.math4.complex.Quaternion q]
    (-> this (.add q))))

(defn get-q-2
  "Gets the third component of the quaternion (second component
   of the vector part).

  returns: the second component of the vector part. - `double`"
  (^Double [^Quaternion this]
    (-> this (.getQ2))))

(defn equals
  "Checks whether this instance is equal to another quaternion
   within a given tolerance.

  q - Quaternion with which to compare the current quaternion. - `org.apache.commons.math4.complex.Quaternion`
  eps - Tolerance. - `double`

  returns: true if the each of the components are equal
   within the allowed absolute error. - `boolean`"
  (^Boolean [^Quaternion this ^org.apache.commons.math4.complex.Quaternion q ^Double eps]
    (-> this (.equals q eps)))
  (^Boolean [^Quaternion this ^java.lang.Object other]
    (-> this (.equals other))))

(defn get-positive-polar-form
  "Returns the polar form of the quaternion.

  returns: the unit quaternion with positive scalar part. - `org.apache.commons.math4.complex.Quaternion`"
  (^org.apache.commons.math4.complex.Quaternion [^Quaternion this]
    (-> this (.getPositivePolarForm))))

