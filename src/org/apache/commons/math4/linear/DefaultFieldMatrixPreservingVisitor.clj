(ns org.apache.commons.math4.linear.DefaultFieldMatrixPreservingVisitor
  "Default implementation of the FieldMatrixPreservingVisitor interface.

  This class is a convenience to create custom visitors without defining all
  methods. This class provides default implementations that do nothing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear DefaultFieldMatrixPreservingVisitor]))

(defn ->default-field-matrix-preserving-visitor
  "Constructor.

  Build a new instance.

  zero - additive identity of the field - `T`"
  (^DefaultFieldMatrixPreservingVisitor [zero]
    (new DefaultFieldMatrixPreservingVisitor zero)))

(defn start
  "Start visiting a matrix.
   This method is called once before any entry of the matrix is visited.

  rows - number of rows of the matrix - `int`
  columns - number of columns of the matrix - `int`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`"
  ([^DefaultFieldMatrixPreservingVisitor this ^Integer rows ^Integer columns ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.start rows columns start-row end-row start-column end-column))))

(defn visit
  "Visit one matrix entry.

  row - row index of the entry - `int`
  column - column index of the entry - `int`
  value - current value of the entry - `T`"
  ([^DefaultFieldMatrixPreservingVisitor this ^Integer row ^Integer column value]
    (-> this (.visit row column value))))

(defn end
  "End visiting a matrix.
   This method is called once after all entries of the matrix have been visited.

  returns: the value that the walkInXxxOrder must return - `T`"
  ([^DefaultFieldMatrixPreservingVisitor this]
    (-> this (.end))))

