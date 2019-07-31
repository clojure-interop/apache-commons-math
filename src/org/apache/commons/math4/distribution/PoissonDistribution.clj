(ns org.apache.commons.math4.distribution.PoissonDistribution
  "Implementation of the Poisson distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution PoissonDistribution]))

(defn ->poisson-distribution
  "Constructor.

  Creates a new Poisson distribution with specified mean, convergence
   criterion and maximum number of iterations.

  p - Poisson mean. - `double`
  epsilon - Convergence criterion for cumulative probabilities. - `double`
  max-iterations - the maximum number of iterations for cumulative probabilities. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if p <= 0."
  (^PoissonDistribution [^Double p ^Double epsilon ^Integer max-iterations]
    (new PoissonDistribution p epsilon max-iterations))
  (^PoissonDistribution [^Double p ^Double epsilon]
    (new PoissonDistribution p epsilon))
  (^PoissonDistribution [^Double p]
    (new PoissonDistribution p)))

(def *-default-max-iterations
  "Static Constant.

  Default maximum number of iterations for cumulative probability calculations.

  type: int"
  PoissonDistribution/DEFAULT_MAX_ITERATIONS)

(def *-default-epsilon
  "Static Constant.

  Default convergence criterion.

  type: double"
  PoissonDistribution/DEFAULT_EPSILON)

(defn normal-approximate-probability
  "Calculates the Poisson distribution function using a normal
   approximation. The N(mean, sqrt(mean)) distribution is used
   to approximate the Poisson distribution. The computation uses
   \"half-correction\" (evaluating the normal distribution function at
   x  0.5).

  x - Upper bound, inclusive. - `int`

  returns: the distribution function value calculated using a normal
   approximation. - `double`"
  (^Double [^PoissonDistribution this ^Integer x]
    (-> this (.normalApproximateProbability x))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.IntegerDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.IntegerDistribution$Sampler [^PoissonDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `int`

  returns: the value of the probability mass function at x - `double`"
  (^Double [^PoissonDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-mean
  "Get the mean for the distribution.

  returns: the mean for the distribution. - `double`"
  (^Double [^PoissonDistribution this]
    (-> this (.getMean))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

   For mean parameter p, the variance is p.

  returns: the variance (possibly Double.POSITIVE_INFINITY or
   Double.NaN if it is not defined) - `double`"
  (^Double [^PoissonDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is
   connected, i.e. whether all integers between the lower and upper bound of
   the support are included in the support.

   The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^PoissonDistribution this]
    (-> this (.isSupportConnected))))

(defn log-probability
  "For a random variable X whose values are distributed according to
   this distribution, this method returns log(P(X = x)), where
   log is the natural logarithm. In other words, this method
   represents the logarithm of the probability mass function (PMF) for the
   distribution. Note that due to the floating point precision and
   under/overflow issues, this method will for some distributions be more
   precise and faster than computing the logarithm of
   IntegerDistribution.probability(int).

   The default implementation simply computes the logarithm of probability(x).

  x - the point at which the PMF is evaluated - `int`

  returns: the logarithm of the value of the probability mass function at x - `double`"
  (^Double [^PoissonDistribution this ^Integer x]
    (-> this (.logProbability x))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in Z | P(X <= x) > 0}.

   The lower bound of the support is always 0 no matter the mean parameter.

  returns: lower bound of the support (always 0) - `int`"
  (^Integer [^PoissonDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

   The upper bound of the support is positive infinity,
   regardless of the parameter values. There is no integer infinity,
   so this method returns Integer.MAX_VALUE.

  returns: upper bound of the support (always Integer.MAX_VALUE for
   positive infinity) - `int`"
  (^Integer [^PoissonDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

   For mean parameter p, the mean is p.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^PoissonDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x).  In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `int`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^PoissonDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

