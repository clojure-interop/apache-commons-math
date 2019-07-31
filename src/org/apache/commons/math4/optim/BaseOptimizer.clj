(ns org.apache.commons.math4.optim.BaseOptimizer
  "Base class for implementing optimizers.
  It contains the boiler-plate code for counting the number of evaluations
  of the objective function and the number of iterations of the algorithm,
  and storing the convergence checker.
  It is not a \"user\" class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim BaseOptimizer]))

(defn get-max-evaluations
  "Gets the maximal number of function evaluations.

  returns: the maximal number of function evaluations. - `int`"
  (^Integer [^BaseOptimizer this]
    (-> this (.getMaxEvaluations))))

(defn get-evaluations
  "Gets the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BaseOptimizer this]
    (-> this (.getEvaluations))))

(defn get-max-iterations
  "Gets the maximal number of iterations.

  returns: the maximal number of iterations. - `int`"
  (^Integer [^BaseOptimizer this]
    (-> this (.getMaxIterations))))

(defn get-iterations
  "Gets the number of iterations performed by the algorithm.
   The number iterations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BaseOptimizer this]
    (-> this (.getIterations))))

(defn get-convergence-checker
  "Gets the convergence checker.

  returns: the object used to check for convergence. - `org.apache.commons.math4.optim.ConvergenceChecker<PAIR>`"
  (^org.apache.commons.math4.optim.ConvergenceChecker [^BaseOptimizer this]
    (-> this (.getConvergenceChecker))))

(defn optimize
  "Stores data and performs the optimization.

   The list of parameters is open-ended so that sub-classes can extend it
   with arguments specific to their concrete implementations.

   When the method is called multiple times, instance data is overwritten
   only when actually present in the list of arguments: when not specified,
   data set in a previous call is retained (and thus is optional in
   subsequent calls).

   Important note: Subclasses must override
   parseOptimizationData(OptimizationData[]) if they need to register
   their own options; but then, they must also call
   super.parseOptimizationData(optData) within that method.

  opt-data - Optimization data. This method will register the following data: MaxEval MaxIter - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `PAIR`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  ([^BaseOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data)))
  ([^BaseOptimizer this]
    (-> this (.optimize))))

