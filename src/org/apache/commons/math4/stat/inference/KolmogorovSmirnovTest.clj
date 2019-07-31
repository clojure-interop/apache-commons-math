(ns org.apache.commons.math4.stat.inference.KolmogorovSmirnovTest
  "Implementation of the
  Kolmogorov-Smirnov (K-S) test for equality of continuous distributions.

  The K-S test uses a statistic based on the maximum deviation of the empirical distribution of
  sample data points from the distribution expected under the null hypothesis. For one-sample tests
  evaluating the null hypothesis that a set of sample data points follow a given distribution, the
  test statistic is \\(D_n=\\sup_x |F_n(x)-F(x)|\\), where \\(F\\) is the expected distribution and
  \\(F_n\\) is the empirical distribution of the \\(n\\) sample data points. The distribution of
  \\(D_n\\) is estimated using a method based on [1] with certain quick decisions for extreme values
  given in [2].


  Two-sample tests are also supported, evaluating the null hypothesis that the two samples
  x and y come from the same underlying distribution. In this case, the test
  statistic is \\(D_{n,m}=\\sup_t | F_n(t)-F_m(t)|\\) where \\(n\\) is the length of x, \\(m\\) is
  the length of y, \\(F_n\\) is the empirical distribution that puts mass \\(1/n\\) at each of
  the values in x and \\(F_m\\) is the empirical distribution of the y values. The
  default 2-sample test method, kolmogorovSmirnovTest(double[], double[]) works as
  follows:

  For small samples (where the product of the sample sizes is less than
  10000), the method presented in [4] is used to compute the
  exact p-value for the 2-sample test.
  When the product of the sample sizes exceeds 10000, the asymptotic
  distribution of \\(D_{n,m}\\) is used. See approximateP(double, int, int) for details on
  the approximation.

  If the product of the sample sizes is less than 10000 and the sample
  data contains ties, random jitter is added to the sample data to break ties before applying
  the algorithm above. Alternatively, the bootstrap(double[], double[], int, boolean)
  method, modeled after ks.boot
  in the R Matching package [3], can be used if ties are known to be present in the data.


  In the two-sample case, \\(D_{n,m}\\) has a discrete distribution. This makes the p-value
  associated with the null hypothesis \\(H_0 : D_{n,m} \\ge d \\) differ from \\(H_0 : D_{n,m} > d \\)
  by the mass of the observed value \\(d\\). To distinguish these, the two-sample tests use a boolean
  strict parameter. This parameter is ignored for large samples.


  The methods used by the 2-sample default implementation are also exposed directly:

  exactP(double, int, int, boolean) computes exact 2-sample p-values
  approximateP(double, int, int) uses the asymptotic distribution The boolean
  arguments in the first two methods allow the probability used to estimate the p-value to be
  expressed using strict or non-strict inequality. See
  kolmogorovSmirnovTest(double[], double[], boolean).



  References:

  [1]  Evaluating Kolmogorov's Distribution by
  George Marsaglia, Wai Wan Tsang, and Jingbo Wang
  [2]  Computing the Two-Sided Kolmogorov-Smirnov
  Distribution by Richard Simard and Pierre L'Ecuyer
  [3] Jasjeet S. Sekhon. 2011.
  Multivariate and Propensity Score Matching Software with Automated Balance Optimization:
  The Matching package for R Journal of Statistical Software, 42(7): 1-52.
  [4] Wilcox, Rand. 2012. Introduction to Robust Estimation and Hypothesis Testing,
  Chapter 5, 3rd Ed. Academic Press.


  Note that [1] contains an error in computing h, refer to MATH-437 for details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference KolmogorovSmirnovTest]))

(defn ->kolmogorov-smirnov-test
  "Constructor.

  Deprecated.

  source - random data generator used by monteCarloP(double, int, int, boolean, int) - `org.apache.commons.rng.RandomSource`
  seed - Seed. - `long`"
  (^KolmogorovSmirnovTest [^org.apache.commons.rng.RandomSource source ^Long seed]
    (new KolmogorovSmirnovTest source seed))
  (^KolmogorovSmirnovTest []
    (new KolmogorovSmirnovTest )))

(defn bootstrap
  "Estimates the p-value of a two-sample
    Kolmogorov-Smirnov test
   evaluating the null hypothesis that x and y are samples drawn from the same
   probability distribution. This method estimates the p-value by repeatedly sampling sets of size
   x.length and y.length from the empirical distribution of the combined sample.
   When strict is true, this is equivalent to the algorithm implemented in the R function
   ks.boot, described in

   Jasjeet S. Sekhon. 2011. 'Multivariate and Propensity Score Matching
   Software with Automated Balance Optimization: The Matching package for R.'
   Journal of Statistical Software, 42(7): 1-52.

  x - first sample - `double[]`
  y - second sample - `double[]`
  iterations - number of bootstrap resampling iterations - `int`
  strict - whether or not the null hypothesis is expressed as a strict inequality - `boolean`

  returns: estimated p-value - `double`"
  (^Double [^KolmogorovSmirnovTest this x y ^Integer iterations ^Boolean strict]
    (-> this (.bootstrap x y iterations strict)))
  (^Double [^KolmogorovSmirnovTest this x y ^Integer iterations]
    (-> this (.bootstrap x y iterations))))

(defn cdf
  "Calculates P(D_n < d) using method described in [1] with quick decisions for extreme
   values given in [2] (see above).

  d - statistic - `double`
  n - sample size - `int`
  exact - whether the probability should be calculated exact using BigFraction everywhere at the expense of very slow execution time, or if double should be used convenient places to gain speed. Almost never choose true in real applications unless you are very sure; true is almost solely for verification purposes. - `boolean`

  returns: \\(P(D_n < d)\\) - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if algorithm fails to convert h to a BigFraction in expressing d as \\((k - h) / m\\) for integer k, m and \\(0 \\le h < 1\\)."
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n ^Boolean exact]
    (-> this (.cdf d n exact)))
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n]
    (-> this (.cdf d n))))

(defn monte-carlo-p
  "Uses Monte Carlo simulation to approximate \\(P(D_{n,m} > d)\\) where \\(D_{n,m}\\) is the
   2-sample Kolmogorov-Smirnov statistic. See
   kolmogorovSmirnovStatistic(double[], double[]) for the definition of \\(D_{n,m}\\).

   The simulation generates iterations random partitions of m  n into an
   n set and an m set, computing \\(D_{n,m}\\) for each partition and returning
   the proportion of values that are greater than d, or greater than or equal to
   d if strict is false.

  d - D-statistic value - `double`
  n - first sample size - `int`
  m - second sample size - `int`
  strict - whether or not the probability to compute is expressed as a strict inequality - `boolean`
  iterations - number of random partitions to generate - `int`

  returns: proportion of randomly generated m-n partitions of m  n that result in \\(D_{n,m}\\)
           greater than (resp. greater than or equal to) d - `double`"
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n ^Integer m ^Boolean strict ^Integer iterations]
    (-> this (.monteCarloP d n m strict iterations))))

(defn ks-sum
  "Computes \\( 1  2 \\sum_{i=1}^\\infty (-1)^i e^{-2 i^2 t^2} \\) stopping when successive partial
   sums are within tolerance of one another, or when maxIterations partial sums
   have been computed. If the sum does not converge before maxIterations iterations a
   TooManyIterationsException is thrown.

  t - argument - `double`
  tolerance - Cauchy criterion for partial sums - `double`
  max-iterations - maximum number of partial sums to compute - `int`

  returns: Kolmogorov sum evaluated at t - `double`

  throws: org.apache.commons.math4.exception.TooManyIterationsException - if the series does not converge"
  (^Double [^KolmogorovSmirnovTest this ^Double t ^Double tolerance ^Integer max-iterations]
    (-> this (.ksSum t tolerance max-iterations))))

(defn cdf-exact
  "Calculates P(D_n < d). The result is exact in the sense that BigFraction/BigReal is
   used everywhere at the expense of very slow execution time. Almost never choose this in real
   applications unless you are very sure; this is almost solely for verification purposes.
   Normally, you would choose cdf(double, int). See the class
   javadoc for definitions and algorithm description.

  d - statistic - `double`
  n - sample size - `int`

  returns: \\(P(D_n < d)\\) - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the algorithm fails to convert h to a BigFraction in expressing d as \\((k - h) / m\\) for integer k, m and \\(0 \\le h < 1\\)"
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n]
    (-> this (.cdfExact d n))))

(defn pelz-good
  "Computes the Pelz-Good approximation for \\(P(D_n < d)\\) as described in [2] in the class javadoc.

  d - value of d-statistic (x in [2]) - `double`
  n - sample size - `int`

  returns: \\(P(D_n < d)\\) - `double`"
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n]
    (-> this (.pelzGood d n))))

(defn kolmogorov-smirnov-test
  "Computes the p-value, or observed significance level, of a one-sample  Kolmogorov-Smirnov test
   evaluating the null hypothesis that data conforms to distribution. If
   exact is true, the distribution used to compute the p-value is computed using
   extended precision. See cdfExact(double, int).

  distribution - reference distribution - `org.apache.commons.math4.distribution.RealDistribution`
  data - sample being being evaluated - `double[]`
  exact - whether or not to force exact computation of the p-value - `boolean`

  returns: the p-value associated with the null hypothesis that data is a sample from
           distribution - `double`

  throws: org.apache.commons.math4.exception.InsufficientDataException - if data does not have length at least 2"
  (^Double [^KolmogorovSmirnovTest this ^org.apache.commons.math4.distribution.RealDistribution distribution data ^Boolean exact]
    (-> this (.kolmogorovSmirnovTest distribution data exact)))
  (^Double [^KolmogorovSmirnovTest this x y]
    (-> this (.kolmogorovSmirnovTest x y))))

(defn approximate-p
  "Uses the Kolmogorov-Smirnov distribution to approximate \\(P(D_{n,m} > d)\\) where \\(D_{n,m}\\)
   is the 2-sample Kolmogorov-Smirnov statistic. See
   kolmogorovSmirnovStatistic(double[], double[]) for the definition of \\(D_{n,m}\\).

   Specifically, what is returned is \\(1 - k(d \\sqrt{mn / (m  n)})\\) where \\(k(t) = 1  2
   \\sum_{i=1}^\\infty (-1)^i e^{-2 i^2 t^2}\\). See ksSum(double, double, int) for
   details on how convergence of the sum is determined. This implementation passes ksSum
   1.0E-20 as tolerance and
   100000 as maxIterations.

  d - D-statistic value - `double`
  n - first sample size - `int`
  m - second sample size - `int`

  returns: approximate probability that a randomly selected m-n partition of m  n generates
           \\(D_{n,m}\\) greater than d - `double`"
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n ^Integer m]
    (-> this (.approximateP d n m))))

(defn kolmogorov-smirnov-statistic
  "Computes the one-sample Kolmogorov-Smirnov test statistic, \\(D_n=\\sup_x |F_n(x)-F(x)|\\) where
   \\(F\\) is the distribution (cdf) function associated with distribution, \\(n\\) is the
   length of data and \\(F_n\\) is the empirical distribution that puts mass \\(1/n\\) at
   each of the values in data.

  distribution - reference distribution - `org.apache.commons.math4.distribution.RealDistribution`
  data - sample being evaluated - `double[]`

  returns: Kolmogorov-Smirnov statistic \\(D_n\\) - `double`

  throws: org.apache.commons.math4.exception.InsufficientDataException - if data does not have length at least 2"
  (^Double [^KolmogorovSmirnovTest this ^org.apache.commons.math4.distribution.RealDistribution distribution data]
    (-> this (.kolmogorovSmirnovStatistic distribution data))))

(defn exact-p
  "Computes \\(P(D_{n,m} > d)\\) if strict is true; otherwise \\(P(D_{n,m} \\ge
   d)\\), where \\(D_{n,m}\\) is the 2-sample Kolmogorov-Smirnov statistic. See
   kolmogorovSmirnovStatistic(double[], double[]) for the definition of \\(D_{n,m}\\).

   The returned probability is exact, implemented by unwinding the recursive function
   definitions presented in [4] (class javadoc).

  d - D-statistic value - `double`
  n - first sample size - `int`
  m - second sample size - `int`
  strict - whether or not the probability to compute is expressed as a strict inequality - `boolean`

  returns: probability that a randomly selected m-n partition of m  n generates \\(D_{n,m}\\)
           greater than (resp. greater than or equal to) d - `double`"
  (^Double [^KolmogorovSmirnovTest this ^Double d ^Integer n ^Integer m ^Boolean strict]
    (-> this (.exactP d n m strict))))

