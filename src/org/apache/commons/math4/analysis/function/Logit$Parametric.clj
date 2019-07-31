(ns org.apache.commons.math4.analysis.function.Logit$Parametric
  "Parametric function where the input array contains the parameters of
  the logit function, ordered as follows:

   Lower bound
   Higher bound"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Logit$Parametric]))

(defn ->parametric
  "Constructor."
  (^Logit$Parametric []
    (new Logit$Parametric )))

(defn value
  "Computes the value of the logit at x.

  x - Value for which the function must be computed. - `double`
  param - Values of lower bound and higher bounds. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  (^Double [^Logit$Parametric this ^Double x ^Double param]
    (-> this (.value x param))))

(defn gradient
  "Computes the value of the gradient at x.
   The components of the gradient vector are the partial
   derivatives of the function with respect to each of the
   parameters (lower bound and higher bound).

  x - Value at which the gradient must be computed. - `double`
  param - Values for lower and higher bounds. - `double`

  returns: the gradient vector at x. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  ([^Logit$Parametric this ^Double x ^Double param]
    (-> this (.gradient x param))))

