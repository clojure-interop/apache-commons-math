(ns org.apache.commons.math4.exception.ZeroException
  "Exception to be thrown when zero is provided where it is not allowed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception ZeroException]))

(defn ->zero-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context pattern. - `org.apache.commons.math4.exception.util.Localizable`
  arguments - Arguments. - `java.lang.Object`"
  (^ZeroException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Object arguments]
    (new ZeroException specific arguments))
  (^ZeroException []
    (new ZeroException )))

