(ns org.apache.commons.math4.ml.neuralnet.twod.util.HitHistogram
  "Computes the hit histogram.
  Each bin will contain the number of data for which the corresponding
  neuron is the best matching unit."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util HitHistogram]))

(defn ->hit-histogram
  "Constructor.

  normalize-count - Whether to compute relative bin counts. If true, the data count in each bin will be divided by the total number of samples. - `boolean`
  distance - Distance. - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^HitHistogram [^Boolean normalize-count ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (new HitHistogram normalize-count distance)))

(defn compute-image
  "Creates an image of the data metrics when represented by the
   map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  data - Data. - `java.lang.Iterable`

  returns: a 2D-array (in row major order) representing the metrics. - `double[][]`"
  ([^HitHistogram this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^java.lang.Iterable data]
    (-> this (.computeImage map data))))

