(ns org.apache.commons.math4.linear.PreconditionedIterativeLinearSolver
  " This abstract class defines preconditioned iterative solvers. When A is
  ill-conditioned, instead of solving system A · x = b directly, it is
  preferable to solve either

  (M · A) · x = M · b

  (left preconditioning), or

  (A · M) · y = b,     followed by
  M · y = x

  (right preconditioning), where M approximates in some way A-1,
  while matrix-vector products of the type M · y remain comparatively
  easy to compute. In this library, M (not M-1!) is called the
  preconditionner.


  Concrete implementations of this abstract class must be provided with the
  preconditioner M, as a RealLinearOperator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear PreconditionedIterativeLinearSolver]))

(defn ->preconditioned-iterative-linear-solver
  "Constructor.

  Creates a new instance of this class, with default iteration manager.

  max-iterations - the maximum number of iterations - `int`"
  (^PreconditionedIterativeLinearSolver [^Integer max-iterations]
    (new PreconditionedIterativeLinearSolver max-iterations)))

(defn solve
  "Returns an estimate of the solution to the linear system A · x =
   b.

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  m - the preconditioner, M (can be null) - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x-0 - the initial guess of the solution - `org.apache.commons.math4.linear.RealVector`

  returns: a new vector containing the solution - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^PreconditionedIterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solve a m b x-0)))
  (^org.apache.commons.math4.linear.RealVector [^PreconditionedIterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solve a b x-0)))
  (^org.apache.commons.math4.linear.RealVector [^PreconditionedIterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b]
    (-> this (.solve a b))))

(defn solve-in-place
  "Returns an estimate of the solution to the linear system A · x =
   b. The solution is computed in-place (initial guess is modified).

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  m - the preconditioner, M (can be null) - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x-0 - the initial guess of the solution - `org.apache.commons.math4.linear.RealVector`

  returns: a reference to x0 (shallow copy) updated with the
   solution - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^PreconditionedIterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solveInPlace a m b x-0)))
  (^org.apache.commons.math4.linear.RealVector [^PreconditionedIterativeLinearSolver this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solveInPlace a b x-0))))

