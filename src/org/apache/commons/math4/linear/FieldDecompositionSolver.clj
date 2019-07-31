(ns org.apache.commons.math4.linear.FieldDecompositionSolver
  "Interface handling decomposition algorithms that can solve A × X = B.
  Decomposition algorithms decompose an A matrix has a product of several specific
  matrices from which they can solve A × X = B in least squares sense: they find X
  such that ||A × X - B|| is minimal.
  Some solvers like FieldLUDecomposition can only find the solution for
  square matrices and when the solution is an exact linear solution, i.e. when
  ||A × X - B|| is exactly 0. Other solvers can also find solutions
  with non-square matrix A and with non-null minimal norm. If an exact linear
  solution exists it is also the minimal norm solution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear FieldDecompositionSolver]))

(defn solve
  "Solve the linear equation A × X = B for matrices A.
   The A matrix is implicit, it is provided by the underlying
   decomposition algorithm.

  b - right-hand side of the equation A × X = B - `org.apache.commons.math4.linear.FieldVector`

  returns: a vector X that minimizes the two norm of A × X - B - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the matrices dimensions do not match."
  (^org.apache.commons.math4.linear.FieldVector [^FieldDecompositionSolver this ^org.apache.commons.math4.linear.FieldVector b]
    (-> this (.solve b))))

(defn non-singular?
  "Check if the decomposed matrix is non-singular.

  returns: true if the decomposed matrix is non-singular - `boolean`"
  (^Boolean [^FieldDecompositionSolver this]
    (-> this (.isNonSingular))))

(defn get-inverse
  "Get the inverse (or pseudo-inverse) of the decomposed matrix.

  returns: inverse matrix - `org.apache.commons.math4.linear.FieldMatrix<T>`

  throws: org.apache.commons.math4.linear.SingularMatrixException - if the decomposed matrix is singular."
  (^org.apache.commons.math4.linear.FieldMatrix [^FieldDecompositionSolver this]
    (-> this (.getInverse))))

