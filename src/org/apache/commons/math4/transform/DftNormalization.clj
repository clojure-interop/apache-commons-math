(ns org.apache.commons.math4.transform.DftNormalization
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform DftNormalization]))

(def STANDARD
  "Enum Constant.

  Should be passed to the constructor of FastFourierTransformer
   to use the standard normalization convention. This normalization
   convention is defined as follows

   forward transform: yn = ∑k=0N-1
   xk exp(-2πi n k / N),
   inverse transform: xk = N-1
   ∑n=0N-1 yn exp(2πi n k / N),

   where N is the size of the data sample.

  type: org.apache.commons.math4.transform.DftNormalization"
  DftNormalization/STANDARD)

(def UNITARY
  "Enum Constant.

  Should be passed to the constructor of FastFourierTransformer
   to use the unitary normalization convention. This normalization
   convention is defined as follows

   forward transform: yn = (1 / √N)
   ∑k=0N-1 xk
   exp(-2πi n k / N),
   inverse transform: xk = (1 / √N)
   ∑n=0N-1 yn exp(2πi n k / N),

   which makes the transform unitary. N is the size of the data sample.

  type: org.apache.commons.math4.transform.DftNormalization"
  DftNormalization/UNITARY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DftNormalization c : DftNormalization.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.transform.DftNormalization[]`"
  ([]
    (DftNormalization/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.transform.DftNormalization`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.transform.DftNormalization [^java.lang.String name]
    (DftNormalization/valueOf name)))

