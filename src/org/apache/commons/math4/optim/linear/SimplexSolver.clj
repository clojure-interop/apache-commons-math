(ns org.apache.commons.math4.optim.linear.SimplexSolver
  "Solves a linear problem using the \"Two-Phase Simplex\" method.

  The SimplexSolver supports the following OptimizationData data provided
  as arguments to optimize(OptimizationData...):

    objective function: LinearObjectiveFunction - mandatory
    linear constraints LinearConstraintSet - mandatory
    type of optimization: GoalType
     - optional, default: MINIMIZE
    whether to allow negative values as solution: NonNegativeConstraint - optional, default: true
    pivot selection rule: PivotSelectionRule - optional, default PivotSelectionRule.DANTZIG
    callback for the best solution: SolutionCallback - optional
    maximum number of iterations: MaxIter - optional, default: Integer.MAX_VALUE


  Note: Depending on the problem definition, the default convergence criteria
  may be too strict, resulting in NoFeasibleSolutionException or
  TooManyIterationsException. In such a case it is advised to adjust these
  criteria with more appropriate values, e.g. relaxing the epsilon value.

  Default convergence criteria:

    Algorithm convergence: 1e-6
    Floating-point comparisons: 10 ulp
    Cut-Off value: 1e-10


  The cut-off value has been introduced to handle the case of very small pivot elements
  in the Simplex tableau, as these may lead to numerical instabilities and degeneracy.
  Potential pivot elements smaller than this value will be treated as if they were zero
  and are thus not considered by the pivot selection mechanism. The default value is safe
  for many problems, but may need to be adjusted in case of very small coefficients
  used in either the LinearConstraint or LinearObjectiveFunction."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear SimplexSolver]))

(defn ->simplex-solver
  "Constructor.

  Builds a simplex solver with a specified accepted amount of error.

  epsilon - Amount of error to accept for algorithm convergence. - `double`
  max-ulps - Amount of error to accept in floating point comparisons. - `int`
  cut-off - Values smaller than the cutOff are treated as zero. - `double`"
  (^SimplexSolver [^Double epsilon ^Integer max-ulps ^Double cut-off]
    (new SimplexSolver epsilon max-ulps cut-off))
  (^SimplexSolver [^Double epsilon ^Integer max-ulps]
    (new SimplexSolver epsilon max-ulps))
  (^SimplexSolver [^Double epsilon]
    (new SimplexSolver epsilon))
  (^SimplexSolver []
    (new SimplexSolver )))

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

  opt-data - Optimization data. In addition to those documented in LinearOptimizer, this method will register the following data: SolutionCallback PivotSelectionRule - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyIterationsException - if the maximal number of iterations is exceeded."
  (^org.apache.commons.math4.optim.PointValuePair [^SimplexSolver this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

(defn do-optimize
  "Performs the bulk of the optimization algorithm.

  returns: the point/value pair giving the optimal value of the
   objective function. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyIterationsException"
  (^org.apache.commons.math4.optim.PointValuePair [^SimplexSolver this]
    (-> this (.doOptimize))))

