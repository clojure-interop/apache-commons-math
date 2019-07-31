(ns org.apache.commons.math4.exception.NotPositiveException
  "Exception to be thrown when the argument is negative."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NotPositiveException]))

(defn ->not-positive-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context where the error occurred. - `org.apache.commons.math4.exception.util.Localizable`
  value - Argument. - `java.lang.Number`"
  (^NotPositiveException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number value]
    (new NotPositiveException specific value))
  (^NotPositiveException [^java.lang.Number value]
    (new NotPositiveException value)))

