(ns org.apache.commons.math4.analysis.function.Sigmoid$Parametric
  "Parametric function where the input array contains the parameters of
  the sigmoid function, ordered
  as follows:

   Lower asymptote
   Higher asymptote"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sigmoid$Parametric]))

(defn ->parametric
  "Constructor."
  (^Sigmoid$Parametric []
    (new Sigmoid$Parametric )))

(defn value
  "Computes the value of the sigmoid at x.

  x - Value for which the function must be computed. - `double`
  param - Values of lower asymptote and higher asymptote. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  (^Double [^Sigmoid$Parametric this ^Double x ^Double param]
    (-> this (.value x param))))

(defn gradient
  "Computes the value of the gradient at x.
   The components of the gradient vector are the partial
   derivatives of the function with respect to each of the
   parameters (lower asymptote and higher asymptote).

  x - Value at which the gradient must be computed. - `double`
  param - Values for lower asymptote and higher asymptote. - `double`

  returns: the gradient vector at x. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  ([^Sigmoid$Parametric this ^Double x ^Double param]
    (-> this (.gradient x param))))

