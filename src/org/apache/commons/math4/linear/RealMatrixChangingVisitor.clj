(ns org.apache.commons.math4.linear.RealMatrixChangingVisitor
  "Interface defining a visitor for matrix entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealMatrixChangingVisitor]))

(defn start
  "Start visiting a matrix.
   This method is called once before any entry of the matrix is visited.

  rows - number of rows of the matrix - `int`
  columns - number of columns of the matrix - `int`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`"
  ([^RealMatrixChangingVisitor this ^Integer rows ^Integer columns ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.start rows columns start-row end-row start-column end-column))))

(defn visit
  "Visit one matrix entry.

  row - row index of the entry - `int`
  column - column index of the entry - `int`
  value - current value of the entry - `double`

  returns: the new value to be set for the entry - `double`"
  (^Double [^RealMatrixChangingVisitor this ^Integer row ^Integer column ^Double value]
    (-> this (.visit row column value))))

(defn end
  "End visiting a matrix.
   This method is called once after all entries of the matrix have been visited.

  returns: the value that the walkInXxxOrder must return - `double`"
  (^Double [^RealMatrixChangingVisitor this]
    (-> this (.end))))

