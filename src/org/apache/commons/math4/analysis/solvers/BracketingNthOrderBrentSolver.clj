(ns org.apache.commons.math4.analysis.solvers.BracketingNthOrderBrentSolver
  "This class implements a modification of the  Brent algorithm.

  The changes with respect to the original Brent algorithm are:

    the returned value is chosen in the current interval according
    to user specified AllowedSolution,
    the maximal order for the invert polynomial root search is
    user-specified instead of being invert quadratic only

  The given interval must bracket the root."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BracketingNthOrderBrentSolver]))

(defn ->bracketing-nth-order-brent-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Function value accuracy. - `double`
  maximal-order - maximal order. - `int`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if maximal order is lower than 2"
  (^BracketingNthOrderBrentSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy ^Integer maximal-order]
    (new BracketingNthOrderBrentSolver relative-accuracy absolute-accuracy function-value-accuracy maximal-order))
  (^BracketingNthOrderBrentSolver [^Double relative-accuracy ^Double absolute-accuracy ^Integer maximal-order]
    (new BracketingNthOrderBrentSolver relative-accuracy absolute-accuracy maximal-order))
  (^BracketingNthOrderBrentSolver [^Double absolute-accuracy ^Integer maximal-order]
    (new BracketingNthOrderBrentSolver absolute-accuracy maximal-order))
  (^BracketingNthOrderBrentSolver []
    (new BracketingNthOrderBrentSolver )))

(defn get-maximal-order
  "Get the maximal order.

  returns: maximal order - `int`"
  (^Integer [^BracketingNthOrderBrentSolver this]
    (-> this (.getMaximalOrder))))

(defn solve
  "Solve for a zero in the given interval, start at startValue.
   A solver may require that the interval brackets a single zero root.
   Solvers that do require bracketing should be able to handle the case
   where one of the endpoints is itself a root.

  max-eval - Maximum number of evaluations. - `int`
  f - Function to solve. - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - Lower bound for the interval. - `double`
  max - Upper bound for the interval. - `double`
  start-value - Start value to use. - `double`
  allowed-solution - The kind of solutions that the root-finding algorithm may accept as solutions. - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  returns: A value where the function is zero. - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the allowed number of evaluations is exceeded."
  (^Double [^BracketingNthOrderBrentSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Double start-value ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max start-value allowed-solution)))
  (^Double [^BracketingNthOrderBrentSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max allowed-solution))))

