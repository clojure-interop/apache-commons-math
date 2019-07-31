(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize
  "Population size.
  The number of offspring is the primary strategy parameter.
  In the absence of better clues, a good default could be an
  integer close to 4  3 ln(n), where n is the
  number of optimized parameters.
  Increasing the population size improves global search properties
  at the expense of speed (which in general decreases at most
  linearly with increasing population size)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv CMAESOptimizer$PopulationSize]))

(defn ->population-size
  "Constructor.

  size - Population size. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if size <= 0."
  (^CMAESOptimizer$PopulationSize [^Integer size]
    (new CMAESOptimizer$PopulationSize size)))

(defn get-population-size
  "returns: the population size. - `int`"
  (^Integer [^CMAESOptimizer$PopulationSize this]
    (-> this (.getPopulationSize))))

