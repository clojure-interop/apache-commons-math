(ns org.apache.commons.math4.analysis.solvers.NewtonRaphsonSolver
  "Implements
  Newton's Method for finding zeros of real univariate differentiable
  functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers NewtonRaphsonSolver]))

(defn ->newton-raphson-solver
  "Constructor.

  Construct a solver.

  absolute-accuracy - Absolute accuracy. - `double`"
  (^NewtonRaphsonSolver [^Double absolute-accuracy]
    (new NewtonRaphsonSolver absolute-accuracy))
  (^NewtonRaphsonSolver []
    (new NewtonRaphsonSolver )))

(defn solve
  "Find a zero near the midpoint of min and max.

  max-eval - Maximum number of evaluations. - `int`
  f - Function to solve. - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction`
  min - Lower bound for the interval. - `double`
  max - Upper bound for the interval. - `double`

  returns: the value where the function is zero. - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum evaluation count is exceeded."
  (^Double [^NewtonRaphsonSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction f ^Double min ^Double max]
    (-> this (.solve max-eval f min max))))

