(ns org.apache.commons.math4.linear.NonSelfAdjointOperatorException
  "Exception to be thrown when a self-adjoint RealLinearOperator
  is expected.
  Since the coefficients of the matrix are not accessible, the most
  general definition is used to check that A is not self-adjoint, i.e.
  there exist x and y such as | x' A y - y' A x | >= eps,
  where eps is a user-specified tolerance, and x'
  denotes the transpose of x.
  In the terminology of this exception, A is the \"offending\"
  linear operator, x and y are the first and second
  \"offending\" vectors, respectively."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonSelfAdjointOperatorException]))

(defn ->non-self-adjoint-operator-exception
  "Constructor.

  Creates a new instance of this class."
  (^NonSelfAdjointOperatorException []
    (new NonSelfAdjointOperatorException )))

