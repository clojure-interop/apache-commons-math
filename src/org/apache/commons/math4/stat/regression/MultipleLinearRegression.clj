(ns org.apache.commons.math4.stat.regression.MultipleLinearRegression
  "The multiple linear regression can be represented in matrix-notation.


   y=X*b+u
  where y is an n-vector regressand, X is a [n,k] matrix whose k columns are called
  regressors, b is k-vector of regression parameters and u is an n-vector
  of error terms or residuals.

  The notation is quite standard in literature,
  cf eg Davidson and MacKinnon, Econometrics Theory and Methods, 2004."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression MultipleLinearRegression]))

(defn estimate-regression-parameters
  "Estimates the regression parameters b.

  returns: The [k,1] array representing b - `double[]`"
  ([^MultipleLinearRegression this]
    (-> this (.estimateRegressionParameters))))

(defn estimate-regression-parameters-variance
  "Estimates the variance of the regression parameters, ie Var(b).

  returns: The [k,k] array representing the variance of b - `double[][]`"
  ([^MultipleLinearRegression this]
    (-> this (.estimateRegressionParametersVariance))))

(defn estimate-residuals
  "Estimates the residuals, ie u = y - X*b.

  returns: The [n,1] array representing the residuals - `double[]`"
  ([^MultipleLinearRegression this]
    (-> this (.estimateResiduals))))

(defn estimate-regressand-variance
  "Returns the variance of the regressand, ie Var(y).

  returns: The double representing the variance of y - `double`"
  (^Double [^MultipleLinearRegression this]
    (-> this (.estimateRegressandVariance))))

(defn estimate-regression-parameters-standard-errors
  "Returns the standard errors of the regression parameters.

  returns: standard errors of estimated regression parameters - `double[]`"
  ([^MultipleLinearRegression this]
    (-> this (.estimateRegressionParametersStandardErrors))))

