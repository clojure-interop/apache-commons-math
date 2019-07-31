(ns org.apache.commons.math4.optim.SimplePointChecker
  "Simple implementation of the ConvergenceChecker interface using
  only point coordinates.

  Convergence is considered to have been reached if either the relative
  difference between each point coordinate are smaller than a threshold
  or if either the absolute difference between the point coordinates are
  smaller than another threshold.

  The converged method will also return
  true if the number of iterations has been set (see
  this constructor)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim SimplePointChecker]))

(defn ->simple-point-checker
  "Constructor.

  Builds an instance with specified thresholds.
   In order to perform only relative checks, the absolute tolerance
   must be set to a negative value. In order to perform only absolute
   checks, the relative tolerance must be set to a negative value.

  relative-threshold - Relative tolerance threshold. - `double`
  absolute-threshold - Absolute tolerance threshold. - `double`
  max-iter - Maximum iteration count. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if maxIter <= 0."
  (^SimplePointChecker [^Double relative-threshold ^Double absolute-threshold ^Integer max-iter]
    (new SimplePointChecker relative-threshold absolute-threshold max-iter))
  (^SimplePointChecker [^Double relative-threshold ^Double absolute-threshold]
    (new SimplePointChecker relative-threshold absolute-threshold)))

(defn converged
  "Check if the optimization algorithm has converged considering the
   last two points.
   This method may be called several times from the same algorithm
   iteration with different points. This can be detected by checking the
   iteration number at each call if needed. Each time this method is
   called, the previous and current point correspond to points with the
   same role at each iteration, so they can be compared. As an example,
   simplex-based algorithms call this method for all points of the simplex,
   not only for the best or worst ones.

  iteration - Index of current iteration - `int`
  previous - Best point in the previous iteration. - `PAIR`
  current - Best point in the current iteration. - `PAIR`

  returns: true if the arguments satify the convergence criterion. - `boolean`"
  (^Boolean [^SimplePointChecker this ^Integer iteration previous current]
    (-> this (.converged iteration previous current))))

