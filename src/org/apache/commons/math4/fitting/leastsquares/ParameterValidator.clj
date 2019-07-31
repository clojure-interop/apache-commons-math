(ns org.apache.commons.math4.fitting.leastsquares.ParameterValidator
  "Interface for validating a set of model parameters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares ParameterValidator]))

(defn validate
  "Validates the set of parameters.

  params - Input parameters. - `org.apache.commons.math4.linear.RealVector`

  returns: the validated values. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ParameterValidator this ^org.apache.commons.math4.linear.RealVector params]
    (-> this (.validate params))))

