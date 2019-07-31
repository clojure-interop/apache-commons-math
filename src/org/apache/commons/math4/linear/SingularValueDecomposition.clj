(ns org.apache.commons.math4.linear.SingularValueDecomposition
  "Calculates the compact Singular Value Decomposition of a matrix.

  The Singular Value Decomposition of matrix A is a set of three matrices: U,
  Σ and V such that A = U × Σ × VT. Let A be
  a m × n matrix, then U is a m × p orthogonal matrix, Σ is a
  p × p diagonal matrix with positive or null elements, V is a p ×
  n orthogonal matrix (hence VT is also orthogonal) where
  p=min(m,n).

  This class is similar to the class with similar name from the
  JAMA library, with the
  following changes:

    the norm2 method which has been renamed as getNorm,
    the cond method which has been renamed as getConditionNumber,
    the rank method which has been renamed as getRank,
    a getUT method has been added,
    a getVT method has been added,
    a getSolver method has been added,
    a getCovariance method has been added."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SingularValueDecomposition]))

(defn ->singular-value-decomposition
  "Constructor.

  Calculates the compact Singular Value Decomposition of the given matrix.

  matrix - Matrix to decompose. - `org.apache.commons.math4.linear.RealMatrix`"
  (^SingularValueDecomposition [^org.apache.commons.math4.linear.RealMatrix matrix]
    (new SingularValueDecomposition matrix)))

(defn get-covariance
  "Returns the n × n covariance matrix.
   The covariance matrix is V × J × VT
   where J is the diagonal matrix of the inverse of the squares of
   the singular values.

  min-singular-value - value below which singular values are ignored (a 0 or negative value implies all singular value will be used) - `double`

  returns: covariance matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: java.lang.IllegalArgumentException - if minSingularValue is larger than the largest singular value, meaning all singular values are ignored"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this ^Double min-singular-value]
    (-> this (.getCovariance min-singular-value))))

(defn get-condition-number
  "Return the condition number of the matrix.

  returns: condition number of the matrix - `double`"
  (^Double [^SingularValueDecomposition this]
    (-> this (.getConditionNumber))))

(defn get-inverse-condition-number
  "Computes the inverse of the condition number.
   In cases of rank deficiency, the condition
   number will become undefined.

  returns: the inverse of the condition number. - `double`"
  (^Double [^SingularValueDecomposition this]
    (-> this (.getInverseConditionNumber))))

(defn get-vt
  "Returns the transpose of the matrix V of the decomposition.
   V is an orthogonal matrix, i.e. its transpose is also its inverse.

  returns: the V matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this]
    (-> this (.getVT))))

(defn get-rank
  "Return the effective numerical matrix rank.
   The effective numerical rank is the number of non-negligible
   singular values. The threshold used to identify non-negligible
   terms is max(m,n) × ulp(s1) where ulp(s1)
   is the least significant bit of the largest singular value.

  returns: effective numerical matrix rank - `int`"
  (^Integer [^SingularValueDecomposition this]
    (-> this (.getRank))))

(defn get-singular-values
  "Returns the diagonal elements of the matrix Σ of the decomposition.
   The singular values are provided in non-increasing order, for
   compatibility with Jama.

  returns: the diagonal elements of the Σ matrix - `double[]`"
  ([^SingularValueDecomposition this]
    (-> this (.getSingularValues))))

(defn get-v
  "Returns the matrix V of the decomposition.
   V is an orthogonal matrix, i.e. its transpose is also its inverse.

  returns: the V matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this]
    (-> this (.getV))))

(defn get-ut
  "Returns the transpose of the matrix U of the decomposition.
   U is an orthogonal matrix, i.e. its transpose is also its inverse.

  returns: the U matrix (or null if decomposed matrix is singular) - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this]
    (-> this (.getUT))))

(defn get-solver
  "Get a solver for finding the A × X = B solution in least square sense.

  returns: a solver - `org.apache.commons.math4.linear.DecompositionSolver`"
  (^org.apache.commons.math4.linear.DecompositionSolver [^SingularValueDecomposition this]
    (-> this (.getSolver))))

(defn get-u
  "Returns the matrix U of the decomposition.
   U is an orthogonal matrix, i.e. its transpose is also its inverse.

  returns: the U matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this]
    (-> this (.getU))))

(defn get-norm
  "Returns the L2 norm of the matrix.
   The L2 norm is max(|A × u|2 /
   |u|2), where |.|2 denotes the vectorial 2-norm
   (i.e. the traditional euclidian norm).

  returns: norm - `double`"
  (^Double [^SingularValueDecomposition this]
    (-> this (.getNorm))))

(defn get-s
  "Returns the diagonal matrix Σ of the decomposition.
   Σ is a diagonal matrix. The singular values are provided in
   non-increasing order, for compatibility with Jama.

  returns: the Σ matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SingularValueDecomposition this]
    (-> this (.getS))))

