(ns org.apache.commons.math4.optim.univariate.MultiStartUnivariateOptimizer
  "Special implementation of the UnivariateOptimizer interface
  adding multi-start features to an existing optimizer.

  This class wraps an optimizer in order to use it several times in
  turn with different starting points (trying to avoid being trapped
  in a local extremum when looking for a global one)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate MultiStartUnivariateOptimizer]))

(defn ->multi-start-univariate-optimizer
  "Constructor.

  Create a multi-start optimizer from a single-start optimizer.

  optimizer - Single-start optimizer to wrap. - `org.apache.commons.math4.optim.univariate.UnivariateOptimizer`
  starts - Number of starts to perform. If starts == 1, the optimize methods will return the same solution as optimizer would. - `int`
  generator - Random generator to use for restarts. - `org.apache.commons.rng.UniformRandomProvider`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if starts < 1."
  (^MultiStartUnivariateOptimizer [^org.apache.commons.math4.optim.univariate.UnivariateOptimizer optimizer ^Integer starts ^org.apache.commons.rng.UniformRandomProvider generator]
    (new MultiStartUnivariateOptimizer optimizer starts generator)))

(defn get-evaluations
  "Gets the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^MultiStartUnivariateOptimizer this]
    (-> this (.getEvaluations))))

(defn get-optima
  "Gets all the optima found during the last call to optimize.
   The optimizer stores all the optima found during a set of
   restarts. The optimize method returns the best point only.
   This method returns all the points found at the end of each starts,
   including the best one already returned by the optimize method.

   The returned array as one element for each start as specified
   in the constructor. It is ordered with the results from the
   runs that did converge first, sorted from best to worst
   objective value (i.e in ascending order if minimizing and in
   descending order if maximizing), followed by null elements
   corresponding to the runs that did not converge. This means all
   elements will be null if the optimize method did throw
   an exception.
   This also means that if the first element is not null, it is
   the best point found across all starts.

  returns: an array containing the optima. - `org.apache.commons.math4.optim.univariate.UnivariatePointValuePair[]`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if optimize has not been called."
  ([^MultiStartUnivariateOptimizer this]
    (-> this (.getOptima))))

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

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if optData does not contain an instance of MaxEval or SearchInterval."
  (^org.apache.commons.math4.optim.univariate.UnivariatePointValuePair [^MultiStartUnivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

