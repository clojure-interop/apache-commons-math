(ns org.apache.commons.math4.analysis.solvers.SecantSolver
  "Implements the Secant method for root-finding (approximating a
  zero of a univariate real function). The solution that is maintained is
  not bracketed, and as such convergence is not guaranteed.

  Implementation based on the following article: M. Dowell and P. Jarratt,
  A modified regula falsi method for computing the root of an
  equation, BIT Numerical Mathematics, volume 11, number 2,
  pages 168-174, Springer, 1971.

  Note that since release 3.0 this class implements the actual
  Secant algorithm, and not a modified one. As such, the 3.0 version
  is not backwards compatible with previous versions. To use an algorithm
  similar to the pre-3.0 releases, use the
  Illinois algorithm or the
  Pegasus algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers SecantSolver]))

(defn ->secant-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - relative accuracy - `double`
  absolute-accuracy - absolute accuracy - `double`"
  (^SecantSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new SecantSolver relative-accuracy absolute-accuracy))
  (^SecantSolver [^Double absolute-accuracy]
    (new SecantSolver absolute-accuracy))
  (^SecantSolver []
    (new SecantSolver )))

