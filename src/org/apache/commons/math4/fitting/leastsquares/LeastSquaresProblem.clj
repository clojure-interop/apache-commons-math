(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem
  "The data necessary to define a non-linear least squares problem.

  Includes the observed values, computed model function, and
  convergence/divergence criteria. Weights are implicit in LeastSquaresProblem.Evaluation.getResiduals() and LeastSquaresProblem.Evaluation.getJacobian().


  Instances are typically either created progressively using a builder or created at once using a factory."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresProblem]))

(defn get-start
  "Gets the initial guess.

  returns: the initial guess values. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^LeastSquaresProblem this]
    (-> this (.getStart))))

(defn get-observation-size
  "Get the number of observations (rows in the Jacobian) in this problem.

  returns: the number of scalar observations - `int`"
  (^Integer [^LeastSquaresProblem this]
    (-> this (.getObservationSize))))

(defn get-parameter-size
  "Get the number of parameters (columns in the Jacobian) in this problem.

  returns: the number of scalar parameters - `int`"
  (^Integer [^LeastSquaresProblem this]
    (-> this (.getParameterSize))))

(defn evaluate
  "Evaluate the model at the specified point.

  point - the parameter values. - `org.apache.commons.math4.linear.RealVector`

  returns: the model's value and derivative at the given point. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations (of the model vector function) is exceeded."
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation [^LeastSquaresProblem this ^org.apache.commons.math4.linear.RealVector point]
    (-> this (.evaluate point))))

