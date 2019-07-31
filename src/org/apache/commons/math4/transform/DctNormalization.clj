(ns org.apache.commons.math4.transform.DctNormalization
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform DctNormalization]))

(def STANDARD_DCT_I
  "Enum Constant.

  Should be passed to the constructor of FastCosineTransformer
   to use the standard normalization convention.  The standard
   DCT-I normalization convention is defined as follows

   forward transform:
   yn = (1/2) [x0  (-1)nxN-1]
    ∑k=1N-2
   xk cos[π nk / (N - 1)],
   inverse transform:
   xk = [1 / (N - 1)] [y0
    (-1)kyN-1]
    [2 / (N - 1)] ∑n=1N-2
   yn cos[π nk / (N - 1)],

   where N is the size of the data sample.

  type: org.apache.commons.math4.transform.DctNormalization"
  DctNormalization/STANDARD_DCT_I)

(def ORTHOGONAL_DCT_I
  "Enum Constant.

  Should be passed to the constructor of FastCosineTransformer
   to use the orthogonal normalization convention. The orthogonal
   DCT-I normalization convention is defined as follows

   forward transform:
   yn = [2(N - 1)]-1/2 [x0
    (-1)nxN-1]
    [2 / (N - 1)]1/2 ∑k=1N-2
   xk cos[π nk / (N - 1)],
   inverse transform:
   xk = [2(N - 1)]-1/2 [y0
    (-1)kyN-1]
    [2 / (N - 1)]1/2 ∑n=1N-2
   yn cos[π nk / (N - 1)],

   which makes the transform orthogonal. N is the size of the data sample.

  type: org.apache.commons.math4.transform.DctNormalization"
  DctNormalization/ORTHOGONAL_DCT_I)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DctNormalization c : DctNormalization.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.transform.DctNormalization[]`"
  ([]
    (DctNormalization/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.transform.DctNormalization`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.transform.DctNormalization [^java.lang.String name]
    (DctNormalization/valueOf name)))

