(ns org.apache.commons.math4.ode.UnknownParameterException
  "Exception to be thrown when a parameter is unknown."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode UnknownParameterException]))

(defn ->unknown-parameter-exception
  "Constructor.

  Construct an exception from the unknown parameter.

  name - parameter name. - `java.lang.String`"
  (^UnknownParameterException [^java.lang.String name]
    (new UnknownParameterException name)))

(defn get-name
  "returns: the name of the unknown parameter. - `java.lang.String`"
  (^java.lang.String [^UnknownParameterException this]
    (-> this (.getName))))

