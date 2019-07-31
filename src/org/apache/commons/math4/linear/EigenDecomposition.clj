(ns org.apache.commons.math4.linear.EigenDecomposition
  "Calculates the eigen decomposition of a real matrix.

  The eigen decomposition of matrix A is a set of two matrices:
  V and D such that A = V × D × VT.
  A, V and D are all m × m matrices.

  This class is similar in spirit to the EigenvalueDecomposition
  class from the JAMA
  library, with the following changes:

    a getVt method has been added,
    two getRealEigenvalue and
        getImagEigenvalue methods to pick up a
        single eigenvalue have been added,
    a getEigenvector method to pick up a
        single eigenvector has been added,
    a getDeterminant method has been added.
    a getSolver method has been added.


  As of 3.1, this class supports general real matrices (both symmetric and non-symmetric):

  If A is symmetric, then A = V*D*V' where the eigenvalue matrix D is diagonal
  and the eigenvector matrix V is orthogonal, i.e.
  A = V.multiply(D.multiply(V.transpose())) and
  V.multiply(V.transpose()) equals the identity matrix.


  If A is not symmetric, then the eigenvalue matrix D is block diagonal with the real
  eigenvalues in 1-by-1 blocks and any complex eigenvalues, lambda  i*mu, in 2-by-2
  blocks:


     [lambda, mu    ]
     [   -mu, lambda]
  The columns of V represent the eigenvectors in the sense that A*V = V*D,
  i.e. A.multiply(V) equals V.multiply(D).
  The matrix V may be badly conditioned, or even singular, so the validity of the
  equation A = V*D*inverse(V) depends upon the condition of V.

  This implementation is based on the paper by A. Drubrulle, R.S. Martin and
  J.H. Wilkinson \"The Implicit QL Algorithm\" in Wilksinson and Reinsch (1971)
  Handbook for automatic computation, vol. 2, Linear algebra, Springer-Verlag,
  New-York."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear EigenDecomposition]))

(defn ->eigen-decomposition
  "Constructor.

  Calculates the eigen decomposition of the symmetric tridiagonal
   matrix.  The Householder matrix is assumed to be the identity matrix.

  main - Main diagonal of the symmetric tridiagonal form. - `double[]`
  secondary - Secondary of the tridiagonal form. - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the algorithm fails to converge."
  (^EigenDecomposition [main secondary]
    (new EigenDecomposition main secondary))
  (^EigenDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new EigenDecomposition matrix)))

(defn get-vt
  "Gets the transpose of the matrix V of the decomposition.
   V is an orthogonal matrix, i.e. its transpose is also its inverse.
   The columns of V are the eigenvectors of the original matrix.
   No assumption is made about the orientation of the system axes formed
   by the columns of V (e.g. in a 3-dimension space, V can form a left-
   or right-handed system).

  returns: the transpose of the V matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^EigenDecomposition this]
    (-> this (.getVT))))

(defn has-complex-eigenvalues?
  "Returns whether the calculated eigen values are complex or real.
   The method performs a zero check for each element of the
   getImagEigenvalues() array and returns true if any
   element is not equal to zero.

  returns: true if the eigen values are complex, false otherwise - `boolean`"
  (^Boolean [^EigenDecomposition this]
    (-> this (.hasComplexEigenvalues))))

(defn get-real-eigenvalue
  "Returns the real part of the ith eigenvalue of the original
   matrix.

  i - index of the eigenvalue (counting from 0) - `int`

  returns: real part of the ith eigenvalue of the original
   matrix. - `double`"
  (^Double [^EigenDecomposition this ^Integer i]
    (-> this (.getRealEigenvalue i))))

(defn get-d
  "Gets the block diagonal matrix D of the decomposition.
   D is a block diagonal matrix.
   Real eigenvalues are on the diagonal while complex values are on
   2x2 blocks { {real imaginary}, {-imaginary, real} }.

  returns: the D matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^EigenDecomposition this]
    (-> this (.getD))))

(defn get-v
  "Gets the matrix V of the decomposition.
   V is an orthogonal matrix, i.e. its transpose is also its inverse.
   The columns of V are the eigenvectors of the original matrix.
   No assumption is made about the orientation of the system axes formed
   by the columns of V (e.g. in a 3-dimension space, V can form a left-
   or right-handed system).

  returns: the V matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^EigenDecomposition this]
    (-> this (.getV))))

(defn get-real-eigenvalues
  "Gets a copy of the real parts of the eigenvalues of the original matrix.

  returns: a copy of the real parts of the eigenvalues of the original matrix. - `double[]`"
  ([^EigenDecomposition this]
    (-> this (.getRealEigenvalues))))

(defn get-imag-eigenvalue
  "Gets the imaginary part of the ith eigenvalue of the original
   matrix.

  i - Index of the eigenvalue (counting from 0). - `int`

  returns: the imaginary part of the ith eigenvalue of the original
   matrix. - `double`"
  (^Double [^EigenDecomposition this ^Integer i]
    (-> this (.getImagEigenvalue i))))

(defn get-imag-eigenvalues
  "Gets a copy of the imaginary parts of the eigenvalues of the original
   matrix.

  returns: a copy of the imaginary parts of the eigenvalues of the original
   matrix. - `double[]`"
  ([^EigenDecomposition this]
    (-> this (.getImagEigenvalues))))

(defn get-eigenvector
  "Gets a copy of the ith eigenvector of the original matrix.

  i - Index of the eigenvector (counting from 0). - `int`

  returns: a copy of the ith eigenvector of the original matrix. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^EigenDecomposition this ^Integer i]
    (-> this (.getEigenvector i))))

(defn get-solver
  "Gets a solver for finding the A × X = B solution in exact
   linear sense.

   Since 3.1, eigen decomposition of a general matrix is supported,
   but the DecompositionSolver only supports real eigenvalues.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`

  throws: org.apache.commons.math4.exception.MathUnsupportedOperationException - if the decomposition resulted in complex eigenvalues"
  (^org.apache.commons.math4.linear.DecompositionSolver [^EigenDecomposition this]
    (-> this (.getSolver))))

(defn get-determinant
  "Computes the determinant of the matrix.

  returns: the determinant of the matrix. - `double`"
  (^Double [^EigenDecomposition this]
    (-> this (.getDeterminant))))

(defn get-square-root
  "Computes the square-root of the matrix.
   This implementation assumes that the matrix is symmetric and positive
   definite.

  returns: the square-root of the matrix. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.MathUnsupportedOperationException - if the matrix is not symmetric or not positive definite."
  (^org.apache.commons.math4.linear.RealMatrix [^EigenDecomposition this]
    (-> this (.getSquareRoot))))

