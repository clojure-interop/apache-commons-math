(ns org.apache.commons.math4.exception.InsufficientDataException
  "Exception to be thrown when there is insufficient data to perform a computation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception InsufficientDataException]))

(defn ->insufficient-data-exception
  "Constructor.

  Construct the exception with a specific context.

  pattern - Message pattern providing the specific context of the error. - `org.apache.commons.math4.exception.util.Localizable`
  arguments - Values for replacing the placeholders in pattern. - `java.lang.Object`"
  (^InsufficientDataException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object arguments]
    (new InsufficientDataException pattern arguments))
  (^InsufficientDataException []
    (new InsufficientDataException )))

