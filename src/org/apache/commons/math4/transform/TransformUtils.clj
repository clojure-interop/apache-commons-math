(ns org.apache.commons.math4.transform.TransformUtils
  "Useful functions for the implementation of various transforms."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform TransformUtils]))

(defn *scale-array
  "Multiply every component in the given real array by the
   given real number. The change is made in place.

  f - the real array to be scaled - `double[]`
  d - the real scaling coefficient - `double`

  returns: a reference to the scaled array - `double[]`"
  ([f ^Double d]
    (TransformUtils/scaleArray f d)))

(defn *create-real-imaginary-array
  "Builds a new two dimensional array of double filled with the real
   and imaginary parts of the specified Complex numbers. In the
   returned array dataRI, the data is laid out as follows

   dataRI[0][i] = dataC[i].getReal(),
   dataRI[1][i] = dataC[i].getImaginary().

  data-c - the array of Complex data to be transformed - `org.apache.commons.math4.complex.Complex[]`

  returns: a two dimensional array filled with the real and imaginary parts
     of the specified complex input - `double[][]`"
  ([data-c]
    (TransformUtils/createRealImaginaryArray data-c)))

(defn *create-complex-array
  "Builds a new array of Complex from the specified two dimensional
   array of real and imaginary parts. In the returned array dataC,
   the data is laid out as follows

   dataC[i].getReal() = dataRI[0][i],
   dataC[i].getImaginary() = dataRI[1][i].

  data-ri - the array of real and imaginary parts to be transformed - `double[][]`

  returns: an array of Complex with specified real and imaginary parts. - `org.apache.commons.math4.complex.Complex[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of rows of the specified array is not two, or the array is not rectangular"
  ([data-ri]
    (TransformUtils/createComplexArray data-ri)))

(defn *exact-log-2
  "Returns the base-2 logarithm of the specified int. Throws an
   exception if n is not a power of two.

  n - the int whose base-2 logarithm is to be evaluated - `int`

  returns: the base-2 logarithm of n - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if n is not a power of two"
  (^Integer [^Integer n]
    (TransformUtils/exactLog2 n)))

