(ns org.apache.commons.math4.exception.NullArgumentException
  "All conditions checks that fail due to a null argument must throw
  this exception.
  This class is meant to signal a precondition violation (\"null is an illegal
  argument\") and so does not extend the standard NullPointerException.
  Propagation of NullPointerException from within Commons-Math is
  construed to be a bug.

  Note: from 4.0 onwards, this class extends NullPointerException instead
  of MathIllegalArgumentException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NullArgumentException]))

(defn ->null-argument-exception
  "Constructor.

  Default constructor."
  (^NullArgumentException []
    (new NullArgumentException ))
  (^NullArgumentException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object arguments]
    (new NullArgumentException pattern arguments)))

(defn get-context
  "Gets a reference to the \"rich context\" data structure that allows to
   customize error messages and store key, value pairs in exceptions.

  returns: a reference to the exception context. - `org.apache.commons.math4.exception.util.ExceptionContext`"
  (^org.apache.commons.math4.exception.util.ExceptionContext [^NullArgumentException this]
    (-> this (.getContext))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^NullArgumentException this]
    (-> this (.getMessage))))

(defn get-localized-message
  "returns: `java.lang.String`"
  (^java.lang.String [^NullArgumentException this]
    (-> this (.getLocalizedMessage))))

