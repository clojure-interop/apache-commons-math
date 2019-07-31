(ns org.apache.commons.math4.ml.neuralnet.Network
  "Neural network, composed of Neuron instances and the links
  between them.

  Although updating a neuron's state is thread-safe, modifying the
  network's topology (adding or removing links) is not."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet Network]))

(defn ->network
  "Constructor.

  initial-identifier - Identifier for the first neuron that will be added to this network. - `long`
  feature-size - Size of the neuron's features. - `int`"
  (^Network [^Long initial-identifier ^Integer feature-size]
    (new Network initial-identifier feature-size)))

(defn get-neighbours
  "Retrieves the neurons in the neighbourhood of any neuron in the
   neurons list.
   The exclude list allows to retrieve the \"concentric\"
   neighbourhoods by removing the neurons that belong to the inner
   \"circles\".

  neurons - Neurons for which to retrieve the neighbours. - `java.lang.Iterable`
  exclude - Neurons to exclude from the returned list. Can be null. - `java.lang.Iterable`

  returns: the list of neighbours. - `java.util.Collection<org.apache.commons.math4.ml.neuralnet.Neuron>`"
  (^java.util.Collection [^Network this ^java.lang.Iterable neurons ^java.lang.Iterable exclude]
    (-> this (.getNeighbours neurons exclude)))
  (^java.util.Collection [^Network this ^java.lang.Iterable neurons]
    (-> this (.getNeighbours neurons))))

(defn get-features-size
  "Gets the size of the neurons' features set.

  returns: the size of the features set. - `int`"
  (^Integer [^Network this]
    (-> this (.getFeaturesSize))))

(defn create-neuron
  "Creates a neuron and assigns it a unique identifier.

  features - Initial values for the neuron's features. - `double[]`

  returns: the neuron's identifier. - `long`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of features is different from the expected size (as set by the constructor)."
  (^Long [^Network this features]
    (-> this (.createNeuron features))))

(defn copy
  "Performs a deep copy of this instance.
   Upon return, the copied and original instances will be independent:
   Updating one will not affect the other.

  returns: a new instance with the same state as this instance. - `org.apache.commons.math4.ml.neuralnet.Network`"
  (^org.apache.commons.math4.ml.neuralnet.Network [^Network this]
    (-> this (.copy))))

(defn delete-neuron
  "Deletes a neuron.
   Links from all neighbours to the removed neuron will also be
   deleted.

  neuron - Neuron to be removed from this network. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  throws: java.util.NoSuchElementException - if n does not belong to this network."
  ([^Network this ^org.apache.commons.math4.ml.neuralnet.Neuron neuron]
    (-> this (.deleteNeuron neuron))))

(defn add-link
  "Adds a link from neuron a to neuron b.
   Note: the link is not bi-directional; if a bi-directional link is
   required, an additional call must be made with a and
   b exchanged in the argument list.

  a - Neuron. - `org.apache.commons.math4.ml.neuralnet.Neuron`
  b - Neuron. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  throws: java.util.NoSuchElementException - if the neurons do not exist in the network."
  ([^Network this ^org.apache.commons.math4.ml.neuralnet.Neuron a ^org.apache.commons.math4.ml.neuralnet.Neuron b]
    (-> this (.addLink a b))))

(defn iterator
  "returns: `java.util.Iterator<org.apache.commons.math4.ml.neuralnet.Neuron>`"
  (^java.util.Iterator [^Network this]
    (-> this (.iterator))))

(defn get-neuron
  "Retrieves the neuron with the given (unique) id.

  id - Identifier. - `long`

  returns: the neuron associated with the given id. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  throws: java.util.NoSuchElementException - if the neuron does not exist in the network."
  (^org.apache.commons.math4.ml.neuralnet.Neuron [^Network this ^Long id]
    (-> this (.getNeuron id))))

(defn delete-link
  "Deletes the link between neurons a and b.

  a - Neuron. - `org.apache.commons.math4.ml.neuralnet.Neuron`
  b - Neuron. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  throws: java.util.NoSuchElementException - if the neurons do not exist in the network."
  ([^Network this ^org.apache.commons.math4.ml.neuralnet.Neuron a ^org.apache.commons.math4.ml.neuralnet.Neuron b]
    (-> this (.deleteLink a b))))

(defn get-neurons
  "Creates a list of the neurons, sorted in a custom order.

  comparator - Comparator used for sorting the neurons. - `java.util.Comparator`

  returns: a list of neurons, sorted in the order prescribed by the
   given comparator. - `java.util.Collection<org.apache.commons.math4.ml.neuralnet.Neuron>`"
  (^java.util.Collection [^Network this ^java.util.Comparator comparator]
    (-> this (.getNeurons comparator))))

