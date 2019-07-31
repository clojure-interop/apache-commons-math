(ns org.apache.commons.math4.ml.neuralnet.twod.util.LocationFinder
  "Helper class to find the grid coordinates of a neuron."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util LocationFinder]))

(defn ->location-finder
  "Constructor.

  Builds a finder to retrieve the locations of neurons that
   belong to the given map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if the network contains non-unique identifiers. This indicates an inconsistent state due to a bug in the construction code of the underlying network."
  (^LocationFinder [^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map]
    (new LocationFinder map)))

(defn get-location
  "Retrieves a neuron's grid coordinates.

  n - Neuron. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  returns: the (row, column) coordinates of n, or null
   if no such neuron belongs to the map used to build this instance. - `org.apache.commons.math4.ml.neuralnet.twod.util.LocationFinder$Location`"
  (^org.apache.commons.math4.ml.neuralnet.twod.util.LocationFinder$Location [^LocationFinder this ^org.apache.commons.math4.ml.neuralnet.Neuron n]
    (-> this (.getLocation n))))

