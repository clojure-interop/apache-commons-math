(ns org.apache.commons.math4.stat.regression.UpdatingMultipleLinearRegression
  "An interface for regression models allowing for dynamic updating of the data.
  That is, the entire data set need not be loaded into memory. As observations
  become available, they can be added to the regression  model and an updated
  estimate regression statistics can be calculated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression UpdatingMultipleLinearRegression]))

(defn has-intercept?
  "Returns true if a constant has been included false otherwise.

  returns: true if constant exists, false otherwise - `boolean`"
  (^Boolean [^UpdatingMultipleLinearRegression this]
    (-> this (.hasIntercept))))

(defn get-n
  "Returns the number of observations added to the regression model.

  returns: Number of observations - `long`"
  (^Long [^UpdatingMultipleLinearRegression this]
    (-> this (.getN))))

(defn add-observation
  "Adds one observation to the regression model.

  x - the independent variables which form the design matrix - `double[]`
  y - the dependent or response variable - `double`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if the length of x does not equal the number of independent variables in the model"
  ([^UpdatingMultipleLinearRegression this x ^Double y]
    (-> this (.addObservation x y))))

(defn add-observations
  "Adds a series of observations to the regression model. The lengths of
   x and y must be the same and x must be rectangular.

  x - a series of observations on the independent variables - `double[][]`
  y - a series of observations on the dependent variable The length of x and y must be the same - `double[]`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if x is not rectangular, does not match the length of y or does not contain sufficient data to estimate the model"
  ([^UpdatingMultipleLinearRegression this x y]
    (-> this (.addObservations x y))))

(defn clear
  "Clears internal buffers and resets the regression model. This means all
   data and derived values are initialized"
  ([^UpdatingMultipleLinearRegression this]
    (-> this (.clear))))

(defn regress
  "Performs a regression on data present in buffers including only regressors
   indexed in variablesToInclude and outputs a RegressionResults object

  variables-to-include - an array of indices of regressors to include - `int[]`

  returns: RegressionResults acts as a container of regression output - `org.apache.commons.math4.stat.regression.RegressionResults`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if the model is not correctly specified"
  (^org.apache.commons.math4.stat.regression.RegressionResults [^UpdatingMultipleLinearRegression this variables-to-include]
    (-> this (.regress variables-to-include)))
  (^org.apache.commons.math4.stat.regression.RegressionResults [^UpdatingMultipleLinearRegression this]
    (-> this (.regress))))

