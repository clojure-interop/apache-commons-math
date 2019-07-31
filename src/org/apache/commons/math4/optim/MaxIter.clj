(ns org.apache.commons.math4.optim.MaxIter
  "Maximum number of iterations performed by an (iterative) algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim MaxIter]))

(defn ->max-iter
  "Constructor.

  max - Allowed number of iterations. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if max <= 0."
  (^MaxIter [^Integer max]
    (new MaxIter max)))

(defn *unlimited
  "Factory method that creates instance of this class that represents
   a virtually unlimited number of iterations.

  returns: a new instance suitable for allowing Integer.MAX_VALUE
   evaluations. - `org.apache.commons.math4.optim.MaxIter`"
  (^org.apache.commons.math4.optim.MaxIter []
    (MaxIter/unlimited )))

(defn get-max-iter
  "Gets the maximum number of evaluations.

  returns: the allowed number of evaluations. - `int`"
  (^Integer [^MaxIter this]
    (-> this (.getMaxIter))))

