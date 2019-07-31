(ns org.apache.commons.math4.optim.univariate.UnivariateOptimizer
  "Base class for a univariate scalar function optimizer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate UnivariateOptimizer]))

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

  opt-data - Optimization data. In addition to those documented in BaseOptimizer, this method will register the following data: GoalType SearchInterval UnivariateObjectiveFunction - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.univariate.UnivariatePointValuePair`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  (^org.apache.commons.math4.optim.univariate.UnivariatePointValuePair [^UnivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

(defn get-goal-type
  "returns: the optimization type. - `org.apache.commons.math4.optim.nonlinear.scalar.GoalType`"
  (^org.apache.commons.math4.optim.nonlinear.scalar.GoalType [^UnivariateOptimizer this]
    (-> this (.getGoalType))))

(defn get-start-value
  "returns: the initial guess. - `double`"
  (^Double [^UnivariateOptimizer this]
    (-> this (.getStartValue))))

(defn get-min
  "returns: the lower bounds. - `double`"
  (^Double [^UnivariateOptimizer this]
    (-> this (.getMin))))

(defn get-max
  "returns: the upper bounds. - `double`"
  (^Double [^UnivariateOptimizer this]
    (-> this (.getMax))))

