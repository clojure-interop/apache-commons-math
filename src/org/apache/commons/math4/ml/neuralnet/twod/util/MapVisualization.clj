(ns org.apache.commons.math4.ml.neuralnet.twod.util.MapVisualization
  "Interface for algorithms that compute some property of a 2D-map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util MapVisualization]))

(defn compute-image
  "Creates an image of the map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`

  returns: a 2D-array (in row major order) representing the property. - `double[][]`"
  ([^MapVisualization this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map]
    (-> this (.computeImage map))))

