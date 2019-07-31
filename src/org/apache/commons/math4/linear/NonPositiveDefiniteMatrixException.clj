(ns org.apache.commons.math4.linear.NonPositiveDefiniteMatrixException
  "Exception to be thrown when a positive definite matrix is expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonPositiveDefiniteMatrixException]))

(defn ->non-positive-definite-matrix-exception
  "Constructor.

  Construct an exception.

  wrong - Value that fails the positivity check. - `double`
  index - Row (and column) index. - `int`
  threshold - Absolute positivity threshold. - `double`"
  (^NonPositiveDefiniteMatrixException [^Double wrong ^Integer index ^Double threshold]
    (new NonPositiveDefiniteMatrixException wrong index threshold)))

(defn get-row
  "returns: the row index. - `int`"
  (^Integer [^NonPositiveDefiniteMatrixException this]
    (-> this (.getRow))))

(defn get-column
  "returns: the column index. - `int`"
  (^Integer [^NonPositiveDefiniteMatrixException this]
    (-> this (.getColumn))))

(defn get-threshold
  "returns: the absolute positivity threshold. - `double`"
  (^Double [^NonPositiveDefiniteMatrixException this]
    (-> this (.getThreshold))))

