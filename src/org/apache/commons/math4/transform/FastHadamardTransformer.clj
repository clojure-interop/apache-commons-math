(ns org.apache.commons.math4.transform.FastHadamardTransformer
  "Implements the Fast Hadamard Transform (FHT).
  Transformation of an input vector x to the output vector y.

  In addition to transformation of real vectors, the Hadamard transform can
  transform integer vectors into integer vectors. However, this integer transform
  cannot be inverted directly. Due to a scaling factor it may lead to rational results.
  As an example, the inverse transform of integer vector (0, 1, 0, 1) is rational
  vector (1/2, -1/2, 0, 0)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.transform FastHadamardTransformer]))

(defn ->fast-hadamard-transformer
  "Constructor."
  (^FastHadamardTransformer []
    (new FastHadamardTransformer )))

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
  ([^FastHadamardTransformer this ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f min max n type)))
  ([^FastHadamardTransformer this f ^org.apache.commons.math4.transform.TransformType type]
    (-> this (.transform f type)))
  ([^FastHadamardTransformer this f]
    (-> this (.transform f))))

