(ns org.apache.commons.math4.fitting.leastsquares.AbstractEvaluation
  "An implementation of LeastSquaresProblem.Evaluation that is designed for extension. All of the
  methods implemented here use the methods that are left unimplemented.

  TODO cache results?"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares AbstractEvaluation]))

(defn get-covariances
  "Get the covariance matrix of the optimized parameters.  Note that this
   operation involves the inversion of the JTJ matrix,
   where J is the Jacobian matrix. The threshold parameter is a
   way for the caller to specify that the result of this computation should be
   considered meaningless, and thus trigger an exception.

  threshold - Singularity threshold. - `double`

  returns: the covariance matrix. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^AbstractEvaluation this ^Double threshold]
    (-> this (.getCovariances threshold))))

(defn get-sigma
  "Get an estimate of the standard deviation of the parameters. The returned
   values are the square root of the diagonal coefficients of the covariance
   matrix, sd(a[i]) ~= sqrt(C[i][i]), where a[i] is the optimized
   value of the i-th parameter, and C is the covariance matrix.

  covariance-singularity-threshold - Singularity threshold (see computeCovariances). - `double`

  returns: an estimate of the standard deviation of the optimized parameters - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^AbstractEvaluation this ^Double covariance-singularity-threshold]
    (-> this (.getSigma covariance-singularity-threshold))))

(defn get-rms
  "Get the normalized cost. It is the square-root of the sum of squared of
   the residuals, divided by the number of measurements.

  returns: the cost. - `double`"
  (^Double [^AbstractEvaluation this]
    (-> this (.getRMS))))

(defn get-cost
  "Get the cost.
   It is the square-root of the objective function.

  returns: the cost. - `double`"
  (^Double [^AbstractEvaluation this]
    (-> this (.getCost))))

(defn get-chi-square
  "Get the sum of the squares of the residuals.

  returns: the cost. - `double`"
  (^Double [^AbstractEvaluation this]
    (-> this (.getChiSquare))))

(defn get-reduced-chi-square
  "Get the reduced chi-square.

  number-of-fitted-parameters - Number of fitted parameters. - `int`

  returns: the sum of the squares of the residuals divided by the number
   of degrees of freedom. - `double`"
  (^Double [^AbstractEvaluation this ^Integer number-of-fitted-parameters]
    (-> this (.getReducedChiSquare number-of-fitted-parameters))))

