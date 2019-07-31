(ns org.apache.commons.math4.analysis.solvers.FieldBracketingNthOrderBrentSolver
  "This class implements a modification of the  Brent algorithm.

  The changes with respect to the original Brent algorithm are:

    the returned value is chosen in the current interval according
    to user specified AllowedSolution
    the maximal order for the invert polynomial root search is
    user-specified instead of being invert quadratic only

  The given interval must bracket the root."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers FieldBracketingNthOrderBrentSolver]))

(defn ->field-bracketing-nth-order-brent-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `T`
  absolute-accuracy - Absolute accuracy. - `T`
  function-value-accuracy - Function value accuracy. - `T`
  maximal-order - maximal order. - `int`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if maximal order is lower than 2"
  (^FieldBracketingNthOrderBrentSolver [relative-accuracy absolute-accuracy function-value-accuracy ^Integer maximal-order]
    (new FieldBracketingNthOrderBrentSolver relative-accuracy absolute-accuracy function-value-accuracy maximal-order)))

(defn get-maximal-order
  "Get the maximal order.

  returns: maximal order - `int`"
  (^Integer [^FieldBracketingNthOrderBrentSolver this]
    (-> this (.getMaximalOrder))))

(defn get-max-evaluations
  "Get the maximal number of function evaluations.

  returns: the maximal number of function evaluations. - `int`"
  (^Integer [^FieldBracketingNthOrderBrentSolver this]
    (-> this (.getMaxEvaluations))))

(defn get-evaluations
  "Get the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^FieldBracketingNthOrderBrentSolver this]
    (-> this (.getEvaluations))))

(defn get-absolute-accuracy
  "Get the absolute accuracy.

  returns: absolute accuracy - `T`"
  ([^FieldBracketingNthOrderBrentSolver this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-relative-accuracy
  "Get the relative accuracy.

  returns: relative accuracy - `T`"
  ([^FieldBracketingNthOrderBrentSolver this]
    (-> this (.getRelativeAccuracy))))

(defn get-function-value-accuracy
  "Get the function accuracy.

  returns: function accuracy - `T`"
  ([^FieldBracketingNthOrderBrentSolver this]
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

  returns: a value where the function is zero. - `T`

  throws: org.apache.commons.math4.exception.NullArgumentException - if f is null."
  ([^FieldBracketingNthOrderBrentSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.RealFieldUnivariateFunction f min max start-value ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max start-value allowed-solution)))
  ([^FieldBracketingNthOrderBrentSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.RealFieldUnivariateFunction f min max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max allowed-solution))))

