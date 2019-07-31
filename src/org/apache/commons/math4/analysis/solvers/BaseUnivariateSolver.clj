(ns org.apache.commons.math4.analysis.solvers.BaseUnivariateSolver
  "Interface for (univariate real) rootfinding algorithms.
  Implementations will search for only one zero in the given interval.

  This class is not intended for use outside of the Apache Commons Math
  library, regular user should rely on more specific interfaces like
  UnivariateSolver, PolynomialSolver or UnivariateDifferentiableSolver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BaseUnivariateSolver]))

(defn get-max-evaluations
  "Get the maximum number of function evaluations.

  returns: the maximum number of function evaluations. - `int`"
  (^Integer [^BaseUnivariateSolver this]
    (-> this (.getMaxEvaluations))))

(defn get-evaluations
  "Get the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BaseUnivariateSolver this]
    (-> this (.getEvaluations))))

(defn get-absolute-accuracy
  "Get the absolute accuracy of the solver.  Solutions returned by the
   solver should be accurate to this tolerance, i.e., if ε is the
   absolute accuracy of the solver and v is a value returned by
   one of the solve methods, then a root of the function should
   exist somewhere in the interval (v - ε, v  ε).

  returns: the absolute accuracy. - `double`"
  (^Double [^BaseUnivariateSolver this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-relative-accuracy
  "Get the relative accuracy of the solver.  The contract for relative
   accuracy is the same as getAbsoluteAccuracy(), but using
   relative, rather than absolute error.  If ρ is the relative accuracy
   configured for a solver and v is a value returned, then a root
   of the function should exist somewhere in the interval
   (v - ρ v, v  ρ v).

  returns: the relative accuracy. - `double`"
  (^Double [^BaseUnivariateSolver this]
    (-> this (.getRelativeAccuracy))))

(defn get-function-value-accuracy
  "Get the function value accuracy of the solver.  If v is
   a value returned by the solver for a function f,
   then by contract, |f(v)| should be less than or equal to
   the function value accuracy configured for the solver.

  returns: the function value accuracy. - `double`"
  (^Double [^BaseUnivariateSolver this]
    (-> this (.getFunctionValueAccuracy))))

(defn solve
  "Solve for a zero in the given interval, start at startValue.
   A solver may require that the interval brackets a single zero root.
   Solvers that do require bracketing should be able to handle the case
   where one of the endpoints is itself a root.

  max-eval - Maximum number of evaluations. - `int`
  f - Function to solve. - `FUNC`
  min - Lower bound for the interval. - `double`
  max - Upper bound for the interval. - `double`
  start-value - Start value to use. - `double`

  returns: a value where the function is zero. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arguments do not satisfy the requirements specified by the solver."
  (^Double [^BaseUnivariateSolver this ^Integer max-eval f ^Double min ^Double max ^Double start-value]
    (-> this (.solve max-eval f min max start-value)))
  (^Double [^BaseUnivariateSolver this ^Integer max-eval f ^Double min ^Double max]
    (-> this (.solve max-eval f min max)))
  (^Double [^BaseUnivariateSolver this ^Integer max-eval f ^Double start-value]
    (-> this (.solve max-eval f start-value))))

