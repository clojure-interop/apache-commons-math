(ns org.apache.commons.math4.analysis.polynomials.PolynomialFunction$Parametric
  "Dedicated parametric polynomial class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialFunction$Parametric]))

(defn ->parametric
  "Constructor."
  (^PolynomialFunction$Parametric []
    (new PolynomialFunction$Parametric )))

(defn gradient
  "Compute the gradient of the function with respect to its parameters.

  x - Point for which the function value should be computed. - `double`
  parameters - Function parameters. - `double`

  returns: the value. - `double[]`"
  ([^PolynomialFunction$Parametric this ^Double x ^Double parameters]
    (-> this (.gradient x parameters))))

(defn value
  "Compute the value of the function.

  x - Point for which the function value should be computed. - `double`
  parameters - Function parameters. - `double`

  returns: the value. - `double`

  throws: org.apache.commons.math4.exception.NoDataException"
  (^Double [^PolynomialFunction$Parametric this ^Double x ^Double parameters]
    (-> this (.value x parameters))))

