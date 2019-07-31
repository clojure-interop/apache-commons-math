(ns org.apache.commons.math4.linear.DefaultIterativeLinearSolverEvent
  "A default concrete implementation of the abstract class
  IterativeLinearSolverEvent."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear DefaultIterativeLinearSolverEvent]))

(defn ->default-iterative-linear-solver-event
  "Constructor.

  Creates a new instance of this class. This implementation does
   not deep copy the specified vectors x, b,
   r. Therefore the user must make sure that these vectors are
   either unmodifiable views or deep copies of the same vectors actually
   used by the source. Failure to do so may compromise subsequent
   iterations of the source. If the residual vector r is
   null, then getResidual() throws a
   MathUnsupportedOperationException, and
   providesResidual() returns false.

  source - the iterative solver which fired this event - `java.lang.Object`
  iterations - the number of iterations performed at the time this event is created - `int`
  x - the current estimate of the solution - `org.apache.commons.math4.linear.RealVector`
  b - the right-hand side vector - `org.apache.commons.math4.linear.RealVector`
  r - the current estimate of the residual (can be null) - `org.apache.commons.math4.linear.RealVector`
  rnorm - the norm of the current estimate of the residual - `double`"
  (^DefaultIterativeLinearSolverEvent [^java.lang.Object source ^Integer iterations ^org.apache.commons.math4.linear.RealVector x ^org.apache.commons.math4.linear.RealVector b ^org.apache.commons.math4.linear.RealVector r ^Double rnorm]
    (new DefaultIterativeLinearSolverEvent source iterations x b r rnorm))
  (^DefaultIterativeLinearSolverEvent [^java.lang.Object source ^Integer iterations ^org.apache.commons.math4.linear.RealVector x ^org.apache.commons.math4.linear.RealVector b ^Double rnorm]
    (new DefaultIterativeLinearSolverEvent source iterations x b rnorm)))

(defn get-norm-of-residual
  "Returns the norm of the residual. The returned value is not required to
   be exact. Instead, the norm of the so-called updated
   residual (if available) should be returned. For example, the
   conjugate gradient method computes a sequence
   of residuals, the norm of which is cheap to compute. However, due to
   accumulation of round-off errors, this residual might differ from the
   true residual after some iterations. See e.g. A. Greenbaum and
   Z. Strakos, Predicting the Behavior of Finite Precision Lanzos and
   Conjugate Gradient Computations, Technical Report 538, Department of
   Computer Science, New York University, 1991 (available
   here).

  returns: the norm of the residual, ||r|| - `double`"
  (^Double [^DefaultIterativeLinearSolverEvent this]
    (-> this (.getNormOfResidual))))

(defn get-residual
  "Returns the residual. This is an optional operation, as all iterative
   linear solvers do not provide cheap estimate of the updated residual
   vector, in which case


   this method should throw a
   MathUnsupportedOperationException,
   IterativeLinearSolverEvent.providesResidual() returns false.


   The default implementation throws a
   MathUnsupportedOperationException. If this method is overriden,
   then IterativeLinearSolverEvent.providesResidual() should be overriden as well.


   This implementation throws an MathUnsupportedOperationException
   if no residual vector r was provided at construction time.

  returns: the updated residual, r - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^DefaultIterativeLinearSolverEvent this]
    (-> this (.getResidual))))

(defn get-right-hand-side-vector
  "Returns the current right-hand side of the linear system to be solved.
   This method should return an unmodifiable view, or a deep copy of the
   actual right-hand side vector, in order not to compromise subsequent
   iterations of the source IterativeLinearSolver.

  returns: the right-hand side vector, b - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^DefaultIterativeLinearSolverEvent this]
    (-> this (.getRightHandSideVector))))

(defn get-solution
  "Returns the current estimate of the solution to the linear system to be
   solved. This method should return an unmodifiable view, or a deep copy of
   the actual current solution, in order not to compromise subsequent
   iterations of the source IterativeLinearSolver.

  returns: the solution, x - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^DefaultIterativeLinearSolverEvent this]
    (-> this (.getSolution))))

(defn provides-residual
  "Returns true if IterativeLinearSolverEvent.getResidual() is supported. The default
   implementation returns false.

   This implementation returns true if a non-null value was
   specified for the residual vector r at construction time.

  returns: true if r != null - `boolean`"
  (^Boolean [^DefaultIterativeLinearSolverEvent this]
    (-> this (.providesResidual))))

