(ns org.apache.commons.math4.exception.NoDataException
  "Exception to be thrown when the required data is missing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NoDataException]))

(defn ->no-data-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Contextual information on what caused the exception. - `org.apache.commons.math4.exception.util.Localizable`"
  (^NoDataException [^org.apache.commons.math4.exception.util.Localizable specific]
    (new NoDataException specific))
  (^NoDataException []
    (new NoDataException )))

