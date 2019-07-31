(ns org.apache.commons.math4.linear.MatrixUtils
  "A collection of static methods that operate on or return matrices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear MatrixUtils]))

(def *-default-format
  "Static Constant.

  The default format for RealMatrix objects.

  type: org.apache.commons.math4.linear.RealMatrixFormat"
  MatrixUtils/DEFAULT_FORMAT)

(def *-octave-format
  "Static Constant.

  A format for RealMatrix objects compatible with octave.

  type: org.apache.commons.math4.linear.RealMatrixFormat"
  MatrixUtils/OCTAVE_FORMAT)

(defn *deserialize-real-vector
  "Deserialize  a RealVector field in a class.

   This method is intended to be called from within a private
   readObject method (after a call to
   ois.defaultReadObject()) in a class that has a
   RealVector field, which should be declared transient.
   This way, the default handling does not deserialize the vector (the RealVector interface is not serializable by default) but this method does
   deserialize it specifically.

  instance - instance in which the field must be set up - `java.lang.Object`
  field-name - name of the field within the class (may be private and final) - `java.lang.String`
  ois - stream from which the real vector should be read - `java.io.ObjectInputStream`

  throws: java.lang.ClassNotFoundException - if a class in the stream cannot be found"
  ([^java.lang.Object instance ^java.lang.String field-name ^java.io.ObjectInputStream ois]
    (MatrixUtils/deserializeRealVector instance field-name ois)))

(defn *serialize-real-vector
  "Serialize a RealVector.

   This method is intended to be called from within a private
   writeObject method (after a call to
   oos.defaultWriteObject()) in a class that has a
   RealVector field, which should be declared transient.
   This way, the default handling does not serialize the vector (the RealVector interface is not serializable by default) but this method does
   serialize it specifically.


   The following example shows how a simple class with a name and a real vector
   should be written:


   public class NamedVector implements Serializable {

       private final String name;
       private final transient RealVector coefficients;

       // omitted constructors, getters ...

       private void writeObject(ObjectOutputStream oos) throws IOException {
           oos.defaultWriteObject();  // takes care of name field
           MatrixUtils.serializeRealVector(coefficients, oos);
       }

       private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
           ois.defaultReadObject();  // takes care of name field
           MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);
       }

   }

  vector - real vector to serialize - `org.apache.commons.math4.linear.RealVector`
  oos - stream where the real vector should be written - `java.io.ObjectOutputStream`

  throws: java.io.IOException - if object cannot be written to stream"
  ([^org.apache.commons.math4.linear.RealVector vector ^java.io.ObjectOutputStream oos]
    (MatrixUtils/serializeRealVector vector oos)))

(defn *create-real-vector
  "Creates a RealVector using the data from the input array.

  data - the input data - `double[]`

  returns: a data.length RealVector - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NoDataException - if data is empty."
  (^org.apache.commons.math4.linear.RealVector [data]
    (MatrixUtils/createRealVector data)))

(defn *create-row-real-matrix
  "Create a row RealMatrix using the data from the input
   array.

  row-data - the input row data - `double[]`

  returns: a 1 x rowData.length RealMatrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NoDataException - if rowData is empty."
  (^org.apache.commons.math4.linear.RealMatrix [row-data]
    (MatrixUtils/createRowRealMatrix row-data)))

(defn *serialize-real-matrix
  "Serialize a RealMatrix.

   This method is intended to be called from within a private
   writeObject method (after a call to
   oos.defaultWriteObject()) in a class that has a
   RealMatrix field, which should be declared transient.
   This way, the default handling does not serialize the matrix (the RealMatrix interface is not serializable by default) but this method does
   serialize it specifically.


   The following example shows how a simple class with a name and a real matrix
   should be written:


   public class NamedMatrix implements Serializable {

       private final String name;
       private final transient RealMatrix coefficients;

       // omitted constructors, getters ...

       private void writeObject(ObjectOutputStream oos) throws IOException {
           oos.defaultWriteObject();  // takes care of name field
           MatrixUtils.serializeRealMatrix(coefficients, oos);
       }

       private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
           ois.defaultReadObject();  // takes care of name field
           MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);
       }

   }

  matrix - real matrix to serialize - `org.apache.commons.math4.linear.RealMatrix`
  oos - stream where the real matrix should be written - `java.io.ObjectOutputStream`

  throws: java.io.IOException - if object cannot be written to stream"
  ([^org.apache.commons.math4.linear.RealMatrix matrix ^java.io.ObjectOutputStream oos]
    (MatrixUtils/serializeRealMatrix matrix oos)))

(defn *symmetric?
  "Checks whether a matrix is symmetric.

  matrix - Matrix to check. - `org.apache.commons.math4.linear.RealMatrix`
  eps - Relative tolerance. - `double`

  returns: true if matrix is symmetric. - `boolean`"
  (^Boolean [^org.apache.commons.math4.linear.RealMatrix matrix ^Double eps]
    (MatrixUtils/isSymmetric matrix eps)))

(defn *solve-upper-triangular-system
  "Solver a  system composed  of an Upper Triangular Matrix
   RealMatrix.

   This method is called to solve systems of equations which are
   of the lower triangular form. The matrix RealMatrix
   is assumed, though not checked, to be in upper triangular form.
   The vector RealVector is overwritten with the solution.
   The matrix is checked that it is square and its dimensions match
   the length of the vector.

  rm - RealMatrix which is upper triangular - `org.apache.commons.math4.linear.RealMatrix`
  b - RealVector this is overwritten - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the matrix and vector are not conformable"
  ([^org.apache.commons.math4.linear.RealMatrix rm ^org.apache.commons.math4.linear.RealVector b]
    (MatrixUtils/solveUpperTriangularSystem rm b)))

(defn *create-field-vector
  "Creates a FieldVector using the data from the input array.

  data - the input data - `T[]`

  returns: a data.length FieldVector - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NoDataException - if data is empty."
  ([data]
    (MatrixUtils/createFieldVector data)))

(defn *block-inverse
  "Computes the inverse of the given matrix by splitting it into
   4 sub-matrices.

  m - Matrix whose inverse must be computed. - `org.apache.commons.math4.linear.RealMatrix`
  split-index - Index that determines the \"split\" line and column. The element corresponding to this index will part of the upper-left sub-matrix. - `int`

  returns: the inverse of m. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if m is not square."
  (^org.apache.commons.math4.linear.RealMatrix [^org.apache.commons.math4.linear.RealMatrix m ^Integer split-index]
    (MatrixUtils/blockInverse m split-index)))

(defn *create-column-real-matrix
  "Creates a column RealMatrix using the data from the input
   array.

  column-data - the input column data - `double[]`

  returns: a columnData x 1 RealMatrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NoDataException - if columnData is empty."
  (^org.apache.commons.math4.linear.RealMatrix [column-data]
    (MatrixUtils/createColumnRealMatrix column-data)))

(defn *check-sub-matrix-index
  "Check if submatrix ranges indices are valid.
   Rows and columns are indicated counting from 0 to n - 1.

  m - Matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  start-row - Initial row index. - `int`
  end-row - Final row index. - `int`
  start-column - Initial column index. - `int`
  end-column - Final column index. - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the indices are invalid."
  ([^org.apache.commons.math4.linear.AnyMatrix m ^Integer start-row ^Integer end-row ^Integer start-column ^Integer end-column]
    (MatrixUtils/checkSubMatrixIndex m start-row end-row start-column end-column))
  ([^org.apache.commons.math4.linear.AnyMatrix m selected-rows selected-columns]
    (MatrixUtils/checkSubMatrixIndex m selected-rows selected-columns)))

(defn *big-fraction-matrix-to-real-matrix
  "Convert a FieldMatrix/BigFraction matrix to a RealMatrix.

  m - Matrix to convert. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: the converted matrix. - `org.apache.commons.math4.linear.Array2DRowRealMatrix`"
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^org.apache.commons.math4.linear.FieldMatrix m]
    (MatrixUtils/bigFractionMatrixToRealMatrix m)))

(defn *check-matrix-index
  "Check if matrix indices are valid.

  m - Matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  row - Row index to check. - `int`
  column - Column index to check. - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if row or column is not a valid index."
  ([^org.apache.commons.math4.linear.AnyMatrix m ^Integer row ^Integer column]
    (MatrixUtils/checkMatrixIndex m row column)))

(defn *fraction-matrix-to-real-matrix
  "Convert a FieldMatrix/Fraction matrix to a RealMatrix.

  m - Matrix to convert. - `org.apache.commons.math4.linear.FieldMatrix`

  returns: the converted matrix. - `org.apache.commons.math4.linear.Array2DRowRealMatrix`"
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^org.apache.commons.math4.linear.FieldMatrix m]
    (MatrixUtils/fractionMatrixToRealMatrix m)))

(defn *create-real-matrix
  "Returns a RealMatrix with specified dimensions.
   The type of matrix returned depends on the dimension. Below
   212 elements (i.e. 4096 elements or 64×64 for a
   square matrix) which can be stored in a 32kB array, a Array2DRowRealMatrix instance is built. Above this threshold a BlockRealMatrix instance is built.
   The matrix elements are all set to 0.0.

  rows - number of rows of the matrix - `int`
  columns - number of columns of the matrix - `int`

  returns: RealMatrix with specified dimensions - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^Integer rows ^Integer columns]
    (MatrixUtils/createRealMatrix rows columns))
  (^org.apache.commons.math4.linear.RealMatrix [data]
    (MatrixUtils/createRealMatrix data)))

(defn *check-subtraction-compatible
  "Check if matrices are subtraction compatible

  left - Left hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  right - Right hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the matrices are not addition compatible."
  ([^org.apache.commons.math4.linear.AnyMatrix left ^org.apache.commons.math4.linear.AnyMatrix right]
    (MatrixUtils/checkSubtractionCompatible left right)))

(defn *check-addition-compatible
  "Check if matrices are addition compatible.

  left - Left hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  right - Right hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`

  throws: org.apache.commons.math4.linear.MatrixDimensionMismatchException - if the matrices are not addition compatible."
  ([^org.apache.commons.math4.linear.AnyMatrix left ^org.apache.commons.math4.linear.AnyMatrix right]
    (MatrixUtils/checkAdditionCompatible left right)))

(defn *create-column-field-matrix
  "Creates a column FieldMatrix using the data from the input
   array.

  column-data - the input column data - `T[]`

  returns: a columnData x 1 FieldMatrix - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NoDataException - if data is empty."
  ([column-data]
    (MatrixUtils/createColumnFieldMatrix column-data)))

(defn *create-field-identity-matrix
  "Returns dimension x dimension identity matrix.

  field - field to which the elements belong - `org.apache.commons.math4.Field`
  dimension - dimension of identity matrix to generate - `int`

  returns: identity matrix - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: java.lang.IllegalArgumentException - if dimension is not positive"
  ([^org.apache.commons.math4.Field field ^Integer dimension]
    (MatrixUtils/createFieldIdentityMatrix field dimension)))

(defn *check-symmetric
  "Checks whether a matrix is symmetric.

  matrix - Matrix to check. - `org.apache.commons.math4.linear.RealMatrix`
  eps - Relative tolerance. - `double`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if the matrix is not square."
  ([^org.apache.commons.math4.linear.RealMatrix matrix ^Double eps]
    (MatrixUtils/checkSymmetric matrix eps)))

(defn *deserialize-real-matrix
  "Deserialize  a RealMatrix field in a class.

   This method is intended to be called from within a private
   readObject method (after a call to
   ois.defaultReadObject()) in a class that has a
   RealMatrix field, which should be declared transient.
   This way, the default handling does not deserialize the matrix (the RealMatrix interface is not serializable by default) but this method does
   deserialize it specifically.

  instance - instance in which the field must be set up - `java.lang.Object`
  field-name - name of the field within the class (may be private and final) - `java.lang.String`
  ois - stream from which the real matrix should be read - `java.io.ObjectInputStream`

  throws: java.lang.ClassNotFoundException - if a class in the stream cannot be found"
  ([^java.lang.Object instance ^java.lang.String field-name ^java.io.ObjectInputStream ois]
    (MatrixUtils/deserializeRealMatrix instance field-name ois)))

(defn *create-row-field-matrix
  "Create a row FieldMatrix using the data from the input
   array.

  row-data - the input row data - `T[]`

  returns: a 1 x rowData.length FieldMatrix - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.exception.NoDataException - if rowData is empty."
  ([row-data]
    (MatrixUtils/createRowFieldMatrix row-data)))

(defn *check-column-index
  "Check if a column index is valid.

  m - Matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  column - Column index to check. - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if column is not a valid index."
  ([^org.apache.commons.math4.linear.AnyMatrix m ^Integer column]
    (MatrixUtils/checkColumnIndex m column)))

(defn *create-field-diagonal-matrix
  "Returns a diagonal matrix with specified elements.

  diagonal - diagonal elements of the matrix (the array elements will be copied) - `T[]`

  returns: diagonal matrix - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldMatrix<T>`"
  ([diagonal]
    (MatrixUtils/createFieldDiagonalMatrix diagonal)))

(defn *check-row-index
  "Check if a row index is valid.

  m - Matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  row - Row index to check. - `int`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if row is not a valid index."
  ([^org.apache.commons.math4.linear.AnyMatrix m ^Integer row]
    (MatrixUtils/checkRowIndex m row)))

(defn *inverse
  "Computes the inverse of the given matrix.

   By default, the inverse of the matrix is computed using the QR-decomposition,
   unless a more efficient method can be determined for the input matrix.

  matrix - Matrix whose inverse shall be computed - `org.apache.commons.math4.linear.RealMatrix`
  threshold - Singularity threshold - `double`

  returns: the inverse of m - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NullArgumentException - if matrix is null"
  (^org.apache.commons.math4.linear.RealMatrix [^org.apache.commons.math4.linear.RealMatrix matrix ^Double threshold]
    (MatrixUtils/inverse matrix threshold))
  (^org.apache.commons.math4.linear.RealMatrix [^org.apache.commons.math4.linear.RealMatrix matrix]
    (MatrixUtils/inverse matrix)))

(defn *create-real-diagonal-matrix
  "Creates a diagonal matrix with the specified diagonal elements.

  diagonal - Diagonal elements of the matrix. The array elements will be copied. - `double[]`

  returns: a diagonal matrix instance. - `org.apache.commons.math4.linear.DiagonalMatrix`"
  (^org.apache.commons.math4.linear.DiagonalMatrix [diagonal]
    (MatrixUtils/createRealDiagonalMatrix diagonal)))

(defn *create-field-matrix
  "Returns a FieldMatrix with specified dimensions.
   The type of matrix returned depends on the dimension. Below
   212 elements (i.e. 4096 elements or 64×64 for a
   square matrix), a FieldMatrix instance is built. Above
   this threshold a BlockFieldMatrix instance is built.
   The matrix elements are all set to field.getZero().

  field - field to which the matrix elements belong - `org.apache.commons.math4.Field`
  rows - number of rows of the matrix - `int`
  columns - number of columns of the matrix - `int`

  returns: FieldMatrix with specified dimensions - `<T extends org.apache.commons.math4.FieldElement<T>> org.apache.commons.math4.linear.FieldMatrix<T>`"
  ([^org.apache.commons.math4.Field field ^Integer rows ^Integer columns]
    (MatrixUtils/createFieldMatrix field rows columns))
  ([data]
    (MatrixUtils/createFieldMatrix data)))

(defn *check-multiplication-compatible
  "Check if matrices are multiplication compatible

  left - Left hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`
  right - Right hand side matrix. - `org.apache.commons.math4.linear.AnyMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if matrices are not multiplication compatible."
  ([^org.apache.commons.math4.linear.AnyMatrix left ^org.apache.commons.math4.linear.AnyMatrix right]
    (MatrixUtils/checkMultiplicationCompatible left right)))

(defn *solve-lower-triangular-system
  "Solve  a  system of composed of a Lower Triangular Matrix
   RealMatrix.

   This method is called to solve systems of equations which are
   of the lower triangular form. The matrix RealMatrix
   is assumed, though not checked, to be in lower triangular form.
   The vector RealVector is overwritten with the solution.
   The matrix is checked that it is square and its dimensions match
   the length of the vector.

  rm - RealMatrix which is lower triangular - `org.apache.commons.math4.linear.RealMatrix`
  b - RealVector this is overwritten - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the matrix and vector are not conformable"
  ([^org.apache.commons.math4.linear.RealMatrix rm ^org.apache.commons.math4.linear.RealVector b]
    (MatrixUtils/solveLowerTriangularSystem rm b)))

(defn *create-real-matrix-with-diagonal
  "Creates a dense matrix with the specified diagonal elements.

  diagonal - Diagonal elements of the matrix. - `double[]`

  returns: a matrix instance. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [diagonal]
    (MatrixUtils/createRealMatrixWithDiagonal diagonal)))

(defn *create-real-identity-matrix
  "Returns dimension x dimension identity matrix.

  dimension - dimension of identity matrix to generate - `int`

  returns: identity matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: java.lang.IllegalArgumentException - if dimension is not positive"
  (^org.apache.commons.math4.linear.RealMatrix [^Integer dimension]
    (MatrixUtils/createRealIdentityMatrix dimension)))

