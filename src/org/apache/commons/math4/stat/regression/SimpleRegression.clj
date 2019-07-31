(ns org.apache.commons.math4.stat.regression.SimpleRegression
  "Estimates an ordinary least squares regression model
  with one independent variable.

   y = intercept  slope * x

  Standard errors for intercept and slope are
  available as well as ANOVA, r-square and Pearson's r statistics.

  Observations (x,y pairs) can be added to the model one at a time or they
  can be provided in a 2-dimensional array.  The observations are not stored
  in memory, so there is no limit to the number of observations that can be
  added to the model.

  Usage Notes:
   When there are fewer than two observations in the model, or when
  there is no variation in the x values (i.e. all x values are the same)
  all statistics return NaN. At least two observations with
  different x coordinates are required to estimate a bivariate regression
  model.

   Getters for the statistics always compute values based on the current
  set of observations -- i.e., you can get statistics, then add more data
  and get updated statistics without using a new instance.  There is no
  \"compute\" method that updates all statistics.  Each of the getters performs
  the necessary computations to return the requested statistic.

   The intercept term may be suppressed by passing false to
  the SimpleRegression(boolean) constructor.  When the
  hasIntercept property is false, the model is estimated without a
  constant term and getIntercept() returns 0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression SimpleRegression]))

(defn ->simple-regression
  "Constructor.

  Create a SimpleRegression instance, specifying whether or not to estimate
   an intercept.

   Use false to estimate a model with no intercept.  When the
   hasIntercept property is false, the model is estimated without a
   constant term and getIntercept() returns 0.

  include-intercept - whether or not to include an intercept term in the regression model - `boolean`"
  (^SimpleRegression [^Boolean include-intercept]
    (new SimpleRegression include-intercept))
  (^SimpleRegression []
    (new SimpleRegression )))

(defn predict
  "Returns the \"predicted\" y value associated with the
   supplied x value,  based on the data that has been
   added to the model when this method is activated.

    predict(x) = intercept  slope * x

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  x - input x value - `double`

  returns: predicted y value - `double`"
  (^Double [^SimpleRegression this ^Double x]
    (-> this (.predict x))))

(defn get-significance
  "Returns the significance level of the slope (equiv) correlation.

   Specifically, the returned value is the smallest alpha
   such that the slope confidence interval with significance level
   equal to alpha does not include 0.
   On regression output, this is often denoted Prob(|t| > 0)

   Usage Note:
   The validity of this statistic depends on the assumption that the
   observations included in the model are drawn from a

   Bivariate Normal Distribution.

   If there are fewer that three observations in the
   model, or if there is no variation in x, this returns
   Double.NaN.

  returns: significance level for slope/correlation - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the significance level can not be computed."
  (^Double [^SimpleRegression this]
    (-> this (.getSignificance))))

(defn get-slope-std-err
  "Returns the standard
   error of the slope estimate,
   usually denoted s(b1).

   If there are fewer that three data pairs in the model,
   or if there is no variation in x, this returns Double.NaN.

  returns: standard error associated with slope estimate - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getSlopeStdErr))))

(defn has-intercept?
  "Returns true if the model includes an intercept term.

  returns: true if the regression includes an intercept; false otherwise - `boolean`"
  (^Boolean [^SimpleRegression this]
    (-> this (.hasIntercept))))

(defn get-slope
  "Returns the slope of the estimated regression line.

   The least squares estimate of the slope is computed using the
   normal equations.
   The slope is sometimes denoted b1.

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double.NaN is
   returned.

  returns: the slope of the regression line - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getSlope))))

(defn get-sum-squared-errors
  "Returns the
   sum of squared errors (SSE) associated with the regression
   model.

   The sum is computed using the computational formula

   SSE = SYY - (SXY * SXY / SXX)

   where SYY is the sum of the squared deviations of the y
   values about their mean, SXX is similarly defined and
   SXY is the sum of the products of x and y mean deviations.

   The sums are accumulated using the updating algorithm referenced in
   addData(double, double).

   The return value is constrained to be non-negative - i.e., if due to
   rounding errors the computational formula returns a negative result,
   0 is returned.

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: sum of squared errors associated with the regression model - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getSumSquaredErrors))))

(defn get-slope-confidence-interval
  "Returns the half-width of a (100-100*alpha)% confidence interval for
   the slope estimate.

   The (100-100*alpha)% confidence interval is

   (getSlope() - getSlopeConfidenceInterval(),
   getSlope()  getSlopeConfidenceInterval())

   To request, for example, a 99% confidence interval, use
   alpha = .01

   Usage Note:
   The validity of this statistic depends on the assumption that the
   observations included in the model are drawn from a

   Bivariate Normal Distribution.

    Preconditions:
   If there are fewer that three observations in the
   model, or if there is no variation in x, this returns
   Double.NaN.

   (0 < alpha < 1); otherwise an
   OutOfRangeException is thrown.

  alpha - the desired significance level - `double`

  returns: half-width of 95% confidence interval for the slope estimate - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the confidence interval can not be computed."
  (^Double [^SimpleRegression this ^Double alpha]
    (-> this (.getSlopeConfidenceInterval alpha)))
  (^Double [^SimpleRegression this]
    (-> this (.getSlopeConfidenceInterval))))

(defn get-mean-square-error
  "Returns the sum of squared errors divided by the degrees of freedom,
   usually abbreviated MSE.

   If there are fewer than three data pairs in the model,
   or if there is no variation in x, this returns
   Double.NaN.

  returns: sum of squared deviations of y values - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getMeanSquareError))))

(defn get-total-sum-squares
  "Returns the sum of squared deviations of the y values about their mean.

   This is defined as SSTO
   here.

   If n < 2, this returns Double.NaN.

  returns: sum of squared deviations of y values - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getTotalSumSquares))))

(defn get-sum-of-cross-products
  "Returns the sum of crossproducts, xi*yi.

  returns: sum of cross products - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getSumOfCrossProducts))))

(defn regress
  "Performs a regression on data present in buffers including only regressors
   indexed in variablesToInclude and outputs a RegressionResults object

  variables-to-include - an array of indices of regressors to include - `int[]`

  returns: RegressionResults acts as a container of regression output - `org.apache.commons.math4.stat.regression.RegressionResults`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the variablesToInclude array is null or zero length"
  (^org.apache.commons.math4.stat.regression.RegressionResults [^SimpleRegression this variables-to-include]
    (-> this (.regress variables-to-include)))
  (^org.apache.commons.math4.stat.regression.RegressionResults [^SimpleRegression this]
    (-> this (.regress))))

(defn remove-data
  "Removes the observation (x,y) from the regression data set.

   Mirrors the addData method.  This method permits the use of
   SimpleRegression instances in streaming mode where the regression
   is applied to a sliding \"window\" of observations, however the caller is
   responsible for maintaining the set of observations in the window.

   The method has no effect if there are no points of data (i.e. n=0)

  x - independent variable value - `double`
  y - dependent variable value - `double`"
  ([^SimpleRegression this ^Double x ^Double y]
    (-> this (.removeData x y)))
  ([^SimpleRegression this data]
    (-> this (.removeData data))))

(defn get-x-sum-squares
  "Returns the sum of squared deviations of the x values about their mean.

   If n < 2, this returns Double.NaN.

  returns: sum of squared deviations of x values - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getXSumSquares))))

(defn get-r
  "Returns
   Pearson's product moment correlation coefficient,
   usually denoted r.

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: Pearson's r - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getR))))

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
  (^Double [^SimpleRegression this]
    (-> this (.getRegressionSumSquares))))

(defn add-observations
  "Adds a series of observations to the regression model. The lengths of
   x and y must be the same and x must be rectangular.

  x - a series of observations on the independent variables - `double[][]`
  y - a series of observations on the dependent variable The length of x and y must be the same - `double[]`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if x is not rectangular, does not match the length of y or does not contain sufficient data to estimate the model"
  ([^SimpleRegression this x y]
    (-> this (.addObservations x y))))

(defn get-intercept-std-err
  "Returns the
   standard error of the intercept estimate,
   usually denoted s(b0).

   If there are fewer that three observations in the
   model, or if there is no variation in x, this returns
   Double.NaN. Additionally, a Double.NaN is
   returned when the intercept is constrained to be zero

  returns: standard error associated with intercept estimate - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getInterceptStdErr))))

(defn append
  "Appends data from another regression calculation to this one.

   The mean update formulae are based on a paper written by Philippe
   Pébay:

   Formulas for Robust, One-Pass Parallel Computation of Covariances and
   Arbitrary-Order Statistical Moments, 2008, Technical Report
   SAND2008-6212, Sandia National Laboratories.

  reg - model to append data from - `org.apache.commons.math4.stat.regression.SimpleRegression`"
  ([^SimpleRegression this ^org.apache.commons.math4.stat.regression.SimpleRegression reg]
    (-> this (.append reg))))

(defn clear
  "Clears all data from the model."
  ([^SimpleRegression this]
    (-> this (.clear))))

(defn get-r-square
  "Returns the
   coefficient of determination,
   usually denoted r-square.

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: r-square - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getRSquare))))

(defn get-intercept
  "Returns the intercept of the estimated regression line, if
   hasIntercept() is true; otherwise 0.

   The least squares estimate of the intercept is computed using the
   normal equations.
   The intercept is sometimes denoted b0.

   Preconditions:
   At least two observations (with at least two different x values)
   must have been added before invoking this method. If this method is
   invoked before a model can be estimated, Double,NaN is
   returned.

  returns: the intercept of the regression line if the model includes an
   intercept; 0 otherwise - `double`"
  (^Double [^SimpleRegression this]
    (-> this (.getIntercept))))

(defn add-observation
  "Adds one observation to the regression model.

  x - the independent variables which form the design matrix - `double[]`
  y - the dependent or response variable - `double`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if the length of x does not equal the number of independent variables in the model"
  ([^SimpleRegression this x ^Double y]
    (-> this (.addObservation x y))))

(defn add-data
  "Adds the observation (x,y) to the regression data set.

   Uses updating formulas for means and sums of squares defined in
   \"Algorithms for Computing the Sample Variance: Analysis and
   Recommendations\", Chan, T.F., Golub, G.H., and LeVeque, R.J.
   1983, American Statistician, vol. 37, pp. 242-247, referenced in
   Weisberg, S. \"Applied Linear Regression\". 2nd Ed. 1985.

  x - independent variable value - `double`
  y - dependent variable value - `double`"
  ([^SimpleRegression this ^Double x ^Double y]
    (-> this (.addData x y)))
  ([^SimpleRegression this data]
    (-> this (.addData data))))

(defn get-n
  "Returns the number of observations that have been added to the model.

  returns: n number of observations that have been added. - `long`"
  (^Long [^SimpleRegression this]
    (-> this (.getN))))

