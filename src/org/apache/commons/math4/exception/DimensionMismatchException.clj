(ns org.apache.commons.math4.exception.DimensionMismatchException
  "Exception to be thrown when two dimensions differ."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception DimensionMismatchException]))

(defn ->dimension-mismatch-exception
  "Constructor.

  Construct an exception from the mismatched dimensions.

  specific - Specific context information pattern. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Wrong dimension. - `int`
  expected - Expected dimension. - `int`"
  (^DimensionMismatchException [^org.apache.commons.math4.exception.util.Localizable specific ^Integer wrong ^Integer expected]
    (new DimensionMismatchException specific wrong expected))
  (^DimensionMismatchException [^Integer wrong ^Integer expected]
    (new DimensionMismatchException wrong expected)))

(defn get-dimension
  "returns: the expected dimension. - `int`"
  (^Integer [^DimensionMismatchException this]
    (-> this (.getDimension))))

