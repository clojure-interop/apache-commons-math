(ns org.apache.commons.math4.ml.neuralnet.MapUtils
  "Utilities for network maps."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet MapUtils]))

(defn *find-best
  "Finds the neuron that best matches the given features.

  features - Data. - `double[]`
  neurons - List of neurons to scan. If the list is empty null will be returned. - `java.lang.Iterable`
  distance - Distance function. The neuron's features are passed as the first argument to DistanceMeasure.compute(double[],double[]). - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the neuron whose features are closest to the given data. - `org.apache.commons.math4.ml.neuralnet.Neuron`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the size of the input is not compatible with the neurons features size."
  (^org.apache.commons.math4.ml.neuralnet.Neuron [features ^java.lang.Iterable neurons ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/findBest features neurons distance)))

(defn *find-best-and-second-best
  "Finds the two neurons that best match the given features.

  features - Data. - `double[]`
  neurons - List of neurons to scan. If the list is empty null will be returned. - `java.lang.Iterable`
  distance - Distance function. The neuron's features are passed as the first argument to DistanceMeasure.compute(double[],double[]). - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the two neurons whose features are closest to the given data. - `org.apache.commons.math4.util.Pair<org.apache.commons.math4.ml.neuralnet.Neuron,org.apache.commons.math4.ml.neuralnet.Neuron>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the size of the input is not compatible with the neurons features size."
  (^org.apache.commons.math4.util.Pair [features ^java.lang.Iterable neurons ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/findBestAndSecondBest features neurons distance)))

(defn *sort
  "Creates a list of neurons sorted in increased order of the distance
   to the given features.

  features - Data. - `double[]`
  neurons - List of neurons to scan. If it is empty, an empty array will be returned. - `java.lang.Iterable`
  distance - Distance function. - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the neurons, sorted in increasing order of distance in data
   space. - `org.apache.commons.math4.ml.neuralnet.Neuron[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the size of the input is not compatible with the neurons features size."
  ([features ^java.lang.Iterable neurons ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/sort features neurons distance)))

(defn *compute-u
  "Computes the
    U-matrix of a two-dimensional map.

  map - Network. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  distance - Function to use for computing the average distance from a neuron to its neighbours. - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the matrix of average distances. - `double[][]`"
  ([^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/computeU map distance)))

(defn *compute-hit-histogram
  "Computes the \"hit\" histogram of a two-dimensional map.

  data - Feature vectors. - `java.lang.Iterable`
  map - Network. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  distance - Function to use for determining the best matching unit. - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the number of hits for each neuron in the map. - `int[][]`"
  ([^java.lang.Iterable data ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/computeHitHistogram data map distance)))

(defn *compute-quantization-error
  "Computes the quantization error.
   The quantization error is the average distance between a feature vector
   and its \"best matching unit\" (closest neuron).

  data - Feature vectors. - `java.lang.Iterable`
  neurons - List of neurons to scan. - `java.lang.Iterable`
  distance - Distance function. - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the error. - `double`

  throws: org.apache.commons.math4.exception.NoDataException - if data is empty."
  (^Double [^java.lang.Iterable data ^java.lang.Iterable neurons ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/computeQuantizationError data neurons distance)))

(defn *compute-topographic-error
  "Computes the topographic error.
   The topographic error is the proportion of data for which first and
   second best matching units are not adjacent in the map.

  data - Feature vectors. - `java.lang.Iterable`
  net - Network. - `org.apache.commons.math4.ml.neuralnet.Network`
  distance - Distance function. - `org.apache.commons.math4.ml.distance.DistanceMeasure`

  returns: the error. - `double`

  throws: org.apache.commons.math4.exception.NoDataException - if data is empty."
  (^Double [^java.lang.Iterable data ^org.apache.commons.math4.ml.neuralnet.Network net ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (MapUtils/computeTopographicError data net distance)))

