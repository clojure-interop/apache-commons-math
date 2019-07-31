(ns org.apache.commons.math4.linear.AbstractFieldMatrix
  "Basic implementation of FieldMatrix methods regardless of the underlying storage.
  All the methods implemented here use getEntry(int, int) to access
  matrix elements. Derived class can provide faster implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear AbstractFieldMatrix]))

(defn scalar-add
  "Increment each entry of this matrix.

  d - Value to be added to each entry. - `T`

  returns: d  this. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this d]
    (-> this (.scalarAdd d))))

(defn pre-multiply
  "Premultiply this matrix by m.

  m - Matrix to premultiply by. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: m * this. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of m differs from the number of rows of this matrix."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.preMultiply m))))

(defn set-row-vector
  "Set the entries in row number row
   as a vector.

  row - Row to be set. - `int`
  vector - row vector (must have the same number of columns as the instance). - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^AbstractFieldMatrix this ^Integer row ^org.apache.commons.math4.linear.FieldVector vector]
    (-> this (.setRowVector row vector))))

(defn create-matrix
  "Create a new FieldMatrix of the same type as the instance with
   the supplied row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: a 2-dimensional array of entries. - `T[][]`"
  ([^AbstractFieldMatrix this]
    (-> this (.getData))))

(defn get-column-matrix
  "Get the entries in column number column
   as a column matrix.

  column - Column to be fetched. - `int`

  returns: a column matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^Integer column]
    (-> this (.getColumnMatrix column))))

(defn get-trace
  "Returns the
   trace of the matrix (the sum of the elements on the main diagonal).

  returns: trace - `T`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if the matrix is not square."
  ([^AbstractFieldMatrix this]
    (-> this (.getTrace))))

(defn get-column-dimension
  "Returns the number of columns in the matrix.

  returns: columnDimension - `int`"
  (^Integer [^AbstractFieldMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Make a (deep) copy of this.

  returns: a copy of this matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this]
    (-> this (.copy))))

(defn scalar-multiply
  "Multiply each entry by d.

  d - Value to multiply all entries by. - `T`

  returns: d * this. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this d]
    (-> this (.scalarMultiply d))))

(defn multiply
  "Postmultiply this matrix by m.

  m - Matrix to postmultiply by. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this * m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the number of rows of matrix m."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.multiply m))))

(defn get-column
  "Get the entries in column number col as an array.

  column - the column to be fetched - `int`

  returns: array of entries in the column - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is not valid."
  ([^AbstractFieldMatrix this ^Integer column]
    (-> this (.getColumn column))))

(defn get-entry
  "Returns the entry in the specified row and column.

  row - row location of entry to be fetched - `int`
  column - column location of entry to be fetched - `int`

  returns: matrix entry in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^AbstractFieldMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn square?
  "Is this a square matrix?

  returns: true if the matrix is square (rowDimension = columnDimension) - `boolean`"
  (^Boolean [^AbstractFieldMatrix this]
    (-> this (.isSquare))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `T[]`

  returns: this * v - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the size of the vector v."
  ([^AbstractFieldMatrix this v]
    (-> this (.operate v))))

(defn walk-in-optimized-order
  "Visit (and possibly change) some matrix entries using the fastest possible order.
   The fastest walking order depends on the exact matrix class. It may be
   different from traditional row or column orders.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.FieldMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`

  returns: the value returned by FieldMatrixChangingVisitor.end() at the end
   of the walk - `T`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if endRow < startRow or endColumn < startColumn."
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInOptimizedOrder visitor start-row end-row start-column end-column)))
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInOptimizedOrder visitor))))

(defn to-string
  "Get a string representation for this matrix.

  returns: a string representation for this matrix - `java.lang.String`"
  (^java.lang.String [^AbstractFieldMatrix this]
    (-> this (.toString))))

(defn get-column-vector
  "Returns the entries in column number column
   as a vector.

  column - Column to be fetched. - `int`

  returns: a column vector. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  (^org.apache.commons.math4.linear.FieldVector [^AbstractFieldMatrix this ^Integer column]
    (-> this (.getColumnVector column))))

(defn get-sub-matrix
  "Get a submatrix. Rows and columns are indicated
   counting from 0 to n - 1.

  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`

  returns: the matrix containing the data of the specified rows and columns. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - is endRow < startRow of endColumn < startColumn."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.getSubMatrix start-row end-row start-column end-column)))
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this selected-rows selected-columns]
    (-> this (.getSubMatrix selected-rows selected-columns))))

(defn get-row-dimension
  "Returns the number of rows in the matrix.

  returns: rowDimension - `int`"
  (^Integer [^AbstractFieldMatrix this]
    (-> this (.getRowDimension))))

(defn power
  "Returns the result multiplying this with itself p times.
   Depending on the type of the field elements, T, instability for high
   powers might occur.

  p - raise this to power p - `int`

  returns: this^p - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if this matrix is not square"
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^Integer p]
    (-> this (.power p))))

(defn set-column
  "Set the entries in column number column
   as a column matrix.

  column - the column to be set - `int`
  array - column array (must have the same number of rows as the instance) - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^AbstractFieldMatrix this ^Integer column array]
    (-> this (.setColumn column array))))

(defn set-row
  "Set the entries in row number row
   as a row matrix.

  row - Row to be set. - `int`
  array - Row matrix (must have the same number of columns as the instance). - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^AbstractFieldMatrix this ^Integer row array]
    (-> this (.setRow row array))))

(defn set-row-matrix
  "Set the entries in row number row
   as a row matrix.

  row - Row to be set. - `int`
  matrix - Row matrix (must have one row and the same number of columns as the instance). - `org.apache.commons.math4.linear.FieldMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^AbstractFieldMatrix this ^Integer row ^org.apache.commons.math4.linear.FieldMatrix matrix]
    (-> this (.setRowMatrix row matrix))))

(defn subtract
  "Subtract m from this matrix.

  m - Matrix to be subtracted. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this - m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.subtract m))))

(defn get-field
  "Get the type of field elements of the matrix.

  returns: the type of field elements of the matrix. - `org.apache.commons.math4.Field<T>`"
  (^org.apache.commons.math4.Field [^AbstractFieldMatrix this]
    (-> this (.getField))))

(defn set-column-matrix
  "Set the entries in column number column
   as a column matrix.

  column - Column to be set. - `int`
  matrix - column matrix (must have one column and the same number of rows as the instance). - `org.apache.commons.math4.linear.FieldMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^AbstractFieldMatrix this ^Integer column ^org.apache.commons.math4.linear.FieldMatrix matrix]
    (-> this (.setColumnMatrix column matrix))))

(defn get-row
  "Get the entries in row number row as an array.

  row - Row to be fetched. - `int`

  returns: array of entries in the row. - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is not valid."
  ([^AbstractFieldMatrix this ^Integer row]
    (-> this (.getRow row))))

(defn get-row-vector
  "Get the entries in row number row
   as a vector.

  row - Row to be fetched - `int`

  returns: a row vector. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.FieldVector [^AbstractFieldMatrix this ^Integer row]
    (-> this (.getRowVector row))))

(defn set-entry
  "Set the entry in the specified row and column.

  row - row location of entry to be set - `int`
  column - column location of entry to be set - `int`
  value - matrix entry to be set in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^AbstractFieldMatrix this ^Integer row ^Integer column value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  increment - Value to add to the current matrix entry in (row, column). - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^AbstractFieldMatrix this ^Integer row ^Integer column increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  factor - Multiplication factor for the current matrix entry in (row,column) - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^AbstractFieldMatrix this ^Integer row ^Integer column factor]
    (-> this (.multiplyEntry row column factor))))

(defn hash-code
  "Computes a hashcode for the matrix.

  returns: hashcode for matrix - `int`"
  (^Integer [^AbstractFieldMatrix this]
    (-> this (.hashCode))))

(defn add
  "Compute the sum of this and m.

  m - Matrix to be added. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.add m))))

(defn copy-sub-matrix
  "Copy a submatrix. Rows and columns are 0-based. The designated submatrix
   is copied into the top left portion of the destination array.

  start-row - Initial row index. - `int`
  end-row - Final row index (inclusive). - `int`
  start-column - Initial column index. - `int`
  end-column - Final column index (inclusive). - `int`
  destination - The array where the submatrix data should be copied (if larger than rows/columns counts, only the upper-left part will be modified). - `T[][]`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the dimensions of destination are not large enough to hold the submatrix."
  ([^AbstractFieldMatrix this ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column destination]
    (-> this (.copySubMatrix start-row end-row start-column end-column destination)))
  ([^AbstractFieldMatrix this selected-rows selected-columns destination]
    (-> this (.copySubMatrix selected-rows selected-columns destination))))

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

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if endRow < startRow or endColumn < startColumn."
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInColumnOrder visitor start-row end-row start-column end-column)))
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInColumnOrder visitor))))

(defn get-row-matrix
  "Get the entries in row number row
   as a row matrix.

  row - Row to be fetched. - `int`

  returns: a row matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this ^Integer row]
    (-> this (.getRowMatrix row))))

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

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if endRow < startRow or endColumn < startColumn."
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInRowOrder visitor start-row end-row start-column end-column)))
  ([^AbstractFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInRowOrder visitor))))

(defn equals
  "Returns true iff object is a
   FieldMatrix instance with the same dimensions as this
   and all corresponding matrix entries are equal.

  object - the object to test equality against. - `java.lang.Object`

  returns: true if object equals this - `boolean`"
  (^Boolean [^AbstractFieldMatrix this ^java.lang.Object object]
    (-> this (.equals object))))

(defn transpose
  "Returns the transpose of this matrix.

  returns: transpose matrix - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^AbstractFieldMatrix this]
    (-> this (.transpose))))

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

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if subMatrix is not rectangular (not all rows have the same length)."
  ([^AbstractFieldMatrix this sub-matrix ^Integer row ^Integer column]
    (-> this (.setSubMatrix sub-matrix row column))))

(defn set-column-vector
  "Set the entries in column number column
   as a vector.

  column - Column to be set. - `int`
  vector - Column vector (must have the same number of rows as the instance). - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^AbstractFieldMatrix this ^Integer column ^org.apache.commons.math4.linear.FieldVector vector]
    (-> this (.setColumnVector column vector))))

