(ns org.apache.commons.math4.geometry.euclidean.oned.Interval
  "This class represents a 1D interval."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned Interval]))

(defn ->interval
  "Constructor.

  Simple constructor.

  lower - lower bound of the interval - `double`
  upper - upper bound of the interval - `double`"
  (^Interval [^Double lower ^Double upper]
    (new Interval lower upper)))

(defn get-inf
  "Get the lower bound of the interval.

  returns: lower bound of the interval - `double`"
  (^Double [^Interval this]
    (-> this (.getInf))))

(defn get-sup
  "Get the upper bound of the interval.

  returns: upper bound of the interval - `double`"
  (^Double [^Interval this]
    (-> this (.getSup))))

(defn get-size
  "Get the size of the interval.

  returns: size of the interval - `double`"
  (^Double [^Interval this]
    (-> this (.getSize))))

(defn get-barycenter
  "Get the barycenter of the interval.

  returns: barycenter of the interval - `double`"
  (^Double [^Interval this]
    (-> this (.getBarycenter))))

(defn check-point
  "Check a point with respect to the interval.

  point - point to check - `double`
  tolerance - tolerance below which points are considered to belong to the boundary - `double`

  returns: a code representing the point status: either Region.Location.INSIDE, Region.Location.OUTSIDE or Region.Location.BOUNDARY - `org.apache.commons.math4.geometry.partitioning.Region$Location`"
  (^org.apache.commons.math4.geometry.partitioning.Region$Location [^Interval this ^Double point ^Double tolerance]
    (-> this (.checkPoint point tolerance))))

