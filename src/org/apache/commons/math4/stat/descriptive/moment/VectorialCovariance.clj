(ns org.apache.commons.math4.stat.descriptive.moment.VectorialCovariance
  "Returns the covariance matrix of the available vectors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment VectorialCovariance]))

(defn ->vectorial-covariance
  "Constructor.

  Constructs a VectorialCovariance.

  dimension - vectors dimension - `int`
  is-bias-corrected - if true, computed the unbiased sample covariance, otherwise computes the biased population covariance - `boolean`"
  (^VectorialCovariance [^Integer dimension ^Boolean is-bias-corrected]
    (new VectorialCovariance dimension is-bias-corrected)))

(defn increment
  "Add a new vector to the sample.

  v - vector to add - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the vector does not have the right dimension"
  ([^VectorialCovariance this v]
    (-> this (.increment v))))

(defn get-result
  "Get the covariance matrix.

  returns: covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^VectorialCovariance this]
    (-> this (.getResult))))

(defn get-n
  "Get the number of vectors in the sample.

  returns: number of vectors in the sample - `long`"
  (^Long [^VectorialCovariance this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^VectorialCovariance this]
    (-> this (.clear))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VectorialCovariance this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VectorialCovariance this ^java.lang.Object obj]
    (-> this (.equals obj))))

