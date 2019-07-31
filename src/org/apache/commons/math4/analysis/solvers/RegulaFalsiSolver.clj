(ns org.apache.commons.math4.analysis.solvers.RegulaFalsiSolver
  "Implements the Regula Falsi or False position method for
  root-finding (approximating a zero of a univariate real function). It is a
  modified Secant method.

  The Regula Falsi method is included for completeness, for
  testing purposes, for educational purposes, for comparison to other
  algorithms, etc. It is however not intended to be used
  for actual problems, as one of the bounds often remains fixed, resulting
  in very slow convergence. Instead, one of the well-known modified
  Regula Falsi algorithms can be used (Illinois or Pegasus). These two
  algorithms solve the fundamental issues of the original Regula
  Falsi algorithm, and greatly out-performs it for most, if not all,
  (practical) functions.

  Unlike the Secant method, the Regula Falsi guarantees
  convergence, by maintaining a bracketed solution. Note however, that due to
  the finite/limited precision of Java's double type, which is
  used in this implementation, the algorithm may get stuck in a situation
  where it no longer makes any progress. Such cases are detected and result
  in a ConvergenceException exception being thrown. In other words,
  the algorithm theoretically guarantees convergence, but the implementation
  does not.

  The Regula Falsi method assumes that the function is continuous,
  but not necessarily smooth.

  Implementation based on the following article: M. Dowell and P. Jarratt,
  A modified regula falsi method for computing the root of an
  equation, BIT Numerical Mathematics, volume 11, number 2,
  pages 168-174, Springer, 1971."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers RegulaFalsiSolver]))

(defn ->regula-falsi-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Maximum function value error. - `double`"
  (^RegulaFalsiSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy]
    (new RegulaFalsiSolver relative-accuracy absolute-accuracy function-value-accuracy))
  (^RegulaFalsiSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new RegulaFalsiSolver relative-accuracy absolute-accuracy))
  (^RegulaFalsiSolver [^Double absolute-accuracy]
    (new RegulaFalsiSolver absolute-accuracy))
  (^RegulaFalsiSolver []
    (new RegulaFalsiSolver )))

