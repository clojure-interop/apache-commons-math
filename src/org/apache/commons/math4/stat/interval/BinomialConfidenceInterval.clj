(ns org.apache.commons.math4.stat.interval.BinomialConfidenceInterval
  "Interface to generate confidence intervals for a binomial proportion."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.interval BinomialConfidenceInterval]))

(defn create-interval
  "Create a confidence interval for the true probability of success
   of an unknown binomial distribution with the given observed number
   of trials, successes and confidence level.

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
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^BinomialConfidenceInterval this ^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (-> this (.createInterval number-of-trials number-of-successes confidence-level))))

