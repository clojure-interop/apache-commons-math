(ns org.apache.commons.math4.linear.NonSquareOperatorException
  "Exception to be thrown when a square linear operator is expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear NonSquareOperatorException]))

(defn ->non-square-operator-exception
  "Constructor.

  Construct an exception from the mismatched dimensions.

  wrong - Row dimension. - `int`
  expected - Column dimension. - `int`"
  (^NonSquareOperatorException [^Integer wrong ^Integer expected]
    (new NonSquareOperatorException wrong expected)))

