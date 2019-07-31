(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.PowellOptimizer
  "Powell's algorithm.
  This code is translated and adapted from the Python version of this
  algorithm (as implemented in module optimize.py v0.5 of
  SciPy).

  The default stopping criterion is based on the differences of the
  function value between two successive iterations. It is however possible
  to define a custom convergence checker that might terminate the algorithm
  earlier.

  Line search is performed by the LineSearch class.

  Constraints are not supported: the call to
  optimize will throw
  MathUnsupportedOperationException if bounds are passed to it.
  In order to impose simple constraints, the objective function must be
  wrapped in an adapter like
  MultivariateFunctionMappingAdapter or
  MultivariateFunctionPenaltyAdapter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv PowellOptimizer]))

(defn ->powell-optimizer
  "Constructor.

  This constructor allows to specify a user-defined convergence checker,
   in addition to the parameters that control the default convergence
   checking procedure and the line search tolerances.

  rel - Relative threshold for this optimizer. - `double`
  abs - Absolute threshold for this optimizer. - `double`
  line-rel - Relative threshold for the internal line search optimizer. - `double`
  line-abs - Absolute threshold for the internal line search optimizer. - `double`
  checker - Convergence checker. - `org.apache.commons.math4.optim.ConvergenceChecker`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if abs <= 0."
  (^PowellOptimizer [^Double rel ^Double abs ^Double line-rel ^Double line-abs ^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new PowellOptimizer rel abs line-rel line-abs checker))
  (^PowellOptimizer [^Double rel ^Double abs ^Double line-rel ^Double line-abs]
    (new PowellOptimizer rel abs line-rel line-abs))
  (^PowellOptimizer [^Double rel ^Double abs ^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new PowellOptimizer rel abs checker))
  (^PowellOptimizer [^Double rel ^Double abs]
    (new PowellOptimizer rel abs)))

