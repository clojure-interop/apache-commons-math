(ns org.apache.commons.math4.optim.univariate.UnivariatePointValuePair
  "This class holds a point and the value of an objective function at this
  point.
  This is a simple immutable container."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate UnivariatePointValuePair]))

(defn ->univariate-point-value-pair
  "Constructor.

  Build a point/objective function value pair.

  point - Point. - `double`
  value - Value of an objective function at the point - `double`"
  (^UnivariatePointValuePair [^Double point ^Double value]
    (new UnivariatePointValuePair point value)))

(defn get-point
  "Get the point.

  returns: the point. - `double`"
  (^Double [^UnivariatePointValuePair this]
    (-> this (.getPoint))))

(defn get-value
  "Get the value of the objective function.

  returns: the stored value of the objective function. - `double`"
  (^Double [^UnivariatePointValuePair this]
    (-> this (.getValue))))

