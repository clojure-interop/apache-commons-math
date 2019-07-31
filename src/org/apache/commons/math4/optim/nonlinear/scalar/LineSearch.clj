(ns org.apache.commons.math4.optim.nonlinear.scalar.LineSearch
  "Class for finding the minimum of the objective function along a given
  direction."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar LineSearch]))

(defn ->line-search
  "Constructor.

  The BrentOptimizer default stopping criterion uses the
   tolerances to check the domain (point) values, not the function
   values.
   The relativeTolerance and absoluteTolerance
   arguments are thus passed to a custom checker that will use the function values.

  optimizer - Optimizer on behalf of which the line search be performed. Its computeObjectiveValue method will be called by the search method. - `org.apache.commons.math4.optim.nonlinear.scalar.MultivariateOptimizer`
  relative-tolerance - Search will stop when the function relative difference between successive iterations is below this value. - `double`
  absolute-tolerance - Search will stop when the function absolute difference between successive iterations is below this value. - `double`
  initial-bracketing-range - Extent of the initial interval used to find an interval that brackets the optimum. If the optimized function varies a lot in the vicinity of the optimum, it may be necessary to provide a value lower than the distance between successive local minima. - `double`"
  (^LineSearch [^org.apache.commons.math4.optim.nonlinear.scalar.MultivariateOptimizer optimizer ^Double relative-tolerance ^Double absolute-tolerance ^Double initial-bracketing-range]
    (new LineSearch optimizer relative-tolerance absolute-tolerance initial-bracketing-range)))

(defn search
  "Finds the number alpha that optimizes
   f(startPoint  alpha * direction).

  start-point - Starting point. - `double[]`
  direction - Search direction. - `double[]`

  returns: the optimum. - `org.apache.commons.math4.optim.univariate.UnivariatePointValuePair`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the number of evaluations is exceeded."
  (^org.apache.commons.math4.optim.univariate.UnivariatePointValuePair [^LineSearch this start-point direction]
    (-> this (.search start-point direction))))

