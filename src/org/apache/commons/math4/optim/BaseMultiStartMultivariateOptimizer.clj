(ns org.apache.commons.math4.optim.BaseMultiStartMultivariateOptimizer
  "Base class multi-start optimizer for a multivariate function.

  This class wraps an optimizer in order to use it several times in
  turn with different starting points (trying to avoid being trapped
  in a local extremum when looking for a global one).
  It is not a \"user\" class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim BaseMultiStartMultivariateOptimizer]))

(defn ->base-multi-start-multivariate-optimizer
  "Constructor.

  Create a multi-start optimizer from a single-start optimizer.

   Note that if there are bounds constraints (see BaseMultivariateOptimizer.getLowerBound()
   and BaseMultivariateOptimizer.getUpperBound()), then a simple rejection algorithm is used
   at each restart. This implies that the random vector generator should have
   a good probability to generate vectors in the bounded domain, otherwise the
   rejection algorithm will hit the BaseOptimizer.getMaxEvaluations() count without
   generating a proper restart point. Users must be take great care of the curse of dimensionality.

  optimizer - Single-start optimizer to wrap. - `org.apache.commons.math4.optim.BaseMultivariateOptimizer`
  starts - Number of starts to perform. If starts == 1, the optimize will return the same solution as the given optimizer would return. - `int`
  generator - Random vector generator to use for restarts. - `org.apache.commons.math4.random.RandomVectorGenerator`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if starts < 1."
  (^BaseMultiStartMultivariateOptimizer [^org.apache.commons.math4.optim.BaseMultivariateOptimizer optimizer ^Integer starts ^org.apache.commons.math4.random.RandomVectorGenerator generator]
    (new BaseMultiStartMultivariateOptimizer optimizer starts generator)))

(defn get-evaluations
  "Gets the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BaseMultiStartMultivariateOptimizer this]
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

   The behaviour is undefined if this method is called before
   optimize; it will likely throw NullPointerException.

  returns: an array containing the optima sorted from best to worst. - `PAIR[]`"
  ([^BaseMultiStartMultivariateOptimizer this]
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

  opt-data - Optimization data. In addition to those documented in BaseOptimizer, this method will register the following data: InitialGuess SimpleBounds - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `PAIR`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if optData does not contain an instance of MaxEval or InitialGuess."
  ([^BaseMultiStartMultivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

