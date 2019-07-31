(ns org.apache.commons.math4.geometry.hull.ConvexHullGenerator
  "Interface for convex hull generators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.hull ConvexHullGenerator]))

(defn generate
  "Builds the convex hull from the set of input points.

  points - the set of input points - `java.util.Collection`

  returns: the convex hull - `org.apache.commons.math4.geometry.hull.ConvexHull<S,P>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the input collection is null"
  (^org.apache.commons.math4.geometry.hull.ConvexHull [^ConvexHullGenerator this ^java.util.Collection points]
    (-> this (.generate points))))

