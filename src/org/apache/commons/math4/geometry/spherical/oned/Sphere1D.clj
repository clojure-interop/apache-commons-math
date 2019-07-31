(ns org.apache.commons.math4.geometry.spherical.oned.Sphere1D
  "This class implements a one-dimensional sphere (i.e. a circle).

  We use here the topologists definition of the 1-sphere (see
  Sphere on
  MathWorld), i.e. the 1-sphere is the one-dimensional closed curve
  defined in 2D as x2+y2=1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned Sphere1D]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.geometry.spherical.oned.Sphere1D`"
  (^org.apache.commons.math4.geometry.spherical.oned.Sphere1D []
    (Sphere1D/getInstance )))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Sphere1D this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

   As the 1-dimension sphere does not have proper sub-spaces,
   this method always throws a Sphere1D.NoSubSpaceException

  returns: nothing - `org.apache.commons.math4.geometry.Space`

  throws: org.apache.commons.math4.geometry.spherical.oned.Sphere1D$NoSubSpaceException - in all cases"
  (^org.apache.commons.math4.geometry.Space [^Sphere1D this]
    (-> this (.getSubSpace))))

