(ns org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D
  "This class implements a one-dimensional space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned Euclidean1D]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D []
    (Euclidean1D/getInstance )))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Euclidean1D this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

   As the 1-dimension Euclidean space does not have proper sub-spaces,
   this method always throws a Euclidean1D.NoSubSpaceException

  returns: nothing - `org.apache.commons.math4.geometry.Space`

  throws: org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D$NoSubSpaceException - in all cases"
  (^org.apache.commons.math4.geometry.Space [^Euclidean1D this]
    (-> this (.getSubSpace))))

