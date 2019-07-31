(ns org.apache.commons.math4.exception.MathParseException
  "Class to signal parse failures."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathParseException]))

(defn ->math-parse-exception
  "Constructor.

  wrong - Bad string representation of the object. - `java.lang.String`
  position - Index, in the wrong string, that caused the parsing to fail. - `int`
  type - Class of the object supposedly represented by the wrong string. - `java.lang.Class`"
  (^MathParseException [^java.lang.String wrong ^Integer position ^java.lang.Class type]
    (new MathParseException wrong position type))
  (^MathParseException [^java.lang.String wrong ^Integer position]
    (new MathParseException wrong position)))

