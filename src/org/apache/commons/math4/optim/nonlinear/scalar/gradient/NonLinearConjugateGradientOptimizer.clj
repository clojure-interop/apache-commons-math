(ns org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer
  "Non-linear conjugate gradient optimizer.

  This class supports both the Fletcher-Reeves and the Polak-Ribière
  update formulas for the conjugate search directions.
  It also supports optional preconditioning.

  Constraints are not supported: the call to
  optimize will throw
  MathUnsupportedOperationException if bounds are passed to it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.gradient NonLinearConjugateGradientOptimizer]))

(defn ->non-linear-conjugate-gradient-optimizer
  "Constructor.

  Constructor with default preconditioner.

  update-formula - formula to use for updating the β parameter, must be one of NonLinearConjugateGradientOptimizer.Formula.FLETCHER_REEVES or NonLinearConjugateGradientOptimizer.Formula.POLAK_RIBIERE. - `org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula`
  checker - Convergence checker. - `org.apache.commons.math4.optim.ConvergenceChecker`
  relative-tolerance - Relative threshold for line search. - `double`
  absolute-tolerance - Absolute threshold for line search. - `double`
  initial-bracketing-range - Extent of the initial interval used to find an interval that brackets the optimum in order to perform the line search. - `double`"
  (^NonLinearConjugateGradientOptimizer [^org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula update-formula ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Double relative-tolerance ^Double absolute-tolerance ^Double initial-bracketing-range]
    (new NonLinearConjugateGradientOptimizer update-formula checker relative-tolerance absolute-tolerance initial-bracketing-range))
  (^NonLinearConjugateGradientOptimizer [^org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula update-formula ^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new NonLinearConjugateGradientOptimizer update-formula checker))
  (^NonLinearConjugateGradientOptimizer [^org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula update-formula ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Double relative-tolerance ^Double absolute-tolerance ^Double initial-bracketing-range ^org.apache.commons.math4.optim.nonlinear.scalar.gradient.Preconditioner preconditioner]
    (new NonLinearConjugateGradientOptimizer update-formula checker relative-tolerance absolute-tolerance initial-bracketing-range preconditioner)))

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
  (^org.apache.commons.math4.optim.PointValuePair [^NonLinearConjugateGradientOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

