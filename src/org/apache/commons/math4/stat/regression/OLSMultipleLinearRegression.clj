(ns org.apache.commons.math4.stat.regression.OLSMultipleLinearRegression
  "Implements ordinary least squares (OLS) to estimate the parameters of a
  multiple linear regression model.

  The regression coefficients, b, satisfy the normal equations:


  XT X b = XT y

  To solve the normal equations, this implementation uses QR decomposition
  of the X matrix. (See QRDecomposition for details on the
  decomposition algorithm.) The X matrix, also known as the design matrix,
  has rows corresponding to sample observations and columns corresponding to independent
  variables.  When the model is estimated using an intercept term (i.e. when
  isNoIntercept is false as it is by default), the X
  matrix includes an initial column identically equal to 1.  We solve the normal equations
  as follows:


  XTX b = XT y
  (QR)T (QR) b = (QR)Ty
  RT (QTQ) R b = RT QT y
  RT R b = RT QT y
  (RT)-1 RT R b = (RT)-1 RT QT y
  R b = QT y

  Given Q and R, the last equation is solved by back-substitution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression OLSMultipleLinearRegression]))

(defn ->ols-multiple-linear-regression
  "Constructor.

  Create an empty OLSMultipleLinearRegression instance, using the given
   singularity threshold for the QR decomposition.

  threshold - the singularity threshold - `double`"
  (^OLSMultipleLinearRegression [^Double threshold]
    (new OLSMultipleLinearRegression threshold))
  (^OLSMultipleLinearRegression []
    (new OLSMultipleLinearRegression )))

(defn new-sample-data
  "Loads model x and y sample data from a flat input array, overriding any previous sample.

   Assumes that rows are concatenated with y values first in each row.  For example, an input
   data array containing the sequence of values (1, 2, 3, 4, 5, 6, 7, 8, 9) with
   nobs = 3 and nvars = 2 creates a regression dataset with two
   independent variables, as below:


     y   x[0]  x[1]
     --------------
     1     2     3
     4     5     6
     7     8     9

   Note that there is no need to add an initial unitary column (column of 1's) when
   specifying a model including an intercept term.  If AbstractMultipleLinearRegression.isNoIntercept() is true,
   the X matrix will be created without an initial column of \"1\"s; otherwise this column will
   be added.

   Throws IllegalArgumentException if any of the following preconditions fail:
   data cannot be null
   data.length = nobs * (nvars  1)
   nobs > nvars

   This implementation computes and caches the QR decomposition of the X matrix.

  data - `double[]`
  nobs - `int`
  nvars - `int`"
  ([^OLSMultipleLinearRegression this data ^Integer nobs ^Integer nvars]
    (-> this (.newSampleData data nobs nvars)))
  ([^OLSMultipleLinearRegression this y x]
    (-> this (.newSampleData y x))))

