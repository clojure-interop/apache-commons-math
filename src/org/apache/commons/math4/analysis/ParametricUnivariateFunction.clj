(ns org.apache.commons.math4.analysis.ParametricUnivariateFunction
  "An interface representing a real function that depends on one independent
  variable plus some extra parameters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis ParametricUnivariateFunction]))

(defn value
  "Compute the value of the function.

  x - Point for which the function value should be computed. - `double`
  parameters - Function parameters. - `double`

  returns: the value. - `double`"
  (^Double [^ParametricUnivariateFunction this ^Double x ^Double parameters]
    (-> this (.value x parameters))))

(defn gradient
  "Compute the gradient of the function with respect to its parameters.

  x - Point for which the function value should be computed. - `double`
  parameters - Function parameters. - `double`

  returns: the value. - `double[]`"
  ([^ParametricUnivariateFunction this ^Double x ^Double parameters]
    (-> this (.gradient x parameters))))

