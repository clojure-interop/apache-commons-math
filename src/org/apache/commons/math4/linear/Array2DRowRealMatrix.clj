(ns org.apache.commons.math4.linear.Array2DRowRealMatrix
  "Implementation of RealMatrix using a double[][] array to
  store entries."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear Array2DRowRealMatrix]))

(defn ->array-2-d-row-real-matrix
  "Constructor.

  Create a new RealMatrix with the supplied row and column dimensions.

  row-dimension - Number of rows in the new matrix. - `int`
  column-dimension - Number of columns in the new matrix. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if the row or column dimension is not positive."
  (^Array2DRowRealMatrix [^Integer row-dimension ^Integer column-dimension]
    (new Array2DRowRealMatrix row-dimension column-dimension))
  (^Array2DRowRealMatrix [d]
    (new Array2DRowRealMatrix d))
  (^Array2DRowRealMatrix []
    (new Array2DRowRealMatrix )))

(defn pre-multiply
  "Returns the (row) vector result of premultiplying this by the vector v.

  v - the row vector to premultiply by - `double[]`

  returns: v * this - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of v does not match the row dimension of this."
  ([^Array2DRowRealMatrix this v]
    (-> this (.preMultiply v))))

(defn create-matrix
  "Create a new RealMatrix of the same type as the instance with the
   supplied
   row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^org.apache.commons.math4.linear.RealMatrix [^Array2DRowRealMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: 2-dimensional array of entries - `double[][]`"
  ([^Array2DRowRealMatrix this]
    (-> this (.getData))))

(defn get-column-dimension
  "Returns the number of columns of this matrix.

  returns: the number of columns. - `int`"
  (^Integer [^Array2DRowRealMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Returns a (deep) copy of this.

  returns: matrix copy - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^Array2DRowRealMatrix this]
    (-> this (.copy))))

(defn multiply
  "Returns the result of postmultiplying this by m.

  m - matrix to postmultiply by - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  returns: this * m - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if columnDimension(this) != rowDimension(m)"
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.Array2DRowRealMatrix m]
    (-> this (.multiply m))))

(defn get-entry
  "Get the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be fetched. - `int`
  column - Column index of entry to be fetched. - `int`

  returns: the matrix entry at (row, column). - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  (^Double [^Array2DRowRealMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn get-data-ref
  "Get a reference to the underlying data array.

  returns: 2-dimensional array of entries. - `double[][]`"
  ([^Array2DRowRealMatrix this]
    (-> this (.getDataRef))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `double[]`

  returns: this * v - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of v does not match the column dimension of this."
  ([^Array2DRowRealMatrix this v]
    (-> this (.operate v))))

(defn get-row-dimension
  "Returns the number of rows of this matrix.

  returns: the number of rows. - `int`"
  (^Integer [^Array2DRowRealMatrix this]
    (-> this (.getRowDimension))))

(defn subtract
  "Returns this minus m.

  m - Matrix to be subtracted. - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  returns: this - m - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.Array2DRowRealMatrix m]
    (-> this (.subtract m))))

(defn set-entry
  "Set the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be set. - `int`
  column - Column index of entry to be set. - `int`
  value - the new value of the entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid"
  ([^Array2DRowRealMatrix this ^Integer row ^Integer column ^Double value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Adds (in place) the specified value to the specified entry of
   this matrix. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  increment - value to add to the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowRealMatrix this ^Integer row ^Integer column ^Double increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Multiplies (in place) the specified entry of this matrix by the
   specified value. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  factor - Multiplication factor for the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^Array2DRowRealMatrix this ^Integer row ^Integer column ^Double factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Compute the sum of this and m.

  m - Matrix to be added. - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.Array2DRowRealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.Array2DRowRealMatrix m]
    (-> this (.add m))))

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
  (^Double [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInColumnOrder visitor start-row end-row start-column end-column)))
  (^Double [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor]
    (-> this (.walkInColumnOrder visitor))))

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
  (^Double [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInRowOrder visitor start-row end-row start-column end-column)))
  (^Double [^Array2DRowRealMatrix this ^org.apache.commons.math4.linear.RealMatrixChangingVisitor visitor]
    (-> this (.walkInRowOrder visitor))))

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
  ([^Array2DRowRealMatrix this sub-matrix ^Integer row ^Integer column]
    (-> this (.setSubMatrix sub-matrix row column))))

