(ns org.apache.commons.math4.optim.AbstractOptimizationProblem
  "Base class for implementing optimization problems. It contains the boiler-plate code
  for counting the number of evaluations of the objective function and the number of
  iterations of the algorithm, and storing the convergence checker."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim AbstractOptimizationProblem]))

(defn get-evaluation-counter
  "Get a independent Incrementor that counts up to the maximum number of evaluations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^AbstractOptimizationProblem this]
    (-> this (.getEvaluationCounter))))

(defn get-iteration-counter
  "Get a independent Incrementor that counts up to the maximum number of iterations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^AbstractOptimizationProblem this]
    (-> this (.getIterationCounter))))

(defn get-convergence-checker
  "Gets the convergence checker.

  returns: the object used to check for convergence. - `org.apache.commons.math4.optim.ConvergenceChecker<PAIR>`"
  (^org.apache.commons.math4.optim.ConvergenceChecker [^AbstractOptimizationProblem this]
    (-> this (.getConvergenceChecker))))

