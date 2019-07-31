(ns org.apache.commons.math4.optim.univariate.BrentOptimizer
  "For a function defined on some interval (lo, hi), this class
  finds an approximation x to the point at which the function
  attains its minimum.
  It implements Richard Brent's algorithm (from his book \"Algorithms for
  Minimization without Derivatives\", p. 79) for finding minima of real
  univariate functions.

  This code is an adaptation, partly based on the Python code from SciPy
  (module \"optimize.py\" v0.5); the original algorithm is also modified

   to use an initial guess provided by the user,
   to ensure that the best point encountered is the one returned."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate BrentOptimizer]))

(defn ->brent-optimizer
  "Constructor.

  The arguments are used implement the original stopping criterion
   of Brent's algorithm.
   abs and rel define a tolerance
   tol = rel |x|  abs. rel should be no smaller than
   2 macheps and preferably not much less than sqrt(macheps),
   where macheps is the relative machine precision. abs must
   be positive.

  rel - Relative threshold. - `double`
  abs - Absolute threshold. - `double`
  checker - Additional, user-defined, convergence checking procedure. - `org.apache.commons.math4.optim.ConvergenceChecker`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if abs <= 0."
  (^BrentOptimizer [^Double rel ^Double abs ^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (new BrentOptimizer rel abs checker))
  (^BrentOptimizer [^Double rel ^Double abs]
    (new BrentOptimizer rel abs)))

