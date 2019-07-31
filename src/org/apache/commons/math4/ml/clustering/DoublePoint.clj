(ns org.apache.commons.math4.ml.clustering.DoublePoint
  "A simple implementation of Clusterable for points with double coordinates."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering DoublePoint]))

(defn ->double-point
  "Constructor.

  Build an instance wrapping an double array.

   The wrapped array is referenced, it is not copied.

  point - the n-dimensional point in double space - `double[]`"
  (^DoublePoint [point]
    (new DoublePoint point)))

(defn get-point
  "Gets the n-dimensional point.

  returns: the point array - `double[]`"
  ([^DoublePoint this]
    (-> this (.getPoint))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DoublePoint this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DoublePoint this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DoublePoint this]
    (-> this (.toString))))

