(ns org.apache.commons.math4.stat.correlation.PearsonsCorrelation
  "Computes Pearson's product-moment correlation coefficients for pairs of arrays
  or columns of a matrix.

  The constructors that take RealMatrix or
  double[][] arguments generate correlation matrices.  The
  columns of the input matrices are assumed to represent variable values.
  Correlations are given by the formula

  cor(X, Y) = Σ[(xi - E(X))(yi - E(Y))] / [(n - 1)s(X)s(Y)]
  where E(X) is the mean of X, E(Y)
  is the mean of the Y values and s(X), s(Y) are standard deviations.

  To compute the correlation coefficient for a single pair of arrays, use PearsonsCorrelation()
  to construct an instance with no data and then correlation(double[], double[]).
  Correlation matrices can also be computed directly from an instance with no data using
  computeCorrelationMatrix(double[][]). In order to use getCorrelationMatrix(),
  getCorrelationPValues(),  or getCorrelationStandardErrors(); however, one of the
  constructors supplying data or a covariance matrix must be used to create the instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.correlation PearsonsCorrelation]))

(defn ->pearsons-correlation
  "Constructor.

  Create a PearsonsCorrelation from a covariance matrix. The correlation
   matrix is computed by scaling the covariance matrix.

  covariance-matrix - covariance matrix - `org.apache.commons.math4.linear.RealMatrix`
  number-of-observations - the number of observations in the dataset used to compute the covariance matrix - `int`"
  (^PearsonsCorrelation [^org.apache.commons.math4.linear.RealMatrix covariance-matrix ^Integer number-of-observations]
    (new PearsonsCorrelation covariance-matrix number-of-observations))
  (^PearsonsCorrelation [data]
    (new PearsonsCorrelation data))
  (^PearsonsCorrelation []
    (new PearsonsCorrelation )))

(defn get-correlation-matrix
  "Returns the correlation matrix.

   This method will return null if the argumentless constructor was used
   to create this instance, even if computeCorrelationMatrix(double[][])
   has been called before it is activated.

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^PearsonsCorrelation this]
    (-> this (.getCorrelationMatrix))))

(defn get-correlation-standard-errors
  "Returns a matrix of standard errors associated with the estimates
   in the correlation matrix.
   getCorrelationStandardErrors().getEntry(i,j) is the standard
   error associated with getCorrelationMatrix.getEntry(i,j)

   The formula used to compute the standard error is
   SEr = ((1 - r2) / (n - 2))1/2
   where r is the estimated correlation coefficient and
   n is the number of observations in the source dataset.

   To use this method, one of the constructors that supply an input
   matrix must have been used to create this instance.

  returns: matrix of correlation standard errors - `org.apache.commons.math4.linear.RealMatrix`

  throws: java.lang.NullPointerException - if this instance was created with no data"
  (^org.apache.commons.math4.linear.RealMatrix [^PearsonsCorrelation this]
    (-> this (.getCorrelationStandardErrors))))

(defn get-correlation-p-values
  "Returns a matrix of p-values associated with the (two-sided) null
   hypothesis that the corresponding correlation coefficient is zero.

   getCorrelationPValues().getEntry(i,j) is the probability
   that a random variable distributed as tn-2 takes
   a value with absolute value greater than or equal to
   |r|((n - 2) / (1 - r2))1/2

   The values in the matrix are sometimes referred to as the
   significance of the corresponding correlation coefficients.

   To use this method, one of the constructors that supply an input
   matrix must have been used to create this instance.

  returns: matrix of p-values - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if an error occurs estimating probabilities"
  (^org.apache.commons.math4.linear.RealMatrix [^PearsonsCorrelation this]
    (-> this (.getCorrelationPValues))))

(defn compute-correlation-matrix
  "Computes the correlation matrix for the columns of the
   input matrix, using correlation(double[], double[]).

   Throws MathIllegalArgumentException if the matrix does not have at least
   two columns and two rows.  Pairwise correlations are set to NaN if one
   of the correlates has zero variance.

  matrix - matrix with columns representing variables to correlate - `org.apache.commons.math4.linear.RealMatrix`

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the matrix does not contain sufficient data"
  (^org.apache.commons.math4.linear.RealMatrix [^PearsonsCorrelation this ^org.apache.commons.math4.linear.RealMatrix matrix]
    (-> this (.computeCorrelationMatrix matrix))))

(defn correlation
  "Computes the Pearson's product-moment correlation coefficient between two arrays.

   Throws MathIllegalArgumentException if the arrays do not have the same length
   or their common length is less than 2.  Returns NaN if either of the arrays
   has zero variance (i.e., if one of the arrays does not contain at least two distinct
   values).

  x-array - first data array - `double[]`
  y-array - second data array - `double[]`

  returns: Returns Pearson's correlation coefficient for the two arrays - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays lengths do not match"
  (^Double [^PearsonsCorrelation this x-array y-array]
    (-> this (.correlation x-array y-array))))

(defn covariance-to-correlation
  "Derives a correlation matrix from a covariance matrix.

   Uses the formula
   r(X,Y) = cov(X,Y)/s(X)s(Y) where
   r(·,·) is the correlation coefficient and
   s(·) means standard deviation.

  covariance-matrix - the covariance matrix - `org.apache.commons.math4.linear.RealMatrix`

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^PearsonsCorrelation this ^org.apache.commons.math4.linear.RealMatrix covariance-matrix]
    (-> this (.covarianceToCorrelation covariance-matrix))))

