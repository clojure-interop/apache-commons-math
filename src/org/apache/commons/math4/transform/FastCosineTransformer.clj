(ns org.apache.commons.math4.transform.FastCosineTransformer
  "Implements the Fast Cosine Transform for transformation of one-dimensional
  real data sets. For reference, see James S. Walker, Fast Fourier
  Transforms, chapter 3 (ISBN 0849371635).

  There are several variants of the discrete cosine transform. The present
  implementation corresponds to DCT-I, with various normalization conventions,
  which are specified by the parameter DctNormalization.

  DCT-I is equivalent to DFT of an even extension of the data series.
  More precisely, if x0, …, xN-1 is the data set
  to be cosine transformed, the extended data set
  x0#, …, x2N-3#
  is defined as follows

  xk# = xk if 0 ≤ k < N,
  xk# = x2N-2-k
  if N ≤ k < 2N - 2.


  Then, the standard DCT-I y0, …, yN-1 of the real
  data set x0, …, xN-1 is equal to half
  of the N first elements of the DFT of the extended data set
  x0#, …, x2N-3#

  yn = (1 / 2) ∑k=02N-3
  xk# exp[-2πi nk / (2N - 2)]
      k = 0, …, N-1.

  The present implementation of the discrete cosine transform as a fast cosine
  transform requires the length of the data set to be a power of two plus one
  (N = 2n  1). Besides, it implicitly assumes
  that the sampled function is even."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform FastCosineTransformer]))

(defn ->fast-cosine-transformer
  "Constructor.

  Creates a new instance of this class, with various normalization
   conventions.

  normalization - the type of normalization to be applied to the transformed data - `org.apache.commons.math4.transform.DctNormalization`"
  (^FastCosineTransformer [^org.apache.commons.math4.transform.DctNormalization normalization]
    (new FastCosineTransformer normalization)))

(defn transform
  "Returns the (forward, inverse) transform of the specified real function,
   sampled on the specified interval.

  f - the function to be sampled and transformed - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - the (inclusive) lower bound for the interval - `double`
  max - the (exclusive) upper bound for the interval - `double`
  n - the number of sample points - `int`
  type - the type of transform (forward, inverse) to be performed - `org.apache.commons.math4.transform.TransformType`

  returns: the real transformed array - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the lower bound is greater than, or equal to the upper bound"
  ([^FastCosineTransformer this ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f min max n type)))
  ([^FastCosineTransformer this f ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f type))))

