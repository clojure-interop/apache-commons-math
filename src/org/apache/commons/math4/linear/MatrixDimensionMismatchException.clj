(ns org.apache.commons.math4.linear.MatrixDimensionMismatchException
  "Exception to be thrown when either the number of rows or the number of
  columns of a matrix do not match the expected values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear MatrixDimensionMismatchException]))

(defn ->matrix-dimension-mismatch-exception
  "Constructor.

  Construct an exception from the mismatched dimensions.

  wrong-row-dim - Wrong row dimension. - `int`
  wrong-col-dim - Wrong column dimension. - `int`
  expected-row-dim - Expected row dimension. - `int`
  expected-col-dim - Expected column dimension. - `int`"
  (^MatrixDimensionMismatchException [^Integer wrong-row-dim ^Integer wrong-col-dim ^Integer expected-row-dim ^Integer expected-col-dim]
    (new MatrixDimensionMismatchException wrong-row-dim wrong-col-dim expected-row-dim expected-col-dim)))

(defn get-wrong-row-dimension
  "returns: the expected row dimension. - `int`"
  (^Integer [^MatrixDimensionMismatchException this]
    (-> this (.getWrongRowDimension))))

(defn get-expected-row-dimension
  "returns: the expected row dimension. - `int`"
  (^Integer [^MatrixDimensionMismatchException this]
    (-> this (.getExpectedRowDimension))))

(defn get-wrong-column-dimension
  "returns: the wrong column dimension. - `int`"
  (^Integer [^MatrixDimensionMismatchException this]
    (-> this (.getWrongColumnDimension))))

(defn get-expected-column-dimension
  "returns: the expected column dimension. - `int`"
  (^Integer [^MatrixDimensionMismatchException this]
    (-> this (.getExpectedColumnDimension))))

