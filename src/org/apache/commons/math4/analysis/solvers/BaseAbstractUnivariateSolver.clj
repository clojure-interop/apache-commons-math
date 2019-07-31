(ns org.apache.commons.math4.analysis.solvers.BaseAbstractUnivariateSolver
  "Provide a default implementation for several functions useful to generic
  solvers.
  The default values for relative and function tolerances are 1e-14
  and 1e-15, respectively. It is however highly recommended to not
  rely on the default, but rather carefully consider values that match
  user's expectations, as well as the specifics of each implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BaseAbstractUnivariateSolver]))

(defn get-evaluations
  "Get the number of evaluations of the objective function.
   The number of evaluations corresponds to the last call to the
   optimize method. It is 0 if the method has not been
   called yet.

  returns: the number of evaluations of the objective function. - `int`"
  (^Integer [^BaseAbstractUnivariateSolver this]
    (-> this (.getEvaluations))))

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

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the allowed number of evaluations is exceeded."
  (^Double [^BaseAbstractUnivariateSolver this ^Integer max-eval f ^Double min ^Double max ^Double start-value]
    (-> this (.solve max-eval f min max start-value)))
  (^Double [^BaseAbstractUnivariateSolver this ^Integer max-eval f ^Double min ^Double max]
    (-> this (.solve max-eval f min max)))
  (^Double [^BaseAbstractUnivariateSolver this ^Integer max-eval f ^Double start-value]
    (-> this (.solve max-eval f start-value))))

(defn get-relative-accuracy
  "Get the relative accuracy of the solver.  The contract for relative
   accuracy is the same as BaseUnivariateSolver.getAbsoluteAccuracy(), but using
   relative, rather than absolute error.  If ρ is the relative accuracy
   configured for a solver and v is a value returned, then a root
   of the function should exist somewhere in the interval
   (v - ρ v, v  ρ v).

  returns: the relative accuracy. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getRelativeAccuracy))))

(defn get-max-evaluations
  "Get the maximum number of function evaluations.

  returns: the maximum number of function evaluations. - `int`"
  (^Integer [^BaseAbstractUnivariateSolver this]
    (-> this (.getMaxEvaluations))))

(defn get-min
  "returns: the lower end of the search interval. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getMin))))

(defn get-absolute-accuracy
  "Get the absolute accuracy of the solver.  Solutions returned by the
   solver should be accurate to this tolerance, i.e., if ε is the
   absolute accuracy of the solver and v is a value returned by
   one of the solve methods, then a root of the function should
   exist somewhere in the interval (v - ε, v  ε).

  returns: the absolute accuracy. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-max
  "returns: the higher end of the search interval. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getMax))))

(defn get-start-value
  "returns: the initial guess. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getStartValue))))

(defn get-function-value-accuracy
  "Get the function value accuracy of the solver.  If v is
   a value returned by the solver for a function f,
   then by contract, |f(v)| should be less than or equal to
   the function value accuracy configured for the solver.

  returns: the function value accuracy. - `double`"
  (^Double [^BaseAbstractUnivariateSolver this]
    (-> this (.getFunctionValueAccuracy))))

