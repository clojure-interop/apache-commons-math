(ns org.apache.commons.math4.random.RandomVectorGenerator
  "This interface represents a random generator for whole vectors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random RandomVectorGenerator]))

(defn next-vector
  "Generate a random vector.

  returns: a random vector as an array of double. - `double[]`"
  ([^RandomVectorGenerator this]
    (-> this (.nextVector))))

