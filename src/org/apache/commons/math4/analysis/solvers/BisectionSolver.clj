(ns org.apache.commons.math4.analysis.solvers.BisectionSolver
  "Implements the
  bisection algorithm for finding zeros of univariate real functions.

  The function should be continuous but not necessarily smooth."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BisectionSolver]))

(defn ->bisection-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`"
  (^BisectionSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new BisectionSolver relative-accuracy absolute-accuracy))
  (^BisectionSolver [^Double absolute-accuracy]
    (new BisectionSolver absolute-accuracy))
  (^BisectionSolver []
    (new BisectionSolver )))

