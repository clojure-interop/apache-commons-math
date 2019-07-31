(ns org.apache.commons.math4.exception.NotStrictlyPositiveException
  "Exception to be thrown when the argument is not greater than 0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NotStrictlyPositiveException]))

(defn ->not-strictly-positive-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context where the error occurred. - `org.apache.commons.math4.exception.util.Localizable`
  value - Argument. - `java.lang.Number`"
  (^NotStrictlyPositiveException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number value]
    (new NotStrictlyPositiveException specific value))
  (^NotStrictlyPositiveException [^java.lang.Number value]
    (new NotStrictlyPositiveException value)))

