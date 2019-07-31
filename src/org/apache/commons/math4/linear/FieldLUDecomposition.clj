(ns org.apache.commons.math4.linear.FieldLUDecomposition
  "Calculates the LUP-decomposition of a square matrix.
  The LUP-decomposition of a matrix A consists of three matrices
  L, U and P that satisfy: PA = LU, L is lower triangular, and U is
  upper triangular and P is a permutation matrix. All matrices are
  m×m.
  Since field elements do not provide an ordering
  operator, the permutation matrix is computed here only in order to avoid
  a zero pivot element, no attempt is done to get the largest pivot
  element.
  This class is based on the class with similar name from the
  JAMA library.

    a getP method has been added,
    the det method has been renamed as getDeterminant,
    the getDoublePivot method has been removed (but the int based
    getPivot method has been kept),
    the solve and isNonSingular methods have been replaced
    by a getSolver method and the equivalent methods
    provided by the returned DecompositionSolver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear FieldLUDecomposition]))

(defn ->field-lu-decomposition
  "Constructor.

  Calculates the LU-decomposition of the given matrix.

  matrix - The matrix to decompose. - `org.apache.commons.math4.linear.FieldMatrix`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if matrix is not square"
  (^FieldLUDecomposition [^org.apache.commons.math4.linear.FieldMatrix matrix]
    (new FieldLUDecomposition matrix)))

(defn get-l
  "Returns the matrix L of the decomposition.
   L is a lower-triangular matrix

  returns: the L matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^FieldLUDecomposition this]
    (-> this (.getL))))

(defn get-u
  "Returns the matrix U of the decomposition.
   U is an upper-triangular matrix

  returns: the U matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^FieldLUDecomposition this]
    (-> this (.getU))))

(defn get-p
  "Returns the P rows permutation matrix.
   P is a sparse matrix with exactly one element set to 1.0 in
   each row and each column, all other elements being set to 0.0.
   The positions of the 1 elements are given by the pivot permutation vector.

  returns: the P rows permutation matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^FieldLUDecomposition this]
    (-> this (.getP))))

(defn get-pivot
  "Returns the pivot permutation vector.

  returns: the pivot permutation vector - `int[]`"
  ([^FieldLUDecomposition this]
    (-> this (.getPivot))))

(defn get-determinant
  "Return the determinant of the matrix.

  returns: determinant of the matrix - `T`"
  ([^FieldLUDecomposition this]
    (-> this (.getDeterminant))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in exact linear sense.

  returns: a solver - `org.apache.commons.math4.linear.FieldDecompositionSolver<T>`"
  (^org.apache.commons.math4.linear.FieldDecompositionSolver [^FieldLUDecomposition this]
    (-> this (.getSolver))))

