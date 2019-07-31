(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder
  "A mutable builder for LeastSquaresProblems."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresBuilder]))

(defn ->least-squares-builder
  "Constructor."
  (^LeastSquaresBuilder []
    (new LeastSquaresBuilder )))

(defn model
  "Configure the model function.

  value - the model function value - `org.apache.commons.math4.analysis.MultivariateVectorFunction`
  jacobian - the Jacobian of value - `org.apache.commons.math4.analysis.MultivariateMatrixFunction`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.analysis.MultivariateVectorFunction value ^org.apache.commons.math4.analysis.MultivariateMatrixFunction jacobian]
    (-> this (.model value jacobian)))
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.fitting.leastsquares.MultivariateJacobianFunction new-model]
    (-> this (.model new-model))))

(defn parameter-validator
  "Configure the validator of the model parameters.

  new-validator - Parameter validator. - `org.apache.commons.math4.fitting.leastsquares.ParameterValidator`

  returns: this object. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.fitting.leastsquares.ParameterValidator new-validator]
    (-> this (.parameterValidator new-validator))))

(defn max-iterations
  "Configure the max iterations.

  new-max-iterations - the maximum number of iterations permitted. - `int`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^Integer new-max-iterations]
    (-> this (.maxIterations new-max-iterations))))

(defn start
  "Configure the initial guess.

  new-start - the initial guess. - `org.apache.commons.math4.linear.RealVector`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.linear.RealVector new-start]
    (-> this (.start new-start))))

(defn build
  "Construct a LeastSquaresProblem from the data in this builder.

  returns: a new LeastSquaresProblem. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem [^LeastSquaresBuilder this]
    (-> this (.build))))

(defn target
  "Configure the observed data.

  new-target - the observed data. - `org.apache.commons.math4.linear.RealVector`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.linear.RealVector new-target]
    (-> this (.target new-target))))

(defn max-evaluations
  "Configure the max evaluations.

  new-max-evaluations - the maximum number of evaluations permitted. - `int`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^Integer new-max-evaluations]
    (-> this (.maxEvaluations new-max-evaluations))))

(defn checker
  "Configure the convergence checker.

  new-checker - the convergence checker. - `org.apache.commons.math4.optim.ConvergenceChecker`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.optim.ConvergenceChecker new-checker]
    (-> this (.checker new-checker))))

(defn weight
  "Configure the weight matrix.

  new-weight - the weight matrix - `org.apache.commons.math4.linear.RealMatrix`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.linear.RealMatrix new-weight]
    (-> this (.weight new-weight))))

(defn checker-pair
  "Configure the convergence checker.

   This function is an overloaded version of checker(ConvergenceChecker).

  new-checker - the convergence checker. - `org.apache.commons.math4.optim.ConvergenceChecker`

  returns: this - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^org.apache.commons.math4.optim.ConvergenceChecker new-checker]
    (-> this (.checkerPair new-checker))))

(defn lazy-evaluation
  "Configure whether evaluation will be lazy or not.

  new-value - Whether to perform lazy evaluation. - `boolean`

  returns: this object. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresBuilder [^LeastSquaresBuilder this ^Boolean new-value]
    (-> this (.lazyEvaluation new-value))))

