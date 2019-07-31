(ns org.apache.commons.math4.exception.NotANumberException
  "Exception to be thrown when a number is not a number."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NotANumberException]))

(defn ->not-a-number-exception
  "Constructor.

  Construct the exception."
  (^NotANumberException []
    (new NotANumberException )))

