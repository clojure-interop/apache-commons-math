(ns org.apache.commons.math4.transform.RealTransformer
  "Interface for one-dimensional data sets transformations producing real results.

  Such transforms include sine transform,
  cosine transform or Hadamard transform. Fourier transform is of a different kind and does not implement this
  interface since it produces Complex
  results instead of real ones."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform RealTransformer]))

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
  ([^RealTransformer this ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f min max n type)))
  ([^RealTransformer this f ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f type))))

