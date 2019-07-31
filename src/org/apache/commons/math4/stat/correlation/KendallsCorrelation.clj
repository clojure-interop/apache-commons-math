(ns org.apache.commons.math4.stat.correlation.KendallsCorrelation
  "Implementation of Kendall's Tau-b rank correlation.

  A pair of observations (x1, y1) and
  (x2, y2) are considered concordant if
  x1 < x2 and y1 < y2
  or x2 < x1 and y2 < y1.
  The pair is discordant if x1 < x2 and
  y2 < y1 or x2 < x1 and
  y1 < y2.  If either x1 = x2
  or y1 = y2, the pair is neither concordant nor
  discordant.

  Kendall's Tau-b is defined as:


  taub = (nc - nd) / sqrt((n0 - n1) * (n0 - n2))

  where:

      n0 = n * (n - 1) / 2
      nc = Number of concordant pairs
      nd = Number of discordant pairs
      n1 = sum of ti * (ti - 1) / 2 for all i
      n2 = sum of uj * (uj - 1) / 2 for all j
      ti = Number of tied values in the ith group of ties in x
      uj = Number of tied values in the jth group of ties in y


  This implementation uses the O(n log n) algorithm described in
  William R. Knight's 1966 paper \"A Computer Method for Calculating
  Kendall's Tau with Ungrouped Data\" in the Journal of the American
  Statistical Association."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.correlation KendallsCorrelation]))

(defn ->kendalls-correlation
  "Constructor.

  Create a KendallsCorrelation from a rectangular array
   whose columns represent values of variables to be correlated.

  data - rectangular array with columns representing variables - `double[][]`

  throws: java.lang.IllegalArgumentException - if the input data array is not rectangular with at least two rows and two columns."
  (^KendallsCorrelation [data]
    (new KendallsCorrelation data))
  (^KendallsCorrelation []
    (new KendallsCorrelation )))

(defn get-correlation-matrix
  "Returns the correlation matrix.

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^KendallsCorrelation this]
    (-> this (.getCorrelationMatrix))))

(defn compute-correlation-matrix
  "Computes the Kendall's Tau rank correlation matrix for the columns of
   the input matrix.

  matrix - matrix with columns representing variables to correlate - `org.apache.commons.math4.linear.RealMatrix`

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^KendallsCorrelation this ^org.apache.commons.math4.linear.RealMatrix matrix]
    (-> this (.computeCorrelationMatrix matrix))))

(defn correlation
  "Computes the Kendall's Tau rank correlation coefficient between the two arrays.

  x-array - first data array - `double[]`
  y-array - second data array - `double[]`

  returns: Returns Kendall's Tau rank correlation coefficient for the two arrays - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays lengths do not match"
  (^Double [^KendallsCorrelation this x-array y-array]
    (-> this (.correlation x-array y-array))))

