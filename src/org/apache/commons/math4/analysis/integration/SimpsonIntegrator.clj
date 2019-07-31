(ns org.apache.commons.math4.analysis.integration.SimpsonIntegrator
  "Implements
  Simpson's Rule for integration of real univariate functions. For
  reference, see Introduction to Numerical Analysis, ISBN 038795452X,
  chapter 3.

  This implementation employs the basic trapezoid rule to calculate Simpson's
  rule."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration SimpsonIntegrator]))

(defn ->simpson-integrator
  "Constructor.

  Build a Simpson integrator with given accuracies and iterations counts.

  relative-accuracy - relative accuracy of the result - `double`
  absolute-accuracy - absolute accuracy of the result - `double`
  minimal-iteration-count - minimum number of iterations - `int`
  maximal-iteration-count - maximum number of iterations (must be less than or equal to SIMPSON_MAX_ITERATIONS_COUNT) - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if minimal number of iterations is not strictly positive"
  (^SimpsonIntegrator [^Double relative-accuracy ^Double absolute-accuracy ^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new SimpsonIntegrator relative-accuracy absolute-accuracy minimal-iteration-count maximal-iteration-count))
  (^SimpsonIntegrator [^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new SimpsonIntegrator minimal-iteration-count maximal-iteration-count))
  (^SimpsonIntegrator []
    (new SimpsonIntegrator )))

(def *-simpson-max-iterations-count
  "Static Constant.

  Maximal number of iterations for Simpson.

  type: int"
  SimpsonIntegrator/SIMPSON_MAX_ITERATIONS_COUNT)

