(ns org.apache.commons.math4.optim.nonlinear.scalar.MultivariateOptimizer
  "Base class for a multivariate scalar function optimizer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar MultivariateOptimizer]))

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

  opt-data - Optimization data. In addition to those documented in BaseMultivariateOptimizer, this method will register the following data: ObjectiveFunction GoalType - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  (^org.apache.commons.math4.optim.PointValuePair [^MultivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

(defn get-goal-type
  "returns: the optimization type. - `org.apache.commons.math4.optim.nonlinear.scalar.GoalType`"
  (^org.apache.commons.math4.optim.nonlinear.scalar.GoalType [^MultivariateOptimizer this]
    (-> this (.getGoalType))))

(defn compute-objective-value
  "Computes the objective function value.
   This method must be called by subclasses to enforce the
   evaluation counter limit.

  params - Point at which the objective function must be evaluated. - `double[]`

  returns: the objective function value at the specified point. - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  (^Double [^MultivariateOptimizer this params]
    (-> this (.computeObjectiveValue params))))

