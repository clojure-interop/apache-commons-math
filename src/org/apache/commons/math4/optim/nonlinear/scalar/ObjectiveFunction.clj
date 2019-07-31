(ns org.apache.commons.math4.optim.nonlinear.scalar.ObjectiveFunction
  "Scalar function to be optimized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar ObjectiveFunction]))

(defn ->objective-function
  "Constructor.

  f - Function to be optimized. - `org.apache.commons.math4.analysis.MultivariateFunction`"
  (^ObjectiveFunction [^org.apache.commons.math4.analysis.MultivariateFunction f]
    (new ObjectiveFunction f)))

(defn get-objective-function
  "Gets the function to be optimized.

  returns: the objective function. - `org.apache.commons.math4.analysis.MultivariateFunction`"
  (^org.apache.commons.math4.analysis.MultivariateFunction [^ObjectiveFunction this]
    (-> this (.getObjectiveFunction))))

