(ns org.apache.commons.math4.linear.OpenMapRealMatrix
  "Sparse matrix implementation based on an open addressed map.


   Caveat: This implementation assumes that, for any x,
   the equality x * 0d == 0d holds. But it is is not true for
   NaN. Moreover, zero entries will lose their sign.
   Some operations (that involve NaN and/or infinities) may
   thus give incorrect results."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear OpenMapRealMatrix]))

(defn ->open-map-real-matrix
  "Constructor.

  Build a sparse matrix with the supplied row and column dimensions.

  row-dimension - Number of rows of the matrix. - `int`
  column-dimension - Number of columns of the matrix. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if row or column dimension is not positive."
  (^OpenMapRealMatrix [^Integer row-dimension ^Integer column-dimension]
    (new OpenMapRealMatrix row-dimension column-dimension))
  (^OpenMapRealMatrix [^org.apache.commons.math4.linear.OpenMapRealMatrix matrix]
    (new OpenMapRealMatrix matrix)))

(defn create-matrix
  "Create a new RealMatrix of the same type as the instance with the
   supplied
   row and column dimensions.

  row-dimension - the number of rows in the new matrix - `int`
  column-dimension - the number of columns in the new matrix - `int`

  returns: a new matrix of the same type as the instance - `org.apache.commons.math4.linear.OpenMapRealMatrix`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the total number of entries of the matrix is larger than Integer.MAX_VALUE."
  (^org.apache.commons.math4.linear.OpenMapRealMatrix [^OpenMapRealMatrix this ^Integer row-dimension ^Integer column-dimension]
    (-> this (.createMatrix row-dimension column-dimension))))

(defn get-column-dimension
  "Returns the number of columns of this matrix.

  returns: the number of columns. - `int`"
  (^Integer [^OpenMapRealMatrix this]
    (-> this (.getColumnDimension))))

(defn copy
  "Returns a (deep) copy of this.

  returns: matrix copy - `org.apache.commons.math4.linear.OpenMapRealMatrix`"
  (^org.apache.commons.math4.linear.OpenMapRealMatrix [^OpenMapRealMatrix this]
    (-> this (.copy))))

(defn multiply
  "Returns the result of postmultiplying this by m.

  m - matrix to postmultiply by - `org.apache.commons.math4.linear.RealMatrix`

  returns: this * m - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if m is an OpenMapRealMatrix, and the total number of entries of the product is larger than Integer.MAX_VALUE."
  (^org.apache.commons.math4.linear.RealMatrix [^OpenMapRealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.multiply m))))

(defn get-entry
  "Get the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be fetched. - `int`
  column - Column index of entry to be fetched. - `int`

  returns: the matrix entry at (row, column). - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  (^Double [^OpenMapRealMatrix this ^Integer row ^Integer column]
    (-> this (.getEntry row column))))

(defn get-row-dimension
  "Returns the number of rows of this matrix.

  returns: the number of rows. - `int`"
  (^Integer [^OpenMapRealMatrix this]
    (-> this (.getRowDimension))))

(defn subtract
  "Returns this minus m.

  m - matrix to be subtracted - `org.apache.commons.math4.linear.RealMatrix`

  returns: this - m - `org.apache.commons.math4.linear.OpenMapRealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.OpenMapRealMatrix [^OpenMapRealMatrix this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.subtract m))))

(defn set-entry
  "Set the entry in the specified row and column. Row and column indices
   start at 0.

  row - Row index of entry to be set. - `int`
  column - Column index of entry to be set. - `int`
  value - the new value of the entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid"
  ([^OpenMapRealMatrix this ^Integer row ^Integer column ^Double value]
    (-> this (.setEntry row column value))))

(defn add-to-entry
  "Adds (in place) the specified value to the specified entry of
   this matrix. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  increment - value to add to the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^OpenMapRealMatrix this ^Integer row ^Integer column ^Double increment]
    (-> this (.addToEntry row column increment))))

(defn multiply-entry
  "Multiplies (in place) the specified entry of this matrix by the
   specified value. Row and column indices start at 0.

  row - Row index of the entry to be modified. - `int`
  column - Column index of the entry to be modified. - `int`
  factor - Multiplication factor for the matrix entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the row or column index is not valid."
  ([^OpenMapRealMatrix this ^Integer row ^Integer column ^Double factor]
    (-> this (.multiplyEntry row column factor))))

(defn add
  "Compute the sum of this matrix and m.

  m - Matrix to be added. - `org.apache.commons.math4.linear.OpenMapRealMatrix`

  returns: this  m. - `org.apache.commons.math4.linear.OpenMapRealMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if m is not the same size as this."
  (^org.apache.commons.math4.linear.OpenMapRealMatrix [^OpenMapRealMatrix this ^org.apache.commons.math4.linear.OpenMapRealMatrix m]
    (-> this (.add m))))

