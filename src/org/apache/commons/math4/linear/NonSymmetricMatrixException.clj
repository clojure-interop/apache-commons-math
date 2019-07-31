(ns org.apache.commons.math4.linear.NonSymmetricMatrixException
  "Exception to be thrown when a symmetric matrix is expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonSymmetricMatrixException]))

(defn ->non-symmetric-matrix-exception
  "Constructor.

  Construct an exception.

  row - Row index. - `int`
  column - Column index. - `int`
  threshold - Relative symmetry threshold. - `double`"
  (^NonSymmetricMatrixException [^Integer row ^Integer column ^Double threshold]
    (new NonSymmetricMatrixException row column threshold)))

(defn get-row
  "returns: the row index of the entry. - `int`"
  (^Integer [^NonSymmetricMatrixException this]
    (-> this (.getRow))))

(defn get-column
  "returns: the column index of the entry. - `int`"
  (^Integer [^NonSymmetricMatrixException this]
    (-> this (.getColumn))))

(defn get-threshold
  "returns: the relative symmetry threshold. - `double`"
  (^Double [^NonSymmetricMatrixException this]
    (-> this (.getThreshold))))

