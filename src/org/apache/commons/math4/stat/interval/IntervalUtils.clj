(ns org.apache.commons.math4.stat.interval.IntervalUtils
  "Factory methods to generate confidence intervals for a binomial proportion.
  The supported methods are:

  Agresti-Coull interval
  Clopper-Pearson method (exact method)
  Normal approximation (based on central limit theorem)
  Wilson score interval"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.interval IntervalUtils]))

(defn *get-agresti-coull-interval
  "Create an Agresti-Coull binomial confidence interval for the true
   probability of success of an unknown binomial distribution with the given
   observed number of trials, successes and confidence level.

  number-of-trials - number of trials - `int`
  number-of-successes - number of successes - `int`
  confidence-level - desired probability that the true probability of success falls within the returned interval - `double`

  returns: Confidence interval containing the probability of success with
           probability confidenceLevel - `org.apache.commons.math4.stat.interval.ConfidenceInterval`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numberOfTrials <= 0."
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (IntervalUtils/getAgrestiCoullInterval number-of-trials number-of-successes confidence-level)))

(defn *get-clopper-pearson-interval
  "Create a Clopper-Pearson binomial confidence interval for the true
   probability of success of an unknown binomial distribution with the given
   observed number of trials, successes and confidence level.

   Preconditions:

   numberOfTrials must be positive
   numberOfSuccesses may not exceed numberOfTrials
   confidenceLevel must be strictly between 0 and 1 (exclusive)

  number-of-trials - number of trials - `int`
  number-of-successes - number of successes - `int`
  confidence-level - desired probability that the true probability of success falls within the returned interval - `double`

  returns: Confidence interval containing the probability of success with
           probability confidenceLevel - `org.apache.commons.math4.stat.interval.ConfidenceInterval`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numberOfTrials <= 0."
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (IntervalUtils/getClopperPearsonInterval number-of-trials number-of-successes confidence-level)))

(defn *get-normal-approximation-interval
  "Create a binomial confidence interval for the true probability of success
   of an unknown binomial distribution with the given observed number of
   trials, successes and confidence level using the Normal approximation to
   the binomial distribution.

  number-of-trials - number of trials - `int`
  number-of-successes - number of successes - `int`
  confidence-level - desired probability that the true probability of success falls within the interval - `double`

  returns: Confidence interval containing the probability of success with
           probability confidenceLevel - `org.apache.commons.math4.stat.interval.ConfidenceInterval`"
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (IntervalUtils/getNormalApproximationInterval number-of-trials number-of-successes confidence-level)))

(defn *get-wilson-score-interval
  "Create a Wilson score binomial confidence interval for the true
   probability of success of an unknown binomial distribution with the given
   observed number of trials, successes and confidence level.

  number-of-trials - number of trials - `int`
  number-of-successes - number of successes - `int`
  confidence-level - desired probability that the true probability of success falls within the returned interval - `double`

  returns: Confidence interval containing the probability of success with
           probability confidenceLevel - `org.apache.commons.math4.stat.interval.ConfidenceInterval`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numberOfTrials <= 0."
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (IntervalUtils/getWilsonScoreInterval number-of-trials number-of-successes confidence-level)))

