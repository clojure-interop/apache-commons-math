(ns org.apache.commons.math4.stat.inference.ChiSquareTest
  "Implements Chi-Square test statistics.

  This implementation handles both known and unknown distributions.

  Two samples tests can be used when the distribution is unknown a priori
  but provided by one sample, or when the hypothesis under test is that the two
  samples come from the same underlying distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference ChiSquareTest]))

(defn ->chi-square-test
  "Constructor.

  Construct a ChiSquareTest"
  (^ChiSquareTest []
    (new ChiSquareTest )))

(defn chi-square
  "Computes the
   Chi-Square statistic comparing observed and expected
   frequency counts.

   This statistic can be used to perform a Chi-Square test evaluating the null
   hypothesis that the observed counts follow the expected distribution.

   Preconditions:
   Expected counts must all be positive.

   Observed counts must all be ≥ 0.

   The observed and expected arrays must have the same length and
   their common length must be at least 2.

   If any of the preconditions are not met, an
   IllegalArgumentException is thrown.
   Note: This implementation rescales the
   expected array if necessary to ensure that the sum of the
   expected and observed counts are equal.

  expected - array of expected frequency counts - `double[]`
  observed - array of observed frequency counts - `long[]`

  returns: chiSquare test statistic - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if observed has negative entries"
  (^Double [^ChiSquareTest this expected observed]
    (-> this (.chiSquare expected observed)))
  (^Double [^ChiSquareTest this counts]
    (-> this (.chiSquare counts))))

(defn chi-square-test
  "Performs a
   Chi-square goodness of fit test evaluating the null hypothesis that the
   observed counts conform to the frequency distribution described by the expected
   counts, with significance level alpha.  Returns true iff the null
   hypothesis can be rejected with 100 * (1 - alpha) percent confidence.

   Example:
   To test the hypothesis that observed follows
   expected at the 99% level, use
   chiSquareTest(expected, observed, 0.01)

   Preconditions:
   Expected counts must all be positive.

   Observed counts must all be ≥ 0.

   The observed and expected arrays must have the same length and
   their common length must be at least 2.
     0 < alpha < 0.5

   If any of the preconditions are not met, an
   IllegalArgumentException is thrown.
   Note: This implementation rescales the
   expected array if necessary to ensure that the sum of the
   expected and observed counts are equal.

  expected - array of expected frequency counts - `double[]`
  observed - array of observed frequency counts - `long[]`
  alpha - significance level of the test - `double`

  returns: true iff null hypothesis can be rejected with confidence
   1 - alpha - `boolean`

  throws: org.apache.commons.math4.exception.NotPositiveException - if observed has negative entries"
  (^Boolean [^ChiSquareTest this expected observed ^Double alpha]
    (-> this (.chiSquareTest expected observed alpha)))
  (^Double [^ChiSquareTest this expected observed]
    (-> this (.chiSquareTest expected observed)))
  (^Double [^ChiSquareTest this counts]
    (-> this (.chiSquareTest counts))))

(defn chi-square-data-sets-comparison
  "Computes a

   Chi-Square two sample test statistic comparing bin frequency counts
   in observed1 and observed2.  The
   sums of frequency counts in the two samples are not required to be the
   same.  The formula used to compute the test statistic is

   ∑[(K * observed1[i] - observed2[i]/K)2 / (observed1[i]  observed2[i])]
    where
   K = &sqrt;[&sum(observed2 / ∑(observed1)]

   This statistic can be used to perform a Chi-Square test evaluating the
   null hypothesis that both observed counts follow the same distribution.

   Preconditions:
   Observed counts must be non-negative.

   Observed counts for a specific bin must not both be zero.

   Observed counts for a specific sample must not all be 0.

   The arrays observed1 and observed2 must have
   the same length and their common length must be at least 2.

   If any of the preconditions are not met, an
   IllegalArgumentException is thrown.

  observed-1 - array of observed frequency counts of the first data set - `long[]`
  observed-2 - array of observed frequency counts of the second data set - `long[]`

  returns: chiSquare test statistic - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - the the length of the arrays does not match"
  (^Double [^ChiSquareTest this observed-1 observed-2]
    (-> this (.chiSquareDataSetsComparison observed-1 observed-2))))

(defn chi-square-test-data-sets-comparison
  "Performs a Chi-Square two sample test comparing two binned data
   sets. The test evaluates the null hypothesis that the two lists of
   observed counts conform to the same frequency distribution, with
   significance level alpha.  Returns true iff the null
   hypothesis can be rejected with 100 * (1 - alpha) percent confidence.

   See chiSquareDataSetsComparison(long[], long[]) for
   details on the formula used to compute the Chisquare statistic used
   in the test. The degrees of of freedom used to perform the test is
   one less than the common length of the input observed count arrays.

   Preconditions:
   Observed counts must be non-negative.

   Observed counts for a specific bin must not both be zero.

   Observed counts for a specific sample must not all be 0.

   The arrays observed1 and observed2 must
   have the same length and their common length must be at least 2.

     0 < alpha < 0.5

   If any of the preconditions are not met, an
   IllegalArgumentException is thrown.

  observed-1 - array of observed frequency counts of the first data set - `long[]`
  observed-2 - array of observed frequency counts of the second data set - `long[]`
  alpha - significance level of the test - `double`

  returns: true iff null hypothesis can be rejected with confidence
   1 - alpha - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - the the length of the arrays does not match"
  (^Boolean [^ChiSquareTest this observed-1 observed-2 ^Double alpha]
    (-> this (.chiSquareTestDataSetsComparison observed-1 observed-2 alpha)))
  (^Double [^ChiSquareTest this observed-1 observed-2]
    (-> this (.chiSquareTestDataSetsComparison observed-1 observed-2))))

