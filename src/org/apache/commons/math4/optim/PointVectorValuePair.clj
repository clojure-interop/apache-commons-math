(ns org.apache.commons.math4.optim.PointVectorValuePair
  "This class holds a point and the vectorial value of an objective function at
  that point."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim PointVectorValuePair]))

(defn ->point-vector-value-pair
  "Constructor.

  Build a point/objective function value pair.

  point - Point coordinates. - `double[]`
  value - Value of the objective function at the point. - `double[]`
  copy-array - if true, the input arrays will be copied, otherwise they will be referenced. - `boolean`"
  (^PointVectorValuePair [point value ^Boolean copy-array]
    (new PointVectorValuePair point value copy-array))
  (^PointVectorValuePair [point value]
    (new PointVectorValuePair point value)))

(defn get-point
  "Gets the point.

  returns: a copy of the stored point. - `double[]`"
  ([^PointVectorValuePair this]
    (-> this (.getPoint))))

(defn get-point-ref
  "Gets a reference to the point.

  returns: a reference to the internal array storing the point. - `double[]`"
  ([^PointVectorValuePair this]
    (-> this (.getPointRef))))

(defn get-value
  "Gets the value of the objective function.

  returns: a copy of the stored value of the objective function. - `double[]`"
  ([^PointVectorValuePair this]
    (-> this (.getValue))))

(defn get-value-ref
  "Gets a reference to the value of the objective function.

  returns: a reference to the internal array storing the value of
   the objective function. - `double[]`"
  ([^PointVectorValuePair this]
    (-> this (.getValueRef))))

