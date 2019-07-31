(ns org.apache.commons.math4.analysis.solvers.BrentSolver
  "This class implements the
  Brent algorithm for finding zeros of real univariate functions.
  The function should be continuous but not necessarily smooth.
  The solve method returns a zero x of the function f
  in the given interval [a, b] to within a tolerance
  2 eps abs(x)  t where eps is the relative accuracy and
  t is the absolute accuracy.
  The given interval must bracket the root.

   The reference implementation is given in chapter 4 of

    Algorithms for Minimization Without Derivatives,
    Richard P. Brent,
    Dover, 2002"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BrentSolver]))

(defn ->brent-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Function value accuracy. - `double`"
  (^BrentSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy]
    (new BrentSolver relative-accuracy absolute-accuracy function-value-accuracy))
  (^BrentSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new BrentSolver relative-accuracy absolute-accuracy))
  (^BrentSolver [^Double absolute-accuracy]
    (new BrentSolver absolute-accuracy))
  (^BrentSolver []
    (new BrentSolver )))

