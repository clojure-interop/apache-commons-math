(ns org.apache.commons.math4.fitting.WeightedObservedPoints
  "Simple container for weighted observed points used
  in curve fitting algorithms."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting WeightedObservedPoints]))

(defn ->weighted-observed-points
  "Constructor."
  (^WeightedObservedPoints []
    (new WeightedObservedPoints )))

(defn add
  "Adds a point to the sample.

  weight - Weight of the observed point. - `double`
  x - Abscissa of the point. - `double`
  y - Observed value at x. After fitting we should have f(x) as close as possible to this value. - `double`"
  ([^WeightedObservedPoints this ^Double weight ^Double x ^Double y]
    (-> this (.add weight x y)))
  ([^WeightedObservedPoints this ^Double x ^Double y]
    (-> this (.add x y)))
  ([^WeightedObservedPoints this ^org.apache.commons.math4.fitting.WeightedObservedPoint observed]
    (-> this (.add observed))))

(defn to-list
  "Gets a snapshot of the observed points.
   The list of stored points is copied in order to ensure that
   modification of the returned instance does not affect this
   container.
   Conversely, further modification of this container (through
   the add or clear methods) will not affect the
   returned list.

  returns: the observed points, in the order they were added to this
   container. - `java.util.List<org.apache.commons.math4.fitting.WeightedObservedPoint>`"
  (^java.util.List [^WeightedObservedPoints this]
    (-> this (.toList))))

(defn clear
  "Removes all observations from this container."
  ([^WeightedObservedPoints this]
    (-> this (.clear))))

