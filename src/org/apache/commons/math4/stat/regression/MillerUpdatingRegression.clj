(ns org.apache.commons.math4.stat.regression.MillerUpdatingRegression
  "This class is a concrete implementation of the UpdatingMultipleLinearRegression interface.

  The algorithm is described in:

  Algorithm AS 274: Least Squares Routines to Supplement Those of Gentleman
  Author(s): Alan J. Miller
  Source: Journal of the Royal Statistical Society.
  Series C (Applied Statistics), Vol. 41, No. 2
  (1992), pp. 458-478
  Published by: Blackwell Publishing for the Royal Statistical Society
  Stable URL: http://www.jstor.org/stable/2347583

  This method for multiple regression forms the solution to the OLS problem
  by updating the QR decomposition as described by Gentleman."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression MillerUpdatingRegression]))

(defn ->miller-updating-regression
  "Constructor.

  This is the augmented constructor for the MillerUpdatingRegression class.

  number-of-variables - number of regressors to expect, not including constant - `int`
  include-constant - include a constant automatically - `boolean`
  error-tolerance - zero tolerance, how machine zero is determined - `double`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if numberOfVariables is less than 1"
  (^MillerUpdatingRegression [^Integer number-of-variables ^Boolean include-constant ^Double error-tolerance]
    (new MillerUpdatingRegression number-of-variables include-constant error-tolerance))
  (^MillerUpdatingRegression [^Integer number-of-variables ^Boolean include-constant]
    (new MillerUpdatingRegression number-of-variables include-constant)))

(defn get-diagonal-of-hat-matrix
  "Gets the diagonal of the Hat matrix also known as the leverage matrix.

  row-data - returns the diagonal of the hat matrix for this observation - `double[]`

  returns: the diagonal element of the hatmatrix - `double`"
  (^Double [^MillerUpdatingRegression this row-data]
    (-> this (.getDiagonalOfHatMatrix row-data))))

(defn has-intercept?
  "A getter method which determines whether a constant is included.

  returns: true regression has an intercept, false no intercept - `boolean`"
  (^Boolean [^MillerUpdatingRegression this]
    (-> this (.hasIntercept))))

(defn get-partial-correlations
  "In the original algorithm only the partial correlations of the regressors
   is returned to the user. In this implementation, we have

   corr =
   {
     corrxx - lower triangular
     corrxy - bottom row of the matrix
   }
   Replaces subroutines PCORR and COR of:
   ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2

   Calculate partial correlations after the variables in rows
   1, 2, ..., IN have been forced into the regression.
   If IN = 1, and the first row of R represents a constant in the
   model, then the usual simple correlations are returned.

   If IN = 0, the value returned in array CORMAT for the correlation
   of variables Xi & Xj is:

   sum ( Xi.Xj ) / Sqrt ( sum (Xi^2) . sum (Xj^2) )

   On return, array CORMAT contains the upper triangle of the matrix of
   partial correlations stored by rows, excluding the 1's on the diagonal.
   e.g. if IN = 2, the consecutive elements returned are:
   (3,4) (3,5) ... (3,ncol), (4,5) (4,6) ... (4,ncol), etc.
   Array YCORR stores the partial correlations with the Y-variable
   starting with YCORR(IN+1) = partial correlation with the variable in
   position (IN+1).

  in - how many of the regressors to include (either in canonical order, or in the current reordered state) - `int`

  returns: an array with the partial correlations of the remainder of
   regressors with each other and the regressand, in lower triangular form - `double[]`"
  ([^MillerUpdatingRegression this ^Integer in]
    (-> this (.getPartialCorrelations in))))

(defn get-order-of-regressors
  "Gets the order of the regressors, useful if some type of reordering
   has been called. Calling regress with int[]{} args will trigger
   a reordering.

  returns: int[] with the current order of the regressors - `int[]`"
  ([^MillerUpdatingRegression this]
    (-> this (.getOrderOfRegressors))))

(defn regress
  "Conducts a regression on the data in the model, using a subset of regressors.

  number-of-regressors - many of the regressors to include (either in canonical order, or in the current reordered state) - `int`

  returns: RegressionResults the structure holding all regression results - `org.apache.commons.math4.stat.regression.RegressionResults`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - - thrown if number of observations is less than the number of variables or number of regressors requested is greater than the regressors in the model"
  (^org.apache.commons.math4.stat.regression.RegressionResults [^MillerUpdatingRegression this ^Integer number-of-regressors]
    (-> this (.regress number-of-regressors)))
  (^org.apache.commons.math4.stat.regression.RegressionResults [^MillerUpdatingRegression this]
    (-> this (.regress))))

(defn add-observations
  "Adds multiple observations to the model.

  x - observations on the regressors - `double[][]`
  y - observations on the regressand - `double[]`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if x is not rectangular, does not match the length of y or does not contain sufficient data to estimate the model"
  ([^MillerUpdatingRegression this x y]
    (-> this (.addObservations x y))))

(defn clear
  "As the name suggests,  clear wipes the internals and reorders everything in the
   canonical order."
  ([^MillerUpdatingRegression this]
    (-> this (.clear))))

(defn add-observation
  "Adds an observation to the regression model.

  x - the array with regressor values - `double[]`
  y - the value of dependent variable given these regressors - `double`

  throws: org.apache.commons.math4.stat.regression.ModelSpecificationException - if the length of x does not equal the number of independent variables in the model"
  ([^MillerUpdatingRegression this x ^Double y]
    (-> this (.addObservation x y))))

(defn get-n
  "Gets the number of observations added to the regression model.

  returns: number of observations - `long`"
  (^Long [^MillerUpdatingRegression this]
    (-> this (.getN))))

