(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.CMAESOptimizer
  "An implementation of the active Covariance Matrix Adaptation Evolution Strategy (CMA-ES)
  for non-linear, non-convex, non-smooth, global function minimization.

  The CMA-Evolution Strategy (CMA-ES) is a reliable stochastic optimization method
  which should be applied if derivative-based methods, e.g. quasi-Newton BFGS or
  conjugate gradient, fail due to a rugged search landscape (e.g. noise, local
  optima, outlier, etc.) of the objective function. Like a
  quasi-Newton method, the CMA-ES learns and applies a variable metric
  on the underlying search space. Unlike a quasi-Newton method, the
  CMA-ES neither estimates nor uses gradients, making it considerably more
  reliable in terms of finding a good, or even close to optimal, solution.

  In general, on smooth objective functions the CMA-ES is roughly ten times
  slower than BFGS (counting objective function evaluations, no gradients provided).
  For up to N=10 variables also the derivative-free simplex
  direct search method (Nelder and Mead) can be faster, but it is
  far less reliable than CMA-ES.

  The CMA-ES is particularly well suited for non-separable
  and/or badly conditioned problems. To observe the advantage of CMA compared
  to a conventional evolution strategy, it will usually take about
  30 N function evaluations. On difficult problems the complete
  optimization (a single run) is expected to take roughly between
  30 N and 300 N2
  function evaluations.

  This implementation is translated and adapted from the Matlab version
  of the CMA-ES algorithm as implemented in module cmaes.m version 3.51.

  For more information, please refer to the following links:

   Matlab code
   Introduction to CMA-ES
   Wikipedia"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv CMAESOptimizer]))

(defn ->cmaes-optimizer
  "Constructor.

  max-iterations - Maximal number of iterations. - `int`
  stop-fitness - Whether to stop if objective function value is smaller than stopFitness. - `double`
  is-active-cma - Chooses the covariance matrix update method. - `boolean`
  diagonal-only - Number of initial iterations, where the covariance matrix remains diagonal. - `int`
  check-feasable-count - Determines how often new random objective variables are generated in case they are out of bounds. - `int`
  rng - Random generator. - `org.apache.commons.rng.UniformRandomProvider`
  generate-statistics - Whether statistic data is collected. - `boolean`
  checker - Convergence checker. - `org.apache.commons.math4.optim.ConvergenceChecker`"
  (^CMAESOptimizer [^Integer max-iterations ^Double stop-fitness ^Boolean is-active-cma ^Integer diagonal-only ^Integer check-feasable-count ^org.apache.commons.rng.UniformRandomProvider rng ^Boolean generate-statistics ^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new CMAESOptimizer max-iterations stop-fitness is-active-cma diagonal-only check-feasable-count rng generate-statistics checker)))

(defn get-statistics-sigma-history
  "returns: History of sigma values. - `java.util.List<java.lang.Double>`"
  (^java.util.List [^CMAESOptimizer this]
    (-> this (.getStatisticsSigmaHistory))))

(defn get-statistics-mean-history
  "returns: History of mean matrix. - `java.util.List<org.apache.commons.math4.linear.RealMatrix>`"
  (^java.util.List [^CMAESOptimizer this]
    (-> this (.getStatisticsMeanHistory))))

(defn get-statistics-fitness-history
  "returns: History of fitness values. - `java.util.List<java.lang.Double>`"
  (^java.util.List [^CMAESOptimizer this]
    (-> this (.getStatisticsFitnessHistory))))

(defn get-statistics-d-history
  "returns: History of D matrix. - `java.util.List<org.apache.commons.math4.linear.RealMatrix>`"
  (^java.util.List [^CMAESOptimizer this]
    (-> this (.getStatisticsDHistory))))

(defn optimize
  "Stores data and performs the optimization.

   The list of parameters is open-ended so that sub-classes can extend it
   with arguments specific to their concrete implementations.

   When the method is called multiple times, instance data is overwritten
   only when actually present in the list of arguments: when not specified,
   data set in a previous call is retained (and thus is optional in
   subsequent calls).

   Important note: Subclasses must override
   BaseOptimizer.parseOptimizationData(OptimizationData[]) if they need to register
   their own options; but then, they must also call
   super.parseOptimizationData(optData) within that method.

  opt-data - Optimization data. In addition to those documented in MultivariateOptimizer, this method will register the following data: CMAESOptimizer.Sigma CMAESOptimizer.PopulationSize - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `org.apache.commons.math4.optim.PointValuePair`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  (^org.apache.commons.math4.optim.PointValuePair [^CMAESOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

