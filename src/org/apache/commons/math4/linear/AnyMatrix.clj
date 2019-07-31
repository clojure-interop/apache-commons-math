(ns org.apache.commons.math4.linear.AnyMatrix
  "Interface defining very basic matrix operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear AnyMatrix]))

(defn square?
  "Is this a square matrix?

  returns: true if the matrix is square (rowDimension = columnDimension) - `boolean`"
  (^Boolean [^AnyMatrix this]
    (-> this (.isSquare))))

(defn get-row-dimension
  "Returns the number of rows in the matrix.

  returns: rowDimension - `int`"
  (^Integer [^AnyMatrix this]
    (-> this (.getRowDimension))))

(defn get-column-dimension
  "Returns the number of columns in the matrix.

  returns: columnDimension - `int`"
  (^Integer [^AnyMatrix this]
    (-> this (.getColumnDimension))))

