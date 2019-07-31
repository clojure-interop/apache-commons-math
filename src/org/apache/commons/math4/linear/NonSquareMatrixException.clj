(ns org.apache.commons.math4.linear.NonSquareMatrixException
  "Exception to be thrown when a square matrix is expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonSquareMatrixException]))

(defn ->non-square-matrix-exception
  "Constructor.

  Construct an exception from the mismatched dimensions.

  wrong - Row dimension. - `int`
  expected - Column dimension. - `int`"
  (^NonSquareMatrixException [^Integer wrong ^Integer expected]
    (new NonSquareMatrixException wrong expected)))

