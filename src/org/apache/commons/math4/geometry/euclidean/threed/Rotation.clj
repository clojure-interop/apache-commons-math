(ns org.apache.commons.math4.geometry.euclidean.threed.Rotation
  "This class implements rotations in a three-dimensional space.

  Rotations can be represented by several different mathematical
  entities (matrices, axe and angle, Cardan or Euler angles,
  quaternions). This class presents an higher level abstraction, more
  user-oriented and hiding this implementation details. Well, for the
  curious, we use quaternions for the internal representation. The
  user can build a rotation from any of these representations, and
  any of these representations can be retrieved from a
  Rotation instance (see the various constructors and
  getters). In addition, a rotation can also be built implicitly
  from a set of vectors and their image.
  This implies that this class can be used to convert from one
  representation to another one. For example, converting a rotation
  matrix into a set of Cardan angles from can be done using the
  following single line of code:


  double[] angles = new Rotation(matrix, 1.0e-10).getAngles(RotationOrder.XYZ);
  Focus is oriented on what a rotation do rather than on its
  underlying representation. Once it has been built, and regardless of its
  internal representation, a rotation is an operator which basically
  transforms three dimensional vectors into other three
  dimensional vectors. Depending on the application, the
  meaning of these vectors may vary and the semantics of the rotation also.
  For example in an spacecraft attitude simulation tool, users will often
  consider the vectors are fixed (say the Earth direction for example) and the
  frames change. The rotation transforms the coordinates of the vector in inertial
  frame into the coordinates of the same vector in satellite frame. In this
  case, the rotation implicitly defines the relation between the two frames.
  Another example could be a telescope control application, where the rotation
  would transform the sighting direction at rest into the desired observing
  direction when the telescope is pointed towards an object of interest. In this
  case the rotation transforms the direction at rest in a topocentric frame
  into the sighting direction in the same topocentric frame. This implies in this
  case the frame is fixed and the vector moves.
  In many case, both approaches will be combined. In our telescope example,
  we will probably also need to transform the observing direction in the topocentric
  frame into the observing direction in inertial frame taking into account the observatory
  location and the Earth rotation, which would essentially be an application of the
  first approach.

  These examples show that a rotation is what the user wants it to be. This
  class does not push the user towards one specific definition and hence does not
  provide methods like projectVectorIntoDestinationFrame or
  computeTransformedDirection. It provides simpler and more generic
  methods: applyTo(Vector3D) and applyInverseTo(Vector3D).

  Since a rotation is basically a vectorial operator, several rotations can be
  composed together and the composite operation r = r1 o
  r2 (which means that for each vector u,
  r(u) = r1(r2(u))) is also a rotation. Hence
  we can consider that in addition to vectors, a rotation can be applied to other
  rotations as well (or to itself). With our previous notations, we would say we
  can apply r1 to r2 and the result
  we get is r = r1 o r2. For this purpose, the
  class provides the methods: applyTo(Rotation) and
  applyInverseTo(Rotation).

  Rotations are guaranteed to be immutable objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed Rotation]))

(defn ->rotation
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

  q-0 - scalar part of the quaternion - `double`
  q-1 - first coordinate of the vectorial part of the quaternion - `double`
  q-2 - second coordinate of the vectorial part of the quaternion - `double`
  q-3 - third coordinate of the vectorial part of the quaternion - `double`
  needs-normalization - if true, the coordinates are considered not to be normalized, a normalization preprocessing step is performed before using them - `boolean`"
  (^Rotation [^Double q-0 ^Double q-1 ^Double q-2 ^Double q-3 ^Boolean needs-normalization]
    (new Rotation q-0 q-1 q-2 q-3 needs-normalization))
  (^Rotation [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u-2 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-1 ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v-2]
    (new Rotation u-1 u-2 v-1 v-2))
  (^Rotation [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D axis ^Double angle ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (new Rotation axis angle convention))
  (^Rotation [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D axis ^Double angle]
    (new Rotation axis angle)))

(def *-identity
  "Static Constant.

  Identity rotation.

  type: org.apache.commons.math4.geometry.euclidean.threed.Rotation"
  Rotation/IDENTITY)

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

  r-1 - first rotation - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`
  r-2 - second rotation - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`

  returns: distance between r1 and r2 - `double`"
  (^Double [^org.apache.commons.math4.geometry.euclidean.threed.Rotation r-1 ^org.apache.commons.math4.geometry.euclidean.threed.Rotation r-2]
    (Rotation/distance r-1 r-2)))

(defn revert
  "Revert a rotation.
   Build a rotation which reverse the effect of another
   rotation. This means that if r(u) = v, then r.revert(v) = u. The
   instance is not changed.

  returns: a new rotation whose effect is the reverse of the effect
   of the instance - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Rotation [^Rotation this]
    (-> this (.revert))))

(defn get-axis
  "Get the normalized axis of the rotation.

   Note that as getAngle() always returns an angle
   between 0 and π, changing the convention changes the
   direction of the axis, not the sign of the angle.

  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: normalized axis of the rotation - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.getAxis convention)))
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Rotation this]
    (-> this (.getAxis))))

(defn get-q-3
  "Get the third coordinate of the vectorial part of the quaternion.

  returns: third coordinate of the vectorial part of the quaternion - `double`"
  (^Double [^Rotation this]
    (-> this (.getQ3))))

(defn apply-inverse-to
  "Apply the inverse of the rotation to a vector stored in an array.

  in - an array with three items which stores vector to rotate - `double[]`
  out - an array with three items to put result to (it can be the same array as in) - `double[]`"
  ([^Rotation this in out]
    (-> this (.applyInverseTo in out)))
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u]
    (-> this (.applyInverseTo u))))

(defn get-q-1
  "Get the first coordinate of the vectorial part of the quaternion.

  returns: first coordinate of the vectorial part of the quaternion - `double`"
  (^Double [^Rotation this]
    (-> this (.getQ1))))

(defn apply-to
  "Apply the rotation to a vector stored in an array.

  in - an array with three items which stores vector to rotate - `double[]`
  out - an array with three items to put result to (it can be the same array as in) - `double[]`"
  ([^Rotation this in out]
    (-> this (.applyTo in out)))
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u]
    (-> this (.applyTo u))))

(defn get-q-0
  "Get the scalar coordinate of the quaternion.

  returns: scalar coordinate of the quaternion - `double`"
  (^Double [^Rotation this]
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

  r - rotation to apply the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`
  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: a new rotation which is the composition of r by the inverse
   of the instance - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Rotation [^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.Rotation r ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.composeInverse r convention))))

(defn get-angle
  "Get the angle of the rotation.

  returns: angle of the rotation (between 0 and π) - `double`"
  (^Double [^Rotation this]
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

  r - rotation to apply the rotation to - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`
  convention - convention to use for the semantics of the angle - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  returns: a new rotation which is the composition of r by the instance - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Rotation [^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.Rotation r ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
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

  returns: an array of three angles, in the order specified by the set - `double[]`

  throws: org.apache.commons.math4.geometry.euclidean.threed.CardanEulerSingularityException - if the rotation is singular with respect to the angles set specified"
  ([^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationOrder order ^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention convention]
    (-> this (.getAngles order convention)))
  ([^Rotation this ^org.apache.commons.math4.geometry.euclidean.threed.RotationOrder order]
    (-> this (.getAngles order))))

(defn get-q-2
  "Get the second coordinate of the vectorial part of the quaternion.

  returns: second coordinate of the vectorial part of the quaternion - `double`"
  (^Double [^Rotation this]
    (-> this (.getQ2))))

(defn get-matrix
  "Get the 3X3 matrix corresponding to the instance

  returns: the matrix corresponding to the instance - `double[][]`"
  ([^Rotation this]
    (-> this (.getMatrix))))

