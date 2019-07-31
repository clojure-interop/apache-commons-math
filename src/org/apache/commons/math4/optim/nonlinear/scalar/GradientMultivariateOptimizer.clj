(ns org.apache.commons.math4.optim.nonlinear.scalar.GradientMultivariateOptimizer
  "Base class for implementing optimizers for multivariate scalar
  differentiable functions.
  It contains boiler-plate code for dealing with gradient evaluation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar GradientMultivariateOptimizer]))

(defn optimize
  "Stores data and performs the optimization.

   The list of parameters is open-ended so that sub-classes can extend it
   with arguments specific to their concrete implementations.

   When the method is called multiple times, instance data is overwritten
   only when actually present in the list of arguments: when not specified,
   data set in a previous call is retained (and thus is optional in
   subsequent calls).

   Important note: Subclasses must override
   BaseOptimizer.parseOptimizationData(OptimizationData[]) if they need to register
   their own options; but then, they must also call
   super.parseOptimizationData(optData) within that method.

  opt-data - Optimization data. In addition to those documented in MultivariateOptimizer, this method will register the following data: ObjectiveFunctionGradient - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations (of the objective function) is exceeded."
  (^org.apache.commons.math4.optim.PointValuePair [^GradientMultivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

