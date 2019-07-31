(ns org.apache.commons.math4.stat.inference.TTest
  "An implementation for Student's t-tests.

  Tests can be:
  One-sample or two-sample
  One-sided or two-sided
  Paired or unpaired (for two-sample tests)
  Homoscedastic (equal variance assumption) or heteroscedastic
  (for two sample tests)
  Fixed significance level (boolean-valued) or returning p-values.


  Test statistics are available for all tests.  Methods including \"Test\" in
  in their names perform tests, all other methods return t-statistics.  Among
  the \"Test\" methods, double-valued methods return p-values;
  boolean-valued methods perform fixed significance level tests.
  Significance levels are always specified as numbers between 0 and 0.5
  (e.g. tests at the 95% level  use alpha=0.05).

  Input to tests can be either double[] arrays or
  StatisticalSummary instances.
  Uses commons-math TDistribution
  implementation to estimate exact p-values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference TTest]))

(defn ->t-test
  "Constructor."
  (^TTest []
    (new TTest )))

(defn paired-t
  "Computes a paired, 2-sample t-statistic based on the data in the input
   arrays.  The t-statistic returned is equivalent to what would be returned by
   computing the one-sample t-statistic t(double, double[]), with
   mu = 0 and the sample array consisting of the (signed)
   differences between corresponding entries in sample1 and
   sample2.

   Preconditions:
   The input arrays must have the same length and their common length
   must be at least 2.

  sample-1 - array of sample data values - `double[]`
  sample-2 - array of sample data values - `double[]`

  returns: t statistic - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the arrays are null"
  (^Double [^TTest this sample-1 sample-2]
    (-> this (.pairedT sample-1 sample-2))))

(defn paired-t-test
  "Performs a paired t-test evaluating the null hypothesis that the
   mean of the paired differences between sample1 and
   sample2 is 0 in favor of the two-sided alternative that the
   mean paired difference is not equal to 0, with significance level
   alpha.

   Returns true iff the null hypothesis can be rejected with
   confidence 1 - alpha.  To perform a 1-sided test, use
   alpha * 2

   Usage Note:
   The validity of the test depends on the assumptions of the parametric
   t-test procedure, as discussed

   here

   Preconditions:
   The input array lengths must be the same and their common length
   must be at least 2.

     0 < alpha < 0.5

  sample-1 - array of sample data values - `double[]`
  sample-2 - array of sample data values - `double[]`
  alpha - significance level of the test - `double`

  returns: true if the null hypothesis can be rejected with
   confidence 1 - alpha - `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the arrays are null"
  (^Boolean [^TTest this sample-1 sample-2 ^Double alpha]
    (-> this (.pairedTTest sample-1 sample-2 alpha)))
  (^Double [^TTest this sample-1 sample-2]
    (-> this (.pairedTTest sample-1 sample-2))))

(defn t
  "Computes a
   t statistic  given observed values and a comparison constant.

   This statistic can be used to perform a one sample t-test for the mean.

   Preconditions:
   The observed array length must be at least 2.

  mu - comparison constant - `double`
  observed - array of values - `double[]`

  returns: t statistic - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if observed is null"
  (^Double [^TTest this ^Double mu observed]
    (-> this (.t mu observed))))

(defn homoscedastic-t
  "Computes a 2-sample t statistic,  under the hypothesis of equal
   subpopulation variances.  To compute a t-statistic without the
   equal variances hypothesis, use t(double[], double[]).

   This statistic can be used to perform a (homoscedastic) two-sample
   t-test to compare sample means.

   The t-statistic is

       t = (m1 - m2) / (sqrt(1/n1 1/n2) sqrt(var))

   where n1 is the size of first sample;
    n2 is the size of second sample;
    m1 is the mean of first sample;
    m2 is the mean of second sample

  sample-1 - `double[]`
  sample-2 - `double[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException"
  (^Double [^TTest this sample-1 sample-2]
    (-> this (.homoscedasticT sample-1 sample-2))))

