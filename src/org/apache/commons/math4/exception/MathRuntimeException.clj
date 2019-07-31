(ns org.apache.commons.math4.exception.MathRuntimeException
  "As of release 4.0, all exceptions thrown by the Commons Math code (except
  NullArgumentException) inherit from this class.
  In most cases, this class should not be instantiated directly: it should
  serve as a base class for implementing exception classes that describe a
  specific \"problem\"."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathRuntimeException]))

(defn ->math-runtime-exception
  "Constructor.

  cause - Root cause. - `java.lang.Throwable`
  pattern - Message pattern explaining the cause of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^MathRuntimeException [^java.lang.Throwable cause ^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathRuntimeException cause pattern args))
  (^MathRuntimeException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathRuntimeException pattern args)))

(defn get-context
  "Gets a reference to the \"rich context\" data structure that allows to
   customize error messages and store key, value pairs in exceptions.

  returns: a reference to the exception context. - `org.apache.commons.math4.exception.util.ExceptionContext`"
  (^org.apache.commons.math4.exception.util.ExceptionContext [^MathRuntimeException this]
    (-> this (.getContext))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^MathRuntimeException this]
    (-> this (.getMessage))))

(defn get-localized-message
  "returns: `java.lang.String`"
  (^java.lang.String [^MathRuntimeException this]
    (-> this (.getLocalizedMessage))))

