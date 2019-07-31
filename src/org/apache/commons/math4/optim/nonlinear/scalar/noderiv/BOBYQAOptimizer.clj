(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer
  "Powell's BOBYQA algorithm. This implementation is translated and
  adapted from the Fortran version available
  here.
  See
  this paper for an introduction.

  BOBYQA is particularly well suited for high dimensional problems
  where derivatives are not available. In most cases it outperforms the
  PowellOptimizer significantly. Stochastic algorithms like
  CMAESOptimizer succeed more often than BOBYQA, but are more
  expensive. BOBYQA could also be considered as a replacement of any
  derivative-based optimizer when the derivatives are approximated by
  finite differences."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv BOBYQAOptimizer]))

(defn ->bobyqa-optimizer
  "Constructor.

  number-of-interpolation-points - Number of interpolation conditions. For a problem of dimension n, its value must be in the interval [n+2, (n+1)(n+2)/2]. Choices that exceed 2n+1 are not recommended. - `int`
  initial-trust-region-radius - Initial trust region radius. - `double`
  stopping-trust-region-radius - Stopping trust region radius. - `double`"
  (^BOBYQAOptimizer [^Integer number-of-interpolation-points ^Double initial-trust-region-radius ^Double stopping-trust-region-radius]
    (new BOBYQAOptimizer number-of-interpolation-points initial-trust-region-radius stopping-trust-region-radius))
  (^BOBYQAOptimizer [^Integer number-of-interpolation-points]
    (new BOBYQAOptimizer number-of-interpolation-points)))

(def *-minimum-problem-dimension
  "Static Constant.

  Minimum dimension of the problem: 2

  type: int"
  BOBYQAOptimizer/MINIMUM_PROBLEM_DIMENSION)

(def *-default-initial-radius
  "Static Constant.

  Default value for initialTrustRegionRadius: 10.0 .

  type: double"
  BOBYQAOptimizer/DEFAULT_INITIAL_RADIUS)

(def *-default-stopping-radius
  "Static Constant.

  Default value for stoppingTrustRegionRadius: 1.0E-8 .

  type: double"
  BOBYQAOptimizer/DEFAULT_STOPPING_RADIUS)

