(ns org.apache.commons.math4.stat.descriptive.WeightedEvaluation
  "Weighted evaluation for statistics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive WeightedEvaluation]))

(defn evaluate
  "Returns the result of evaluating the statistic over the specified entries
   in the input array, using corresponding entries in the supplied weights array.

  values - the input array - `double[]`
  weights - array of weights - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  returns: the value of the weighted statistic applied to the included array entries - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if either array is null, lengths do not match, indices are invalid, weights contain NaN, negative or infinite values, or weights does not include at least on positive value"
  (^Double [^WeightedEvaluation this values weights ^Integer begin ^Integer length]
    (-> this (.evaluate values weights begin length)))
  (^Double [^WeightedEvaluation this values weights]
    (-> this (.evaluate values weights))))

