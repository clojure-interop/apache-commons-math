(ns org.apache.commons.math4.util.MathArrays$Function
  "Real-valued function that operate on an array or a part of it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MathArrays$Function]))

(defn evaluate
  "Operates on an entire array.

  array - Array to operate on. - `double[]`

  returns: the result of the operation. - `double`"
  (^Double [^MathArrays$Function this array]
    (-> this (.evaluate array)))
  (^Double [^MathArrays$Function this array ^Integer start-index ^Integer num-elements]
    (-> this (.evaluate array start-index num-elements))))

