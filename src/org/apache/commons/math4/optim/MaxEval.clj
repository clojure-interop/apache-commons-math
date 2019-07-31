(ns org.apache.commons.math4.optim.MaxEval
  "Maximum number of evaluations of the function to be optimized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim MaxEval]))

(defn ->max-eval
  "Constructor.

  max - Allowed number of evalutations. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if max <= 0."
  (^MaxEval [^Integer max]
    (new MaxEval max)))

(defn *unlimited
  "Factory method that creates instance of this class that represents
   a virtually unlimited number of evaluations.

  returns: a new instance suitable for allowing Integer.MAX_VALUE
   evaluations. - `org.apache.commons.math4.optim.MaxEval`"
  (^org.apache.commons.math4.optim.MaxEval []
    (MaxEval/unlimited )))

(defn get-max-eval
  "Gets the maximum number of evaluations.

  returns: the allowed number of evaluations. - `int`"
  (^Integer [^MaxEval this]
    (-> this (.getMaxEval))))

