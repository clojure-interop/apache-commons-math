(ns org.apache.commons.math4.stat.regression.AbstractMultipleLinearRegression
  "Abstract base class for implementations of MultipleLinearRegression."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression AbstractMultipleLinearRegression]))

(defn ->abstract-multiple-linear-regression
  "Constructor."
  (^AbstractMultipleLinearRegression []
    (new AbstractMultipleLinearRegression )))

(defn no-intercept?
  "returns: true if the model has no intercept term; false otherwise - `boolean`"
  (^Boolean [^AbstractMultipleLinearRegression this]
    (-> this (.isNoIntercept))))

(defn set-no-intercept
  "no-intercept - true means the model is to be estimated without an intercept term - `boolean`"
  ([^AbstractMultipleLinearRegression this ^Boolean no-intercept]
    (-> this (.setNoIntercept no-intercept))))

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
   specifying a model including an intercept term.  If isNoIntercept() is true,
   the X matrix will be created without an initial column of \"1\"s; otherwise this column will
   be added.

   Throws IllegalArgumentException if any of the following preconditions fail:
   data cannot be null
   data.length = nobs * (nvars  1)
   nobs > nvars

  data - `double[]`
  nobs - `int`
  nvars - `int`"
  ([^AbstractMultipleLinearRegression this data ^Integer nobs ^Integer nvars]
    (-> this (.newSampleData data nobs nvars))))

