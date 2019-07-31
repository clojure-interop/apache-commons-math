(ns org.apache.commons.math4.analysis.solvers.MullerSolver
  "This class implements the
  Muller's Method for root finding of real univariate functions. For
  reference, see Elementary Numerical Analysis, ISBN 0070124477,
  chapter 3.

  Muller's method applies to both real and complex functions, but here we
  restrict ourselves to real functions.
  This class differs from MullerSolver in the way it avoids complex
  operations.
  Muller's original method would have function evaluation at complex point.
  Since our f(x) is real, we have to find ways to avoid that. Bracketing
  condition is one way to go: by requiring bracketing in every iteration,
  the newly computed approximation is guaranteed to be real.

  Normally Muller's method converges quadratically in the vicinity of a
  zero, however it may be very slow in regions far away from zeros. For
  example, f(x) = exp(x) - 1, min = -50, max = 100. In such case we use
  bisection as a safety backup if it performs very poorly.

  The formulas here use divided differences directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers MullerSolver]))

(defn ->muller-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`"
  (^MullerSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new MullerSolver relative-accuracy absolute-accuracy))
  (^MullerSolver [^Double absolute-accuracy]
    (new MullerSolver absolute-accuracy))
  (^MullerSolver []
    (new MullerSolver )))

