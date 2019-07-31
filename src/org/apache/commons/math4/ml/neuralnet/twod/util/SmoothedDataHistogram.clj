(ns org.apache.commons.math4.ml.neuralnet.twod.util.SmoothedDataHistogram
  "Visualization of high-dimensional data projection on a 2D-map.
  The method is described in

   Using Smoothed Data Histograms for Cluster Visualization in Self-Organizing Maps

   by Elias Pampalk, Andreas Rauber and Dieter Merkl."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util SmoothedDataHistogram]))

(defn ->smoothed-data-histogram
  "Constructor.

  smoothing-bins - Number of bins. - `int`
  distance - Distance. - `org.apache.commons.math4.ml.distance.DistanceMeasure`"
  (^SmoothedDataHistogram [^Integer smoothing-bins ^org.apache.commons.math4.ml.distance.DistanceMeasure distance]
    (new SmoothedDataHistogram smoothing-bins distance)))

(defn compute-image
  "Creates an image of the data metrics when represented by the
   map.

  map - Map. - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D`
  data - Data. - `java.lang.Iterable`

  returns: a 2D-array (in row major order) representing the metrics. - `double[][]`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the size of the map is smaller than the number of smoothing bins."
  ([^SmoothedDataHistogram this ^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D map ^java.lang.Iterable data]
    (-> this (.computeImage map data))))

