(ns org.apache.commons.math4.stat.descriptive.moment.VectorialMean
  "Returns the arithmetic mean of the available vectors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment VectorialMean]))

(defn ->vectorial-mean
  "Constructor.

  Constructs a VectorialMean.

  dimension - vectors dimension - `int`"
  (^VectorialMean [^Integer dimension]
    (new VectorialMean dimension)))

(defn increment
  "Add a new vector to the sample.

  v - vector to add - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the vector does not have the right dimension"
  ([^VectorialMean this v]
    (-> this (.increment v))))

(defn get-result
  "Get the mean vector.

  returns: mean vector - `double[]`"
  ([^VectorialMean this]
    (-> this (.getResult))))

(defn get-n
  "Get the number of vectors in the sample.

  returns: number of vectors in the sample - `long`"
  (^Long [^VectorialMean this]
    (-> this (.getN))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VectorialMean this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VectorialMean this ^java.lang.Object obj]
    (-> this (.equals obj))))

