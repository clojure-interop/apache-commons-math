(ns org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer
  "Gauss-Newton least-squares solver.
   This class solve a least-square problem by
  solving the normal equations of the linearized problem at each iteration. Either LU
  decomposition or Cholesky decomposition can be used to solve the normal equations,
  or QR decomposition or SVD decomposition can be used to solve the linear system. LU
  decomposition is faster but QR decomposition is more robust for difficult problems,
  and SVD can compute a solution for rank-deficient problems."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares GaussNewtonOptimizer]))

(defn ->gauss-newton-optimizer
  "Constructor.

  Create a Gauss Newton optimizer that uses the given decomposition algorithm to
   solve the normal equations.

  decomposition - the GaussNewtonOptimizer.Decomposition algorithm. - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition`"
  (^GaussNewtonOptimizer [^org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition decomposition]
    (new GaussNewtonOptimizer decomposition))
  (^GaussNewtonOptimizer []
    (new GaussNewtonOptimizer )))

(defn get-decomposition
  "Get the matrix decomposition algorithm used to solve the normal equations.

  returns: the matrix GaussNewtonOptimizer.Decomposition algoritm. - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition`"
  (^org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition [^GaussNewtonOptimizer this]
    (-> this (.getDecomposition))))

(defn with-decomposition
  "Configure the decomposition algorithm.

  new-decomposition - the GaussNewtonOptimizer.Decomposition algorithm to use. - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer [^GaussNewtonOptimizer this ^org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition new-decomposition]
    (-> this (.withDecomposition new-decomposition))))

(defn optimize
  "Solve the non-linear least squares problem.

  lsp - the problem definition, including model function and convergence criteria. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`

  returns: The optimum. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum [^GaussNewtonOptimizer this ^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem lsp]
    (-> this (.optimize lsp))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GaussNewtonOptimizer this]
    (-> this (.toString))))

