(ns org.apache.commons.math4.optim.SimpleVectorValueChecker
  "Simple implementation of the ConvergenceChecker interface using
  only objective function values.

  Convergence is considered to have been reached if either the relative
  difference between the objective function values is smaller than a
  threshold or if either the absolute difference between the objective
  function values is smaller than another threshold for all vectors elements.

  The converged
  method will also return true if the number of iterations has been set
  (see this constructor)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim SimpleVectorValueChecker]))

(defn ->simple-vector-value-checker
  "Constructor.

  Builds an instance with specified tolerance thresholds and
   iteration count.

   In order to perform only relative checks, the absolute tolerance
   must be set to a negative value. In order to perform only absolute
   checks, the relative tolerance must be set to a negative value.

  relative-threshold - Relative tolerance threshold. - `double`
  absolute-threshold - Absolute tolerance threshold. - `double`
  max-iter - Maximum iteration count. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if maxIter <= 0."
  (^SimpleVectorValueChecker [^Double relative-threshold ^Double absolute-threshold ^Integer max-iter]
    (new SimpleVectorValueChecker relative-threshold absolute-threshold max-iter))
  (^SimpleVectorValueChecker [^Double relative-threshold ^Double absolute-threshold]
    (new SimpleVectorValueChecker relative-threshold absolute-threshold)))

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
  previous - Best point in the previous iteration. - `org.apache.commons.math4.optim.PointVectorValuePair`
  current - Best point in the current iteration. - `org.apache.commons.math4.optim.PointVectorValuePair`

  returns: true if the arguments satify the convergence criterion. - `boolean`"
  (^Boolean [^SimpleVectorValueChecker this ^Integer iteration ^org.apache.commons.math4.optim.PointVectorValuePair previous ^org.apache.commons.math4.optim.PointVectorValuePair current]
    (-> this (.converged iteration previous current))))

