(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresAdapter
  "An adapter that delegates to another implementation of LeastSquaresProblem."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresAdapter]))

(defn ->least-squares-adapter
  "Constructor.

  Delegate the LeastSquaresProblem interface to the given implementation.

  problem - the delegate - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`"
  (^LeastSquaresAdapter [^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem problem]
    (new LeastSquaresAdapter problem)))

(defn get-start
  "Gets the initial guess.

  returns: the initial guess values. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^LeastSquaresAdapter this]
    (-> this (.getStart))))

(defn get-observation-size
  "Get the number of observations (rows in the Jacobian) in this problem.

  returns: the number of scalar observations - `int`"
  (^Integer [^LeastSquaresAdapter this]
    (-> this (.getObservationSize))))

(defn get-parameter-size
  "Get the number of parameters (columns in the Jacobian) in this problem.

  returns: the number of scalar parameters - `int`"
  (^Integer [^LeastSquaresAdapter this]
    (-> this (.getParameterSize))))

(defn evaluate
  "Evaluate the model at the specified point.

  point - `org.apache.commons.math4.linear.RealVector`

  returns: the model's value and derivative at the given point. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation [^LeastSquaresAdapter this ^org.apache.commons.math4.linear.RealVector point]
    (-> this (.evaluate point))))

(defn get-evaluation-counter
  "Get a independent Incrementor that counts up to the maximum number of evaluations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^LeastSquaresAdapter this]
    (-> this (.getEvaluationCounter))))

(defn get-iteration-counter
  "Get a independent Incrementor that counts up to the maximum number of iterations
   and then throws an exception.

  returns: a counter for the evaluations. - `org.apache.commons.math4.util.Incrementor`"
  (^org.apache.commons.math4.util.Incrementor [^LeastSquaresAdapter this]
    (-> this (.getIterationCounter))))

(defn get-convergence-checker
  "Gets the convergence checker.

  returns: the object used to check for convergence. - `org.apache.commons.math4.optim.ConvergenceChecker<org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation>`"
  (^org.apache.commons.math4.optim.ConvergenceChecker [^LeastSquaresAdapter this]
    (-> this (.getConvergenceChecker))))

