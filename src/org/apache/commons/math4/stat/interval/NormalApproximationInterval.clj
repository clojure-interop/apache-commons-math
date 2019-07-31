(ns org.apache.commons.math4.stat.interval.NormalApproximationInterval
  "Implements the normal approximation method for creating a binomial proportion confidence interval."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.interval NormalApproximationInterval]))

(defn ->normal-approximation-interval
  "Constructor."
  (^NormalApproximationInterval []
    (new NormalApproximationInterval )))

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
           probability confidenceLevel - `org.apache.commons.math4.stat.interval.ConfidenceInterval`"
  (^org.apache.commons.math4.stat.interval.ConfidenceInterval [^NormalApproximationInterval this ^Integer number-of-trials ^Integer number-of-successes ^Double confidence-level]
    (-> this (.createInterval number-of-trials number-of-successes confidence-level))))

