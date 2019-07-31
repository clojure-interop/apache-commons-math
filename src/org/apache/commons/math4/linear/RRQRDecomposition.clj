(ns org.apache.commons.math4.linear.RRQRDecomposition
  "Calculates the rank-revealing QR-decomposition of a matrix, with column pivoting.
  The rank-revealing QR-decomposition of a matrix A consists of three matrices Q,
  R and P such that AP=QR.  Q is orthogonal (QTQ = I), and R is upper triangular.
  If A is m×n, Q is m×m and R is m×n and P is n×n.
  QR decomposition with column pivoting produces a rank-revealing QR
  decomposition and the getRank(double) method may be used to return the rank of the
  input matrix A.
  This class compute the decomposition using Householder reflectors.
  For efficiency purposes, the decomposition in packed form is transposed.
  This allows inner loop to iterate inside rows, which is much more cache-efficient
  in Java.
  This class is based on the class with similar name from the
  JAMA library, with the
  following changes:

    a getQT method has been added,
    the solve and isFullRank methods have been replaced
    by a getSolver method and the equivalent methods
    provided by the returned DecompositionSolver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RRQRDecomposition]))

(defn ->rrqr-decomposition
  "Constructor.

  Calculates the QR-decomposition of the given matrix.

  matrix - The matrix to decompose. - `org.apache.commons.math4.linear.RealMatrix`
  threshold - Singularity threshold. - `double`"
  (^RRQRDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix ^Double threshold]
    (new RRQRDecomposition matrix threshold))
  (^RRQRDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new RRQRDecomposition matrix)))

(defn get-p
  "Returns the pivot matrix, P, used in the QR Decomposition of matrix A such that AP = QR.

   If no pivoting is used in this decomposition then P is equal to the identity matrix.

  returns: a permutation matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RRQRDecomposition this]
    (-> this (.getP))))

(defn get-rank
  "Return the effective numerical matrix rank.
   The effective numerical rank is the number of non-negligible
   singular values.
   This implementation looks at Frobenius norms of the sequence of
   bottom right submatrices.  When a large fall in norm is seen,
   the rank is returned. The drop is computed as:


     (thisNorm/lastNorm) * rNorm < dropThreshold

   where thisNorm is the Frobenius norm of the current submatrix,
   lastNorm is the Frobenius norm of the previous submatrix,
   rNorm is is the Frobenius norm of the complete matrix

  drop-threshold - threshold triggering rank computation - `double`

  returns: effective numerical matrix rank - `int`"
  (^Integer [^RRQRDecomposition this ^Double drop-threshold]
    (-> this (.getRank drop-threshold))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in least square sense.

   Least Square sense means a solver can be computed for an overdetermined system,
   (i.e. a system with more equations than unknowns, which corresponds to a tall A
   matrix with more rows than columns). In any case, if the matrix is singular
   within the tolerance set at construction, an error will be triggered when
   the solve method will be called.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`"
  (^org.apache.commons.math4.linear.DecompositionSolver [^RRQRDecomposition this]
    (-> this (.getSolver))))

