(ns org.apache.commons.math4.stat.correlation.StorelessCovariance
  "Covariance implementation that does not require input data to be
  stored in memory. The size of the covariance matrix is specified in the
  constructor. Specific elements of the matrix are incrementally updated with
  calls to incrementRow() or increment Covariance().

  This class is based on a paper written by Philippe Pébay:

  Formulas for Robust, One-Pass Parallel Computation of Covariances and
  Arbitrary-Order Statistical Moments, 2008, Technical Report SAND2008-6212,
  Sandia National Laboratories.

  Note: the underlying covariance matrix is symmetric, thus only the
  upper triangular part of the matrix is stored and updated each increment."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.correlation StorelessCovariance]))

(defn ->storeless-covariance
  "Constructor.

  Create a covariance matrix with a given number of rows and columns and the
   indicated bias correction.

  dim - the dimension of the covariance matrix - `int`
  bias-corrected - if true the covariance estimate is corrected for bias, i.e. n-1 in the denominator, otherwise there is no bias correction, i.e. n in the denominator. - `boolean`"
  (^StorelessCovariance [^Integer dim ^Boolean bias-corrected]
    (new StorelessCovariance dim bias-corrected))
  (^StorelessCovariance [^Integer dim]
    (new StorelessCovariance dim)))

(defn get-covariance
  "Get the covariance for an individual element of the covariance matrix.

  x-index - row index in the covariance matrix - `int`
  y-index - column index in the covariance matrix - `int`

  returns: the covariance of the given element - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the number of observations in the cell is < 2"
  (^Double [^StorelessCovariance this ^Integer x-index ^Integer y-index]
    (-> this (.getCovariance x-index y-index))))

(defn increment
  "Increment the covariance matrix with one row of data.

  data - array representing one row of data. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of rowData does not match with the covariance matrix"
  ([^StorelessCovariance this data]
    (-> this (.increment data))))

(defn append
  "Appends sc to this, effectively aggregating the computations in sc
   with this.  After invoking this method, covariances returned should be close
   to what would have been obtained by performing all of the increment(double[])
   operations in sc directly on this.

  sc - externally computed StorelessCovariance to add to this - `org.apache.commons.math4.stat.correlation.StorelessCovariance`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of sc does not match this"
  ([^StorelessCovariance this ^org.apache.commons.math4.stat.correlation.StorelessCovariance sc]
    (-> this (.append sc))))

(defn get-covariance-matrix
  "Returns the covariance matrix

  returns: covariance matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the number of observations in a cell is < 2"
  (^org.apache.commons.math4.linear.RealMatrix [^StorelessCovariance this]
    (-> this (.getCovarianceMatrix))))

(defn get-data
  "Return the covariance matrix as two-dimensional array.

  returns: a two-dimensional double array of covariance values - `double[][]`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the number of observations for a cell is < 2"
  ([^StorelessCovariance this]
    (-> this (.getData))))

(defn get-n
  "This Covariance method is not supported by a StorelessCovariance,
   since the number of bivariate observations does not have to be the same for different
   pairs of covariates - i.e., N as defined in Covariance.getN() is undefined.

  returns: nothing as this implementation always throws a
   MathUnsupportedOperationException - `int`

  throws: org.apache.commons.math4.exception.MathUnsupportedOperationException - in all cases"
  (^Integer [^StorelessCovariance this]
    (-> this (.getN))))

