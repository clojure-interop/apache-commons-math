(ns org.apache.commons.math4.transform.FastFourierTransformer
  "Implements the Fast Fourier Transform for transformation of one-dimensional
  real or complex data sets. For reference, see Applied Numerical Linear
  Algebra, ISBN 0898713897, chapter 6.

  There are several variants of the discrete Fourier transform, with various
  normalization conventions, which are specified by the parameter
  DftNormalization.

  The current implementation of the discrete Fourier transform as a fast
  Fourier transform requires the length of the data set to be a power of 2.
  This greatly simplifies and speeds up the code. Users can pad the data with
  zeros to meet this requirement. There are other flavors of FFT, for
  reference, see S. Winograd,
  On computing the discrete Fourier transform, Mathematics of
  Computation, 32 (1978), 175 - 199."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform FastFourierTransformer]))

(defn ->fast-fourier-transformer
  "Constructor.

  Creates a new instance of this class, with various normalization
   conventions.

  normalization - the type of normalization to be applied to the transformed data - `org.apache.commons.math4.transform.DftNormalization`"
  (^FastFourierTransformer [^org.apache.commons.math4.transform.DftNormalization normalization]
    (new FastFourierTransformer normalization)))

(defn *transform-in-place
  "Computes the standard transform of the specified complex data. The
   computation is done in place. The input data is laid out as follows

     dataRI[0][i] is the real part of the i-th data point,
     dataRI[1][i] is the imaginary part of the i-th data point.

  data-ri - the two dimensional array of real and imaginary parts of the data - `double[][]`
  normalization - the normalization to be applied to the transformed data - `org.apache.commons.math4.transform.DftNormalization`
  type - the type of transform (forward, inverse) to be performed - `org.apache.commons.math4.transform.TransformType`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of rows of the specified array is not two, or the array is not rectangular"
  ([data-ri ^org.apache.commons.math4.transform.DftNormalization normalization ^org.apache.commons.math4.transform.TransformType type]
    (FastFourierTransformer/transformInPlace data-ri normalization type)))

(defn transform
  "Returns the (forward, inverse) transform of the specified real function,
   sampled on the specified interval.

  f - the function to be sampled and transformed - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - the (inclusive) lower bound for the interval - `double`
  max - the (exclusive) upper bound for the interval - `double`
  n - the number of sample points - `int`
  type - the type of transform (forward, inverse) to be performed - `org.apache.commons.math4.transform.TransformType`

  returns: the complex transformed array - `org.apache.commons.math4.complex.Complex[]`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the lower bound is greater than, or equal to the upper bound"
  ([^FastFourierTransformer this ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f min max n type)))
  ([^FastFourierTransformer this f ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f type))))

