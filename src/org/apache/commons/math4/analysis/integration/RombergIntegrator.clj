(ns org.apache.commons.math4.analysis.integration.RombergIntegrator
  "Implements the
  Romberg Algorithm for integration of real univariate functions. For
  reference, see Introduction to Numerical Analysis, ISBN 038795452X,
  chapter 3.

  Romberg integration employs k successive refinements of the trapezoid
  rule to remove error terms less than order O(N^(-2k)). Simpson's rule
  is a special case of k = 2."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration RombergIntegrator]))

(defn ->romberg-integrator
  "Constructor.

  Build a Romberg integrator with given accuracies and iterations counts.

  relative-accuracy - relative accuracy of the result - `double`
  absolute-accuracy - absolute accuracy of the result - `double`
  minimal-iteration-count - minimum number of iterations - `int`
  maximal-iteration-count - maximum number of iterations (must be less than or equal to ROMBERG_MAX_ITERATIONS_COUNT) - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if minimal number of iterations is not strictly positive"
  (^RombergIntegrator [^Double relative-accuracy ^Double absolute-accuracy ^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new RombergIntegrator relative-accuracy absolute-accuracy minimal-iteration-count maximal-iteration-count))
  (^RombergIntegrator [^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new RombergIntegrator minimal-iteration-count maximal-iteration-count))
  (^RombergIntegrator []
    (new RombergIntegrator )))

(def *-romberg-max-iterations-count
  "Static Constant.

  Maximal number of iterations for Romberg.

  type: int"
  RombergIntegrator/ROMBERG_MAX_ITERATIONS_COUNT)

