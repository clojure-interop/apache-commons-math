(ns org.apache.commons.math4.analysis.integration.TrapezoidIntegrator
  "Implements the
  Trapezoid Rule for integration of real univariate functions. For
  reference, see Introduction to Numerical Analysis, ISBN 038795452X,
  chapter 3.

  The function should be integrable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration TrapezoidIntegrator]))

(defn ->trapezoid-integrator
  "Constructor.

  Build a trapezoid integrator with given accuracies and iterations counts.

  relative-accuracy - relative accuracy of the result - `double`
  absolute-accuracy - absolute accuracy of the result - `double`
  minimal-iteration-count - minimum number of iterations - `int`
  maximal-iteration-count - maximum number of iterations (must be less than or equal to TRAPEZOID_MAX_ITERATIONS_COUNT - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if minimal number of iterations is not strictly positive"
  (^TrapezoidIntegrator [^Double relative-accuracy ^Double absolute-accuracy ^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new TrapezoidIntegrator relative-accuracy absolute-accuracy minimal-iteration-count maximal-iteration-count))
  (^TrapezoidIntegrator [^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new TrapezoidIntegrator minimal-iteration-count maximal-iteration-count))
  (^TrapezoidIntegrator []
    (new TrapezoidIntegrator )))

(def *-trapezoid-max-iterations-count
  "Static Constant.

  Maximum number of iterations for trapezoid.

  type: int"
  TrapezoidIntegrator/TRAPEZOID_MAX_ITERATIONS_COUNT)

