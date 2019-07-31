(ns org.apache.commons.math4.exception.NumberIsTooLargeException
  "Exception to be thrown when a number is too large."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NumberIsTooLargeException]))

(defn ->number-is-too-large-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context pattern. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Value that is larger than the maximum. - `java.lang.Number`
  max - Maximum. - `java.lang.Number`
  bound-is-allowed - if true the maximum is included in the allowed range. - `boolean`"
  (^NumberIsTooLargeException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number wrong ^java.lang.Number max ^Boolean bound-is-allowed]
    (new NumberIsTooLargeException specific wrong max bound-is-allowed))
  (^NumberIsTooLargeException [^java.lang.Number wrong ^java.lang.Number max ^Boolean bound-is-allowed]
    (new NumberIsTooLargeException wrong max bound-is-allowed)))

(defn get-bound-is-allowed?
  "returns: true if the maximum is included in the allowed range. - `boolean`"
  (^Boolean [^NumberIsTooLargeException this]
    (-> this (.getBoundIsAllowed))))

(defn get-max
  "returns: the maximum. - `java.lang.Number`"
  (^java.lang.Number [^NumberIsTooLargeException this]
    (-> this (.getMax))))

