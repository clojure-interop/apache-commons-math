(ns org.apache.commons.math4.analysis.solvers.MullerSolver2
  "This class implements the
  Muller's Method for root finding of real univariate functions. For
  reference, see Elementary Numerical Analysis, ISBN 0070124477,
  chapter 3.

  Muller's method applies to both real and complex functions, but here we
  restrict ourselves to real functions.
  This class differs from MullerSolver in the way it avoids complex
  operations.
  Except for the initial [min, max], it does not require bracketing
  condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If a complex
  number arises in the computation, we simply use its modulus as a real
  approximation.

  Because the interval may not be bracketing, the bisection alternative is
  not applicable here. However in practice our treatment usually works
  well, especially near real zeroes where the imaginary part of the complex
  approximation is often negligible.

  The formulas here do not use divided differences directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers MullerSolver2]))

(defn ->muller-solver-2
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`"
  (^MullerSolver2 [^Double relative-accuracy ^Double absolute-accuracy]
    (new MullerSolver2 relative-accuracy absolute-accuracy))
  (^MullerSolver2 [^Double absolute-accuracy]
    (new MullerSolver2 absolute-accuracy))
  (^MullerSolver2 []
    (new MullerSolver2 )))

