(ns org.apache.commons.math4.optim.nonlinear.scalar.gradient.Preconditioner
  "This interface represents a preconditioner for differentiable scalar
  objective function optimizers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.gradient Preconditioner]))

(defn precondition
  "Precondition a search direction.

   The returned preconditioned search direction must be computed fast or
   the algorithm performances will drop drastically. A classical approach
   is to compute only the diagonal elements of the hessian and to divide
   the raw search direction by these elements if they are all positive.
   If at least one of them is negative, it is safer to return a clone of
   the raw search direction as if the hessian was the identity matrix. The
   rationale for this simplified choice is that a negative diagonal element
   means the current point is far from the optimum and preconditioning will
   not be efficient anyway in this case.

  point - current point at which the search direction was computed - `double[]`
  r - raw search direction (i.e. opposite of the gradient) - `double[]`

  returns: approximation of H-1r where H is the objective function hessian - `double[]`"
  ([^Preconditioner this point r]
    (-> this (.precondition point r))))

