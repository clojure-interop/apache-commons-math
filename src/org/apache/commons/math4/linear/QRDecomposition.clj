(ns org.apache.commons.math4.linear.QRDecomposition
  "Calculates the QR-decomposition of a matrix.
  The QR-decomposition of a matrix A consists of two matrices Q and R
  that satisfy: A = QR, Q is orthogonal (QTQ = I), and R is
  upper triangular. If A is m×n, Q is m×m and R m×n.
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
  (:import [org.apache.commons.math4.linear QRDecomposition]))

(defn ->qr-decomposition
  "Constructor.

  Calculates the QR-decomposition of the given matrix.

  matrix - The matrix to decompose. - `org.apache.commons.math4.linear.RealMatrix`
  threshold - Singularity threshold. - `double`"
  (^QRDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix ^Double threshold]
    (new QRDecomposition matrix threshold))
  (^QRDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new QRDecomposition matrix)))

(defn get-r
  "Returns the matrix R of the decomposition.
   R is an upper-triangular matrix

  returns: the R matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^QRDecomposition this]
    (-> this (.getR))))

(defn get-q
  "Returns the matrix Q of the decomposition.
   Q is an orthogonal matrix

  returns: the Q matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^QRDecomposition this]
    (-> this (.getQ))))

(defn get-qt
  "Returns the transpose of the matrix Q of the decomposition.
   Q is an orthogonal matrix

  returns: the transpose of the Q matrix, QT - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^QRDecomposition this]
    (-> this (.getQT))))

(defn get-h
  "Returns the Householder reflector vectors.
   H is a lower trapezoidal matrix whose columns represent
   each successive Householder reflector vector. This matrix is used
   to compute Q.

  returns: a matrix containing the Householder reflector vectors - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^QRDecomposition this]
    (-> this (.getH))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in least square sense.

   Least Square sense means a solver can be computed for an overdetermined system,
   (i.e. a system with more equations than unknowns, which corresponds to a tall A
   matrix with more rows than columns). In any case, if the matrix is singular
   within the tolerance set at construction, an error will be triggered when
   the solve method will be called.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`"
  (^org.apache.commons.math4.linear.DecompositionSolver [^QRDecomposition this]
    (-> this (.getSolver))))

