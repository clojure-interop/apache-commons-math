(ns org.apache.commons.math4.transform.DstNormalization
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform DstNormalization]))

(def STANDARD_DST_I
  "Enum Constant.

  Should be passed to the constructor of FastSineTransformer to
   use the standard normalization convention. The standard DST-I
   normalization convention is defined as follows

   forward transform: yn = ∑k=0N-1
   xk sin(π nk / N),
   inverse transform: xk = (2 / N)
   ∑n=0N-1 yn sin(π nk / N),

   where N is the size of the data sample, and x0 = 0.

  type: org.apache.commons.math4.transform.DstNormalization"
  DstNormalization/STANDARD_DST_I)

(def ORTHOGONAL_DST_I
  "Enum Constant.

  Should be passed to the constructor of FastSineTransformer to
   use the orthogonal normalization convention. The orthogonal
   DCT-I normalization convention is defined as follows

   Forward transform: yn = √(2 / N)
   ∑k=0N-1 xk sin(π nk / N),
   Inverse transform: xk = √(2 / N)
   ∑n=0N-1 yn sin(π nk / N),

   which makes the transform orthogonal. N is the size of the data sample,
   and x0 = 0.

  type: org.apache.commons.math4.transform.DstNormalization"
  DstNormalization/ORTHOGONAL_DST_I)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DstNormalization c : DstNormalization.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.transform.DstNormalization[]`"
  ([]
    (DstNormalization/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.transform.DstNormalization`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.transform.DstNormalization [^java.lang.String name]
    (DstNormalization/valueOf name)))

