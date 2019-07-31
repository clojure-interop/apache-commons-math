(ns org.apache.commons.math4.analysis.solvers.IllinoisSolver
  "Implements the Illinois method for root-finding (approximating
  a zero of a univariate real function). It is a modified
  Regula Falsi method.

  Like the Regula Falsi method, convergence is guaranteed by
  maintaining a bracketed solution. The Illinois method however,
  should converge much faster than the original Regula Falsi
  method. Furthermore, this implementation of the Illinois method
  should not suffer from the same implementation issues as the Regula
  Falsi method, which may fail to convergence in certain cases.

  The Illinois method assumes that the function is continuous,
  but not necessarily smooth.

  Implementation based on the following article: M. Dowell and P. Jarratt,
  A modified regula falsi method for computing the root of an
  equation, BIT Numerical Mathematics, volume 11, number 2,
  pages 168-174, Springer, 1971."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers IllinoisSolver]))

(defn ->illinois-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Maximum function value error. - `double`"
  (^IllinoisSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy]
    (new IllinoisSolver relative-accuracy absolute-accuracy function-value-accuracy))
  (^IllinoisSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new IllinoisSolver relative-accuracy absolute-accuracy))
  (^IllinoisSolver [^Double absolute-accuracy]
    (new IllinoisSolver absolute-accuracy))
  (^IllinoisSolver []
    (new IllinoisSolver )))

