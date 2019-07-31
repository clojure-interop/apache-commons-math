(ns org.apache.commons.math4.linear.NonPositiveDefiniteOperatorException
  "Exception to be thrown when a symmetric, definite positive
  RealLinearOperator is expected.
  Since the coefficients of the matrix are not accessible, the most
  general definition is used to check that A is not positive
  definite, i.e.  there exists x such that x' A x <= 0.
  In the terminology of this exception, A is the \"offending\"
  linear operator and x the \"offending\" vector."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonPositiveDefiniteOperatorException]))

(defn ->non-positive-definite-operator-exception
  "Constructor.

  Creates a new instance of this class."
  (^NonPositiveDefiniteOperatorException []
    (new NonPositiveDefiniteOperatorException )))

