(ns org.apache.commons.math4.genetics.InvalidRepresentationException
  "Exception indicating that the representation of a chromosome is not valid."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics InvalidRepresentationException]))

(defn ->invalid-representation-exception
  "Constructor.

  Construct an InvalidRepresentationException with a specialized message.

  pattern - Message pattern. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^InvalidRepresentationException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new InvalidRepresentationException pattern args)))

