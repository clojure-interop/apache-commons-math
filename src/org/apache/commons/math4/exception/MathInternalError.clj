(ns org.apache.commons.math4.exception.MathInternalError
  "Exception triggered when something that shouldn't happen does happen."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathInternalError]))

(defn ->math-internal-error
  "Constructor.

  Constructor accepting a localized message.

  pattern - Message pattern explaining the cause of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^MathInternalError [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new MathInternalError pattern args))
  (^MathInternalError [^java.lang.Throwable cause]
    (new MathInternalError cause))
  (^MathInternalError []
    (new MathInternalError )))

