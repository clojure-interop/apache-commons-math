(ns org.apache.commons.math4.analysis.integration.MidPointIntegrator
  "Implements the
  Midpoint Rule for integration of real univariate functions. For
  reference, see Numerical Mathematics, ISBN 0387989595,
  chapter 9.2.

  The function should be integrable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration MidPointIntegrator]))

(defn ->mid-point-integrator
  "Constructor.

  Build a midpoint integrator with given accuracies and iterations counts.

  relative-accuracy - relative accuracy of the result - `double`
  absolute-accuracy - absolute accuracy of the result - `double`
  minimal-iteration-count - minimum number of iterations - `int`
  maximal-iteration-count - maximum number of iterations (must be less than or equal to MIDPOINT_MAX_ITERATIONS_COUNT - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if minimal number of iterations is not strictly positive"
  (^MidPointIntegrator [^Double relative-accuracy ^Double absolute-accuracy ^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new MidPointIntegrator relative-accuracy absolute-accuracy minimal-iteration-count maximal-iteration-count))
  (^MidPointIntegrator [^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new MidPointIntegrator minimal-iteration-count maximal-iteration-count))
  (^MidPointIntegrator []
    (new MidPointIntegrator )))

(def *-midpoint-max-iterations-count
  "Static Constant.

  Maximum number of iterations for midpoint.

  type: int"
  MidPointIntegrator/MIDPOINT_MAX_ITERATIONS_COUNT)

