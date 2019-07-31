(ns org.apache.commons.math4.linear.LUDecomposition
  "Calculates the LUP-decomposition of a square matrix.
  The LUP-decomposition of a matrix A consists of three matrices L, U and
  P that satisfy: P×A = L×U. L is lower triangular (with unit
  diagonal terms), U is upper triangular and P is a permutation matrix. All
  matrices are m×m.
  As shown by the presence of the P matrix, this decomposition is
  implemented using partial pivoting.
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
  (:import [org.apache.commons.math4.linear LUDecomposition]))

(defn ->lu-decomposition
  "Constructor.

  Calculates the LU-decomposition of the given matrix.

  matrix - The matrix to decompose. - `org.apache.commons.math4.linear.RealMatrix`
  singularity-threshold - threshold (based on partial row norm) under which a matrix is considered singular - `double`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if matrix is not square"
  (^LUDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix ^Double singularity-threshold]
    (new LUDecomposition matrix singularity-threshold))
  (^LUDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new LUDecomposition matrix)))

(defn get-l
  "Returns the matrix L of the decomposition.
   L is a lower-triangular matrix

  returns: the L matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^LUDecomposition this]
    (-> this (.getL))))

(defn get-u
  "Returns the matrix U of the decomposition.
   U is an upper-triangular matrix

  returns: the U matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^LUDecomposition this]
    (-> this (.getU))))

(defn get-p
  "Returns the P rows permutation matrix.
   P is a sparse matrix with exactly one element set to 1.0 in
   each row and each column, all other elements being set to 0.0.
   The positions of the 1 elements are given by the pivot permutation vector.

  returns: the P rows permutation matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^LUDecomposition this]
    (-> this (.getP))))

(defn get-pivot
  "Returns the pivot permutation vector.

  returns: the pivot permutation vector - `int[]`"
  ([^LUDecomposition this]
    (-> this (.getPivot))))

(defn get-determinant
  "Return the determinant of the matrix

  returns: determinant of the matrix - `double`"
  (^Double [^LUDecomposition this]
    (-> this (.getDeterminant))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in exact linear
   sense.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`"
  (^org.apache.commons.math4.linear.DecompositionSolver [^LUDecomposition this]
    (-> this (.getSolver))))

