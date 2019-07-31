(ns org.apache.commons.math4.transform.FastSineTransformer
  "Implements the Fast Sine Transform for transformation of one-dimensional real
  data sets. For reference, see James S. Walker, Fast Fourier
  Transforms, chapter 3 (ISBN 0849371635).

  There are several variants of the discrete sine transform. The present
  implementation corresponds to DST-I, with various normalization conventions,
  which are specified by the parameter DstNormalization.
  It should be noted that regardless to the convention, the first
  element of the dataset to be transformed must be zero.

  DST-I is equivalent to DFT of an odd extension of the data series.
  More precisely, if x0, …, xN-1 is the data set
  to be sine transformed, the extended data set x0#,
  …, x2N-1# is defined as follows

  x0# = x0 = 0,
  xk# = xk if 1 ≤ k < N,
  xN# = 0,
  xk# = -x2N-k if N  1 ≤ k <
  2N.


  Then, the standard DST-I y0, …, yN-1 of the real
  data set x0, …, xN-1 is equal to half
  of i (the pure imaginary number) times the N first elements of the DFT of the
  extended data set x0#, …,
  x2N-1#
  yn = (i / 2) ∑k=02N-1
  xk# exp[-2πi nk / (2N)]
      k = 0, …, N-1.

  The present implementation of the discrete sine transform as a fast sine
  transform requires the length of the data to be a power of two. Besides,
  it implicitly assumes that the sampled function is odd. In particular, the
  first element of the data set must be 0, which is enforced in
  transform(UnivariateFunction, double, double, int, TransformType),
  after sampling."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform FastSineTransformer]))

(defn ->fast-sine-transformer
  "Constructor.

  Creates a new instance of this class, with various normalization conventions.

  normalization - the type of normalization to be applied to the transformed data - `org.apache.commons.math4.transform.DstNormalization`"
  (^FastSineTransformer [^org.apache.commons.math4.transform.DstNormalization normalization]
    (new FastSineTransformer normalization)))

(defn transform
  "Returns the (forward, inverse) transform of the specified real function,
   sampled on the specified interval.

   This implementation enforces f(x) = 0.0 at x = 0.0.

  f - the function to be sampled and transformed - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - the (inclusive) lower bound for the interval - `double`
  max - the (exclusive) upper bound for the interval - `double`
  n - the number of sample points - `int`
  type - the type of transform (forward, inverse) to be performed - `org.apache.commons.math4.transform.TransformType`

  returns: the real transformed array - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the lower bound is greater than, or equal to the upper bound"
  ([^FastSineTransformer this ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f min max n type)))
  ([^FastSineTransformer this f ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f type))))

