(ns org.apache.commons.math4.geometry.euclidean.threed.FieldRotation
  "This class is a re-implementation of Rotation using RealFieldElement.
  Instance of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed FieldRotation]))

(defn ->field-rotation
  "Constructor.

  Build a rotation from the quaternion coordinates.
   A rotation can be built from a normalized quaternion,
   i.e. a quaternion for which q02
   q12  q22
   q32 = 1. If the quaternion is not normalized,
   the constructor can normalize it in a preprocessing step.
   Note that some conventions put the scalar part of the quaternion
   as the 4th component and the vector part as the first three
   components. This is not our convention. We put the scalar part
   as the first component.

  q-0 - scalar part of the quaternion - `T`
  q-1 - first coordinate of the vectorial part of the quaternion - `T`
  q-2 - second coordinate of the vectorial part of the quaternion - `T`
  q-3 - third coordinate of the vectorial part of the quaternion - `T`
  needs-normalization - if true, the coordinates are considered not to be normalized, a normalization preprocessing step is performed before using them - `boolean`"
  (^FieldRotation [q-0 q-1 q-2 q-3 ^Boolean needs-normalization]
    (new FieldRotation q-0 q-1 q-2 q-3 needs-normalization))
  (^FieldRotation [^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u-2 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D v-2]
    (new FieldRotation u-1 u-2 v-1 v-2))
  (^FieldRotation [^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D axis angle ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (new FieldRotation axis angle convention))
  (^FieldRotation [^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D axis angle]
    (new FieldRotation axis angle)))

(defn *apply-to
  "Apply a rotation to a vector.

  r - rotation to apply - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`
  u - vector to apply the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: a new vector which is the image of u by the rotation - `<T extends org.apache.commons.math4.RealFieldElement<T>> org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.Rotation r ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u]
    (FieldRotation/applyTo r u)))

(defn *apply-inverse-to
  "Apply the inverse of a rotation to a vector.

  r - rotation to apply - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`
  u - vector to apply the inverse of the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D`

  returns: a new vector which such that u is its image by the rotation - `<T extends org.apache.commons.math4.RealFieldElement<T>> org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.Rotation r ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u]
    (FieldRotation/applyInverseTo r u)))

(defn *distance
  "Compute the distance between two rotations.
   The distance is intended here as a way to check if two
   rotations are almost similar (i.e. they transform vectors the same way)
   or very different. It is mathematically defined as the angle of
   the rotation r that prepended to one of the rotations gives the other
   one:


          r1(r) = r2
   This distance is an angle between 0 and π. Its value is the smallest
   possible upper bound of the angle in radians between r1(v)
   and r2(v) for all possible vectors v. This upper bound is
   reached for some v. The distance is equal to 0 if and only if the two
   rotations are identical.
   Comparing two rotations should always be done using this value rather
   than for example comparing the components of the quaternions. It is much
   more stable, and has a geometric meaning. Also comparing quaternions
   components is error prone since for example quaternions (0.36, 0.48, -0.48, -0.64)
   and (-0.36, -0.48, 0.48, 0.64) represent exactly the same rotation despite
   their components are different (they are exact opposites).

  r-1 - first rotation - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation`
  r-2 - second rotation - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation`

  returns: distance between r1 and r2 - `<T extends org.apache.commons.math4.RealFieldElement<T>> T`"
  ([^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation r-1 ^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation r-2]
    (FieldRotation/distance r-1 r-2)))

(defn revert
  "Revert a rotation.
   Build a rotation which reverse the effect of another
   rotation. This means that if r(u) = v, then r.revert(v) = u. The
   instance is not changed.

  returns: a new rotation whose effect is the reverse of the effect
   of the instance - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation [^FieldRotation this]
    (-> this (.revert))))

(defn get-axis
  "Get the normalized axis of the rotation.

   Note that as getAngle() always returns an angle
   between 0 and π, changing the convention changes the
   direction of the axis, not the sign of the angle.

  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: normalized axis of the rotation - `org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.getAxis convention)))
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldRotation this]
    (-> this (.getAxis))))

(defn get-q-3
  "Get the third coordinate of the vectorial part of the quaternion.

  returns: third coordinate of the vectorial part of the quaternion - `T`"
  ([^FieldRotation this]
    (-> this (.getQ3))))

(defn apply-inverse-to
  "Apply the inverse of the rotation to a vector stored in an array.

  in - an array with three items which stores vector to rotate - `T[]`
  out - an array with three items to put result to (it can be the same array as in) - `T[]`"
  ([^FieldRotation this in out]
    (-> this (.applyInverseTo in out)))
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u]
    (-> this (.applyInverseTo u))))

(defn get-q-1
  "Get the first coordinate of the vectorial part of the quaternion.

  returns: first coordinate of the vectorial part of the quaternion - `T`"
  ([^FieldRotation this]
    (-> this (.getQ1))))

(defn apply-to
  "Apply the rotation to a vector stored in an array.

  in - an array with three items which stores vector to rotate - `T[]`
  out - an array with three items to put result to (it can be the same array as in) - `T[]`"
  ([^FieldRotation this in out]
    (-> this (.applyTo in out)))
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D [^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.FieldVector3D u]
    (-> this (.applyTo u))))

(defn get-q-0
  "Get the scalar coordinate of the quaternion.

  returns: scalar coordinate of the quaternion - `T`"
  ([^FieldRotation this]
    (-> this (.getQ0))))

(defn compose-inverse
  "Compose the inverse of the instance with another rotation.

   If the semantics of the rotations composition corresponds to a
   vector operator convention,
   applying the inverse of the instance to a rotation is computing
   the composition in an order compliant with the following rule :
   let u be any vector and v its image by r1
   (i.e. r1.applyTo(u) = v). Let w be the inverse image
   of v by r2 (i.e. r2.applyInverseTo(v) = w).
   Then w = comp.applyTo(u), where
   comp = r2.composeInverse(r1).


   If the semantics of the rotations composition corresponds to a
   frame transform convention,
   the application order will be reversed, which means it is the
   innermost rotation that will be reversed. So keeping the exact same
   meaning of all r1, r2, u, v, w
   and  comp as above, comp could also be computed as
   comp = r1.revert().composeInverse(r2.revert(), RotationConvention.FRAME_TRANSFORM).

  r - rotation to apply the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation`
  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: a new rotation which is the composition of r by the inverse
   of the instance - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation [^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation r ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.composeInverse r convention))))

(defn get-angle
  "Get the angle of the rotation.

  returns: angle of the rotation (between 0 and π) - `T`"
  ([^FieldRotation this]
    (-> this (.getAngle))))

(defn compose
  "Compose the instance with another rotation.

   If the semantics of the rotations composition corresponds to a
   vector operator convention,
   applying the instance to a rotation is computing the composition
   in an order compliant with the following rule : let u be any
   vector and v its image by r1 (i.e.
   r1.applyTo(u) = v). Let w be the image of v by
   rotation r2 (i.e. r2.applyTo(v) = w). Then
   w = comp.applyTo(u), where
   comp = r2.compose(r1, RotationConvention.VECTOR_OPERATOR).


   If the semantics of the rotations composition corresponds to a
   frame transform convention,
   the application order will be reversed. So keeping the exact same
   meaning of all r1, r2, u, v, w
   and  comp as above, comp could also be computed as
   comp = r1.compose(r2, RotationConvention.FRAME_TRANSFORM).

  r - rotation to apply the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation`
  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: a new rotation which is the composition of r by the instance - `org.apache.commons.math4.geometry.euclidean.threed.FieldRotation<T>`"
  (^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation [^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.FieldRotation r ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.compose r convention))))

(defn get-angles
  "Get the Cardan or Euler angles corresponding to the instance.

   The equations show that each rotation can be defined by two
   different values of the Cardan or Euler angles set. For example
   if Cardan angles are used, the rotation defined by the angles
   a1, a2 and a3 is the same as
   the rotation defined by the angles π  a1, π
   - a2 and π  a3. This method implements
   the following arbitrary choices:

     for Cardan angles, the chosen set is the one for which the
     second angle is between -π/2 and π/2 (i.e its cosine is
     positive),
     for Euler angles, the chosen set is the one for which the
     second angle is between 0 and π (i.e its sine is positive).


   Cardan and Euler angle have a very disappointing drawback: all
   of them have singularities. This means that if the instance is
   too close to the singularities corresponding to the given
   rotation order, it will be impossible to retrieve the angles. For
   Cardan angles, this is often called gimbal lock. There is
   nothing to do to prevent this, it is an intrinsic problem
   with Cardan and Euler representation (but not a problem with the
   rotation itself, which is perfectly well defined). For Cardan
   angles, singularities occur when the second angle is close to
   -π/2 or π/2, for Euler angle singularities occur when the
   second angle is close to 0 or π, this implies that the identity
   rotation is always singular for Euler angles!

  order - rotation order to use - `org.apache.commons.math4.geometry.euclidean.threed.RotationOrder`
  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: an array of three angles, in the order specified by the set - `T[]`

  throws: org.apache.commons.math4.geometry.euclidean.threed.CardanEulerSingularityException - if the rotation is singular with respect to the angles set specified"
  ([^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationOrder order ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.getAngles order convention)))
  ([^FieldRotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationOrder order]
    (-> this (.getAngles order))))

(defn to-rotation
  "Convert to a constant vector without derivatives.

  returns: a constant vector - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Rotation [^FieldRotation this]
    (-> this (.toRotation))))

(defn get-q-2
  "Get the second coordinate of the vectorial part of the quaternion.

  returns: second coordinate of the vectorial part of the quaternion - `T`"
  ([^FieldRotation this]
    (-> this (.getQ2))))

(defn get-matrix
  "Get the 3X3 matrix corresponding to the instance

  returns: the matrix corresponding to the instance - `T[][]`"
  ([^FieldRotation this]
    (-> this (.getMatrix))))

