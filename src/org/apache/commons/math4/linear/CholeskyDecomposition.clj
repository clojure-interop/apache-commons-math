(ns org.apache.commons.math4.linear.CholeskyDecomposition
  "Calculates the Cholesky decomposition of a matrix.
  The Cholesky decomposition of a real symmetric positive-definite
  matrix A consists of a lower triangular matrix L with same size such
  that: A = LLT. In a sense, this is the square root of A.
  This class is based on the class with similar name from the
  JAMA library, with the
  following changes:

    a getLT method has been added,
    the isspd method has been removed, since the constructor of
    this class throws a NonPositiveDefiniteMatrixException when a
    matrix cannot be decomposed,
    a getDeterminant method has been added,
    the solve method has been replaced by a getSolver method and the equivalent method provided by the returned
    DecompositionSolver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear CholeskyDecomposition]))

(defn ->cholesky-decomposition
  "Constructor.

  Calculates the Cholesky decomposition of the given matrix.

  matrix - the matrix to decompose - `org.apache.commons.math4.linear.RealMatrix`
  relative-symmetry-threshold - threshold above which off-diagonal elements are considered too different and matrix not symmetric - `double`
  absolute-positivity-threshold - threshold below which diagonal elements are considered null and matrix not positive definite - `double`

  throws: org.apache.commons.math4.linear.NonSquareMatrixException - if the matrix is not square."
  (^CholeskyDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix ^Double relative-symmetry-threshold ^Double absolute-positivity-threshold]
    (new CholeskyDecomposition matrix relative-symmetry-threshold absolute-positivity-threshold))
  (^CholeskyDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new CholeskyDecomposition matrix)))

(def *-default-relative-symmetry-threshold
  "Static Constant.

  Default threshold above which off-diagonal elements are considered too different
   and matrix not symmetric.

  type: double"
  CholeskyDecomposition/DEFAULT_RELATIVE_SYMMETRY_THRESHOLD)

(def *-default-absolute-positivity-threshold
  "Static Constant.

  Default threshold below which diagonal elements are considered null
   and matrix not positive definite.

  type: double"
  CholeskyDecomposition/DEFAULT_ABSOLUTE_POSITIVITY_THRESHOLD)

(defn get-l
  "Returns the matrix L of the decomposition.
   L is an lower-triangular matrix

  returns: the L matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^CholeskyDecomposition this]
    (-> this (.getL))))

(defn get-lt
  "Returns the transpose of the matrix L of the decomposition.
   LT is an upper-triangular matrix

  returns: the transpose of the matrix L of the decomposition - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^CholeskyDecomposition this]
    (-> this (.getLT))))

(defn get-determinant
  "Return the determinant of the matrix

  returns: determinant of the matrix - `double`"
  (^Double [^CholeskyDecomposition this]
    (-> this (.getDeterminant))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in least square sense.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`"
  (^org.apache.commons.math4.linear.DecompositionSolver [^CholeskyDecomposition this]
    (-> this (.getSolver))))

