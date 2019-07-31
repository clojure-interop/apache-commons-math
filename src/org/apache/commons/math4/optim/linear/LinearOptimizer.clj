(ns org.apache.commons.math4.optim.linear.LinearOptimizer
  "Base class for implementing linear optimizers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear LinearOptimizer]))

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

  opt-data - Optimization data. In addition to those documented in MultivariateOptimizer, this method will register the following data: LinearObjectiveFunction LinearConstraintSet NonNegativeConstraint - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyIterationsException - if the maximal number of iterations is exceeded."
  (^org.apache.commons.math4.optim.PointValuePair [^LinearOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

