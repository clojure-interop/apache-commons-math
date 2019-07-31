(ns org.apache.commons.math4.linear.RealLinearOperator
  "This class defines a linear operator operating on real (double)
  vector spaces. No direct access to the coefficients of the underlying matrix
  is provided.

  The motivation for such an interface is well stated by
  Barrett et al. (1994):

   We restrict ourselves to iterative methods, which work by repeatedly
   improving an approximate solution until it is accurate enough. These
   methods access the coefficient matrix A of the linear system only via the
   matrix-vector product y = A · x
   (and perhaps z = AT · x). Thus the user need only
   supply a subroutine for computing y (and perhaps z) given x, which permits
   full exploitation of the sparsity or other special structure of A.




   Barret et al. (1994)

    R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,
    V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,
    Templates for the Solution of Linear Systems: Building Blocks for
    Iterative Methods, SIAM"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealLinearOperator]))

(defn ->real-linear-operator
  "Constructor."
  (^RealLinearOperator []
    (new RealLinearOperator )))

(defn get-row-dimension
  "Returns the dimension of the codomain of this operator.

  returns: the number of rows of the underlying matrix - `int`"
  (^Integer [^RealLinearOperator this]
    (-> this (.getRowDimension))))

(defn get-column-dimension
  "Returns the dimension of the domain of this operator.

  returns: the number of columns of the underlying matrix - `int`"
  (^Integer [^RealLinearOperator this]
    (-> this (.getColumnDimension))))

(defn operate
  "Returns the result of multiplying this by the vector x.

  x - the vector to operate on - `org.apache.commons.math4.linear.RealVector`

  returns: the product of this instance with x - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the column dimension does not match the size of x"
  (^org.apache.commons.math4.linear.RealVector [^RealLinearOperator this ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.operate x))))

(defn operate-transpose
  "Returns the result of multiplying the transpose of this operator
   by the vector x (optional operation). The default implementation
   throws an UnsupportedOperationException. Users overriding this
   method must also override isTransposable().

  x - the vector to operate on - `org.apache.commons.math4.linear.RealVector`

  returns: the product of the transpose of this instance with
   x - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the row dimension does not match the size of x"
  (^org.apache.commons.math4.linear.RealVector [^RealLinearOperator this ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.operateTranspose x))))

(defn transposable?
  "Returns true if this operator supports
   operateTranspose(RealVector). If true is returned,
   operateTranspose(RealVector) should not throw
   UnsupportedOperationException. The default implementation returns
   false.

  returns: false - `boolean`"
  (^Boolean [^RealLinearOperator this]
    (-> this (.isTransposable))))

