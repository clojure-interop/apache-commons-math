(ns org.apache.commons.math4.stat.inference.GTest
  "Implements G Test
  statistics.

  This is known in statistical genetics as the McDonald-Kreitman test.
  The implementation handles both known and unknown distributions.

  Two samples tests can be used when the distribution is unknown a priori
  but provided by one sample, or when the hypothesis under test is that the two
  samples come from the same underlying distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference GTest]))

(defn ->g-test
  "Constructor."
  (^GTest []
    (new GTest )))

(defn g
  "Computes the G statistic
   for Goodness of Fit comparing observed and expected
   frequency counts.

   This statistic can be used to perform a G test (Log-Likelihood Ratio
   Test) evaluating the null hypothesis that the observed counts follow the
   expected distribution.

   Preconditions:
   Expected counts must all be positive.
   Observed counts must all be ≥ 0.
   The observed and expected arrays must have the same length and their
   common length must be at least 2.

   If any of the preconditions are not met, a
   MathIllegalArgumentException is thrown.

   Note:This implementation rescales the
   expected array if necessary to ensure that the sum of the
   expected and observed counts are equal.

  expected - array of expected frequency counts - `double[]`
  observed - array of observed frequency counts - `long[]`

  returns: G-Test statistic - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if observed has negative entries"
  (^Double [^GTest this expected observed]
    (-> this (.g expected observed))))

(defn g-test
  "Performs a G-Test (Log-Likelihood Ratio Test) for goodness of fit
   evaluating the null hypothesis that the observed counts conform to the
   frequency distribution described by the expected counts, with
   significance level alpha. Returns true iff the null
   hypothesis can be rejected with 100 * (1 - alpha) percent confidence.

   Example: To test the hypothesis that
   observed follows expected at the 99% level,
   use
   gTest(expected, observed, 0.01)

   Returns true iff gTestGoodnessOfFitPValue(expected, observed) < alpha

   Preconditions:
   Expected counts must all be positive.
   Observed counts must all be ≥ 0.
   The observed and expected arrays must have the same length and their
   common length must be at least 2.
    0 < alpha < 0.5

   If any of the preconditions are not met, a
   MathIllegalArgumentException is thrown.

   Note:This implementation rescales the
   expected array if necessary to ensure that the sum of the
   expected and observed counts are equal.

  expected - array of expected frequency counts - `double[]`
  observed - array of observed frequency counts - `long[]`
  alpha - significance level of the test - `double`

  returns: true iff null hypothesis can be rejected with confidence 1 -
   alpha - `boolean`

  throws: org.apache.commons.math4.exception.NotPositiveException - if observed has negative entries"
  (^Boolean [^GTest this expected observed ^Double alpha]
    (-> this (.gTest expected observed alpha)))
  (^Double [^GTest this expected observed]
    (-> this (.gTest expected observed))))

(defn g-test-intrinsic
  "Returns the intrinsic (Hardy-Weinberg proportions) p-Value, as described
   in p64-69 of McDonald, J.H. 2009. Handbook of Biological Statistics
   (2nd ed.). Sparky House Publishing, Baltimore, Maryland.

    The probability returned is the tail probability beyond
   g(expected, observed)
   in the ChiSquare distribution with degrees of freedom two less than the
   common length of expected and observed.

  expected - array of expected frequency counts - `double[]`
  observed - array of observed frequency counts - `long[]`

  returns: p-value - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if observed has negative entries"
  (^Double [^GTest this expected observed]
    (-> this (.gTestIntrinsic expected observed))))

(defn g-data-sets-comparison
  "Computes a G (Log-Likelihood Ratio) two sample test statistic for
   independence comparing frequency counts in
   observed1 and observed2. The sums of frequency
   counts in the two samples are not required to be the same. The formula
   used to compute the test statistic is

   2 * totalSum * [H(rowSums)  H(colSums) - H(k)]

    where H is the

   Shannon Entropy of the random variable formed by viewing the elements
   of the argument array as incidence counts;
   k is a matrix with rows [observed1, observed2];
   rowSums, colSums are the row/col sums of k;
   and totalSum is the overall sum of all entries in k.

   This statistic can be used to perform a G test evaluating the null
   hypothesis that both observed counts are independent

    Preconditions:
   Observed counts must be non-negative.
   Observed counts for a specific bin must not both be zero.
   Observed counts for a specific sample must not all be  0.
   The arrays observed1 and observed2 must have
   the same length and their common length must be at least 2.

   If any of the preconditions are not met, a
   MathIllegalArgumentException is thrown.

  observed-1 - array of observed frequency counts of the first data set - `long[]`
  observed-2 - array of observed frequency counts of the second data set - `long[]`

  returns: G-Test statistic - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - the the lengths of the arrays do not match or their common length is less than 2"
  (^Double [^GTest this observed-1 observed-2]
    (-> this (.gDataSetsComparison observed-1 observed-2))))

(defn root-log-likelihood-ratio
  "Calculates the root log-likelihood ratio for 2 state Datasets. See
   gDataSetsComparison(long[], long[] ).

   Given two events A and B, let k11 be the number of times both events
   occur, k12 the incidence of B without A, k21 the count of A without B,
   and k22 the number of times neither A nor B occurs.  What is returned
   by this method is

   (sgn) sqrt(gValueDataSetsComparison({k11, k12}, {k21, k22})

   where sgn is -1 if k11 / (k11  k12) < k21 / (k21  k22));
   1 otherwise.

   Signed root LLR has two advantages over the basic LLR: a) it is positive
   where k11 is bigger than expected, negative where it is lower b) if there is
   no difference it is asymptotically normally distributed. This allows one
   to talk about \"number of standard deviations\" which is a more common frame
   of reference than the chi^2 distribution.

  k-11 - number of times the two events occurred together (AB) - `long`
  k-12 - number of times the second event occurred WITHOUT the first event (notA,B) - `long`
  k-21 - number of times the first event occurred WITHOUT the second event (A, notB) - `long`
  k-22 - number of times something else occurred (i.e. was neither of these events (notA, notB) - `long`

  returns: root log-likelihood ratio - `double`"
  (^Double [^GTest this ^Long k-11 ^Long k-12 ^Long k-21 ^Long k-22]
    (-> this (.rootLogLikelihoodRatio k-11 k-12 k-21 k-22))))

(defn g-test-data-sets-comparison
  "Performs a G-Test (Log-Likelihood Ratio Test) comparing two binned
   data sets. The test evaluates the null hypothesis that the two lists
   of observed counts conform to the same frequency distribution, with
   significance level alpha. Returns true iff the null
   hypothesis can be rejected  with 100 * (1 - alpha) percent confidence.

   See gDataSetsComparison(long[], long[]) for details
   on the formula used to compute the G (LLR) statistic used in the test and
   gTest(double[], long[]) for information on how
   the observed significance level is computed. The degrees of of freedom used
   to perform the test is one less than the common length of the input observed
   count arrays.

   Preconditions:
   Observed counts must be non-negative.
   Observed counts for a specific bin must not both be zero.
   Observed counts for a specific sample must not all be 0.
   The arrays observed1 and observed2 must
   have the same length and their common length must be at least 2.
   0 < alpha < 0.5

   If any of the preconditions are not met, a
   MathIllegalArgumentException is thrown.

  observed-1 - array of observed frequency counts of the first data set - `long[]`
  observed-2 - array of observed frequency counts of the second data set - `long[]`
  alpha - significance level of the test - `double`

  returns: true iff null hypothesis can be rejected with confidence 1 -
   alpha - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - the the length of the arrays does not match"
  (^Boolean [^GTest this observed-1 observed-2 ^Double alpha]
    (-> this (.gTestDataSetsComparison observed-1 observed-2 alpha)))
  (^Double [^GTest this observed-1 observed-2]
    (-> this (.gTestDataSetsComparison observed-1 observed-2))))

