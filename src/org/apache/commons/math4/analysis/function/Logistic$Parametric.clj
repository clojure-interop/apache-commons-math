(ns org.apache.commons.math4.analysis.function.Logistic$Parametric
  "Parametric function where the input array contains the parameters of
  the logistic function, ordered as follows:

   k
   m
   b
   q
   a
   n"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Logistic$Parametric]))

(defn ->parametric
  "Constructor."
  (^Logistic$Parametric []
    (new Logistic$Parametric )))

(defn value
  "Computes the value of the sigmoid at x.

  x - Value for which the function must be computed. - `double`
  param - Values for k, m, b, q, a and n. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  (^Double [^Logistic$Parametric this ^Double x ^Double param]
    (-> this (.value x param))))

(defn gradient
  "Computes the value of the gradient at x.
   The components of the gradient vector are the partial
   derivatives of the function with respect to each of the
   parameters.

  x - Value at which the gradient must be computed. - `double`
  param - Values for k, m, b, q, a and n. - `double`

  returns: the gradient vector at x. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  ([^Logistic$Parametric this ^Double x ^Double param]
    (-> this (.gradient x param))))

