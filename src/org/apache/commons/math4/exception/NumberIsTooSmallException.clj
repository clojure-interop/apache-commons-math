(ns org.apache.commons.math4.exception.NumberIsTooSmallException
  "Exception to be thrown when a number is too small."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NumberIsTooSmallException]))

(defn ->number-is-too-small-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context pattern. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Value that is smaller than the minimum. - `java.lang.Number`
  min - Minimum. - `java.lang.Number`
  bound-is-allowed - Whether min is included in the allowed range. - `boolean`"
  (^NumberIsTooSmallException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number wrong ^java.lang.Number min ^Boolean bound-is-allowed]
    (new NumberIsTooSmallException specific wrong min bound-is-allowed))
  (^NumberIsTooSmallException [^java.lang.Number wrong ^java.lang.Number min ^Boolean bound-is-allowed]
    (new NumberIsTooSmallException wrong min bound-is-allowed)))

(defn get-bound-is-allowed?
  "returns: true if the minimum is included in the allowed range. - `boolean`"
  (^Boolean [^NumberIsTooSmallException this]
    (-> this (.getBoundIsAllowed))))

(defn get-min
  "returns: the minimum. - `java.lang.Number`"
  (^java.lang.Number [^NumberIsTooSmallException this]
    (-> this (.getMin))))

