(ns org.apache.commons.math4.geometry.euclidean.threed.RotationConvention
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed RotationConvention]))

(def VECTOR_OPERATOR
  "Enum Constant.

  Constant for rotation that have the semantics of a vector operator.

   According to this convention, the rotation moves vectors with respect
   to a fixed reference frame.


   This means that if we define rotation r is a 90 degrees rotation around
   the Z axis, the image of vector Vector3D.PLUS_I would be
   Vector3D.PLUS_J, the image of vector Vector3D.PLUS_J
   would be Vector3D.MINUS_I, the image of vector Vector3D.PLUS_K
   would be Vector3D.PLUS_K, and the image of vector with coordinates (1, 2, 3)
   would be vector (-2, 1, 3). This means that the vector rotates counterclockwise.


   This convention was the only one supported by Apache Commons Math up to version 3.5.


   The difference with FRAME_TRANSFORM is only the semantics of the sign
   of the angle. It is always possible to create or use a rotation using either
   convention to really represent a rotation that would have been best created or
   used with the other convention, by changing accordingly the sign of the
   rotation angle. This is how things were done up to version 3.5.

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationConvention"
  RotationConvention/VECTOR_OPERATOR)

(def FRAME_TRANSFORM
  "Enum Constant.

  Constant for rotation that have the semantics of a frame conversion.

   According to this convention, the rotation considered vectors to be fixed,
   but their coordinates change as they are converted from an initial frame to
   a destination frame rotated with respect to the initial frame.


   This means that if we define rotation r is a 90 degrees rotation around
   the Z axis, the image of vector Vector3D.PLUS_I would be
   Vector3D.MINUS_J, the image of vector Vector3D.PLUS_J
   would be Vector3D.PLUS_I, the image of vector Vector3D.PLUS_K
   would be Vector3D.PLUS_K, and the image of vector with coordinates (1, 2, 3)
   would be vector (2, -1, 3). This means that the coordinates of the vector rotates
   clockwise, because they are expressed with respect to a destination frame that is rotated
   counterclockwise.


   The difference with VECTOR_OPERATOR is only the semantics of the sign
   of the angle. It is always possible to create or use a rotation using either
   convention to really represent a rotation that would have been best created or
   used with the other convention, by changing accordingly the sign of the
   rotation angle. This is how things were done up to version 3.5.

  type: org.apache.commons.math4.geometry.euclidean.threed.RotationConvention"
  RotationConvention/FRAME_TRANSFORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RotationConvention c : RotationConvention.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention[]`"
  ([]
    (RotationConvention/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.geometry.euclidean.threed.RotationConvention`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.geometry.euclidean.threed.RotationConvention [^java.lang.String name]
    (RotationConvention/valueOf name)))

