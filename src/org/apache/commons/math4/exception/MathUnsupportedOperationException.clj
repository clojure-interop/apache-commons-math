(ns org.apache.commons.math4.exception.MathUnsupportedOperationException
  "Base class for all unsupported features.
  It is used for all the exceptions that have the semantics of the standard
  UnsupportedOperationException, but must also provide a localized
  message."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathUnsupportedOperationException]))

(defn ->math-unsupported-operation-exception
  "Constructor.

  Default constructor."
  (^MathUnsupportedOperationException []
    (new MathUnsupportedOperationException ))
  (^MathUnsupportedOperationException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathUnsupportedOperationException pattern args)))

