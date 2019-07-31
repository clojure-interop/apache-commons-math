(ns org.apache.commons.math4.linear.RealMatrix
  "Interface defining a real-valued matrix with basic algebraic operations.

  Matrix element indexing is 0-based -- e.g., getEntry(0, 0)
  returns the element in the first row, first column of the matrix."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealMatrix]))

(defn scalar-add
  "Returns the result of adding d to each entry of this.

  d - value to be added to each entry - `double`

  returns: d  this - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Double d]
    (-> this (.scalarAdd d))))

(defn pre-multiply
  "Returns the result of premultiplying this by m.

  m - matrix to premultiply by - `org.apache.commons.math4.linear.RealMatrix`

  returns: m * this - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if rowDimension(this) != columnDimension(m)"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.preMultiply m))))

(defn set-row-vector
  "Sets the specified row of this matrix to the entries of
   the specified vector. Row indices start at 0.

  row - Row to be set. - `int`
  vector - row vector to be copied (must have the same number of column as the instance). - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^RealMatrix this ^Integer row ^org.apache.commons.math4.linear.RealVector vector]
    (-> this (.setRowVector row vector))))

(defn create-matrix
  "Create a new RealMatrix of the same type as the instance with the
   supplied
   row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: 2-dimensional array of entries - `double[][]`"
  ([^RealMatrix this]
    (-> this (.getData))))

(defn get-column-matrix
  "Get the entries at the given column index as a column matrix. Column
   indices start at 0.

  column - Column to be fetched. - `int`

  returns: column Matrix. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Integer column]
    (-> this (.getColumnMatrix column))))

(defn get-trace
  "Returns the
   trace of the matrix (the sum of the elements on the main diagonal).

  returns: the trace. - `double`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if the matrix is not square."
  (^Double [^RealMatrix this]
    (-> this (.getTrace))))

(defn copy
  "Returns a (deep) copy of this.

  returns: matrix copy - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this]
    (-> this (.copy))))

(defn scalar-multiply
  "Returns the result of multiplying each entry of this by
   d.

  d - value to multiply all entries by - `double`

  returns: d * this - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Double d]
    (-> this (.scalarMultiply d))))

(defn multiply
  "Returns the result of postmultiplying this by m.

  m - matrix to postmultiply by - `org.apache.commons.math4.linear.RealMatrix`

  returns: this * m - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if columnDimension(this) != rowDimension(m)"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.multiply m))))

(defn get-column
  "Get the entries at the given column index as an array. Column indices
   start at 0.

  column - Column to be fetched. - `int`

  returns: the array of entries in the column. - `double[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is not valid."
  ([^RealMatrix this ^Integer column]
    (-> this (.getColumn column))))

(defn get-entry
  "Get the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be fetched. - `int`
  column - Column index of entry to be fetched. - `int`

  returns: the matrix entry at (row, column). - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  (^Double [^RealMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `double[]`

  returns: this * v - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of v does not match the column dimension of this."
  ([^RealMatrix this v]
    (-> this (.operate v))))

(defn walk-in-optimized-order
  "Visit (and possibly change) some matrix entries using the fastest possible order.
   The fastest walking order depends on the exact matrix class. It may be
   different from traditional row or column orders.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.RealMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`

  returns: the value returned by RealMatrixChangingVisitor.end() at the end
   of the walk - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInOptimizedOrder visitor start-row end-row start-column end-column)))
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor]
    (-> this (.walkInOptimizedOrder visitor))))

(defn get-column-vector
  "Get the entries at the given column index as a vector. Column indices
   start at 0.

  column - Column to be fetched. - `int`

  returns: a column vector. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid"
  (^org.apache.commons.math4.linear.RealVector [^RealMatrix this ^Integer column]
    (-> this (.getColumnVector column))))

(defn get-sub-matrix
  "Gets a submatrix. Rows and columns are indicated
   counting from 0 to n-1.

  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`

  returns: The subMatrix containing the data of the
   specified rows and columns. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.getSubMatrix start-row end-row start-column end-column)))
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this selected-rows selected-columns]
    (-> this (.getSubMatrix selected-rows selected-columns))))

(defn power
  "Returns the result of multiplying this with itself p
   times. Depending on the underlying storage, instability for high powers
   might occur.

  p - raise this to power p - `int`

  returns: this^p - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NotPositiveException - if p < 0"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Integer p]
    (-> this (.power p))))

(defn set-column
  "Sets the specified column of this matrix to the entries
   of the specified array. Column indices start at 0.

  column - Column to be set. - `int`
  array - Column array to be copied (must have the same number of rows as the instance). - `double[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^RealMatrix this ^Integer column array]
    (-> this (.setColumn column array))))

(defn set-row
  "Sets the specified row of this matrix to the entries
   of the specified array. Row indices start at 0.

  row - Row to be set. - `int`
  array - Row matrix to be copied (must have the same number of columns as the instance) - `double[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^RealMatrix this ^Integer row array]
    (-> this (.setRow row array))))

(defn set-row-matrix
  "Sets the specified row of this matrix to the entries of
   the specified row matrix. Row indices start at 0.

  row - Row to be set. - `int`
  matrix - Row matrix to be copied (must have one row and the same number of columns as the instance). - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^RealMatrix this ^Integer row ^org.apache.commons.math4.linear.RealMatrix matrix]
    (-> this (.setRowMatrix row matrix))))

(defn subtract
  "Returns this minus m.

  m - matrix to be subtracted - `org.apache.commons.math4.linear.RealMatrix`

  returns: this - m - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.subtract m))))

(defn set-column-matrix
  "Sets the specified column of this matrix to the entries
   of the specified column matrix. Column indices start at 0.

  column - Column to be set. - `int`
  matrix - Column matrix to be copied (must have one column and the same number of rows as the instance). - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^RealMatrix this ^Integer column ^org.apache.commons.math4.linear.RealMatrix matrix]
    (-> this (.setColumnMatrix column matrix))))

(defn get-row
  "Get the entries at the given row index. Row indices start at 0.

  row - Row to be fetched. - `int`

  returns: the array of entries in the row. - `double[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is not valid."
  ([^RealMatrix this ^Integer row]
    (-> this (.getRow row))))

(defn get-row-vector
  "Returns the entries in row number row as a vector. Row indices
   start at 0.

  row - Row to be fetched. - `int`

  returns: a row vector. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.RealVector [^RealMatrix this ^Integer row]
    (-> this (.getRowVector row))))

(defn get-norm
  "Returns the
   maximum absolute row sum norm of the matrix.

  returns: norm - `double`"
  (^Double [^RealMatrix this]
    (-> this (.getNorm))))

(defn set-entry
  "Set the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be set. - `int`
  column - Column index of entry to be set. - `int`
  value - the new value of the entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid"
  ([^RealMatrix this ^Integer row ^Integer column ^Double value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Adds (in place) the specified value to the specified entry of
   this matrix. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  increment - value to add to the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^RealMatrix this ^Integer row ^Integer column ^Double increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Multiplies (in place) the specified entry of this matrix by the
   specified value. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  factor - Multiplication factor for the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^RealMatrix this ^Integer row ^Integer column ^Double factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Returns the sum of this and m.

  m - matrix to be added - `org.apache.commons.math4.linear.RealMatrix`

  returns: this  m - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.add m))))

(defn copy-sub-matrix
  "Copy a submatrix. Rows and columns are indicated counting from 0 to n-1.

  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`
  destination - The arrays where the submatrix data should be copied (if larger than rows/columns counts, only the upper-left part will be used) - `double[][]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  ([^RealMatrix this ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column destination]
    (-> this (.copySubMatrix start-row end-row start-column end-column destination)))
  ([^RealMatrix this selected-rows selected-columns destination]
    (-> this (.copySubMatrix selected-rows selected-columns destination))))

(defn walk-in-column-order
  "Visit (and possibly change) some matrix entries in column order.
   Column order starts at upper left and iterating through all elements
   of a column from top to bottom before going to the topmost element
   of the next column.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.RealMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index - `int`

  returns: the value returned by RealMatrixChangingVisitor.end() at the end
   of the walk - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInColumnOrder visitor start-row end-row start-column end-column)))
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor]
    (-> this (.walkInColumnOrder visitor))))

(defn get-frobenius-norm
  "Returns the
   Frobenius norm of the matrix.

  returns: norm - `double`"
  (^Double [^RealMatrix this]
    (-> this (.getFrobeniusNorm))))

(defn get-row-matrix
  "Get the entries at the given row index as a row matrix.  Row indices start
   at 0.

  row - Row to be fetched. - `int`

  returns: row Matrix. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this ^Integer row]
    (-> this (.getRowMatrix row))))

(defn walk-in-row-order
  "Visit (and possibly change) some matrix entries in row order.
   Row order starts at upper left and iterating through all elements
   of a row from left to right before going to the leftmost element
   of the next row.

  visitor - visitor used to process all matrix entries - `org.apache.commons.math4.linear.RealMatrixChangingVisitor`
  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index - `int`

  returns: the value returned by RealMatrixChangingVisitor.end() at the end
   of the walk - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInRowOrder visitor start-row end-row start-column end-column)))
  (^Double [^RealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor]
    (-> this (.walkInRowOrder visitor))))

(defn transpose
  "Returns the transpose of this matrix.

  returns: transpose matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrix this]
    (-> this (.transpose))))

(defn set-sub-matrix
  "Replace the submatrix starting at row, column using data in the
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

  sub-matrix - array containing the submatrix replacement data - `double[][]`
  row - row coordinate of the top, left element to be replaced - `int`
  column - column coordinate of the top, left element to be replaced - `int`

  throws: org.apache.commons.math4.exception.NoDataException - if subMatrix is empty."
  ([^RealMatrix this sub-matrix ^Integer row ^Integer column]
    (-> this (.setSubMatrix sub-matrix row column))))

(defn set-column-vector
  "Sets the specified column of this matrix to the entries
   of the specified vector. Column indices start at 0.

  column - Column to be set. - `int`
  vector - column vector to be copied (must have the same number of rows as the instance). - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^RealMatrix this ^Integer column ^org.apache.commons.math4.linear.RealVector vector]
    (-> this (.setColumnVector column vector))))

