(ns org.apache.commons.math4.stat.regression.RegressionResults
  "Results of a Multiple Linear Regression model fit."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression RegressionResults]))

(defn ->regression-results
  "Constructor.

  Constructor for Regression Results.

  parameters - a double array with the regression slope estimates - `double[]`
  varcov - the variance covariance matrix, stored either in a square matrix or as a compressed - `double[][]`
  is-symmetric-compressed - a flag which denotes that the variance covariance matrix is in symmetric compressed format - `boolean`
  nobs - the number of observations of the regression estimation - `long`
  rank - the number of independent variables in the regression - `int`
  sumy - the sum of the independent variable - `double`
  sumysq - the sum of the squared independent variable - `double`
  sse - sum of squared errors - `double`
  contains-constant - true model has constant, false model does not have constant - `boolean`
  copy-data - if true a deep copy of all input data is made, if false only references are copied and the RegressionResults become mutable - `boolean`"
  (^RegressionResults [parameters varcov ^Boolean is-symmetric-compressed ^Long nobs ^Integer rank ^Double sumy ^Double sumysq ^Double sse ^Boolean contains-constant ^Boolean copy-data]
    (new RegressionResults parameters varcov is-symmetric-compressed nobs rank sumy sumysq sse contains-constant copy-data)))

(defn get-adjusted-r-squared
  "Returns the adjusted R-squared statistic, defined by the formula

   R2adj = 1 - [SSR (n - 1)] / [SSTO (n - p)]
   where SSR is the sum of squared residuals},
   SSTO is the total sum of squares}, n is the number
   of observations and p is the number of parameters estimated (including the intercept).

   If the regression is estimated without an intercept term, what is returned is

    1 - (1 - getRSquared() ) * (n / (n - p))

  returns: adjusted R-Squared statistic - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getAdjustedRSquared))))

(defn get-covariance-of-parameters
  "Returns the covariance between regression parameters i and j.

   If there are problems with an ill conditioned design matrix then the covariance
   which involves redundant columns will be assigned Double.NaN.

  i - ith regression parameter. - `int`
  j - jth regression parameter. - `int`

  returns: the covariance of the parameter estimates. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if i or j is not in the interval [0, number of parameters)."
  (^Double [^RegressionResults this ^Integer i ^Integer j]
    (-> this (.getCovarianceOfParameters i j))))

(defn has-intercept?
  "Returns true if the regression model has been computed including an intercept.
   In this case, the coefficient of the intercept is the first element of the
   parameter estimates.

  returns: true if the model has an intercept term - `boolean`"
  (^Boolean [^RegressionResults this]
    (-> this (.hasIntercept))))

(defn get-parameter-estimate
  "Returns the parameter estimate for the regressor at the given index.

   A redundant regressor will have its redundancy flag set, as well as
    a parameters estimated equal to Double.NaN

  index - Index. - `int`

  returns: the parameters estimated for regressor at index. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if index is not in the interval [0, number of parameters)."
  (^Double [^RegressionResults this ^Integer index]
    (-> this (.getParameterEstimate index))))

(defn get-std-error-of-estimate
  "Returns the standard
   error of the parameter estimate at index,
   usually denoted s(bindex).

  index - Index. - `int`

  returns: the standard errors associated with parameters estimated at index. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if index is not in the interval [0, number of parameters)."
  (^Double [^RegressionResults this ^Integer index]
    (-> this (.getStdErrorOfEstimate index))))

(defn get-mean-square-error
  "Returns the sum of squared errors divided by the degrees of freedom,
   usually abbreviated MSE.

   If there are fewer than numberOfParameters  1 data pairs in the model,
   or if there is no variation in x, this returns
   Double.NaN.

  returns: sum of squared deviations of y values - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getMeanSquareError))))

(defn get-parameter-estimates
  "Returns a copy of the regression parameters estimates.

   The parameter estimates are returned in the natural order of the data.

   A redundant regressor will have its redundancy flag set, as will
    a parameter estimate equal to Double.NaN.

  returns: array of parameter estimates, null if no estimation occurred - `double[]`"
  ([^RegressionResults this]
    (-> this (.getParameterEstimates))))

(defn get-r-squared
  "Returns the
   coefficient of multiple determination,
   usually denoted r-square.

   Preconditions:
   At least numberOfParameters observations (with at least numberOfParameters different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: r-square, a double in the interval [0, 1] - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getRSquared))))

(defn get-total-sum-squares
  "Returns the sum of squared deviations of the y values about their mean.

   This is defined as SSTO
   here.

   If n < 2, this returns Double.NaN.

  returns: sum of squared deviations of y values - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getTotalSumSquares))))

(defn get-error-sum-squares
  "Returns the
   sum of squared errors (SSE) associated with the regression
   model.

   The return value is constrained to be non-negative - i.e., if due to
   rounding errors the computational formula returns a negative result,
   0 is returned.

   Preconditions:
   numberOfParameters data pairs
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: sum of squared errors associated with the regression model - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getErrorSumSquares))))

(defn get-regression-sum-squares
  "Returns the sum of squared deviations of the predicted y values about
   their mean (which equals the mean of y).

   This is usually abbreviated SSR or SSM.  It is defined as SSM
   here

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double.NaN is
   returned.

  returns: sum of squared deviations of predicted y values - `double`"
  (^Double [^RegressionResults this]
    (-> this (.getRegressionSumSquares))))

(defn get-number-of-parameters
  "Returns the number of parameters estimated in the model.

   This is the maximum number of regressors, some techniques may drop
   redundant parameters

  returns: number of regressors, -1 if not estimated - `int`"
  (^Integer [^RegressionResults this]
    (-> this (.getNumberOfParameters))))

(defn get-n
  "Returns the number of observations added to the regression model.

  returns: Number of observations, -1 if an error condition prevents estimation - `long`"
  (^Long [^RegressionResults this]
    (-> this (.getN))))

(defn get-std-error-of-estimates
  "Returns the standard
   error of the parameter estimates,
   usually denoted s(bi).

   If there are problems with an ill conditioned design matrix then the regressor
   which is redundant will be assigned Double.NaN.

  returns: an array standard errors associated with parameters estimates,
    null if no estimation occurred - `double[]`"
  ([^RegressionResults this]
    (-> this (.getStdErrorOfEstimates))))

