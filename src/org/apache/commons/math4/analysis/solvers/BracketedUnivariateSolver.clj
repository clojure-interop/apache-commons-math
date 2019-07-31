(ns org.apache.commons.math4.analysis.solvers.BracketedUnivariateSolver
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
  (:import [org.apache.commons.math4.analysis.solvers BracketedUnivariateSolver]))

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
  allowed-solution - The kind of solutions that the root-finding algorithm may accept as solutions. - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  returns: A value where the function is zero. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arguments do not satisfy the requirements specified by the solver."
  (^Double [^BracketedUnivariateSolver this ^Integer max-eval f ^Double min ^Double max ^Double start-value ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max start-value allowed-solution)))
  (^Double [^BracketedUnivariateSolver this ^Integer max-eval f ^Double min ^Double max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max allowed-solution))))

