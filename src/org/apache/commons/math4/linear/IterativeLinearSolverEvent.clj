(ns org.apache.commons.math4.linear.IterativeLinearSolverEvent
  "This is the base class for all events occurring during the iterations of a
  IterativeLinearSolver."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear IterativeLinearSolverEvent]))

(defn ->iterative-linear-solver-event
  "Constructor.

  Creates a new instance of this class.

  source - the iterative algorithm on which the event initially occurred - `java.lang.Object`
  iterations - the number of iterations performed at the time this event is created - `int`"
  (^IterativeLinearSolverEvent [^java.lang.Object source ^Integer iterations]
    (new IterativeLinearSolverEvent source iterations)))

(defn get-right-hand-side-vector
  "Returns the current right-hand side of the linear system to be solved.
   This method should return an unmodifiable view, or a deep copy of the
   actual right-hand side vector, in order not to compromise subsequent
   iterations of the source IterativeLinearSolver.

  returns: the right-hand side vector, b - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolverEvent this]
    (-> this (.getRightHandSideVector))))

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
  (^Double [^IterativeLinearSolverEvent this]
    (-> this (.getNormOfResidual))))

(defn get-residual
  "Returns the residual. This is an optional operation, as all iterative
   linear solvers do not provide cheap estimate of the updated residual
   vector, in which case


   this method should throw a
   MathUnsupportedOperationException,
   providesResidual() returns false.


   The default implementation throws a
   MathUnsupportedOperationException. If this method is overriden,
   then providesResidual() should be overriden as well.

  returns: the updated residual, r - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolverEvent this]
    (-> this (.getResidual))))

(defn get-solution
  "Returns the current estimate of the solution to the linear system to be
   solved. This method should return an unmodifiable view, or a deep copy of
   the actual current solution, in order not to compromise subsequent
   iterations of the source IterativeLinearSolver.

  returns: the solution, x - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^IterativeLinearSolverEvent this]
    (-> this (.getSolution))))

(defn provides-residual
  "Returns true if getResidual() is supported. The default
   implementation returns false.

  returns: false if getResidual() throws a
   MathUnsupportedOperationException - `boolean`"
  (^Boolean [^IterativeLinearSolverEvent this]
    (-> this (.providesResidual))))

