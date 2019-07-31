(ns org.apache.commons.math4.analysis.solvers.LaguerreSolver
  "Implements the
  Laguerre's Method for root finding of real coefficient polynomials.
  For reference, see

   A First Course in Numerical Analysis,
   ISBN 048641454X, chapter 8.

  Laguerre's method is global in the sense that it can start with any initial
  approximation and be able to solve all roots from that point.
  The algorithm requires a bracketing condition."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers LaguerreSolver]))

(defn ->laguerre-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Function value accuracy. - `double`"
  (^LaguerreSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy]
    (new LaguerreSolver relative-accuracy absolute-accuracy function-value-accuracy))
  (^LaguerreSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new LaguerreSolver relative-accuracy absolute-accuracy))
  (^LaguerreSolver [^Double absolute-accuracy]
    (new LaguerreSolver absolute-accuracy))
  (^LaguerreSolver []
    (new LaguerreSolver )))

(defn do-solve
  "Method for implementing actual optimization algorithms in derived
   classes.

  returns: the root. - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  (^Double [^LaguerreSolver this]
    (-> this (.doSolve))))

(defn solve-all-complex
  "Find all complex roots for the polynomial with the given
   coefficients, starting from the given initial value.

   Note: This method is not part of the API of BaseUnivariateSolver.

  coefficients - Polynomial coefficients. - `double[]`
  initial - Start value. - `double`

  returns: the point at which the function value is zero. - `org.apache.commons.math4.complex.Complex[]`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum number of evaluations is exceeded."
  ([^LaguerreSolver this coefficients ^Double initial]
    (-> this (.solveAllComplex coefficients initial))))

(defn solve-complex
  "Find a complex root for the polynomial with the given coefficients,
   starting from the given initial value.

   Note: This method is not part of the API of BaseUnivariateSolver.

  coefficients - Polynomial coefficients. - `double[]`
  initial - Start value. - `double`

  returns: the point at which the function value is zero. - `org.apache.commons.math4.complex.Complex`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum number of evaluations is exceeded."
  (^org.apache.commons.math4.complex.Complex [^LaguerreSolver this coefficients ^Double initial]
    (-> this (.solveComplex coefficients initial))))

