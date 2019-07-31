(ns org.apache.commons.math4.optim.BaseMultivariateOptimizer
  "Base class for implementing optimizers for multivariate functions.
  It contains the boiler-plate code for initial guess and bounds
  specifications.
  It is not a \"user\" class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim BaseMultivariateOptimizer]))

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

  opt-data - Optimization data. In addition to those documented in BaseOptimizer, this method will register the following data: InitialGuess SimpleBounds - `org.apache.commons.math4.optim.OptimizationData`

  returns: a point/value pair that satisfies the convergence criteria. - `PAIR`"
  ([^BaseMultivariateOptimizer this ^org.apache.commons.math4.optim.OptimizationData opt-data]
    (-> this (.optimize opt-data))))

(defn get-start-point
  "Gets the initial guess.

  returns: the initial guess, or null if not set. - `double[]`"
  ([^BaseMultivariateOptimizer this]
    (-> this (.getStartPoint))))

(defn get-lower-bound
  "returns: the lower bounds, or null if not set. - `double[]`"
  ([^BaseMultivariateOptimizer this]
    (-> this (.getLowerBound))))

(defn get-upper-bound
  "returns: the upper bounds, or null if not set. - `double[]`"
  ([^BaseMultivariateOptimizer this]
    (-> this (.getUpperBound))))

