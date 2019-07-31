(ns org.apache.commons.math4.stat.inference.BinomialTest
  "Implements binomial test statistics.

  Exact test for the statistical significance of deviations from a
  theoretically expected distribution of observations into two categories."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference BinomialTest]))

(defn ->binomial-test
  "Constructor."
  (^BinomialTest []
    (new BinomialTest )))

(defn binomial-test
  "Returns whether the null hypothesis can be rejected with the given confidence level.

   Preconditions:

   Number of trials must be ≥ 0.
   Number of successes must be ≥ 0.
   Number of successes must be ≤ number of trials.
   Probability must be ≥ 0 and ≤ 1.

  number-of-trials - number of trials performed - `int`
  number-of-successes - number of successes observed - `int`
  probability - assumed probability of a single trial under the null hypothesis - `double`
  alternative-hypothesis - type of hypothesis being evaluated (one- or two-sided) - `org.apache.commons.math4.stat.inference.AlternativeHypothesis`
  alpha - significance level of the test - `double`

  returns: true if the null hypothesis can be rejected with confidence 1 - alpha - `boolean`

  throws: org.apache.commons.math4.exception.NotPositiveException - if numberOfTrials or numberOfSuccesses is negative"
  (^Boolean [^BinomialTest this ^Integer number-of-trials ^Integer number-of-successes ^Double probability ^org.apache.commons.math4.stat.inference.AlternativeHypothesis alternative-hypothesis ^Double alpha]
    (-> this (.binomialTest number-of-trials number-of-successes probability alternative-hypothesis alpha)))
  (^Double [^BinomialTest this ^Integer number-of-trials ^Integer number-of-successes ^Double probability ^org.apache.commons.math4.stat.inference.AlternativeHypothesis alternative-hypothesis]
    (-> this (.binomialTest number-of-trials number-of-successes probability alternative-hypothesis))))

