(ns org.apache.commons.math4.stat.inference.InferenceTestUtils
  "A collection of static methods to create inference test instances or to
  perform inference tests."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference InferenceTestUtils]))

(defn *one-way-anova-test
  "category-data - `java.util.Collection`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Boolean [^java.util.Collection category-data ^Double alpha]
    (InferenceTestUtils/oneWayAnovaTest category-data alpha)))

(defn *paired-t-test
  "sample-1 - `double[]`
  sample-2 - `double[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Boolean [sample-1 sample-2 ^Double alpha]
    (InferenceTestUtils/pairedTTest sample-1 sample-2 alpha))
  (^Double [sample-1 sample-2]
    (InferenceTestUtils/pairedTTest sample-1 sample-2)))

(defn *chi-square-data-sets-comparison
  "observed-1 - `long[]`
  observed-2 - `long[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Double [observed-1 observed-2]
    (InferenceTestUtils/chiSquareDataSetsComparison observed-1 observed-2)))

(defn *homoscedastic-t-test
  "sample-1 - `double[]`
  sample-2 - `double[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Boolean [sample-1 sample-2 ^Double alpha]
    (InferenceTestUtils/homoscedasticTTest sample-1 sample-2 alpha))
  (^Double [sample-1 sample-2]
    (InferenceTestUtils/homoscedasticTTest sample-1 sample-2)))

(defn *monte-carlo-p
  "d - `double`
  n - `int`
  m - `int`
  strict - `boolean`
  iterations - `int`

  returns: `double`"
  (^Double [^Double d ^Integer n ^Integer m ^Boolean strict ^Integer iterations]
    (InferenceTestUtils/monteCarloP d n m strict iterations)))

(defn *one-way-anova-p-value
  "category-data - `java.util.Collection`

  returns: `double`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Double [^java.util.Collection category-data]
    (InferenceTestUtils/oneWayAnovaPValue category-data)))

(defn *chi-square
  "expected - `double[]`
  observed - `long[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NotPositiveException"
  (^Double [expected observed]
    (InferenceTestUtils/chiSquare expected observed))
  (^Double [counts]
    (InferenceTestUtils/chiSquare counts)))

(defn *g-test
  "expected - `double[]`
  observed - `long[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NotPositiveException"
  (^Boolean [expected observed ^Double alpha]
    (InferenceTestUtils/gTest expected observed alpha))
  (^Double [expected observed]
    (InferenceTestUtils/gTest expected observed)))

(defn *one-way-anova-f-value
  "category-data - `java.util.Collection`

  returns: `double`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Double [^java.util.Collection category-data]
    (InferenceTestUtils/oneWayAnovaFValue category-data)))

(defn *t
  "mu - `double`
  observed - `double[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Double [^Double mu observed]
    (InferenceTestUtils/t mu observed)))

(defn *kolmogorov-smirnov-test
  "dist - `org.apache.commons.math4.distribution.RealDistribution`
  data - `double[]`
  strict - `boolean`

  returns: `double`

  throws: org.apache.commons.math4.exception.InsufficientDataException"
  (^Double [^org.apache.commons.math4.distribution.RealDistribution dist data ^Boolean strict]
    (InferenceTestUtils/kolmogorovSmirnovTest dist data strict))
  (^Double [^org.apache.commons.math4.distribution.RealDistribution dist data]
    (InferenceTestUtils/kolmogorovSmirnovTest dist data)))

(defn *g-data-sets-comparison
  "observed-1 - `long[]`
  observed-2 - `long[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Double [observed-1 observed-2]
    (InferenceTestUtils/gDataSetsComparison observed-1 observed-2)))

(defn *g
  "expected - `double[]`
  observed - `long[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NotPositiveException"
  (^Double [expected observed]
    (InferenceTestUtils/g expected observed)))

(defn *root-log-likelihood-ratio
  "k-11 - `long`
  k-12 - `long`
  k-21 - `long`
  k-22 - `long`

  returns: `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Double [^Long k-11 ^Long k-12 ^Long k-21 ^Long k-22]
    (InferenceTestUtils/rootLogLikelihoodRatio k-11 k-12 k-21 k-22)))

(defn *approximate-p
  "d - `double`
  n - `int`
  m - `int`

  returns: `double`"
  (^Double [^Double d ^Integer n ^Integer m]
    (InferenceTestUtils/approximateP d n m)))

(defn *t-test
  "mu - `double`
  sample - `double[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Boolean [^Double mu sample ^Double alpha]
    (InferenceTestUtils/tTest mu sample alpha))
  (^Double [^Double mu sample]
    (InferenceTestUtils/tTest mu sample)))

(defn *homoscedastic-t
  "sample-1 - `double[]`
  sample-2 - `double[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Double [sample-1 sample-2]
    (InferenceTestUtils/homoscedasticT sample-1 sample-2)))

(defn *paired-t
  "sample-1 - `double[]`
  sample-2 - `double[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NullArgumentException"
  (^Double [sample-1 sample-2]
    (InferenceTestUtils/pairedT sample-1 sample-2)))

(defn *g-test-intrinsic
  "expected - `double[]`
  observed - `long[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.NotPositiveException"
  (^Double [expected observed]
    (InferenceTestUtils/gTestIntrinsic expected observed)))

(defn *kolmogorov-smirnov-statistic
  "dist - `org.apache.commons.math4.distribution.RealDistribution`
  data - `double[]`

  returns: `double`

  throws: org.apache.commons.math4.exception.InsufficientDataException"
  (^Double [^org.apache.commons.math4.distribution.RealDistribution dist data]
    (InferenceTestUtils/kolmogorovSmirnovStatistic dist data)))

(defn *g-test-data-sets-comparison
  "observed-1 - `long[]`
  observed-2 - `long[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Boolean [observed-1 observed-2 ^Double alpha]
    (InferenceTestUtils/gTestDataSetsComparison observed-1 observed-2 alpha))
  (^Double [observed-1 observed-2]
    (InferenceTestUtils/gTestDataSetsComparison observed-1 observed-2)))

(defn *chi-square-test-data-sets-comparison
  "observed-1 - `long[]`
  observed-2 - `long[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException"
  (^Boolean [observed-1 observed-2 ^Double alpha]
    (InferenceTestUtils/chiSquareTestDataSetsComparison observed-1 observed-2 alpha))
  (^Double [observed-1 observed-2]
    (InferenceTestUtils/chiSquareTestDataSetsComparison observed-1 observed-2)))

(defn *exact-p
  "d - `double`
  m - `int`
  n - `int`
  strict - `boolean`

  returns: `double`"
  (^Double [^Double d ^Integer m ^Integer n ^Boolean strict]
    (InferenceTestUtils/exactP d m n strict)))

(defn *chi-square-test
  "expected - `double[]`
  observed - `long[]`
  alpha - `double`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.NotPositiveException"
  (^Boolean [expected observed ^Double alpha]
    (InferenceTestUtils/chiSquareTest expected observed alpha))
  (^Double [expected observed]
    (InferenceTestUtils/chiSquareTest expected observed))
  (^Double [counts]
    (InferenceTestUtils/chiSquareTest counts)))

