(ns org.apache.commons.math4.stat.interval.ConfidenceInterval
  "Represents an interval estimate of a population parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.interval ConfidenceInterval]))

(defn ->confidence-interval
  "Constructor.

  Create a confidence interval with the given bounds and confidence level.

   Preconditions:

   lower must be strictly less than upper
   confidenceLevel must be strictly between 0 and 1 (exclusive)

  lower-bound - lower endpoint of the interval - `double`
  upper-bound - upper endpoint of the interval - `double`
  confidence-level - coverage probability - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the preconditions are not met"
  (^ConfidenceInterval [^Double lower-bound ^Double upper-bound ^Double confidence-level]
    (new ConfidenceInterval lower-bound upper-bound confidence-level)))

(defn get-lower-bound
  "returns: the lower endpoint of the interval - `double`"
  (^Double [^ConfidenceInterval this]
    (-> this (.getLowerBound))))

(defn get-upper-bound
  "returns: the upper endpoint of the interval - `double`"
  (^Double [^ConfidenceInterval this]
    (-> this (.getUpperBound))))

(defn get-confidence-level
  "returns: the asserted probability that the interval contains the
           population parameter - `double`"
  (^Double [^ConfidenceInterval this]
    (-> this (.getConfidenceLevel))))

(defn to-string
  "returns: String representation of the confidence interval - `java.lang.String`"
  (^java.lang.String [^ConfidenceInterval this]
    (-> this (.toString))))

