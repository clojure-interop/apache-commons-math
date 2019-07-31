(ns org.apache.commons.math4.analysis.solvers.RiddersSolver
  "Implements the
  Ridders' Method for root finding of real univariate functions. For
  reference, see C. Ridders, A new algorithm for computing a single root
  of a real continuous function , IEEE Transactions on Circuits and
  Systems, 26 (1979), 979 - 980.

  The function should be continuous but not necessarily smooth."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers RiddersSolver]))

(defn ->ridders-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`"
  (^RiddersSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new RiddersSolver relative-accuracy absolute-accuracy))
  (^RiddersSolver [^Double absolute-accuracy]
    (new RiddersSolver absolute-accuracy))
  (^RiddersSolver []
    (new RiddersSolver )))

