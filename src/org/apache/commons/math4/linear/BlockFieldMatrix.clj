(ns org.apache.commons.math4.linear.BlockFieldMatrix
  "Cache-friendly implementation of FieldMatrix using a flat arrays to store
  square blocks of the matrix.

  This implementation is specially designed to be cache-friendly. Square blocks are
  stored as small arrays and allow efficient traversal of data both in row major direction
  and columns major direction, one block at a time. This greatly increases performances
  for algorithms that use crossed directions loops like multiplication or transposition.


  The size of square blocks is a static parameter. It may be tuned according to the cache
  size of the target computer processor. As a rule of thumbs, it should be the largest
  value that allows three blocks to be simultaneously cached (this is necessary for example
  for matrix multiplication). The default value is to use 36x36 blocks.


  The regular blocks represent BLOCK_SIZE x BLOCK_SIZE squares. Blocks
  at right hand side and bottom side which may be smaller to fit matrix dimensions. The square
  blocks are flattened in row major order in single dimension arrays which are therefore
  BLOCK_SIZE2 elements long for regular blocks. The blocks are themselves
  organized in row major order.


  As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.
  Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be
  a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]
  array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding
  the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center
  24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28
  rectangle.


  The layout complexity overhead versus simple mapping of matrices to java
  arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads
  to up to 3-fold improvements for matrices of moderate to large size."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear BlockFieldMatrix]))

(defn ->block-field-matrix
  "Constructor.

  Create a new dense matrix copying entries from block layout data.
   The input array must already be in blocks layout.

  rows - the number of rows in the new matrix - `int`
  columns - the number of columns in the new matrix - `int`
  block-data - data for new matrix - `T[][]`
  copy-array - if true, the input array will be copied, otherwise it will be referenced - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the blockData shape is inconsistent with block layout."
  (^BlockFieldMatrix [^Integer rows ^Integer columns block-data ^Boolean copy-array]
    (new BlockFieldMatrix rows columns block-data copy-array))
  (^BlockFieldMatrix [^org.apache.commons.math4.Field field ^Integer rows ^Integer columns]
    (new BlockFieldMatrix field rows columns))
  (^BlockFieldMatrix [raw-data]
    (new BlockFieldMatrix raw-data)))

(def *-block-size
  "Static Constant.

  Block size.

  type: int"
  BlockFieldMatrix/BLOCK_SIZE)

(defn *to-blocks-layout
  "Convert a data array from raw layout to blocks layout.

   Raw layout is the straightforward layout where element at row i and
   column j is in array element rawData[i][j]. Blocks layout
   is the layout used in BlockFieldMatrix instances, where the matrix
   is split in square blocks (except at right and bottom side where blocks may
   be rectangular to fit matrix size) and each block is stored in a flattened
   one-dimensional array.


   This method creates an array in blocks layout from an input array in raw layout.
   It can be used to provide the array argument of the BlockFieldMatrix(int, int, FieldElement[][], boolean)
   constructor.

  raw-data - Data array in raw layout. - `T[][]`

  returns: a new data array containing the same entries but in blocks layout - `<T extends org.apache.commons.math4.FieldElement<T>> T[][]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if rawData is not rectangular (not all rows have the same length)."
  ([raw-data]
    (BlockFieldMatrix/toBlocksLayout raw-data)))

(defn *create-blocks-layout
  "Create a data array in blocks layout.

   This method can be used to create the array argument of the BlockFieldMatrix(int, int, FieldElement[][], boolean)
   constructor.

  field - Field to which the elements belong. - `org.apache.commons.math4.Field`
  rows - Number of rows in the new matrix. - `int`
  columns - Number of columns in the new matrix. - `int`

  returns: a new data array in blocks layout. - `<T extends org.apache.commons.math4.FieldElement<T>> T[][]`"
  ([^org.apache.commons.math4.Field field ^Integer rows ^Integer columns]
    (BlockFieldMatrix/createBlocksLayout field rows columns)))

(defn scalar-add
  "Increment each entry of this matrix.

  d - Value to be added to each entry. - `T`

  returns: d  this. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this d]
    (-> this (.scalarAdd d))))

(defn pre-multiply
  "Returns the (row) vector result of premultiplying this by the vector
   v.

  v - the row vector to premultiply by - `T[]`

  returns: v * this - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of rows of this matrix is not equal to the size of the vector v"
  ([^BlockFieldMatrix this v]
    (-> this (.preMultiply v))))

(defn set-row-vector
  "Set the entries in row number row
   as a vector.

  row - Row to be set. - `int`
  vector - row vector (must have the same number of columns as the instance). - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the vector dimension does not match one instance row."
  ([^BlockFieldMatrix this ^Integer row ^org.apache.commons.math4.linear.FieldVector vector]
    (-> this (.setRowVector row vector))))

(defn create-matrix
  "Create a new FieldMatrix of the same type as the instance with
   the supplied row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: a 2-dimensional array of entries. - `T[][]`"
  ([^BlockFieldMatrix this]
    (-> this (.getData))))

(defn get-column-matrix
  "Get the entries in column number column
   as a column matrix.

  column - Column to be fetched. - `int`

  returns: a column matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^Integer column]
    (-> this (.getColumnMatrix column))))

(defn get-column-dimension
  "Returns the number of columns in the matrix.

  returns: columnDimension - `int`"
  (^Integer [^BlockFieldMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Make a (deep) copy of this.

  returns: a copy of this matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this]
    (-> this (.copy))))

(defn scalar-multiply
  "Multiply each entry by d.

  d - Value to multiply all entries by. - `T`

  returns: d * this. - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this d]
    (-> this (.scalarMultiply d))))

(defn multiply
  "Postmultiply this matrix by m.

  m - Matrix to postmultiply by. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this * m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the number of rows of matrix m."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.multiply m))))

(defn get-column
  "Get the entries in column number col as an array.

  column - the column to be fetched - `int`

  returns: array of entries in the column - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is not valid."
  ([^BlockFieldMatrix this ^Integer column]
    (-> this (.getColumn column))))

(defn get-entry
  "Returns the entry in the specified row and column.

  row - row location of entry to be fetched - `int`
  column - column location of entry to be fetched - `int`

  returns: matrix entry in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^BlockFieldMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `T[]`

  returns: this * v - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the number of columns of this matrix is not equal to the size of the vector v."
  ([^BlockFieldMatrix this v]
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

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  ([^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInOptimizedOrder visitor start-row end-row start-column end-column)))
  ([^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInOptimizedOrder visitor))))

(defn get-column-vector
  "Returns the entries in column number column
   as a vector.

  column - Column to be fetched. - `int`

  returns: a column vector. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  (^org.apache.commons.math4.linear.FieldVector [^BlockFieldMatrix this ^Integer column]
    (-> this (.getColumnVector column))))

(defn get-sub-matrix
  "Get a submatrix. Rows and columns are indicated
   counting from 0 to n - 1.

  start-row - Initial row index - `int`
  end-row - Final row index (inclusive) - `int`
  start-column - Initial column index - `int`
  end-column - Final column index (inclusive) - `int`

  returns: the matrix containing the data of the specified rows and columns. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.getSubMatrix start-row end-row start-column end-column))))

(defn get-row-dimension
  "Returns the number of rows in the matrix.

  returns: rowDimension - `int`"
  (^Integer [^BlockFieldMatrix this]
    (-> this (.getRowDimension))))

(defn set-column
  "Set the entries in column number column
   as a column matrix.

  column - the column to be set - `int`
  array - column array (must have the same number of rows as the instance) - `T[]`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the array size does not match one instance column."
  ([^BlockFieldMatrix this ^Integer column array]
    (-> this (.setColumn column array))))

(defn set-row
  "Set the entries in row number row
   as a row matrix.

  row - Row to be set. - `int`
  array - Row matrix (must have the same number of columns as the instance). - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  ([^BlockFieldMatrix this ^Integer row array]
    (-> this (.setRow row array))))

(defn set-row-matrix
  "Set the entries in row number row
   as a row matrix.

  row - Row to be set. - `int`
  matrix - Row matrix (must have one row and the same number of columns as the instance). - `org.apache.commons.math4.linear.FieldMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the matrix dimensions do not match one instance row."
  ([^BlockFieldMatrix this ^Integer row ^org.apache.commons.math4.linear.FieldMatrix matrix]
    (-> this (.setRowMatrix row matrix))))

(defn subtract
  "Subtract m from this matrix.

  m - Matrix to be subtracted. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this - m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.subtract m))))

(defn set-column-matrix
  "Set the entries in column number column
   as a column matrix.

  column - Column to be set. - `int`
  matrix - column matrix (must have one column and the same number of rows as the instance). - `org.apache.commons.math4.linear.FieldMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the matrix dimensions do not match one instance column."
  ([^BlockFieldMatrix this ^Integer column ^org.apache.commons.math4.linear.FieldMatrix matrix]
    (-> this (.setColumnMatrix column matrix))))

(defn get-row
  "Get the entries in row number row as an array.

  row - Row to be fetched. - `int`

  returns: array of entries in the row. - `T[]`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is not valid."
  ([^BlockFieldMatrix this ^Integer row]
    (-> this (.getRow row))))

(defn get-row-vector
  "Get the entries in row number row
   as a vector.

  row - Row to be fetched - `int`

  returns: a row vector. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.FieldVector [^BlockFieldMatrix this ^Integer row]
    (-> this (.getRowVector row))))

(defn set-entry
  "Set the entry in the specified row and column.

  row - row location of entry to be set - `int`
  column - column location of entry to be set - `int`
  value - matrix entry to be set in row,column - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^BlockFieldMatrix this ^Integer row ^Integer column value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  increment - Value to add to the current matrix entry in (row, column). - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^BlockFieldMatrix this ^Integer row ^Integer column increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Change an entry in the specified row and column.

  row - Row location of entry to be set. - `int`
  column - Column location of entry to be set. - `int`
  factor - Multiplication factor for the current matrix entry in (row,column) - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^BlockFieldMatrix this ^Integer row ^Integer column factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Compute the sum of this and m.

  m - Matrix to be added. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this matrix."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrix m]
    (-> this (.add m))))

(defn get-row-matrix
  "Get the entries in row number row
   as a row matrix.

  row - Row to be fetched. - `int`

  returns: a row matrix. - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified row index is invalid."
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this ^Integer row]
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

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are not valid."
  ([^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (-> this (.walkInRowOrder visitor start-row end-row start-column end-column)))
  ([^BlockFieldMatrix this ^org.apache.commons.math4.linear.FieldMatrixChangingVisitor visitor]
    (-> this (.walkInRowOrder visitor))))

(defn transpose
  "Returns the transpose of this matrix.

  returns: transpose matrix - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^BlockFieldMatrix this]
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
  ([^BlockFieldMatrix this sub-matrix ^Integer row ^Integer column]
    (-> this (.setSubMatrix sub-matrix row column))))

(defn set-column-vector
  "Set the entries in column number column
   as a vector.

  column - Column to be set. - `int`
  vector - Column vector (must have the same number of rows as the instance). - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the specified column index is invalid."
  ([^BlockFieldMatrix this ^Integer column ^org.apache.commons.math4.linear.FieldVector vector]
    (-> this (.setColumnVector column vector))))

