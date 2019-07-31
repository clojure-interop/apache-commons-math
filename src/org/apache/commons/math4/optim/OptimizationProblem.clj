(ns org.apache.commons.math4.optim.OptimizationProblem
  "Common settings for all optimization problems. Includes divergence and convergence
  criteria."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim OptimizationProblem]))

(defn get-evaluation-counter
  "Get a independent Incrementor that counts up to the maximum number of evaluations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^OptimizationProblem this]
    (-> this (.getEvaluationCounter))))

(defn get-iteration-counter
  "Get a independent Incrementor that counts up to the maximum number of iterations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^OptimizationProblem this]
    (-> this (.getIterationCounter))))

(defn get-convergence-checker
  "Gets the convergence checker.

  returns: the object used to check for convergence. - `org.apache.commons.math4.optim.ConvergenceChecker<PAIR>`"
  (^org.apache.commons.math4.optim.ConvergenceChecker [^OptimizationProblem this]
    (-> this (.getConvergenceChecker))))

