(ns org.apache.commons.math4.ode.ParameterizedODE
  "Interface to compute by finite difference Jacobian matrix for some parameter
   when computing partial derivatives equations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode ParameterizedODE]))

(defn get-parameter
  "Get parameter value from its name.

  name - parameter name - `java.lang.String`

  returns: parameter value - `double`

  throws: org.apache.commons.math4.ode.UnknownParameterException - if parameter is not supported"
  (^Double [^ParameterizedODE this ^java.lang.String name]
    (-> this (.getParameter name))))

(defn set-parameter
  "Set the value for a given parameter.

  name - parameter name - `java.lang.String`
  value - parameter value - `double`

  throws: org.apache.commons.math4.ode.UnknownParameterException - if parameter is not supported"
  ([^ParameterizedODE this ^java.lang.String name ^Double value]
    (-> this (.setParameter name value))))

