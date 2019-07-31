(ns org.apache.commons.math4.ml.neuralnet.twod.util.MapDataVisualization
  "Interface for algorithms that compute some metrics of the projection of
  data on a 2D-map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util MapDataVisualization]))

(defn compute-image
  "Creates an image of the data metrics when represented by the
   map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  data - Data. - `java.lang.Iterable`

  returns: a 2D-array (in row major order) representing the metrics. - `double[][]`"
  ([^MapDataVisualization this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^java.lang.Iterable data]
    (-> this (.computeImage map data))))

