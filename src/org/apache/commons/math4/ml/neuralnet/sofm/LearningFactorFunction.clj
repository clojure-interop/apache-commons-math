(ns org.apache.commons.math4.ml.neuralnet.sofm.LearningFactorFunction
  "Provides the learning rate as a function of the number of calls
  already performed during the learning task."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm LearningFactorFunction]))

(defn value
  "Computes the learning rate at the current call.

  num-call - Current step of the training task. - `long`

  returns: the value of the function at numCall. - `double`"
  (^Double [^LearningFactorFunction this ^Long num-call]
    (-> this (.value num-call))))

