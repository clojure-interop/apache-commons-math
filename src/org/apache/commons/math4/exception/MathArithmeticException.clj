(ns org.apache.commons.math4.exception.MathArithmeticException
  "Base class for arithmetic exceptions.
  It is used for all the exceptions that have the semantics of the standard
  ArithmeticException, but must also provide a localized
  message."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathArithmeticException]))

(defn ->math-arithmetic-exception
  "Constructor.

  Constructor with a specific message.

  pattern - Message pattern providing the specific context of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^MathArithmeticException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathArithmeticException pattern args))
  (^MathArithmeticException []
    (new MathArithmeticException )))

