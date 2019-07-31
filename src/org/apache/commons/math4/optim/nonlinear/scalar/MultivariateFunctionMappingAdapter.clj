(ns org.apache.commons.math4.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter
  "Adapter for mapping bounded MultivariateFunction to unbounded ones.


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
  be called by the optimizer with unbound parameters, and the adapter will map
  the unbounded value to the bounded range using appropriate functions like
  Sigmoid for double bounded elements for example.


  As the optimizer sees only unbounded parameters, it should be noted that the
  start point or simplex expected by the optimizer should be unbounded, so the
  user is responsible for converting his bounded point to unbounded by calling
  boundedToUnbounded(double[]) before providing them to the optimizer.
  For the same reason, the point returned by the BaseMultivariateOptimizer.optimize(OptimizationData[])
  method is unbounded. So to convert this point to bounded, users must call
  unboundedToBounded(double[]) by themselves!

  This adapter is only a poor man solution to simple bounds optimization constraints
  that can be used with simple optimizers like
  SimplexOptimizer.
  A better solution is to use an optimizer that directly supports simple bounds like
  CMAESOptimizer or
  BOBYQAOptimizer.
  One caveat of this poor-man's solution is that behavior near the bounds may be
  numerically unstable as bounds are mapped from infinite values.
  Another caveat is that convergence values are evaluated by the optimizer with
  respect to unbounded variables, so there will be scales differences when
  converted to bounded variables."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar MultivariateFunctionMappingAdapter]))

(defn ->multivariate-function-mapping-adapter
  "Constructor.

  Simple constructor.

  bounded - bounded function - `org.apache.commons.math4.analysis.MultivariateFunction`
  lower - lower bounds for each element of the input parameters array (some elements may be set to Double.NEGATIVE_INFINITY for unbounded values) - `double[]`
  upper - upper bounds for each element of the input parameters array (some elements may be set to Double.POSITIVE_INFINITY for unbounded values) - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if lower and upper bounds are not consistent, either according to dimension or to values"
  (^MultivariateFunctionMappingAdapter [^org.apache.commons.math4.analysis.MultivariateFunction bounded lower upper]
    (new MultivariateFunctionMappingAdapter bounded lower upper)))

(defn unbounded-to-bounded
  "Maps an array from unbounded to bounded.

  point - Unbounded values. - `double[]`

  returns: the bounded values. - `double[]`"
  ([^MultivariateFunctionMappingAdapter this point]
    (-> this (.unboundedToBounded point))))

(defn bounded-to-unbounded
  "Maps an array from bounded to unbounded.

  point - Bounded values. - `double[]`

  returns: the unbounded values. - `double[]`"
  ([^MultivariateFunctionMappingAdapter this point]
    (-> this (.boundedToUnbounded point))))

(defn value
  "Compute the underlying function value from an unbounded point.

   This method simply bounds the unbounded point using the mappings
   set up at construction and calls the underlying function using
   the bounded point.

  point - unbounded value - `double[]`

  returns: underlying function value - `double`"
  (^Double [^MultivariateFunctionMappingAdapter this point]
    (-> this (.value point))))

