(ns org.apache.commons.math4.geometry.spherical.twod.Sphere2D
  "This class implements a two-dimensional sphere (i.e. the regular sphere).

  We use here the topologists definition of the 2-sphere (see
  Sphere on
  MathWorld), i.e. the 2-sphere is the two-dimensional surface
  defined in 3D as x2+y2+z2=1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod Sphere2D]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.geometry.spherical.twod.Sphere2D`"
  (^org.apache.commons.math4.geometry.spherical.twod.Sphere2D []
    (Sphere2D/getInstance )))

(defn get-dimension
  "Get the dimension of the space.

  returns: dimension of the space - `int`"
  (^Integer [^Sphere2D this]
    (-> this (.getDimension))))

(defn get-sub-space
  "Get the n-1 dimension subspace of this space.

  returns: n-1 dimension sub-space of this space - `org.apache.commons.math4.geometry.spherical.oned.Sphere1D`"
  (^org.apache.commons.math4.geometry.spherical.oned.Sphere1D [^Sphere2D this]
    (-> this (.getSubSpace))))

