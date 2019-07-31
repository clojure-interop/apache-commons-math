(ns org.apache.commons.math4.ml.neuralnet.Network$NeuronIdentifierComparator
  "Comparator that prescribes an order of the neurons according
  to the increasing order of their identifier."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet Network$NeuronIdentifierComparator]))

(defn ->neuron-identifier-comparator
  "Constructor."
  (^Network$NeuronIdentifierComparator []
    (new Network$NeuronIdentifierComparator )))

(defn compare
  "a - `org.apache.commons.math4.ml.neuralnet.Neuron`
  b - `org.apache.commons.math4.ml.neuralnet.Neuron`

  returns: `int`"
  (^Integer [^Network$NeuronIdentifierComparator this ^org.apache.commons.math4.ml.neuralnet.Neuron a ^org.apache.commons.math4.ml.neuralnet.Neuron b]
    (-> this (.compare a b))))

