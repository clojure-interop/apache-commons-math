(ns org.apache.commons.math4.ml.neuralnet.FeatureInitializer
  "Defines how to assign the first value of a neuron's feature."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet FeatureInitializer]))

(defn value
  "Selects the initial value.

  returns: the initial value. - `double`"
  (^Double [^FeatureInitializer this]
    (-> this (.value))))

