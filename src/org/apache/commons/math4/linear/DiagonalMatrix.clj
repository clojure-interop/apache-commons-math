(ns org.apache.commons.math4.linear.DiagonalMatrix
  "Implementation of a diagonal matrix."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear DiagonalMatrix]))

(defn ->diagonal-matrix
  "Constructor.

  Creates a matrix using the input array as the underlying data.

   If an array is created specially in order to be embedded in a
   this instance and not used directly, the copyArray may be
   set to false.
   This will prevent the copying and improve performance as no new
   array will be built and no data will be copied.

  d - Data for new matrix. - `double[]`
  copy-array - if true, the input array will be copied, otherwise it will be referenced. - `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null"
  (^DiagonalMatrix [d ^Boolean copy-array]
    (new DiagonalMatrix d copy-array))
  (^DiagonalMatrix [^Integer dimension]
    (new DiagonalMatrix dimension)))

(defn pre-multiply
  "Returns the (row) vector result of premultiplying this by the vector v.

  v - the row vector to premultiply by - `double[]`

  returns: v * this - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of v does not match the row dimension of this."
  ([^DiagonalMatrix this v]
    (-> this (.preMultiply v))))

(defn create-matrix
  "Create a new RealMatrix of the same type as the instance with the
   supplied
   row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the requested dimensions are not equal."
  (^org.apache.commons.math4.linear.RealMatrix [^DiagonalMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-data
  "Returns matrix entries as a two-dimensional array.

  returns: 2-dimensional array of entries - `double[][]`"
  ([^DiagonalMatrix this]
    (-> this (.getData))))

(defn get-column-dimension
  "Returns the number of columns of this matrix.

  returns: the number of columns. - `int`"
  (^Integer [^DiagonalMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Returns a (deep) copy of this.

  returns: matrix copy - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^DiagonalMatrix this]
    (-> this (.copy))))

(defn multiply
  "Returns the result of postmultiplying this by m.

  m - matrix to postmultiply by - `org.apache.commons.math4.linear.DiagonalMatrix`

  returns: this * m - `org.apache.commons.math4.linear.DiagonalMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if columnDimension(this) != rowDimension(m)"
  (^org.apache.commons.math4.linear.DiagonalMatrix [^DiagonalMatrix this ^org.apache.commons.math4.linear.DiagonalMatrix m]
    (-> this (.multiply m))))

(defn singular?
  "Returns whether this diagonal matrix is singular, i.e. any diagonal entry
   is equal to 0 within the given threshold.

  threshold - Singularity threshold. - `double`

  returns: true if the matrix is singular, false otherwise - `boolean`"
  (^Boolean [^DiagonalMatrix this ^Double threshold]
    (-> this (.isSingular threshold))))

(defn get-entry
  "Get the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be fetched. - `int`
  column - Column index of entry to be fetched. - `int`

  returns: the matrix entry at (row, column). - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  (^Double [^DiagonalMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn get-data-ref
  "Gets a reference to the underlying data array.

  returns: 1-dimensional array of entries. - `double[]`"
  ([^DiagonalMatrix this]
    (-> this (.getDataRef))))

(defn operate
  "Returns the result of multiplying this by the vector v.

  v - the vector to operate on - `double[]`

  returns: this * v - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of v does not match the column dimension of this."
  ([^DiagonalMatrix this v]
    (-> this (.operate v))))

(defn get-row-dimension
  "Returns the number of rows of this matrix.

  returns: the number of rows. - `int`"
  (^Integer [^DiagonalMatrix this]
    (-> this (.getRowDimension))))

(defn subtract
  "Returns this minus m.

  m - Matrix to be subtracted. - `org.apache.commons.math4.linear.DiagonalMatrix`

  returns: this - m - `org.apache.commons.math4.linear.DiagonalMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.DiagonalMatrix [^DiagonalMatrix this ^org.apache.commons.math4.linear.DiagonalMatrix m]
    (-> this (.subtract m))))

(defn inverse
  "Computes the inverse of this diagonal matrix.

  threshold - Singularity threshold. - `double`

  returns: the inverse of m - `org.apache.commons.math4.linear.DiagonalMatrix`

  throws: org.apache.commons.math4.linear.SingularMatrixException - if the matrix is singular"
  (^org.apache.commons.math4.linear.DiagonalMatrix [^DiagonalMatrix this ^Double threshold]
    (-> this (.inverse threshold)))
  (^org.apache.commons.math4.linear.DiagonalMatrix [^DiagonalMatrix this]
    (-> this (.inverse))))

(defn set-entry
  "Set the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be set. - `int`
  column - Column index of entry to be set. - `int`
  value - the new value of the entry. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if row != column and value is non-zero."
  ([^DiagonalMatrix this ^Integer row ^Integer column ^Double value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Adds (in place) the specified value to the specified entry of
   this matrix. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  increment - value to add to the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if row != column and increment is non-zero."
  ([^DiagonalMatrix this ^Integer row ^Integer column ^Double increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Multiplies (in place) the specified entry of this matrix by the
   specified value. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  factor - Multiplication factor for the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^DiagonalMatrix this ^Integer row ^Integer column ^Double factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Compute the sum of this and m.

  m - Matrix to be added. - `org.apache.commons.math4.linear.DiagonalMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.DiagonalMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.DiagonalMatrix [^DiagonalMatrix this ^org.apache.commons.math4.linear.DiagonalMatrix m]
    (-> this (.add m))))

