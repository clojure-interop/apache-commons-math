(ns org.apache.commons.math4.ml.neuralnet.twod.util.QuantizationError
  "Computes the quantization error histogram.
  Each bin will contain the average of the distances between samples
  mapped to the corresponding unit and the weight vector of that unit."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util QuantizationError]))

(defn ->quantization-error
  "Constructor.

  distance - Distance. - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^QuantizationError [^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (new QuantizationError distance)))

(defn compute-image
  "Creates an image of the data metrics when represented by the
   map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  data - Data. - `java.lang.Iterable`

  returns: a 2D-array (in row major order) representing the metrics. - `double[][]`"
  ([^QuantizationError this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^java.lang.Iterable data]
    (-> this (.computeImage map data))))

