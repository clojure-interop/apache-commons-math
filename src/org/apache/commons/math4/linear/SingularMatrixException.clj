(ns org.apache.commons.math4.linear.SingularMatrixException
  "Exception to be thrown when a non-singular matrix is expected."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SingularMatrixException]))

(defn ->singular-matrix-exception
  "Constructor.

  Construct an exception."
  (^SingularMatrixException []
    (new SingularMatrixException )))

