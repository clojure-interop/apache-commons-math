(ns org.apache.commons.math4.distribution.EmpiricalDistribution
  "Represents an
  empirical probability distribution -- a probability distribution derived
  from observed data without making any assumptions about the functional form
  of the population distribution that the data come from.

  An EmpiricalDistribution maintains data structures, called
  distribution digests, that describe empirical distributions and
  support the following operations:
  loading the distribution from a file of observed data values
  dividing the input data into \"bin ranges\" and reporting bin frequency
      counts (data for histogram)
  reporting univariate statistics describing the full set of data values
      as well as the observations within each bin
  generating random values from the distribution

  Applications can use EmpiricalDistribution to build grouped
  frequency histograms representing the input data or to generate random values
  \"like\" those in the input file -- i.e., the values generated will follow the
  distribution of the values in the file.

  The implementation uses what amounts to the

  Variable Kernel Method with Gaussian smoothing:
  Digesting the input file
  Pass the file once to compute min and max.
  Divide the range from min-max into binCount \"bins.\"
  Pass the data file again, computing bin counts and univariate
      statistics (mean, std dev.) for each of the bins
  Divide the interval (0,1) into subintervals associated with the bins,
      with the length of a bin's subinterval proportional to its count.
  Generating random values from the distribution
  Generate a uniformly distributed value in (0,1)
  Select the subinterval to which the value belongs.
  Generate a random Gaussian value with mean = mean of the associated
      bin and std dev = std dev of associated bin.

  EmpiricalDistribution implements the RealDistribution interface
  as follows.  Given x within the range of values in the dataset, let B
  be the bin containing x and let K be the within-bin kernel for B.  Let P(B-)
  be the sum of the probabilities of the bins below B and let K(B) be the
  mass of B under K (i.e., the integral of the kernel density over B).  Then
  set P(X < x) = P(B-)  P(B) * K(x) / K(B) where K(x) is the kernel distribution
  evaluated at x. This results in a cdf that matches the grouped frequency
  distribution at the bin endpoints and interpolates within bins using
  within-bin kernels.

 USAGE NOTES:
 The binCount is set by default to 1000.  A good rule of thumb
     is to set the bin count to approximately the length of the input file divided
     by 10.
 The input file must be a plain text file containing one valid numeric
     entry per line."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution EmpiricalDistribution]))

(defn ->empirical-distribution
  "Constructor.

  Creates a new EmpiricalDistribution with the specified bin count.

  bin-count - number of bins. Must be strictly positive. - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if binCount <= 0."
  (^EmpiricalDistribution [^Integer bin-count]
    (new EmpiricalDistribution bin-count))
  (^EmpiricalDistribution []
    (new EmpiricalDistribution )))

(def *-default-bin-count
  "Static Constant.

  Default bin count

  type: int"
  EmpiricalDistribution/DEFAULT_BIN_COUNT)

(defn get-bin-count
  "Returns the number of bins.

  returns: the number of bins. - `int`"
  (^Integer [^EmpiricalDistribution this]
    (-> this (.getBinCount))))

(defn loaded?
  "Property indicating whether or not the distribution has been loaded.

  returns: true if the distribution has been loaded - `boolean`"
  (^Boolean [^EmpiricalDistribution this]
    (-> this (.isLoaded))))

(defn create-sampler
  "Creates a sampler.

  rng - Generator of uniformly distributed numbers. - `org.apache.commons.rng.UniformRandomProvider`

  returns: a sampler that produces random numbers according this
   distribution. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`"
  (^org.apache.commons.math4.distribution.RealDistribution$Sampler [^EmpiricalDistribution this ^org.apache.commons.rng.UniformRandomProvider rng]
    (-> this (.createSampler rng))))

(defn probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X = x). In other
   words, this method represents the probability mass function (PMF)
   for the distribution.

  x - the point at which the PMF is evaluated - `double`

  returns: zero. - `double`"
  (^Double [^EmpiricalDistribution this ^Double x]
    (-> this (.probability x))))

(defn load
  "Computes the empirical distribution from the provided
   array of numbers.

  in - the input data array - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if in is null"
  ([^EmpiricalDistribution this in]
    (-> this (.load in))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
   distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
   for certain cases in TDistribution) or Double.NaN if it
   is not defined - `double`"
  (^Double [^EmpiricalDistribution this]
    (-> this (.getNumericalVariance))))

(defn get-upper-bounds
  "Returns a fresh copy of the array of upper bounds for the bins.
   Bins are:
   [min,upperBounds[0]],(upperBounds[0],upperBounds[1]],...,
    (upperBounds[binCount-2], upperBounds[binCount-1] = max].

   Note: In versions 1.0-2.0 of commons-math, this method
   incorrectly returned the array of probability generator upper
   bounds now returned by getGeneratorUpperBounds().

  returns: array of bin upper bounds - `double[]`"
  ([^EmpiricalDistribution this]
    (-> this (.getUpperBounds))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
   i.e. whether all values between the lower and upper bound of the support
   are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^EmpiricalDistribution this]
    (-> this (.isSupportConnected))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution. For a random
   variable X distributed according to this distribution, the
   returned value is

   inf{x in R | P(X<=x) >= p} for 0 < p <= 1,
   inf{x in R | P(X<=x) > 0} for p = 0.


   The default implementation returns

   RealDistribution.getSupportLowerBound() for p = 0,
   RealDistribution.getSupportUpperBound() for p = 1.


   Algorithm description:
   Find the smallest i such that the sum of the masses of the bins
    through i is at least p.

     Let K be the within-bin kernel distribution for bin i.
     Let K(B) be the mass of B under K.
     Let K(B-) be K evaluated at the lower endpoint of B (the combined
     mass of the bins below B under K).
     Let P(B) be the probability of bin i.
     Let P(B-) be the sum of the bin masses below bin i.
     Let pCrit = p - P(B-)
   Return the inverse of K evaluated at
      K(B-)  pCrit * K(B) / P(B)

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
   (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^EmpiricalDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
   value as inverseCumulativeProbability(0). In other words, this
   method must return
   inf {x in R | P(X <= x) > 0}.

  returns: lower bound of the support (might be
   Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^EmpiricalDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-bin-stats
  "Returns a List of SummaryStatistics instances containing
   statistics describing the values in each of the bins.  The list is
   indexed on the bin number.

  returns: List of bin statistics. - `java.util.List<org.apache.commons.math4.stat.descriptive.SummaryStatistics>`"
  (^java.util.List [^EmpiricalDistribution this]
    (-> this (.getBinStats))))

(defn get-generator-upper-bounds
  "Returns a fresh copy of the array of upper bounds of the subintervals
   of [0,1] used in generating data from the empirical distribution.
   Subintervals correspond to bins with lengths proportional to bin counts.

   Preconditions:
   the distribution must be loaded before invoking this method

   In versions 1.0-2.0 of commons-math, this array was (incorrectly) returned
   by getUpperBounds().

  returns: array of upper bounds of subintervals used in data generation - `double[]`

  throws: java.lang.NullPointerException - unless a load method has been called beforehand."
  ([^EmpiricalDistribution this]
    (-> this (.getGeneratorUpperBounds))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
   value as inverseCumulativeProbability(1). In other words, this
   method must return
   inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (might be
   Double.POSITIVE_INFINITY) - `double`"
  (^Double [^EmpiricalDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-sample-stats
  "Returns a StatisticalSummary describing this distribution.
   Preconditions:
   the distribution must be loaded before invoking this method

  returns: the sample statistics - `org.apache.commons.math4.stat.descriptive.StatisticalSummary`

  throws: java.lang.IllegalStateException - if the distribution has not been loaded"
  (^org.apache.commons.math4.stat.descriptive.StatisticalSummary [^EmpiricalDistribution this]
    (-> this (.getSampleStats))))

(defn density
  "Returns the probability density function (PDF) of this distribution
   evaluated at the specified point x. In general, the PDF is
   the derivative of the CDF.
   If the derivative does not exist at x, then an appropriate
   replacement should be returned, e.g. Double.POSITIVE_INFINITY,
   Double.NaN, or  the limit inferior or limit superior of the
   difference quotient.

   Returns the kernel density normalized so that its integral over each bin
   equals the bin mass.

   Algorithm description:
   Find the bin B that x belongs to.
   Compute K(B) = the mass of B with respect to the within-bin kernel (i.e., the
   integral of the kernel density over B).
   Return k(x) * P(B) / K(B), where k is the within-bin kernel density
   and P(B) is the mass of B.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^EmpiricalDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
   distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^EmpiricalDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
   to this distribution, this method returns P(X <= x). In other
   words, this method represents the (cumulative) distribution function
   (CDF) for this distribution.

   Algorithm description:
   Find the bin B that x belongs to.
   Compute P(B) = the mass of B and P(B-) = the combined mass of the bins below B.
   Compute K(B) = the probability mass of B with respect to the within-bin kernel
   and K(B-) = the kernel distribution evaluated at the lower endpoint of B
   Return P(B-)  P(B) * [K(x) - K(B-)] / K(B) where
   K(x) is the within-bin kernel distribution function evaluated at x.
   If K is a constant distribution, we return P(B-)  P(B) (counting the full
   mass of B).

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
   distribution takes a value less than or equal to x - `double`"
  (^Double [^EmpiricalDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

