(ns org.apache.commons.math4.optim.AbstractConvergenceChecker
  "Base class for all convergence checker implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim AbstractConvergenceChecker]))

(defn ->abstract-convergence-checker
  "Constructor.

  Build an instance with a specified thresholds.

  relative-threshold - relative tolerance threshold - `double`
  absolute-threshold - absolute tolerance threshold - `double`"
  (^AbstractConvergenceChecker [^Double relative-threshold ^Double absolute-threshold]
    (new AbstractConvergenceChecker relative-threshold absolute-threshold)))

(defn get-relative-threshold
  "returns: the relative threshold. - `double`"
  (^Double [^AbstractConvergenceChecker this]
    (-> this (.getRelativeThreshold))))

(defn get-absolute-threshold
  "returns: the absolute threshold. - `double`"
  (^Double [^AbstractConvergenceChecker this]
    (-> this (.getAbsoluteThreshold))))

(defn converged
  "Check if the optimization algorithm has converged.

  iteration - Current iteration. - `int`
  previous - Best point in the previous iteration. - `PAIR`
  current - Best point in the current iteration. - `PAIR`

  returns: true if the algorithm is considered to have converged. - `boolean`"
  (^Boolean [^AbstractConvergenceChecker this ^Integer iteration previous current]
    (-> this (.converged iteration previous current))))

