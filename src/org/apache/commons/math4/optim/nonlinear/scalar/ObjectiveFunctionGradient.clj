(ns org.apache.commons.math4.optim.nonlinear.scalar.ObjectiveFunctionGradient
  "Gradient of the scalar function to be optimized."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar ObjectiveFunctionGradient]))

(defn ->objective-function-gradient
  "Constructor.

  g - Gradient of the function to be optimized. - `org.apache.commons.math4.analysis.MultivariateVectorFunction`"
  (^ObjectiveFunctionGradient [^org.apache.commons.math4.analysis.MultivariateVectorFunction g]
    (new ObjectiveFunctionGradient g)))

(defn get-objective-function-gradient
  "Gets the gradient of the function to be optimized.

  returns: the objective function gradient. - `org.apache.commons.math4.analysis.MultivariateVectorFunction`"
  (^org.apache.commons.math4.analysis.MultivariateVectorFunction [^ObjectiveFunctionGradient this]
    (-> this (.getObjectiveFunctionGradient))))

