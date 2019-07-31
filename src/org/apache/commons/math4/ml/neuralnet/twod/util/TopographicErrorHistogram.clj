(ns org.apache.commons.math4.ml.neuralnet.twod.util.TopographicErrorHistogram
  "Computes the topographic error histogram.
  Each bin will contain the number of data for which the first and
  second best matching units are not adjacent in the map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util TopographicErrorHistogram]))

(defn ->topographic-error-histogram
  "Constructor.

  relative-count - Whether to compute relative bin counts. If true, the data count in each bin will be divided by the total number of samples mapped to the neuron represented by that bin. - `boolean`
  distance - Distance. - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^TopographicErrorHistogram [^Boolean relative-count ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (new TopographicErrorHistogram relative-count distance)))

(defn compute-image
  "Creates an image of the data metrics when represented by the
   map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  data - Data. - `java.lang.Iterable`

  returns: a 2D-array (in row major order) representing the metrics. - `double[][]`"
  ([^TopographicErrorHistogram this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^java.lang.Iterable data]
    (-> this (.computeImage map data))))

