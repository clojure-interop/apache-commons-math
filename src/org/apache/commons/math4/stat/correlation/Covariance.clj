(ns org.apache.commons.math4.stat.correlation.Covariance
  "Computes covariances for pairs of arrays or columns of a matrix.

  The constructors that take RealMatrix or
  double[][] arguments generate covariance matrices.  The
  columns of the input matrices are assumed to represent variable values.

  The constructor argument biasCorrected determines whether or
  not computed covariances are bias-corrected.

  Unbiased covariances are given by the formula
  cov(X, Y) = Σ[(xi - E(X))(yi - E(Y))] / (n - 1)
  where E(X) is the mean of X and E(Y)
  is the mean of the Y values.

  Non-bias-corrected estimates use n in place of n - 1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.correlation Covariance]))

(defn ->covariance
  "Constructor.

  Create a Covariance matrix from a rectangular array
   whose columns represent covariates.

   The biasCorrected parameter determines whether or not
   covariance estimates are bias-corrected.

   The input array must be rectangular with at least one column
   and two rows.

  data - rectangular array with columns representing covariates - `double[][]`
  bias-corrected - true means covariances are bias-corrected - `boolean`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the input data array is not rectangular with at least two rows and one column."
  (^Covariance [data ^Boolean bias-corrected]
    (new Covariance data bias-corrected))
  (^Covariance [data]
    (new Covariance data))
  (^Covariance []
    (new Covariance )))

(defn get-covariance-matrix
  "Returns the covariance matrix

  returns: covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^Covariance this]
    (-> this (.getCovarianceMatrix))))

(defn get-n
  "Returns the number of observations (length of covariate vectors)

  returns: number of observations - `int`"
  (^Integer [^Covariance this]
    (-> this (.getN))))

(defn covariance
  "Computes the covariance between the two arrays.

   Array lengths must match and the common length must be at least 2.

  x-array - first data array - `double[]`
  y-array - second data array - `double[]`
  bias-corrected - if true, returned value will be bias-corrected - `boolean`

  returns: returns the covariance for the two arrays - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the arrays lengths do not match or there is insufficient data"
  (^Double [^Covariance this x-array y-array ^Boolean bias-corrected]
    (-> this (.covariance x-array y-array bias-corrected)))
  (^Double [^Covariance this x-array y-array]
    (-> this (.covariance x-array y-array))))

