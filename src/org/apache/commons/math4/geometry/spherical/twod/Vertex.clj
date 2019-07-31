(ns org.apache.commons.math4.geometry.spherical.twod.Vertex
  "Spherical polygons boundary vertex."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod Vertex]))

(defn get-location
  "Get Vertex location.

  returns: vertex location - `org.apache.commons.math4.geometry.spherical.twod.S2Point`"
  (^org.apache.commons.math4.geometry.spherical.twod.S2Point [^Vertex this]
    (-> this (.getLocation))))

(defn get-incoming
  "Get incoming edge.

  returns: incoming edge - `org.apache.commons.math4.geometry.spherical.twod.Edge`"
  (^org.apache.commons.math4.geometry.spherical.twod.Edge [^Vertex this]
    (-> this (.getIncoming))))

(defn get-outgoing
  "Get outgoing edge.

  returns: outgoing edge - `org.apache.commons.math4.geometry.spherical.twod.Edge`"
  (^org.apache.commons.math4.geometry.spherical.twod.Edge [^Vertex this]
    (-> this (.getOutgoing))))

