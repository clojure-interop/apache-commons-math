(ns org.apache.commons.math4.analysis.function.Gaussian$Parametric
  "Parametric function where the input array contains the parameters of
  the Gaussian, ordered as follows:

   Norm
   Mean
   Standard deviation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Gaussian$Parametric]))

(defn ->parametric
  "Constructor."
  (^Gaussian$Parametric []
    (new Gaussian$Parametric )))

(defn value
  "Computes the value of the Gaussian at x.

  x - Value for which the function must be computed. - `double`
  param - Values of norm, mean and standard deviation. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  (^Double [^Gaussian$Parametric this ^Double x ^Double param]
    (-> this (.value x param))))

(defn gradient
  "Computes the value of the gradient at x.
   The components of the gradient vector are the partial
   derivatives of the function with respect to each of the
   parameters (norm, mean and standard deviation).

  x - Value at which the gradient must be computed. - `double`
  param - Values of norm, mean and standard deviation. - `double`

  returns: the gradient vector at x. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  ([^Gaussian$Parametric this ^Double x ^Double param]
    (-> this (.gradient x param))))

