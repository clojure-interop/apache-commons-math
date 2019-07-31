(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.SimplexOptimizer
  "This class implements simplex-based direct search optimization.


   Direct search methods only use objective function values, they do
   not need derivatives and don't either try to compute approximation
   of the derivatives. According to a 1996 paper by Margaret H. Wright
   (Direct
   Search Methods: Once Scorned, Now Respectable), they are used
   when either the computation of the derivative is impossible (noisy
   functions, unpredictable discontinuities) or difficult (complexity,
   computation cost). In the first cases, rather than an optimum, a
   not too bad point is desired. In the latter cases, an
   optimum is desired but cannot be reasonably found. In all cases
   direct search methods can be useful.


   Simplex-based direct search methods are based on comparison of
   the objective function values at the vertices of a simplex (which is a
   set of n+1 points in dimension n) that is updated by the algorithms
   steps.


   The simplex update procedure (NelderMeadSimplex or
  MultiDirectionalSimplex)  must be passed to the
  optimize method.


   Each call to optimize will re-use the start configuration of
   the current simplex and move it such that its first vertex is at the
   provided start point of the optimization.
   If the optimize method is called to solve a different problem
   and the number of parameters change, the simplex must be re-initialized
   to one with the appropriate dimensions.


   Convergence is checked by providing the worst points of
   previous and current simplex to the convergence checker, not the best
   ones.


   This simplex optimizer implementation does not directly support constrained
   optimization with simple bounds; so, for such optimizations, either a more
   dedicated algorithm must be used like
   CMAESOptimizer or BOBYQAOptimizer, or the objective
   function must be wrapped in an adapter like
   MultivariateFunctionMappingAdapter or
   MultivariateFunctionPenaltyAdapter.

   The call to optimize will throw
   MathUnsupportedOperationException if bounds are passed to it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv SimplexOptimizer]))

(defn ->simplex-optimizer
  "Constructor.

  rel - Relative threshold. - `double`
  abs - Absolute threshold. - `double`"
  (^SimplexOptimizer [^Double rel ^Double abs]
    (new SimplexOptimizer rel abs))
  (^SimplexOptimizer [^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new SimplexOptimizer checker)))

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

  opt-data - Optimization data. In addition to those documented in MultivariateOptimizer, this method will register the following data: AbstractSimplex - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`"
  (^org.apache.commons.math4.optim.PointValuePair [^SimplexOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

