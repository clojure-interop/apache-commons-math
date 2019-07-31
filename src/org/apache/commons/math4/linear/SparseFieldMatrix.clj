(ns org.apache.commons.math4.linear.SparseFieldMatrix
  "Sparse matrix implementation based on an open addressed map.


   Caveat: This implementation assumes that, for any x,
   the equality x * 0d == 0d holds. But it is is not true for
   NaN. Moreover, zero entries will lose their sign.
   Some operations (that involve NaN and/or infinities) may
   thus give incorrect results."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SparseFieldMatrix]))

(defn ->sparse-field-matrix
  "Constructor.

  Create a new SparseFieldMatrix with the supplied row and column
   dimensions.

  field - Field to which the elements belong. - `org.apache.commons.math4.Field`
  row-dimension - Number of rows in the new matrix. - `int`
  column-dimension - Number of columns in the new matrix. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^SparseFieldMatrix [^org.apache.commons.math4.Field field ^Integer row-dimension ^Integer column-dimension]
    (new SparseFieldMatrix field row-dimension column-dimension))
  (^SparseFieldMatrix [^org.apache.commons.math4.Field field]
    (new SparseFieldMatrix field)))

(defn add-to-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  increment - Value to add to the current matrix entry in (row, column). - `T`"
  ([^SparseFieldMatrix this ^Integer row ^Integer column increment]
    (-> this (.addToEntry row column increment))))

(defn copy
  "Make a (deep) copy of this.

  returns: a copy of this matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^SparseFieldMatrix this]
    (-> this (.copy))))

(defn create-matrix
  "Create a new FieldMatrix of the same type as the instance with
   the supplied row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^SparseFieldMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-column-dimension
  "Returns the number of columns in the matrix.

  returns: columnDimension - `int`"
  (^Integer [^SparseFieldMatrix this]
    (-> this (.getColumnDimension))))

(defn get-entry
  "Returns the entry in the specified row and column.

  row - row location of entry to be fetched - `int`
  column - column location of entry to be fetched - `int`

  returns: matrix entry in row,column - `T`"
  ([^SparseFieldMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn get-row-dimension
  "Returns the number of rows in the matrix.

  returns: rowDimension - `int`"
  (^Integer [^SparseFieldMatrix this]
    (-> this (.getRowDimension))))

(defn multiply-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  factor - Multiplication factor for the current matrix entry in (row,column) - `T`"
  ([^SparseFieldMatrix this ^Integer row ^Integer column factor]
    (-> this (.multiplyEntry row column factor))))

(defn set-entry
  "Set the entry in the specified row and column.

  row - row location of entry to be set - `int`
  column - column location of entry to be set - `int`
  value - matrix entry to be set in row,column - `T`"
  ([^SparseFieldMatrix this ^Integer row ^Integer column value]
    (-> this (.setEntry row column value))))

