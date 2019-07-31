(ns org.apache.commons.math4.linear.SymmLQ
  " Implementation of the SYMMLQ iterative linear solver proposed by Paige and Saunders (1975). This implementation is
  largely based on the FORTRAN code by Pr. Michael A. Saunders, available here.


  SYMMLQ is designed to solve the system of linear equations A · x = b
  where A is an n × n self-adjoint linear operator (defined as a
  RealLinearOperator), and b is a given vector. The operator A is not
  required to be positive definite. If A is known to be definite, the method of
  conjugate gradients might be preferred, since it will require about the same
  number of iterations as SYMMLQ but slightly less work per iteration.


  SYMMLQ is designed to solve the system (A - shift · I) · x = b,
  where shift is a specified scalar value. If shift and b are suitably chosen,
  the computed vector x may approximate an (unnormalized) eigenvector of A, as
  in the methods of inverse iteration and/or Rayleigh-quotient iteration.
  Again, the linear operator (A - shift · I) need not be positive
  definite (but must be self-adjoint). The work per iteration is very
  slightly less if shift = 0.

  Preconditioning

  Preconditioning may reduce the number of iterations required. The solver may
  be provided with a positive definite preconditioner
  M = PT · P
  that is known to approximate
  (A - shift · I)-1 in some sense, where matrix-vector
  products of the form M · y = x can be computed efficiently. Then
  SYMMLQ will implicitly solve the system of equations
  P · (A - shift · I) · PT ·
  xhat = P · b, i.e.
  Ahat · xhat = bhat,
  where
  Ahat = P · (A - shift · I) · PT,
  bhat = P · b,
  and return the solution
  x = PT · xhat.
  The associated residual is
  rhat = bhat - Ahat · xhat
                  = P · [b - (A - shift · I) · x]
                  = P · r.


  In the case of preconditioning, the IterativeLinearSolverEvents that
  this solver fires are such that
  IterativeLinearSolverEvent.getNormOfResidual() returns the norm of
  the preconditioned, updated residual, ||P · r||, not the norm
  of the true residual ||r||.

  Default stopping criterion

  A default stopping criterion is implemented. The iterations stop when || rhat
  || ≤ δ || Ahat || || xhat ||, where xhat is the current estimate of
  the solution of the transformed system, rhat the current estimate of the
  corresponding residual, and δ a user-specified tolerance.

  Iteration count

  In the present context, an iteration should be understood as one evaluation
  of the matrix-vector product A · x. The initialization phase therefore
  counts as one iteration. If the user requires checks on the symmetry of A,
  this entails one further matrix-vector product in the initial phase. This
  further product is not accounted for in the iteration count. In
  other words, the number of iterations required to reach convergence will be
  identical, whether checks have been required or not.


  The present definition of the iteration count differs from that adopted in
  the original FOTRAN code, where the initialization phase was not
  taken into account.

  Initial guess of the solution

  The x parameter in

  solve(RealLinearOperator, RealVector, RealVector),
  solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector)},
  solveInPlace(RealLinearOperator, RealVector, RealVector),
  solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector),
  solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector, boolean, double),

  should not be considered as an initial guess, as it is set to zero in the
  initial phase. If x0 is known to be a good approximation to x, one
  should compute r0 = b - A · x, solve A · dx = r0,
  and set x = x0  dx.

  Exception context

  Besides standard DimensionMismatchException, this class might throw
  NonSelfAdjointOperatorException if the linear operator or the
  preconditioner are not symmetric. In this case, the ExceptionContext
  provides more information

  key \"operator\" points to the offending linear operator, say L,
  key \"vector1\" points to the first offending vector, say x,
  key \"vector2\" points to the second offending vector, say y, such
  that xT · L · y ≠ yT · L
  · x (within a certain accuracy).



  NonPositiveDefiniteOperatorException might also be thrown in case the
  preconditioner is not positive definite. The relevant keys to the
  ExceptionContext are

  key \"operator\", which points to the offending linear operator,
  say L,
  key \"vector\", which points to the offending vector, say x, such
  that xT · L · x < 0.


  References

  Paige and Saunders (1975)
  C. C. Paige and M. A. Saunders,
  Solution of Sparse Indefinite Systems of Linear Equations, SIAM
  Journal on Numerical Analysis 12(4): 617-629, 1975"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SymmLQ]))

(defn ->symm-lq
  "Constructor.

  Creates a new instance of this class, with default
   stopping criterion. Note that setting check to true
   entails an extra matrix-vector product in the initial phase.

  max-iterations - the maximum number of iterations - `int`
  delta - the δ parameter for the default stopping criterion - `double`
  check - true if self-adjointedness of both matrix and preconditioner should be checked - `boolean`"
  (^SymmLQ [^Integer max-iterations ^Double delta ^Boolean check]
    (new SymmLQ max-iterations delta check)))

(defn get-check?
  "Returns true if symmetry of the matrix, and symmetry as well as
   positive definiteness of the preconditioner should be checked.

  returns: true if the tests are to be performed - `boolean`"
  (^Boolean [^SymmLQ this]
    (-> this (.getCheck))))

(defn solve
  "Returns an estimate of the solution to the linear system (A - shift
   · I) · x = b.

   If the solution x is expected to contain a large multiple of b
   (as in Rayleigh-quotient iteration), then better precision may be
   achieved with goodb set to true; this however requires an
   extra call to the preconditioner.


   shift should be zero if the system A · x = b is to be
   solved. Otherwise, it could be an approximation to an eigenvalue of A,
   such as the Rayleigh quotient bT · A · b /
   (bT · b) corresponding to the vector b. If b is
   sufficiently like an eigenvector corresponding to an eigenvalue near
   shift, then the computed x may have very large components. When
   normalized, x may be closer to an eigenvector than b.

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  m - the preconditioner, M (can be null) - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  goodb - usually false, except if x is expected to contain a large multiple of b - `boolean`
  shift - the amount to be subtracted to all diagonal elements of A - `double`

  returns: a reference to x (shallow copy) - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^Boolean goodb ^Double shift]
    (-> this (.solve a m b goodb shift)))
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.solve a m b x)))
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b]
    (-> this (.solve a m b)))
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b]
    (-> this (.solve a b))))

(defn solve-in-place
  "Returns an estimate of the solution to the linear system (A - shift
   · I) · x = b. The solution is computed in-place.

   If the solution x is expected to contain a large multiple of b
   (as in Rayleigh-quotient iteration), then better precision may be
   achieved with goodb set to true; this however requires an
   extra call to the preconditioner.


   shift should be zero if the system A · x = b is to be
   solved. Otherwise, it could be an approximation to an eigenvalue of A,
   such as the Rayleigh quotient bT · A · b /
   (bT · b) corresponding to the vector b. If b is
   sufficiently like an eigenvector corresponding to an eigenvalue near
   shift, then the computed x may have very large components. When
   normalized, x may be closer to an eigenvector than b.

  a - the linear operator A of the system - `org.apache.commons.math4.linear.RealLinearOperator`
  m - the preconditioner, M (can be null) - `org.apache.commons.math4.linear.RealLinearOperator`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  x - the vector to be updated with the solution; x should not be considered as an initial guess (more) - `org.apache.commons.math4.linear.RealVector`
  goodb - usually false, except if x is expected to contain a large multiple of b - `boolean`
  shift - the amount to be subtracted to all diagonal elements of A - `double`

  returns: a reference to x (shallow copy). - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.NullArgumentException - if one of the parameters is null"
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x ^Boolean goodb ^Double shift]
    (-> this (.solveInPlace a m b x goodb shift)))
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealLinearOperator m ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.solveInPlace a m b x)))
  (^org.apache.commons.math4.linear.RealVector [^SymmLQ this ^org.apache.commons.math4.linear.RealLinearOperator a ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector x]
    (-> this (.solveInPlace a b x))))

