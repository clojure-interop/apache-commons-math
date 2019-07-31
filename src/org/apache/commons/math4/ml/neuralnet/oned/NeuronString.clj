(ns org.apache.commons.math4.ml.neuralnet.oned.NeuronString
  "Neural network with the topology of a one-dimensional line.
  Each neuron defines one point on the line."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.oned NeuronString]))

(defn ->neuron-string
  "Constructor.

  Creates a one-dimensional network:
   Each neuron not located on the border of the mesh has two
   neurons linked to it.

   The links are bi-directional.
   Neurons created successively are neighbours (i.e. there are
   links between them).

   The topology of the network can also be a circle (if the
   dimension is wrapped).

  num - Number of neurons. - `int`
  wrap - Whether to wrap the dimension (i.e the first and last neurons will be linked together). - `boolean`
  feature-init - Arrays that will initialize the features sets of the network's neurons. - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer[]`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if num < 2."
  (^NeuronString [^Integer num ^Boolean wrap feature-init]
    (new NeuronString num wrap feature-init)))

(defn get-network
  "Retrieves the underlying network.
   A reference is returned (enabling, for example, the network to be
   trained).
   This also implies that calling methods that modify the Network
   topology may cause this class to become inconsistent.

  returns: the network. - `org.apache.commons.math4.ml.neuralnet.Network`"
  (^org.apache.commons.math4.ml.neuralnet.Network [^NeuronString this]
    (-> this (.getNetwork))))

(defn get-size
  "Gets the number of neurons.

  returns: the number of neurons. - `int`"
  (^Integer [^NeuronString this]
    (-> this (.getSize))))

(defn get-features
  "Retrieves the features set from the neuron at location
   i in the map.

  i - Neuron index. - `int`

  returns: the features of the neuron at index i. - `double[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if i is out of range."
  ([^NeuronString this ^Integer i]
    (-> this (.getFeatures i))))

