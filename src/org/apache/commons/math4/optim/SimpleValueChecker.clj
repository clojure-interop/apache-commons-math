(ns org.apache.commons.math4.optim.SimpleValueChecker
  "Simple implementation of the ConvergenceChecker interface using
  only objective function values.

  Convergence is considered to have been reached if either the relative
  difference between the objective function values is smaller than a
  threshold or if either the absolute difference between the objective
  function values is smaller than another threshold.

  The converged
  method will also return true if the number of iterations has been set
  (see this constructor)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim SimpleValueChecker]))

(defn ->simple-value-checker
  "Constructor.

  Builds an instance with specified thresholds.

   In order to perform only relative checks, the absolute tolerance
   must be set to a negative value. In order to perform only absolute
   checks, the relative tolerance must be set to a negative value.

  relative-threshold - relative tolerance threshold - `double`
  absolute-threshold - absolute tolerance threshold - `double`
  max-iter - Maximum iteration count. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if maxIter <= 0."
  (^SimpleValueChecker [^Double relative-threshold ^Double absolute-threshold ^Integer max-iter]
    (new SimpleValueChecker relative-threshold absolute-threshold max-iter))
  (^SimpleValueChecker [^Double relative-threshold ^Double absolute-threshold]
    (new SimpleValueChecker relative-threshold absolute-threshold)))

(defn converged
  "Check if the optimization algorithm has converged considering the
   last two points.
   This method may be called several time from the same algorithm
   iteration with different points. This can be detected by checking the
   iteration number at each call if needed. Each time this method is
   called, the previous and current point correspond to points with the
   same role at each iteration, so they can be compared. As an example,
   simplex-based algorithms call this method for all points of the simplex,
   not only for the best or worst ones.

  iteration - Index of current iteration - `int`
  previous - Best point in the previous iteration. - `org.apache.commons.math4.optim.PointValuePair`
  current - Best point in the current iteration. - `org.apache.commons.math4.optim.PointValuePair`

  returns: true if the algorithm has converged. - `boolean`"
  (^Boolean [^SimpleValueChecker this ^Integer iteration ^org.apache.commons.math4.optim.PointValuePair previous ^org.apache.commons.math4.optim.PointValuePair current]
    (-> this (.converged iteration previous current))))

