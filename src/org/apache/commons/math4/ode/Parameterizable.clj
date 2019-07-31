(ns org.apache.commons.math4.ode.Parameterizable
  "This interface enables to process any parameterizable object."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode Parameterizable]))

(defn get-parameters-names
  "Get the names of the supported parameters.

  returns: parameters names - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Parameterizable this]
    (-> this (.getParametersNames))))

(defn supported?
  "Check if a parameter is supported.
   Supported parameters are those listed by getParametersNames().

  name - parameter name to check - `java.lang.String`

  returns: true if the parameter is supported - `boolean`"
  (^Boolean [^Parameterizable this ^java.lang.String name]
    (-> this (.isSupported name))))

