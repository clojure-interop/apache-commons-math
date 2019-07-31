(ns org.apache.commons.math4.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter
  "Adapter extending bounded MultivariateFunction to an unbouded
  domain using a penalty function.


  This adapter can be used to wrap functions subject to simple bounds on
  parameters so they can be used by optimizers that do not directly
  support simple bounds.


  The principle is that the user function that will be wrapped will see its
  parameters bounded as required, i.e when its value method is called
  with argument array point, the elements array will fulfill requirement
  lower[i] <= point[i] <= upper[i] for all i. Some of the components
  may be unbounded or bounded only on one side if the corresponding bound is
  set to an infinite value. The optimizer will not manage the user function by
  itself, but it will handle this adapter and it is this adapter that will take
  care the bounds are fulfilled. The adapter value(double[]) method will
  be called by the optimizer with unbound parameters, and the adapter will check
  if the parameters is within range or not. If it is in range, then the underlying
  user function will be called, and if it is not the value of a penalty function
  will be returned instead.


  This adapter is only a poor-man's solution to simple bounds optimization
  constraints that can be used with simple optimizers like
  SimplexOptimizer.
  A better solution is to use an optimizer that directly supports simple bounds like
  CMAESOptimizer or
  BOBYQAOptimizer.
  One caveat of this poor-man's solution is that if start point or start simplex
  is completely outside of the allowed range, only the penalty function is used,
  and the optimizer may converge without ever entering the range."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar MultivariateFunctionPenaltyAdapter]))

(defn ->multivariate-function-penalty-adapter
  "Constructor.

  Simple constructor.

   When the optimizer provided points are out of range, the value of the
   penalty function will be used instead of the value of the underlying
   function. In order for this penalty to be effective in rejecting this
   point during the optimization process, the penalty function value should
   be defined with care. This value is computed as:


     penalty(point) = offset  ∑i[scale[i] * √|point[i]-boundary[i]|]
   where indices i correspond to all the components that violates their boundaries.


   So when attempting a function minimization, offset should be larger than
   the maximum expected value of the underlying function and scale components
   should all be positive. When attempting a function maximization, offset
   should be lesser than the minimum expected value of the underlying function
   and scale components should all be negative.
   minimization, and lesser than the minimum expected value of the underlying
   function when attempting maximization.


   These choices for the penalty function have two properties. First, all out
   of range points will return a function value that is worse than the value
   returned by any in range point. Second, the penalty is worse for large
   boundaries violation than for small violations, so the optimizer has an hint
   about the direction in which it should search for acceptable points.

  bounded - bounded function - `org.apache.commons.math4.analysis.MultivariateFunction`
  lower - lower bounds for each element of the input parameters array (some elements may be set to Double.NEGATIVE_INFINITY for unbounded values) - `double[]`
  upper - upper bounds for each element of the input parameters array (some elements may be set to Double.POSITIVE_INFINITY for unbounded values) - `double[]`
  offset - base offset of the penalty function - `double`
  scale - scale of the penalty function - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if lower bounds, upper bounds and scales are not consistent, either according to dimension or to bounadary values"
  (^MultivariateFunctionPenaltyAdapter [^org.apache.commons.math4.analysis.MultivariateFunction bounded lower upper ^Double offset scale]
    (new MultivariateFunctionPenaltyAdapter bounded lower upper offset scale)))

(defn value
  "Computes the underlying function value from an unbounded point.

   This method simply returns the value of the underlying function
   if the unbounded point already fulfills the bounds, and compute
   a replacement value using the offset and scale if bounds are
   violated, without calling the function at all.

  point - unbounded point - `double[]`

  returns: either underlying function value or penalty function value - `double`"
  (^Double [^MultivariateFunctionPenaltyAdapter this point]
    (-> this (.value point))))

