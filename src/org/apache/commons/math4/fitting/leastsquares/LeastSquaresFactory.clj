(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresFactory
  "A Factory for creating LeastSquaresProblems."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresFactory]))

(defn *create
  "Create a LeastSquaresProblem
   from the given elements. There will be no weights applied (unit weights).

  model - the model function. Produces the computed values. - `org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction`
  observed - the observed (target) values - `org.apache.commons.math4.linear.RealVector`
  start - the initial guess. - `org.apache.commons.math4.linear.RealVector`
  weight - the weight matrix - `org.apache.commons.math4.linear.RealMatrix`
  checker - convergence checker - `org.apache.commons.math4.optim.ConvergenceChecker`
  max-evaluations - the maximum number of times to evaluate the model - `int`
  max-iterations - the maximum number to times to iterate in the algorithm - `int`
  lazy-evaluation - Whether the call to LeastSquaresProblem.evaluate(RealVector) will defer the evaluation until access to the value is requested. - `boolean`
  param-validator - Model parameters validator. - `org.apache.commons.math4.fitting.leastsquares.ParameterValidator`

  returns: the specified General Least Squares problem. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction model ^org.apache.commons.math4.linear.RealVector observed ^org.apache.commons.math4.linear.RealVector start ^org.apache.commons.math4.linear.RealMatrix weight ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Integer max-evaluations ^Integer max-iterations ^Boolean lazy-evaluation ^org.apache.commons.math4.fitting.leastsquares.ParameterValidator param-validator]
    (LeastSquaresFactory/create model observed start weight checker max-evaluations max-iterations lazy-evaluation param-validator))
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.analysis.MultivariateVectorFunction model ^org.apache.commons.math4.analysis.MultivariateMatrixFunction jacobian observed start ^org.apache.commons.math4.linear.RealMatrix weight ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Integer max-evaluations ^Integer max-iterations]
    (LeastSquaresFactory/create model jacobian observed start weight checker max-evaluations max-iterations))
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction model ^org.apache.commons.math4.linear.RealVector observed ^org.apache.commons.math4.linear.RealVector start ^org.apache.commons.math4.linear.RealMatrix weight ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Integer max-evaluations ^Integer max-iterations]
    (LeastSquaresFactory/create model observed start weight checker max-evaluations max-iterations))
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction model ^org.apache.commons.math4.linear.RealVector observed ^org.apache.commons.math4.linear.RealVector start ^org.apache.commons.math4.optim.ConvergenceChecker checker ^Integer max-evaluations ^Integer max-iterations]
    (LeastSquaresFactory/create model observed start checker max-evaluations max-iterations)))

(defn *weight-matrix
  "Apply a dense weight matrix to the LeastSquaresProblem.

  problem - the unweighted problem - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`
  weights - the matrix of weights - `org.apache.commons.math4.linear.RealMatrix`

  returns: a new LeastSquaresProblem with the weights applied. The original
           problem is not modified. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem problem ^org.apache.commons.math4.linear.RealMatrix weights]
    (LeastSquaresFactory/weightMatrix problem weights)))

(defn *weight-diagonal
  "Apply a diagonal weight matrix to the LeastSquaresProblem.

  problem - the unweighted problem - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`
  weights - the diagonal of the weight matrix - `org.apache.commons.math4.linear.RealVector`

  returns: a new LeastSquaresProblem with the weights applied. The original
           problem is not modified. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem problem ^org.apache.commons.math4.linear.RealVector weights]
    (LeastSquaresFactory/weightDiagonal problem weights)))

(defn *count-evaluations
  "Count the evaluations of a particular problem. The counter will be
   incremented every time LeastSquaresProblem.evaluate(RealVector) is called on
   the returned problem.

  problem - the problem to track. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`
  counter - the counter to increment. - `org.apache.commons.math4.util.Incrementor`

  returns: a least squares problem that tracks evaluations - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem problem ^org.apache.commons.math4.util.Incrementor counter]
    (LeastSquaresFactory/countEvaluations problem counter)))

(defn *evaluation-checker
  "View a convergence checker specified for a PointVectorValuePair as one
   specified for an LeastSquaresProblem.Evaluation.

  checker - the convergence checker to adapt. - `org.apache.commons.math4.optim.ConvergenceChecker`

  returns: a convergence checker that delegates to checker. - `org.apache.commons.math4.optim.ConvergenceChecker<org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation>`"
  (^org.apache.commons.math4.optim.ConvergenceChecker [^org.apache.commons.math4.optim.ConvergenceChecker checker]
    (LeastSquaresFactory/evaluationChecker checker)))

(defn *model
  "Combine a MultivariateVectorFunction with a MultivariateMatrixFunction to produce a MultivariateJacobianFunction.

  value - the vector value function - `org.apache.commons.math4.analysis.MultivariateVectorFunction`
  jacobian - the Jacobian function - `org.apache.commons.math4.analysis.MultivariateMatrixFunction`

  returns: a function that computes both at the same time - `org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction`"
  (^org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction [^org.apache.commons.math4.analysis.MultivariateVectorFunction value ^org.apache.commons.math4.analysis.MultivariateMatrixFunction jacobian]
    (LeastSquaresFactory/model value jacobian)))

