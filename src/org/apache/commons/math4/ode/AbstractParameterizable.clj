(ns org.apache.commons.math4.ode.AbstractParameterizable
  "This abstract class provides boilerplate parameters list."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode AbstractParameterizable]))

(defn get-parameters-names
  "Get the names of the supported parameters.

  returns: parameters names - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^AbstractParameterizable this]
    (-> this (.getParametersNames))))

(defn supported?
  "Check if a parameter is supported.
   Supported parameters are those listed by Parameterizable.getParametersNames().

  name - parameter name to check - `java.lang.String`

  returns: true if the parameter is supported - `boolean`"
  (^Boolean [^AbstractParameterizable this ^java.lang.String name]
    (-> this (.isSupported name))))

(defn complain-if-not-supported
  "Check if a parameter is supported and throw an IllegalArgumentException if not.

  name - name of the parameter to check - `java.lang.String`

  throws: org.apache.commons.math4.ode.UnknownParameterException - if the parameter is not supported"
  ([^AbstractParameterizable this ^java.lang.String name]
    (-> this (.complainIfNotSupported name))))

