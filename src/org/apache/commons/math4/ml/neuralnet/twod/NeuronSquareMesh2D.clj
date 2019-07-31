(ns org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D
  "Neural network with the topology of a two-dimensional surface.
  Each neuron defines one surface element.

  This network is primarily intended to represent a

   Self Organizing Feature Map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod NeuronSquareMesh2D]))

(defn ->neuron-square-mesh-2-d
  "Constructor.

  Creates a two-dimensional network composed of square cells:
   Each neuron not located on the border of the mesh has four
   neurons linked to it.

   The links are bi-directional.

   The topology of the network can also be a cylinder (if one
   of the dimensions is wrapped) or a torus (if both dimensions
   are wrapped).

  num-rows - Number of neurons in the first dimension. - `int`
  wrap-row-dim - Whether to wrap the first dimension (i.e the first and last neurons will be linked together). - `boolean`
  num-cols - Number of neurons in the second dimension. - `int`
  wrap-col-dim - Whether to wrap the second dimension (i.e the first and last neurons will be linked together). - `boolean`
  neighbourhood-type - Neighbourhood type. - `org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood`
  feature-init - Array of functions that will initialize the corresponding element of the features set of each newly created neuron. In particular, the size of this array defines the size of feature set. - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer[]`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if numRows < 2 or numCols < 2."
  (^NeuronSquareMesh2D [^Integer num-rows ^Boolean wrap-row-dim ^Integer num-cols ^Boolean wrap-col-dim ^org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood neighbourhood-type feature-init]
    (new NeuronSquareMesh2D num-rows wrap-row-dim num-cols wrap-col-dim neighbourhood-type feature-init)))

(defn copy
  "Performs a deep copy of this instance.
   Upon return, the copied and original instances will be independent:
   Updating one will not affect the other.

  returns: a new instance with the same state as this instance. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`"
  (^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D [^NeuronSquareMesh2D this]
    (-> this (.copy))))

(defn iterator
  "returns: `java.util.Iterator<org.apache.commons.math4.ml.neuralnet.Neuron>`"
  (^java.util.Iterator [^NeuronSquareMesh2D this]
    (-> this (.iterator))))

(defn get-network
  "Retrieves the underlying network.
   A reference is returned (enabling, for example, the network to be
   trained).
   This also implies that calling methods that modify the Network
   topology may cause this class to become inconsistent.

  returns: the network. - `org.apache.commons.math4.ml.neuralnet.Network`"
  (^org.apache.commons.math4.ml.neuralnet.Network [^NeuronSquareMesh2D this]
    (-> this (.getNetwork))))

(defn get-number-of-rows
  "Gets the number of neurons in each row of this map.

  returns: the number of rows. - `int`"
  (^Integer [^NeuronSquareMesh2D this]
    (-> this (.getNumberOfRows))))

(defn get-number-of-columns
  "Gets the number of neurons in each column of this map.

  returns: the number of column. - `int`"
  (^Integer [^NeuronSquareMesh2D this]
    (-> this (.getNumberOfColumns))))

(defn get-neuron
  "Retrieves the requested neuron relative to the given (row, col)
   position.
   The neuron at position (0, 0) is located at the upper-left
   corner of the map.

  row - Row index. - `int`
  col - Column index. - `int`
  along-row-dir - Direction along the given row (i.e. an offset will be added to the given column index. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection`
  along-col-dir - Direction along the given col (i.e. an offset will be added to the given row index. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection`

  returns: the neuron at the requested location, or null if
   the location is not on the map. - `org.apache.commons.math4.ml.neuralnet.Neuron`"
  (^org.apache.commons.math4.ml.neuralnet.Neuron [^NeuronSquareMesh2D this ^Integer row ^Integer col ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection along-row-dir ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection along-col-dir]
    (-> this (.getNeuron row col along-row-dir along-col-dir)))
  (^org.apache.commons.math4.ml.neuralnet.Neuron [^NeuronSquareMesh2D this ^Integer i ^Integer j]
    (-> this (.getNeuron i j))))

