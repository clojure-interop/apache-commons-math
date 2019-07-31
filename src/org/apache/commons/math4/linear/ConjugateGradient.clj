(ns org.apache.commons.math4.linear.ConjugateGradient
  " This is an implementation of the conjugate gradient method for
  RealLinearOperator. It follows closely the template by Barrett et al. (1994) (figure 2.5). The linear system at
  hand is A · x = b, and the residual is r = b - A · x.

  Default stopping criterion

  A default stopping criterion is implemented. The iterations stop when || r ||
  ≤ δ || b ||, where b is the right-hand side vector, r the current
  estimate of the residual, and δ a user-specified tolerance. It should
  be noted that r is the so-called updated residual, which might
  differ from the true residual due to rounding-off errors (see e.g. Strakos and Tichy, 2002).

  Iteration count

  In the present context, an iteration should be understood as one evaluation
  of the matrix-vector product A · x. The initialization phase therefore
  counts as one iteration.

  Exception context

  Besides standard DimensionMismatchException, this class might throw
  NonPositiveDefiniteOperatorException if the linear operator or
  the preconditioner are not positive definite. In this case, the
  ExceptionContext provides some more information

  key \"operator\" points to the offending linear operator, say L,
  key \"vector\" points to the offending vector, say x, such that
  xT · L · x < 0.


  References

  Barret et al. (1994)
  R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,
  V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,

  Templates for the Solution of Linear Systems: Building Blocks for Iterative
  Methods, SIAM
  Strakos and Tichy (2002)

  Z. Strakos and P. Tichy,
  On error estimation in the conjugate gradient method and why it works
  in finite precision computations, Electronic Transactions on
  Numerical Analysis 13: 56-80, 2002"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear ConjugateGradient]))

(defn ->conjugate-gradient
  "Constructor.

  Creates a new instance of this class, with default
   stopping criterion.

  max-iterations - the maximum number of iterations - `int`
  delta - the δ parameter for the default stopping criterion - `double`
  check - true if positive definiteness of both matrix and preconditioner should be checked - `boolean`"
  (^ConjugateGradient [^Integer max-iterations ^Double delta ^Boolean check]
    (new ConjugateGradient max-iterations delta check)))

(def *-operator
  "Static Constant.

  Key for the exception context.

  type: java.lang.String"
  ConjugateGradient/OPERATOR)

(def *-vector
  "Static Constant.

  Key for the exception context.

  type: java.lang.String"
  ConjugateGradient/VECTOR)

(defn get-check?
  "Returns true if positive-definiteness should be checked for both
   matrix and preconditioner.

  returns: true if the tests are to be performed - `boolean`"
  (^Boolean [^ConjugateGradient this]
    (-> this (.getCheck))))

(defn solve-in-place
  "Returns an estimate of the solution to the linear system A · x =
   b. The solution is computed in-place (initial guess is modified).

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  m - the preconditioner, M (can be null) - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x-0 - the initial guess of the solution - `org.apache.commons.math4.linear.RealVector`

  returns: a reference to x0 (shallow copy) updated with the
   solution - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.linear.NonPositiveDefiniteOperatorException - if a or m is not positive definite"
  (^org.apache.commons.math4.linear.RealVector [^ConjugateGradient this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x-0]
    (-> this (.solveInPlace a m b x-0))))

