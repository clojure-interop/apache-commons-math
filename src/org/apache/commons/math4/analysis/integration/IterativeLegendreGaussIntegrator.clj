(ns org.apache.commons.math4.analysis.integration.IterativeLegendreGaussIntegrator
  "This algorithm divides the integration interval into equally-sized
  sub-interval and on each of them performs a

  Legendre-Gauss quadrature.
  Because of its non-adaptive nature, this algorithm can
  converge to a wrong value for the integral (for example, if the
  function is significantly different from zero toward the ends of the
  integration interval).
  In particular, a change of variables aimed at estimating integrals
  over infinite intervals as proposed

   here should be avoided when using this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration IterativeLegendreGaussIntegrator]))

(defn ->iterative-legendre-gauss-integrator
  "Constructor.

  Builds an integrator with given accuracies and iterations counts.

  n - Number of integration points. - `int`
  relative-accuracy - Relative accuracy of the result. - `double`
  absolute-accuracy - Absolute accuracy of the result. - `double`
  minimal-iteration-count - Minimum number of iterations. - `int`
  maximal-iteration-count - Maximum number of iterations. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if minimal number of iterations or number of points are not strictly positive."
  (^IterativeLegendreGaussIntegrator [^Integer n ^Double relative-accuracy ^Double absolute-accuracy ^Integer minimal-iteration-count ^Integer maximal-iteration-count]
    (new IterativeLegendreGaussIntegrator n relative-accuracy absolute-accuracy minimal-iteration-count maximal-iteration-count))
  (^IterativeLegendreGaussIntegrator [^Integer n ^Double relative-accuracy ^Double absolute-accuracy]
    (new IterativeLegendreGaussIntegrator n relative-accuracy absolute-accuracy)))

