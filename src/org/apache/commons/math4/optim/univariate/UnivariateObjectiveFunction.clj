(ns org.apache.commons.math4.optim.univariate.UnivariateObjectiveFunction
  "Scalar function to be optimized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate UnivariateObjectiveFunction]))

(defn ->univariate-objective-function
  "Constructor.

  f - Function to be optimized. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^UnivariateObjectiveFunction [^org.apache.commons.math4.analysis.UnivariateFunction f]
    (new UnivariateObjectiveFunction f)))

(defn get-objective-function
  "Gets the function to be optimized.

  returns: the objective function. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^UnivariateObjectiveFunction this]
    (-> this (.getObjectiveFunction))))

