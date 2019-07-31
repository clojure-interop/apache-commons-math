(ns org.apache.commons.math4.geometry.Point
  "This interface represents a generic geometrical point."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry Point]))

(defn get-space
  "Get the space to which the point belongs.

  returns: containing space - `org.apache.commons.math4.geometry.Space`"
  (^org.apache.commons.math4.geometry.Space [^Point this]
    (-> this (.getSpace))))

(defn na-n?
  "Returns true if any coordinate of this point is NaN; false otherwise

  returns: true if any coordinate of this point is NaN; false otherwise - `boolean`"
  (^Boolean [^Point this]
    (-> this (.isNaN))))

(defn distance
  "Compute the distance between the instance and another point.

  p - second point - `org.apache.commons.math4.geometry.Point`

  returns: the distance between the instance and p - `double`"
  (^Double [^Point this ^org.apache.commons.math4.geometry.Point p]
    (-> this (.distance p))))

