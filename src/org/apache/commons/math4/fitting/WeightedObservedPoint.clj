(ns org.apache.commons.math4.fitting.WeightedObservedPoint
  "This class is a simple container for weighted observed point in
  curve fitting.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting WeightedObservedPoint]))

(defn ->weighted-observed-point
  "Constructor.

  Simple constructor.

  weight - Weight of the measurement in the fitting process. - `double`
  x - Abscissa of the measurement. - `double`
  y - Ordinate of the measurement. - `double`"
  (^WeightedObservedPoint [^Double weight ^Double x ^Double y]
    (new WeightedObservedPoint weight x y)))

(defn get-weight
  "Gets the weight of the measurement in the fitting process.

  returns: the weight of the measurement in the fitting process. - `double`"
  (^Double [^WeightedObservedPoint this]
    (-> this (.getWeight))))

(defn get-x
  "Gets the abscissa of the point.

  returns: the abscissa of the point. - `double`"
  (^Double [^WeightedObservedPoint this]
    (-> this (.getX))))

(defn get-y
  "Gets the observed value of the function at x.

  returns: the observed value of the function at x. - `double`"
  (^Double [^WeightedObservedPoint this]
    (-> this (.getY))))

