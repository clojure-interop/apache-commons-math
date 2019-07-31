(ns org.apache.commons.math4.stat.regression.GLSMultipleLinearRegression
  "The GLS implementation of multiple linear regression.

  GLS assumes a general covariance matrix Omega of the error


  u ~ N(0, Omega)

  Estimated by GLS,


  b=(X' Omega^-1 X)^-1X'Omega^-1 y
  whose variance is


  Var(b)=(X' Omega^-1 X)^-1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression GLSMultipleLinearRegression]))

(defn ->gls-multiple-linear-regression
  "Constructor."
  (^GLSMultipleLinearRegression []
    (new GLSMultipleLinearRegression )))

(defn new-sample-data
  "Replace sample data, overriding any previous sample.

  y - y values of the sample - `double[]`
  x - x values of the sample - `double[][]`
  covariance - array representing the covariance matrix - `double[][]`"
  ([^GLSMultipleLinearRegression this y x covariance]
    (-> this (.newSampleData y x covariance))))

