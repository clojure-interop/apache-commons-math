(ns org.apache.commons.math4.linear.Array2DRowFieldMatrix
  "Implementation of FieldMatrix using a FieldElement[][] array to store entries.

  As specified in the FieldMatrix interface, matrix element indexing
  is 0-based -- e.g., getEntry(0, 0)
  returns the element in the first row, first column of the matrix."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear Array2DRowFieldMatrix]))

(defn ->array-2-d-row-field-matrix
  "Constructor.

  Create a new FieldMatrix<T> with the supplied row and column dimensions.

  field - Field to which the elements belong. - `org.apache.commons.math4.Field`
  row-dimension - Number of rows in the new matrix. - `int`
  column-dimension - Number of columns in the new matrix. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^Array2DRowFieldMatrix [^org.apache.commons.math4.Field field ^Integer row-dimension ^Integer column-dimension]
    (new Array2DRowFieldMatrix field row-dimension column-dimension))
  (^Array2DRowFieldMatrix [^org.apache.commons.math4.Field field d]
    (new Array2DRowFieldMatrix field d))
  (^Array2DRowFieldMatrix [^org.apache.commons.math4.Field field]
    (new Array2DRowFieldMatrix field)))

(defn pre-multiply
  "Returns the (row) vector result of premultiplying this by the vector
   v.

  v - the row vector to premultiply by - `T[]`

  returns: v * this - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of rows of this matrix is not equal to the size of the vector v"
  ([^Array2DRowFieldMatrix this v]
    (-> this (.preMultiply v))))

(defn create-matrix
  "Create a new FieldMatrix of the same type as the instance with
   the supplied row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^org.apache.commons.math4.linear.FieldMatrix [^Array2DRowFieldMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: a 2-dimensional array of entries. - `T[][]`"
  ([^Array2DRowFieldMatrix this]
    (-> this (.getData))))

(defn get-column-dimension
  "Returns the number of columns in the matrix.

  returns: columnDimension - `int`"
  (^Integer [^Array2DRowFieldMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Make a (deep) copy of this.

  returns: a copy of this matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^Array2DRowFieldMatrix this]
    (-> this (.copy))))

(defn multiply
  "Postmultiplying this matrix by m.

  m - Matrix to postmultiply by. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`

  returns: this * m. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the number of rows of m."
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.Array2DRowFieldMatrix m]
    (-> this (.multiply m))))

(defn get-entry
  "Returns the entry in the specified row and column.

  row - row location of entry to be fetched - `int`
  column - column location of entry to be fetched - `int`

  returns: matrix entry in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowFieldMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn get-data-ref
  "Get a reference to the underlying data array.
   This methods returns internal data, not fresh copy of it.

  returns: the 2-dimensional array of entries. - `T[][]`"
  ([^Array2DRowFieldMatrix this]
    (-> this (.getDataRef))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `T[]`

  returns: this * v - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the size of the vector v."
  ([^Array2DRowFieldMatrix this v]
    (-> this (.operate v))))

(defn get-row-dimension
  "Returns the number of rows in the matrix.

  returns: rowDimension - `int`"
  (^Integer [^Array2DRowFieldMatrix this]
    (-> this (.getRowDimension))))

(defn subtract
  "Subtract m from this matrix.

  m - Matrix to be subtracted. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.Array2DRowFieldMatrix m]
    (-> this (.subtract m))))

(defn set-entry
  "Set the entry in the specified row and column.

  row - row location of entry to be set - `int`
  column - column location of entry to be set - `int`
  value - matrix entry to be set in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowFieldMatrix this ^Integer row ^Integer column value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  increment - Value to add to the current matrix entry in (row, column). - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowFieldMatrix this ^Integer row ^Integer column increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  factor - Multiplication factor for the current matrix entry in (row,column) - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowFieldMatrix this ^Integer row ^Integer column factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Add m to this matrix.

  m - Matrix to be added. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.Array2DRowFieldMatrix m]
    (-> this (.add m))))

(defn walk-in-column-order
  "Visit (and possibly change) some matrix entries in column order.
   Column order starts at upper left and iterating through all elements
   of a column from top to bottom before going to the topmost element
   of the next column.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.FieldMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index - `int`

  returns: the value returned by FieldMatrixChangingVisitor.end() at the end
   of the walk - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  ([^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInColumnOrder visitor start-row end-row start-column end-column)))
  ([^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInColumnOrder visitor))))

(defn walk-in-row-order
  "Visit (and possibly change) some matrix entries in row order.
   Row order starts at upper left and iterating through all elements
   of a row from left to right before going to the leftmost element
   of the next row.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.FieldMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index - `int`

  returns: the value returned by FieldMatrixChangingVisitor.end() at the end
   of the walk - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  ([^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInRowOrder visitor start-row end-row start-column end-column)))
  ([^Array2DRowFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInRowOrder visitor))))

(defn set-sub-matrix
  "Replace the submatrix starting at (row, column) using data in the
   input subMatrix array. Indexes are 0-based.

   Example:
   Starting with



   1  2  3  4
   5  6  7  8
   9  0  1  2

   and subMatrix = {{3, 4} {5,6}}, invoking
   setSubMatrix(subMatrix,1,1)) will result in



   1  2  3  4
   5  3  4  8
   9  5  6  2

  sub-matrix - Array containing the submatrix replacement data. - `T[][]`
  row - Row coordinate of the top-left element to be replaced. - `int`
  column - Column coordinate of the top-left element to be replaced. - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if subMatrix does not fit into this matrix from element in (row, column)."
  ([^Array2DRowFieldMatrix this sub-matrix ^Integer row ^Integer column]
    (-> this (.setSubMatrix sub-matrix row column))))

