(ns org.apache.commons.math4.optim.SimpleBounds
  "Simple optimization constraints: lower and upper bounds.
  The valid range of the parameters is an interval that can be infinite
  (in one or both directions).

  Immutable class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim SimpleBounds]))

(defn ->simple-bounds
  "Constructor.

  l-b - Lower bounds. - `double[]`
  u-b - Upper bounds. - `double[]`"
  (^SimpleBounds [l-b u-b]
    (new SimpleBounds l-b u-b)))

(defn *unbounded
  "Factory method that creates instance of this class that represents
   unbounded ranges.

  dim - Number of parameters. - `int`

  returns: a new instance suitable for passing to an optimizer that
   requires bounds specification. - `org.apache.commons.math4.optim.SimpleBounds`"
  (^org.apache.commons.math4.optim.SimpleBounds [^Integer dim]
    (SimpleBounds/unbounded dim)))

(defn get-lower
  "Gets the lower bounds.

  returns: the lower bounds. - `double[]`"
  ([^SimpleBounds this]
    (-> this (.getLower))))

(defn get-upper
  "Gets the upper bounds.

  returns: the upper bounds. - `double[]`"
  ([^SimpleBounds this]
    (-> this (.getUpper))))

