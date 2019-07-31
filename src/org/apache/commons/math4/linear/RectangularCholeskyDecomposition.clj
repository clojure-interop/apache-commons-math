(ns org.apache.commons.math4.linear.RectangularCholeskyDecomposition
  "Calculates the rectangular Cholesky decomposition of a matrix.
  The rectangular Cholesky decomposition of a real symmetric positive
  semidefinite matrix A consists of a rectangular matrix B with the same
  number of rows such that: A is almost equal to BBT, depending
  on a user-defined tolerance. In a sense, this is the square root of A.
  The difference with respect to the regular CholeskyDecomposition
  is that rows/columns may be permuted (hence the rectangular shape instead
  of the traditional triangular shape) and there is a threshold to ignore
  small diagonal elements. This is used for example to generate correlated
  random n-dimensions vectors in a p-dimension subspace (p < n).
  In other words, it allows generating random vectors from a covariance
  matrix that is only positive semidefinite, and not positive definite.
  Rectangular Cholesky decomposition is not suited for solving
  linear systems, so it does not provide any decomposition solver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RectangularCholeskyDecomposition]))

(defn ->rectangular-cholesky-decomposition
  "Constructor.

  Decompose a symmetric positive semidefinite matrix.

  matrix - Symmetric positive semidefinite matrix. - `org.apache.commons.math4.linear.RealMatrix`
  small - Diagonal elements threshold under which columns are considered to be dependent on previous ones and are discarded. - `double`

  throws: org.apache.commons.math4.linear.NonPositiveDefiniteMatrixException - if the matrix is not positive semidefinite."
  (^RectangularCholeskyDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix ^Double small]
    (new RectangularCholeskyDecomposition matrix small))
  (^RectangularCholeskyDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new RectangularCholeskyDecomposition matrix)))

(defn get-root-matrix
  "Get the root of the covariance matrix.
   The root is the rectangular matrix B such that
   the covariance matrix is equal to B.BT

  returns: root of the square matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RectangularCholeskyDecomposition this]
    (-> this (.getRootMatrix))))

(defn get-rank
  "Get the rank of the symmetric positive semidefinite matrix.
   The r is the number of independent rows in the symmetric positive semidefinite
   matrix, it is also the number of columns of the rectangular
   matrix of the decomposition.

  returns: r of the square matrix. - `int`"
  (^Integer [^RectangularCholeskyDecomposition this]
    (-> this (.getRank))))

