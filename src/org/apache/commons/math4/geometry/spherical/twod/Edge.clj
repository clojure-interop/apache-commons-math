(ns org.apache.commons.math4.geometry.spherical.twod.Edge
  "Spherical polygons boundary edge."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod Edge]))

(defn get-start
  "Get start vertex.

  returns: start vertex - `org.apache.commons.math4.geometry.spherical.twod.Vertex`"
  (^org.apache.commons.math4.geometry.spherical.twod.Vertex [^Edge this]
    (-> this (.getStart))))

(defn get-end
  "Get end vertex.

  returns: end vertex - `org.apache.commons.math4.geometry.spherical.twod.Vertex`"
  (^org.apache.commons.math4.geometry.spherical.twod.Vertex [^Edge this]
    (-> this (.getEnd))))

(defn get-length
  "Get the length of the arc.

  returns: length of the arc (can be greater than \\( \\pi \\)) - `double`"
  (^Double [^Edge this]
    (-> this (.getLength))))

(defn get-circle
  "Get the circle supporting this edge.

  returns: circle supporting this edge - `org.apache.commons.math4.geometry.spherical.twod.Circle`"
  (^org.apache.commons.math4.geometry.spherical.twod.Circle [^Edge this]
    (-> this (.getCircle))))

(defn get-point-at
  "Get an intermediate point.

   The angle along the edge should normally be between 0 and getLength()
   in order to remain within edge limits. However, there are no checks on the
   value of the angle, so user can rebuild the full circle on which an edge is
   defined if they want.

  alpha - angle along the edge, counted from getStart() - `double`

  returns: an intermediate point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^Edge this ^Double alpha]
    (-> this (.getPointAt alpha))))

