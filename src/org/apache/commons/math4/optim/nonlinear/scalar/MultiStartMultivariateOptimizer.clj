(ns org.apache.commons.math4.optim.nonlinear.scalar.MultiStartMultivariateOptimizer
  "Multi-start optimizer.

  This class wraps an optimizer in order to use it several times in
  turn with different starting points (trying to avoid being trapped
  in a local extremum when looking for a global one)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar MultiStartMultivariateOptimizer]))

(defn ->multi-start-multivariate-optimizer
  "Constructor.

  Create a multi-start optimizer from a single-start optimizer.

  optimizer - Single-start optimizer to wrap. - `org.apache.commons.math4.optim.nonlinear.scalar.MultivariateOptimizer`
  starts - Number of starts to perform. If starts == 1, the result will be same as if optimizer is called directly. - `int`
  generator - Random vector generator to use for restarts. - `org.apache.commons.math4.random.RandomVectorGenerator`

  throws: org.apache.commons.math4.exception.NullArgumentException - if optimizer or generator is null."
  (^MultiStartMultivariateOptimizer [^org.apache.commons.math4.optim.nonlinear.scalar.MultivariateOptimizer optimizer ^Integer starts ^org.apache.commons.math4.random.RandomVectorGenerator generator]
    (new MultiStartMultivariateOptimizer optimizer starts generator)))

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

  returns: an array containing the optima sorted from best to worst. - `org.apache.commons.math4.optim.PointValuePair[]`"
  ([^MultiStartMultivariateOptimizer this]
    (-> this (.getOptima))))

