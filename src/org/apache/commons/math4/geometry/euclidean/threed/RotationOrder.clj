(ns org.apache.commons.math4.geometry.euclidean.threed.RotationOrder
  "This class is a utility representing a rotation order specification
  for Cardan or Euler angles specification.

  This class cannot be instanciated by the user. He can only use one
  of the twelve predefined supported orders as an argument to either
  the Rotation.Rotation(RotationOrder,double,double,double)
  constructor or the Rotation.getAngles(org.apache.commons.math4.geometry.euclidean.threed.RotationOrder) method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed RotationOrder]))

(def *-xyz
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around X, then around Y, then
   around Z

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/XYZ)

(def *-xzy
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around X, then around Z, then
   around Y

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/XZY)

(def *-yxz
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around Y, then around X, then
   around Z

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/YXZ)

(def *-yzx
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around Y, then around Z, then
   around X

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/YZX)

(def *-zxy
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around Z, then around X, then
   around Y

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/ZXY)

(def *-zyx
  "Static Constant.

  Set of Cardan angles.
   this ordered set of rotations is around Z, then around Y, then
   around X

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/ZYX)

(def *-xyx
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around X, then around Y, then
   around X

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/XYX)

(def *-xzx
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around X, then around Z, then
   around X

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/XZX)

(def *-yxy
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around Y, then around X, then
   around Y

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/YXY)

(def *-yzy
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around Y, then around Z, then
   around Y

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/YZY)

(def *-zxz
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around Z, then around X, then
   around Z

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/ZXZ)

(def *-zyz
  "Static Constant.

  Set of Euler angles.
   this ordered set of rotations is around Z, then around Y, then
   around Z

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationOrder"
  RotationOrder/ZYZ)

(defn to-string
  "Get a string representation of the instance.

  returns: a string representation of the instance (in fact, its name) - `java.lang.String`"
  (^java.lang.String [^RotationOrder this]
    (-> this (.toString))))

(defn get-a-1
  "Get the axis of the first rotation.

  returns: axis of the first rotation - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^RotationOrder this]
    (-> this (.getA1))))

(defn get-a-2
  "Get the axis of the second rotation.

  returns: axis of the second rotation - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^RotationOrder this]
    (-> this (.getA2))))

(defn get-a-3
  "Get the axis of the second rotation.

  returns: axis of the second rotation - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^RotationOrder this]
    (-> this (.getA3))))

