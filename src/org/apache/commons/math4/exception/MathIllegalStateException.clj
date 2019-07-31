(ns org.apache.commons.math4.exception.MathIllegalStateException
  "Base class for all exceptions that signal that the process
  throwing the exception is in a state that does not comply with
  the set of states that it is designed to be in."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathIllegalStateException]))

(defn ->math-illegal-state-exception
  "Constructor.

  Simple constructor.

  cause - Root cause. - `java.lang.Throwable`
  pattern - Message pattern explaining the cause of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^MathIllegalStateException [^java.lang.Throwable cause ^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathIllegalStateException cause pattern args))
  (^MathIllegalStateException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathIllegalStateException pattern args))
  (^MathIllegalStateException []
    (new MathIllegalStateException )))

