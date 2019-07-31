(ns org.apache.commons.math4.distribution.EnumeratedDistribution
  "A generic implementation of a

  discrete probability distribution (Wikipedia) over a finite sample space,
  based on an enumerated list of <value, probability> pairs.  Input probabilities must all be non-negative,
  but zero values are allowed and their sum does not have to equal one. Constructors will normalize input
  probabilities to make them sum to one.

  The list of  pairs does not, strictly speaking, have to be a function and it can
  contain null values.  The pmf created by the constructor will combine probabilities of equal values and
  will treat null values as equal.  For example, if the list of pairs <\"dog\", 0.2>, <null, 0.1>,
  <\"pig\", 0.2>, <\"dog\", 0.1>, <null, 0.4> is provided to the constructor, the resulting
  pmf will assign mass of 0.5 to null, 0.3 to \"dog\" and 0.2 to null."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution EnumeratedDistribution]))

(defn ->enumerated-distribution
  "Constructor.

  Create an enumerated distribution using the given random number generator
   and probability mass function enumeration.

  pmf - probability mass function enumerated as a list of <T, probability> pairs. - `java.util.List`

  throws: org.apache.commons.math4.exception.NotPositiveException - if any of the probabilities are negative."
  (^EnumeratedDistribution [^java.util.List pmf]
    (new EnumeratedDistribution pmf)))

(defn get-pmf
  "Return the probability mass function as a list of  pairs.

   Note that if duplicate and / or null values were provided to the constructor
   when creating this EnumeratedDistribution, the returned list will contain these
   values.  If duplicates values exist, what is returned will not represent
   a pmf (i.e., it is up to the caller to consolidate duplicate mass points).

  returns: the probability mass function. - `java.util.List<org.apache.commons.math4.util.Pair<T,java.lang.Double>>`"
  (^java.util.List [^EnumeratedDistribution this]
    (-> this (.getPmf))))

(defn create-sampler
  "Creates a EnumeratedDistribution.Sampler.

  rng - Random number generator. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a new sampler instance. - `org.apache.commons.math4.distribution.EnumeratedDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.EnumeratedDistribution$Sampler [^EnumeratedDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

