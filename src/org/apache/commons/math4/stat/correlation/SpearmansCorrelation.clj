(ns org.apache.commons.math4.stat.correlation.SpearmansCorrelation
  "Spearman's rank correlation. This implementation performs a rank
  transformation on the input data and then computes PearsonsCorrelation
  on the ranked data.

  By default, ranks are computed using NaturalRanking with default
  strategies for handling NaNs and ties in the data (NaNs maximal, ties averaged).
  The ranking algorithm can be set using a constructor argument."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.correlation SpearmansCorrelation]))

(defn ->spearmans-correlation
  "Constructor.

  Create a SpearmansCorrelation with the given input data matrix
   and ranking algorithm.

  data-matrix - matrix of data with columns representing variables to correlate - `org.apache.commons.math4.linear.RealMatrix`
  ranking-algorithm - ranking algorithm - `org.apache.commons.math4.stat.ranking.RankingAlgorithm`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the provided RankingAlgorithm is of type NaturalRanking and uses a NaNStrategy.REMOVED strategy"
  (^SpearmansCorrelation [^org.apache.commons.math4.linear.RealMatrix data-matrix ^org.apache.commons.math4.stat.ranking.RankingAlgorithm ranking-algorithm]
    (new SpearmansCorrelation data-matrix ranking-algorithm))
  (^SpearmansCorrelation [^org.apache.commons.math4.stat.ranking.RankingAlgorithm ranking-algorithm]
    (new SpearmansCorrelation ranking-algorithm))
  (^SpearmansCorrelation []
    (new SpearmansCorrelation )))

(defn get-correlation-matrix
  "Calculate the Spearman Rank Correlation Matrix.

  returns: Spearman Rank Correlation Matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: java.lang.NullPointerException - if this instance was created with no data"
  (^org.apache.commons.math4.linear.RealMatrix [^SpearmansCorrelation this]
    (-> this (.getCorrelationMatrix))))

(defn get-rank-correlation
  "Returns a PearsonsCorrelation instance constructed from the
   ranked input data. That is,
   new SpearmansCorrelation(matrix).getRankCorrelation()
   is equivalent to
   new PearsonsCorrelation(rankTransform(matrix)) where
   rankTransform(matrix) is the result of applying the
   configured RankingAlgorithm to each of the columns of
   matrix.

   Returns null if this instance was created with no data.

  returns: PearsonsCorrelation among ranked column data - `org.apache.commons.math4.stat.correlation.PearsonsCorrelation`"
  (^org.apache.commons.math4.stat.correlation.PearsonsCorrelation [^SpearmansCorrelation this]
    (-> this (.getRankCorrelation))))

(defn compute-correlation-matrix
  "Computes the Spearman's rank correlation matrix for the columns of the
   input matrix.

  matrix - matrix with columns representing variables to correlate - `org.apache.commons.math4.linear.RealMatrix`

  returns: correlation matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^SpearmansCorrelation this ^org.apache.commons.math4.linear.RealMatrix matrix]
    (-> this (.computeCorrelationMatrix matrix))))

(defn correlation
  "Computes the Spearman's rank correlation coefficient between the two arrays.

  x-array - first data array - `double[]`
  y-array - second data array - `double[]`

  returns: Returns Spearman's rank correlation coefficient for the two arrays - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays lengths do not match"
  (^Double [^SpearmansCorrelation this x-array y-array]
    (-> this (.correlation x-array y-array))))

