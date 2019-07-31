(ns org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction
  "Provides the network neighbourhood's size as a function of the
  number of calls already performed during the learning task.
  The \"neighbourhood\" is the set of neurons that can be reached
  by traversing at most the number of links returned by this
  function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm NeighbourhoodSizeFunction]))

(defn value
  "Computes the neighbourhood size at the current call.

  num-call - Current step of the training task. - `long`

  returns: the value of the function at numCall. - `int`"
  (^Integer [^NeighbourhoodSizeFunction this ^Long num-call]
    (-> this (.value num-call))))

