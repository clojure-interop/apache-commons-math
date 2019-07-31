(ns org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver
  "Interface for (univariate real) root-finding
  algorithms that maintain a bracketed solution. There are several advantages
  to having such root-finding algorithms:

   The bracketed solution guarantees that the root is kept within the
       interval. As such, these algorithms generally also guarantee
       convergence.
   The bracketed solution means that we have the opportunity to only
       return roots that are greater than or equal to the actual root, or
       are less than or equal to the actual root. That is, we can control
       whether under-approximations and over-approximations are
       allowed solutions. Other root-finding
       algorithms can usually only guarantee that the solution (the root that
       was found) is around the actual root.


  For backwards compatibility, all root-finding algorithms must have
  ANY_SIDE as default for the allowed
  solutions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BracketedRealFieldUnivariateSolver]))

(defn get-max-evaluations
  "Get the maximum number of function evaluations.

  returns: the maximum number of function evaluations. - `int`"
  (^Integer [^BracketedRealFieldUnivariateSolver this]
    (-> this (.getMaxEvaluations))))

(defn get-evaluations
  "Get the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BracketedRealFieldUnivariateSolver this]
    (-> this (.getEvaluations))))

(defn get-absolute-accuracy
  "Get the absolute accuracy of the solver.  Solutions returned by the
   solver should be accurate to this tolerance, i.e., if ε is the
   absolute accuracy of the solver and v is a value returned by
   one of the solve methods, then a root of the function should
   exist somewhere in the interval (v - ε, v  ε).

  returns: the absolute accuracy. - `T`"
  ([^BracketedRealFieldUnivariateSolver this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-relative-accuracy
  "Get the relative accuracy of the solver.  The contract for relative
   accuracy is the same as getAbsoluteAccuracy(), but using
   relative, rather than absolute error.  If ρ is the relative accuracy
   configured for a solver and v is a value returned, then a root
   of the function should exist somewhere in the interval
   (v - ρ v, v  ρ v).

  returns: the relative accuracy. - `T`"
  ([^BracketedRealFieldUnivariateSolver this]
    (-> this (.getRelativeAccuracy))))

(defn get-function-value-accuracy
  "Get the function value accuracy of the solver.  If v is
   a value returned by the solver for a function f,
   then by contract, |f(v)| should be less than or equal to
   the function value accuracy configured for the solver.

  returns: the function value accuracy. - `T`"
  ([^BracketedRealFieldUnivariateSolver this]
    (-> this (.getFunctionValueAccuracy))))

(defn solve
  "Solve for a zero in the given interval, start at startValue.
   A solver may require that the interval brackets a single zero root.
   Solvers that do require bracketing should be able to handle the case
   where one of the endpoints is itself a root.

  max-eval - Maximum number of evaluations. - `int`
  f - Function to solve. - `org.apache.commons.math4.analysis.RealFieldUnivariateFunction`
  min - Lower bound for the interval. - `T`
  max - Upper bound for the interval. - `T`
  start-value - Start value to use. - `T`
  allowed-solution - The kind of solutions that the root-finding algorithm may accept as solutions. - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  returns: A value where the function is zero. - `T`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arguments do not satisfy the requirements specified by the solver."
  ([^BracketedRealFieldUnivariateSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.RealFieldUnivariateFunction f min max start-value ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max start-value allowed-solution)))
  ([^BracketedRealFieldUnivariateSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.RealFieldUnivariateFunction f min max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max allowed-solution))))

