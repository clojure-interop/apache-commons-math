(ns org.apache.commons.math4.linear.JacobiPreconditioner
  "This class implements the standard Jacobi (diagonal) preconditioner. For a
  matrix Aij, this preconditioner is
  M = diag(1 / A11, 1 / A22, …)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear JacobiPreconditioner]))

(defn ->jacobi-preconditioner
  "Constructor.

  Creates a new instance of this class.

  diag - the diagonal coefficients of the linear operator to be preconditioned - `double[]`
  deep - true if a deep copy of the above array should be performed - `boolean`"
  (^JacobiPreconditioner [diag ^Boolean deep]
    (new JacobiPreconditioner diag deep)))

(defn *create
  "Creates a new instance of this class. This method extracts the diagonal
   coefficients of the specified linear operator. If a does not
   extend AbstractRealMatrix, then the coefficients of the
   underlying matrix are not accessible, coefficient extraction is made by
   matrix-vector products with the basis vectors (and might therefore take
   some time). With matrices, direct entry access is carried out.

  a - the linear operator for which the preconditioner should be built - `org.apache.commons.math4.linear.RealLinearOperator`

  returns: the diagonal preconditioner made of the inverse of the diagonal
   coefficients of the specified linear operator - `org.apache.commons.math4.linear.JacobiPreconditioner`

  throws: org.apache.commons.math4.linear.NonSquareOperatorException - if a is not square"
  (^org.apache.commons.math4.linear.JacobiPreconditioner [^org.apache.commons.math4.linear.RealLinearOperator a]
    (JacobiPreconditioner/create a)))

(defn get-column-dimension
  "Returns the dimension of the domain of this operator.

  returns: the number of columns of the underlying matrix - `int`"
  (^Integer [^JacobiPreconditioner this]
    (-> this (.getColumnDimension))))

(defn get-row-dimension
  "Returns the dimension of the codomain of this operator.

  returns: the number of rows of the underlying matrix - `int`"
  (^Integer [^JacobiPreconditioner this]
    (-> this (.getRowDimension))))

(defn operate
  "Returns the result of multiplying this by the vector x.

  x - the vector to operate on - `org.apache.commons.math4.linear.RealVector`

  returns: the product of this instance with x - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^JacobiPreconditioner this ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.operate x))))

(defn sqrt
  "Returns the square root of this diagonal operator. More
   precisely, this method returns
   P = diag(1 / √A11, 1 / √A22, …).

  returns: the square root of this preconditioner - `org.apache.commons.math4.linear.RealLinearOperator`"
  (^org.apache.commons.math4.linear.RealLinearOperator [^JacobiPreconditioner this]
    (-> this (.sqrt))))

