(ns org.apache.commons.math4.ml.neuralnet.twod.util.UnifiedDistanceMatrix
  "U-Matrix
  visualization of high-dimensional data projection."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util UnifiedDistanceMatrix]))

(defn ->unified-distance-matrix
  "Constructor.

  Simple constructor.

  individual-distances - If true, the 8 individual inter-units distances will be computed. They will be stored in additional pixels around each of the original units of the 2D-map. The additional pixels that lie along a \"diagonal\" are shared by two pairs of units: their value will be set to the average distance between the units belonging to each of the pairs. The value zero will be stored in the pixel corresponding to the location of a unit of the 2D-map. If false, only the average distance between a unit and all its neighbours will be computed (and stored in the pixel corresponding to that unit of the 2D-map). In that case, the number of neighbours taken into account depends on the network's neighbourhood type. - `boolean`
  distance - Distance. - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^UnifiedDistanceMatrix [^Boolean individual-distances ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (new UnifiedDistanceMatrix individual-distances distance)))

(defn compute-image
  "Creates an image of the map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`

  returns: a 2D-array (in row major order) representing the property. - `double[][]`"
  ([^UnifiedDistanceMatrix this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map]
    (-> this (.computeImage map))))

