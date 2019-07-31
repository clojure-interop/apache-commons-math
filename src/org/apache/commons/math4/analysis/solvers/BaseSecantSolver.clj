(ns org.apache.commons.math4.analysis.solvers.BaseSecantSolver
  "Base class for all bracketing Secant-based methods for root-finding
  (approximating a zero of a univariate real function).

  Implementation of the Regula Falsi and
  Illinois methods is based on the
  following article: M. Dowell and P. Jarratt,
  A modified regula falsi method for computing the root of an
  equation, BIT Numerical Mathematics, volume 11, number 2,
  pages 168-174, Springer, 1971.

  Implementation of the Pegasus method is
  based on the following article: M. Dowell and P. Jarratt,
  The \"Pegasus\" method for computing the root of an equation,
  BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,
  1972.

  The Secant method is not a
  bracketing method, so it is not implemented here. It has a separate
  implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BaseSecantSolver]))

(defn solve
  "Solve for a zero in the given interval, start at startValue.
   A solver may require that the interval brackets a single zero root.
   Solvers that do require bracketing should be able to handle the case
   where one of the endpoints is itself a root.

  max-eval - Maximum number of evaluations. - `int`
  f - Function to solve. - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - Lower bound for the interval. - `double`
  max - Upper bound for the interval. - `double`
  start-value - Start value to use. - `double`
  allowed-solution - The kind of solutions that the root-finding algorithm may accept as solutions. - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  returns: A value where the function is zero. - `double`"
  (^Double [^BaseSecantSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Double start-value ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max start-value allowed-solution)))
  (^Double [^BaseSecantSolver this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (-> this (.solve max-eval f min max allowed-solution))))

