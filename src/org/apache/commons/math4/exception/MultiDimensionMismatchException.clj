(ns org.apache.commons.math4.exception.MultiDimensionMismatchException
  "Exception to be thrown when two sets of dimensions differ."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MultiDimensionMismatchException]))

(defn ->multi-dimension-mismatch-exception
  "Constructor.

  Construct an exception from the mismatched dimensions.

  specific - Message pattern providing the specific context of the error. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Wrong dimensions. - `java.lang.Integer[]`
  expected - Expected dimensions. - `java.lang.Integer[]`"
  (^MultiDimensionMismatchException [^org.apache.commons.math4.exception.util.Localizable specific wrong expected]
    (new MultiDimensionMismatchException specific wrong expected))
  (^MultiDimensionMismatchException [wrong expected]
    (new MultiDimensionMismatchException wrong expected)))

(defn get-wrong-dimensions
  "returns: an array containing the wrong dimensions. - `java.lang.Integer[]`"
  ([^MultiDimensionMismatchException this]
    (-> this (.getWrongDimensions))))

(defn get-expected-dimensions
  "returns: an array containing the expected dimensions. - `java.lang.Integer[]`"
  ([^MultiDimensionMismatchException this]
    (-> this (.getExpectedDimensions))))

(defn get-wrong-dimension
  "index - Dimension index. - `int`

  returns: the wrong dimension stored at index. - `int`"
  (^Integer [^MultiDimensionMismatchException this ^Integer index]
    (-> this (.getWrongDimension index))))

(defn get-expected-dimension
  "index - Dimension index. - `int`

  returns: the expected dimension stored at index. - `int`"
  (^Integer [^MultiDimensionMismatchException this ^Integer index]
    (-> this (.getExpectedDimension index))))

