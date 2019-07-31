(ns org.apache.commons.math4.linear.IterativeLinearSolver
  "This abstract class defines an iterative solver for the linear system A
  · x = b. In what follows, the residual r is defined as r = b
  - A · x, where A is the linear operator of the linear system, b is the
  right-hand side vector, and x the current estimate of the solution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear IterativeLinearSolver]))

(defn ->iterative-linear-solver
  "Constructor.

  Creates a new instance of this class, with default iteration manager.

  max-iterations - the maximum number of iterations - `int`"
  (^IterativeLinearSolver [^Integer max-iterations]
    (new IterativeLinearSolver max-iterations)))

(defn get-iteration-manager
  "Returns the iteration manager attached to this solver.

  returns: the manager - `org.apache.commons.math4.util.IterationManager`"
  (^org.apache.commons.math4.util.IterationManager [^IterativeLinearSolver this]
    (-> this (.getIterationManager))))

(defn solve
  "Returns an estimate of the solution to the linear system A · x =
   b.

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x-0 - the initial guess of the solution - `org.apache.commons.math4.linear.RealVector`

  returns: a new vector containing the solution - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solve a b x-0)))
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b]
    (-> this (.solve a b))))

(defn solve-in-place
  "Returns an estimate of the solution to the linear system A · x =
   b. The solution is computed in-place (initial guess is modified).

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x-0 - initial guess of the solution - `org.apache.commons.math4.linear.RealVector`

  returns: a reference to x0 (shallow copy) updated with the
   solution - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solveInPlace a b x-0))))

