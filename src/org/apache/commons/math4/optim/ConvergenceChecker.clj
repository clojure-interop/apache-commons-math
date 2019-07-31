(ns org.apache.commons.math4.optim.ConvergenceChecker
  "This interface specifies how to check if an optimization algorithm has
  converged.

  Deciding if convergence has been reached is a problem-dependent issue. The
  user should provide a class implementing this interface to allow the
  optimization algorithm to stop its search according to the problem at hand.

  For convenience, three implementations that fit simple needs are already
  provided: SimpleValueChecker, SimpleVectorValueChecker and
  SimplePointChecker. The first two consider that convergence is
  reached when the objective function value does not change much anymore, it
  does not use the point set at all.
  The third one considers that convergence is reached when the input point
  set does not change much anymore, it does not use objective function value
  at all."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim ConvergenceChecker]))

(defn converged
  "Check if the optimization algorithm has converged.

  iteration - Current iteration. - `int`
  previous - Best point in the previous iteration. - `PAIR`
  current - Best point in the current iteration. - `PAIR`

  returns: true if the algorithm is considered to have converged. - `boolean`"
  (^Boolean [^ConvergenceChecker this ^Integer iteration previous current]
    (-> this (.converged iteration previous current))))

