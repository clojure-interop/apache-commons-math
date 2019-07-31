(ns org.apache.commons.math4.fitting.leastsquares.EvaluationRmsChecker
  "Check if an optimization has converged based on the change in computed RMS."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares EvaluationRmsChecker]))

(defn ->evaluation-rms-checker
  "Constructor.

  Create a convergence checker for the RMS with a relative and absolute tolerance.

   The optimization has converged when the RMS of consecutive evaluations are equal
   to within the given relative tolerance or absolute tolerance.

  rel-tol - the relative tolerance. - `double`
  abs-tol - the absolute tolerance. - `double`"
  (^EvaluationRmsChecker [^Double rel-tol ^Double abs-tol]
    (new EvaluationRmsChecker rel-tol abs-tol))
  (^EvaluationRmsChecker [^Double tol]
    (new EvaluationRmsChecker tol)))

(defn converged
  "Check if the optimization algorithm has converged.

  iteration - Current iteration. - `int`
  previous - Best point in the previous iteration. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation`
  current - Best point in the current iteration. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation`

  returns: true if the algorithm is considered to have converged. - `boolean`"
  (^Boolean [^EvaluationRmsChecker this ^Integer iteration ^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation previous ^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation current]
    (-> this (.converged iteration previous current))))

