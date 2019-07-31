(ns org.apache.commons.math4.geometry.Space
  "This interface represents a generic space, with affine and vectorial counterparts."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry Space]))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Space this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

  returns: n-1 dimension sub-space of this space - `org.apache.commons.math4.geometry.Space`

  throws: org.apache.commons.math4.exception.MathUnsupportedOperationException - for dimension-1 spaces which do not have sub-spaces"
  (^org.apache.commons.math4.geometry.Space [^Space this]
    (-> this (.getSubSpace))))

