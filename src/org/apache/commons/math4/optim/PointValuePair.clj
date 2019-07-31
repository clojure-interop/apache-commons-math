(ns org.apache.commons.math4.optim.PointValuePair
  "This class holds a point and the value of an objective function at
  that point."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim PointValuePair]))

(defn ->point-value-pair
  "Constructor.

  Builds a point/objective function value pair.

  point - Point coordinates. - `double[]`
  value - Value of the objective function at the point. - `double`
  copy-array - if true, the input array will be copied, otherwise it will be referenced. - `boolean`"
  (^PointValuePair [point ^Double value ^Boolean copy-array]
    (new PointValuePair point value copy-array))
  (^PointValuePair [point ^Double value]
    (new PointValuePair point value)))

(defn get-point
  "Gets the point.

  returns: a copy of the stored point. - `double[]`"
  ([^PointValuePair this]
    (-> this (.getPoint))))

(defn get-point-ref
  "Gets a reference to the point.

  returns: a reference to the internal array storing the point. - `double[]`"
  ([^PointValuePair this]
    (-> this (.getPointRef))))

