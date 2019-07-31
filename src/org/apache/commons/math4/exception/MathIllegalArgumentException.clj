(ns org.apache.commons.math4.exception.MathIllegalArgumentException
  "Base class for all preconditions violation exceptions.
  In most cases, this class should not be instantiated directly: it should
  serve as a base class to create all the exceptions that have the semantics
  of the standard IllegalArgumentException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathIllegalArgumentException]))

(defn ->math-illegal-argument-exception
  "Constructor.

  pattern - Message pattern explaining the cause of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^MathIllegalArgumentException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathIllegalArgumentException pattern args)))

