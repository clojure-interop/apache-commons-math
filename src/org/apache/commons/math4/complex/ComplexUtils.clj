(ns org.apache.commons.math4.complex.ComplexUtils
  "Static implementations of common Complex utilities functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.complex ComplexUtils]))

(defn *complex-2-real
  "Converts a Complex[] array to a double[] array for the
   range start - end by increment.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: array of the real component - `double[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2Real c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2Real c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2Real c range))
  ([c]
    (ComplexUtils/complex2Real c)))

(defn *extract-complex-from-real-array
  "Returns double from array real[] at entry index as a
   Complex.

  real - array of real numbers - `double[]`
  index - location in the array - `int`

  returns: Complex. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [real ^Integer index]
    (ComplexUtils/extractComplexFromRealArray real index)))

(defn *extract-real-from-complex-array
  "Returns real component of Complex from array Complex[] at entry
   index as a double.

  complex - array of complex numbers - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: double. - `double`"
  (^Double [complex ^Integer index]
    (ComplexUtils/extractRealFromComplexArray complex index)))

(defn *arg
  "Returns double[] containing arguments (phase angles) of a
   Complex[] array.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`

  returns: double[] array - `double[]`"
  ([c]
    (ComplexUtils/arg c)))

(defn *split-2-complex
  "Converts a split complex array double[] r, double[] i to a
   Complex[] array.

  real - real component - `double[]`
  imag - imaginary component - `double[]`

  returns: Complex array - `org.apache.commons.math4.complex.Complex[]`"
  ([real imag]
    (ComplexUtils/split2Complex real imag)))

(defn *complex-2-real-float
  "Converts a Complex[] array to a float[] array for the
   range start - end by increment.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: float[] array of the real component - `float[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2RealFloat c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2RealFloat c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2RealFloat c range))
  ([c]
    (ComplexUtils/complex2RealFloat c)))

(defn *extract-interleaved-float-from-complex-array
  "Returns Complex object from array Complex[] at entry
   index as a size 2 float of the form {real, imag}.

  complex - Complex array - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: size 2 float[]. - `float[]`"
  ([complex ^Integer index]
    (ComplexUtils/extractInterleavedFloatFromComplexArray complex index)))

(defn *extract-interleaved-from-complex-array
  "Returns values of Complex object from array Complex[] at entry
   index as a size 2 double of the form {real, imag}.

  complex - array of complex numbers - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: size 2 array. - `double[]`"
  ([complex ^Integer index]
    (ComplexUtils/extractInterleavedFromComplexArray complex index)))

(defn *imaginary-2-complex
  "Converts a double[] array to an imaginary Complex[] array
   for the range start - end by increment.

  imaginary - array of numbers to be converted to their Complex equivalent - `double[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: Complex array - `org.apache.commons.math4.complex.Complex[]`"
  ([imaginary ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/imaginary2Complex imaginary start end increment))
  ([imaginary ^Integer start ^Integer end]
    (ComplexUtils/imaginary2Complex imaginary start end))
  ([imaginary ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/imaginary2Complex imaginary range))
  ([imaginary]
    (ComplexUtils/imaginary2Complex imaginary)))

(defn *extract-complex-from-interleaved-array
  "Returns a Complex object from interleaved double[] array at entry
   index.

  d - array of interleaved complex numbers alternating real and imaginary values - `double[]`
  index - location in the array This is the location by complex number, e.g. index number 5 in the array will return new Complex(d[10], d[11]) - `int`

  returns: Complex. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [d ^Integer index]
    (ComplexUtils/extractComplexFromInterleavedArray d index)))

(defn *extract-imaginary-from-complex-array
  "Returns imaginary component of Complex from array Complex[] at
   entry index as a double.

  complex - array of complex numbers - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: double. - `double`"
  (^Double [complex ^Integer index]
    (ComplexUtils/extractImaginaryFromComplexArray complex index)))

(defn *extract-complex-from-imaginary-array
  "Returns double from array imaginary[] at entry index as a
   Complex.

  imaginary - array of imaginary numbers - `double[]`
  index - location in the array - `int`

  returns: Complex array - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [imaginary ^Integer index]
    (ComplexUtils/extractComplexFromImaginaryArray imaginary index)))

(defn *complex-2-interleaved-float
  "Converts a Complex[] array to an interleaved complex
   float[] array for the range start - end by
   increment.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: complex interleaved float[] alternating real and
           imaginary values - `float[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2InterleavedFloat c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2InterleavedFloat c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2InterleavedFloat c range))
  ([c]
    (ComplexUtils/complex2InterleavedFloat c)))

(defn *extract-real-float-from-complex-array
  "Returns real component of array Complex[] at entry index
   as a float.

  complex - array of complex numbers - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: float. - `float`"
  (^Float [complex ^Integer index]
    (ComplexUtils/extractRealFloatFromComplexArray complex index)))

(defn *real-2-complex
  "Converts a double[] array to a Complex[] array for the
   range start - end by increment.

  real - array of numbers to be converted to their Complex equivalent - `double[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: Complex array - `org.apache.commons.math4.complex.Complex[]`"
  ([real ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/real2Complex real start end increment))
  ([real ^Integer start ^Integer end]
    (ComplexUtils/real2Complex real start end))
  ([real ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/real2Complex real range))
  ([real]
    (ComplexUtils/real2Complex real)))

(defn *extract-imaginary-float-from-complex-array
  "Returns imaginary component of array Complex[] at entry
   index as a float.

  complex - array of complex numbers - `org.apache.commons.math4.complex.Complex[]`
  index - location in the array - `int`

  returns: float. - `float`"
  (^Float [complex ^Integer index]
    (ComplexUtils/extractImaginaryFloatFromComplexArray complex index)))

(defn *complex-2-imaginary-float
  "Converts imaginary part of a Complex[] array to a float[]
   array for the range start - end by increment.

  c - Complex array. - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: float[] array of the imaginary component - `float[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2ImaginaryFloat c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2ImaginaryFloat c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2ImaginaryFloat c range))
  ([c]
    (ComplexUtils/complex2ImaginaryFloat c)))

(defn *initialize
  "Initializes a Complex[] array to zero, to avoid
   NullPointerExceptions.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`

  returns: c - `org.apache.commons.math4.complex.Complex[]`"
  ([c]
    (ComplexUtils/initialize c)))

(defn *abs
  "Returns double[] containing absolute values (magnitudes) of a
   Complex[] array.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`

  returns: double[] - `double[]`"
  ([c]
    (ComplexUtils/abs c)))

(defn *complex-2-interleaved
  "Converts a Complex[] array to an interleaved complex
   double[] array for the range start - end by
   increment.

  c - Complex array - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: complex interleaved array alternating real and
           imaginary values - `double[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2Interleaved c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2Interleaved c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2Interleaved c range))
  ([c]
    (ComplexUtils/complex2Interleaved c)))

(defn *interleaved-2-complex
  "Converts a complex interleaved double[] array to a
   Complex[] array for the range start - end by
   increment.

  interleaved - array of numbers to be converted to their Complex equivalent - `double[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: Complex array - `org.apache.commons.math4.complex.Complex[]`"
  ([interleaved ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/interleaved2Complex interleaved start end increment))
  ([interleaved ^Integer start ^Integer end]
    (ComplexUtils/interleaved2Complex interleaved start end))
  ([interleaved ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/interleaved2Complex interleaved range))
  ([interleaved]
    (ComplexUtils/interleaved2Complex interleaved)))

(defn *polar-2-complex
  "Creates a complex number from the given polar representation.

   If either r or theta is NaN, or theta is
   infinite, Complex.NaN is returned.

   If r is infinite and theta is finite, infinite or NaN
   values may be returned in parts of the result, following the rules for
   double arithmetic.



   Examples:

   polar2Complex(INFINITY, \\(\\pi\\)) = INFINITY  INFINITY i
   polar2Complex(INFINITY, 0) = INFINITY  NaN i
   polar2Complex(INFINITY, \\(-\\frac{\\pi}{4}\\)) = INFINITY - INFINITY i
   polar2Complex(INFINITY, \\(5\\frac{\\pi}{4}\\)) = -INFINITY - INFINITY i

  r - the modulus of the complex number to create - `double`
  theta - the argument of the complex number to create - `double`

  returns: Complex - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if r is negative."
  (^org.apache.commons.math4.complex.Complex [^Double r ^Double theta]
    (ComplexUtils/polar2Complex r theta)))

(defn *complex-2-imaginary
  "Converts imaginary part of a Complex[] array to a
   double[] array for the range start - end by
   increment.

  c - Complex array. - `org.apache.commons.math4.complex.Complex[]`
  start - start index - `int`
  end - end index - `int`
  increment - range increment - `int`

  returns: array of the imaginary component - `double[]`"
  ([c ^Integer start ^Integer end ^Integer increment]
    (ComplexUtils/complex2Imaginary c start end increment))
  ([c ^Integer start ^Integer end]
    (ComplexUtils/complex2Imaginary c start end))
  ([c ^org.apache.commons.math4.util.IntegerSequence$Range range]
    (ComplexUtils/complex2Imaginary c range))
  ([c]
    (ComplexUtils/complex2Imaginary c)))

