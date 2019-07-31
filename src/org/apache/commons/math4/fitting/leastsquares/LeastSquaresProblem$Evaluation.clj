(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem$Evaluation
  "An evaluation of a LeastSquaresProblem at a particular point. This class
  also computes several quantities derived from the value and its Jacobian."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresProblem$Evaluation]))

(defn get-covariances
  "Get the covariance matrix of the optimized parameters.  Note that this
   operation involves the inversion of the JTJ matrix,
   where J is the Jacobian matrix. The threshold parameter is a
   way for the caller to specify that the result of this computation should be
   considered meaningless, and thus trigger an exception.

  threshold - Singularity threshold. - `double`

  returns: the covariance matrix. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.linear.SingularMatrixException - if the covariance matrix cannot be computed (singular problem)."
  (^org.apache.commons.math4.linear.RealMatrix [^LeastSquaresProblem$Evaluation this ^Double threshold]
    (-> this (.getCovariances threshold))))

(defn get-residuals
  "Get the weighted residuals. The residual is the difference between the
   observed (target) values and the model (objective function) value. There is one
   residual for each element of the vector-valued function. The raw residuals are
   then multiplied by the square root of the weight matrix.

  returns: the weighted residuals: W1/2 K. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the residuals have the wrong length."
  (^org.apache.commons.math4.linear.RealVector [^LeastSquaresProblem$Evaluation this]
    (-> this (.getResiduals))))

(defn get-cost
  "Get the cost.
   It is the square-root of the objective function.

  returns: the cost. - `double`"
  (^Double [^LeastSquaresProblem$Evaluation this]
    (-> this (.getCost))))

(defn get-jacobian
  "Get the weighted Jacobian matrix.

  returns: the weighted Jacobian: W1/2 J. - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the Jacobian dimension does not match problem dimension."
  (^org.apache.commons.math4.linear.RealMatrix [^LeastSquaresProblem$Evaluation this]
    (-> this (.getJacobian))))

(defn get-chi-square
  "Get the sum of the squares of the residuals.

  returns: the cost. - `double`"
  (^Double [^LeastSquaresProblem$Evaluation this]
    (-> this (.getChiSquare))))

(defn get-sigma
  "Get an estimate of the standard deviation of the parameters. The returned
   values are the square root of the diagonal coefficients of the covariance
   matrix, sd(a[i]) ~= sqrt(C[i][i]), where a[i] is the optimized
   value of the i-th parameter, and C is the covariance matrix.

  covariance-singularity-threshold - Singularity threshold (see computeCovariances). - `double`

  returns: an estimate of the standard deviation of the optimized parameters - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.linear.SingularMatrixException - if the covariance matrix cannot be computed."
  (^org.apache.commons.math4.linear.RealVector [^LeastSquaresProblem$Evaluation this ^Double covariance-singularity-threshold]
    (-> this (.getSigma covariance-singularity-threshold))))

(defn get-point
  "Get the abscissa (independent variables) of this evaluation.

  returns: the point provided to LeastSquaresProblem.evaluate(RealVector). - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^LeastSquaresProblem$Evaluation this]
    (-> this (.getPoint))))

(defn get-reduced-chi-square
  "Get the reduced chi-square.

  n - Number of fitted parameters. - `int`

  returns: the sum of the squares of the residuals divided by the number
   of degrees of freedom. - `double`"
  (^Double [^LeastSquaresProblem$Evaluation this ^Integer n]
    (-> this (.getReducedChiSquare n))))

(defn get-rms
  "Get the normalized cost. It is the square-root of the sum of squared of
   the residuals, divided by the number of measurements.

  returns: the cost. - `double`"
  (^Double [^LeastSquaresProblem$Evaluation this]
    (-> this (.getRMS))))

