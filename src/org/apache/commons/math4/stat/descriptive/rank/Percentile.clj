(ns org.apache.commons.math4.stat.descriptive.rank.Percentile
  "Provides percentile computation.

  There are several commonly used methods for estimating percentiles (a.k.a.
  quantiles) based on sample data.  For large samples, the different methods
  agree closely, but when sample sizes are small, different methods will give
  significantly different results.  The algorithm implemented here works as follows:

  Let n be the length of the (sorted) array and
  0 < p <= 100 be the desired percentile.
  If  n = 1  return the unique array element (regardless of
  the value of p); otherwise
  Compute the estimated percentile position
   pos = p * (n  1) / 100 and the difference, d
  between pos and floor(pos) (i.e. the fractional
  part of pos).
   If pos < 1 return the smallest element in the array.
   Else if pos >= n return the largest element in the array.
   Else let lower be the element in position
  floor(pos) in the array and let upper be the
  next element in the array.  Return lower  d * (upper - lower)



  To compute percentiles, the data must be at least partially ordered.  Input
  arrays are copied and recursively partitioned using an ordering definition.
  The ordering used by Arrays.sort(double[]) is the one determined
  by Double.compareTo(Double).  This ordering makes
  Double.NaN larger than any other value (including
  Double.POSITIVE_INFINITY).  Therefore, for example, the median
  (50th percentile) of
  {0, 1, 2, 3, 4, Double.NaN} evaluates to 2.5.

  Since percentile estimation usually involves interpolation between array
  elements, arrays containing  NaN or infinite values will often
  result in NaN or infinite values returned.

  Further, to include different estimation types such as R1, R2 as mentioned in
  Quantile page(wikipedia),
  a type specific NaN handling strategy is used to closely match with the
  typically observed results from popular tools like R(R1-R9), Excel(R7).

  Since 2.2, Percentile uses only selection instead of complete sorting
  and caches selection algorithm state between calls to the various
  evaluate methods. This greatly improves efficiency, both for a single
  percentile and multiple percentile computations. To maximize performance when
  multiple percentiles are computed based on the same data, users should set the
  data array once using either one of the evaluate(double[], double) or
  setData(double[]) methods and thereafter evaluate(double)
  with just the percentile provided.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank Percentile]))

(defn ->percentile
  "Constructor.

  Constructs a Percentile with the specific quantile value and the following

     default method type: Percentile.EstimationType.LEGACY
     default NaN strategy: NaNStrategy.REMOVED
     a Kth Selector : KthSelector

  quantile - the quantile - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if p is not greater than 0 and less than or equal to 100"
  (^Percentile [^Double quantile]
    (new Percentile quantile))
  (^Percentile []
    (new Percentile )))

(defn set-quantile
  "Sets the value of the quantile field (determines what percentile is
   computed when evaluate() is called with no quantile argument).

  p - a value between 0 < p <= 100 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if p is not greater than 0 and less than or equal to 100"
  ([^Percentile this ^Double p]
    (-> this (.setQuantile p))))

(defn get-quantile
  "Returns the value of the quantile field (determines what percentile is
   computed when evaluate() is called with no quantile argument).

  returns: quantile set while construction or setQuantile(double) - `double`"
  (^Double [^Percentile this]
    (-> this (.getQuantile))))

(defn set-data
  "Set the data array.  The input array is copied, not referenced.

  values - data array to store - `double[]`
  begin - the index of the first element to include - `int`
  length - the number of elements to include - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if values is null or the indices are not valid"
  ([^Percentile this values ^Integer begin ^Integer length]
    (-> this (.setData values begin length)))
  ([^Percentile this values]
    (-> this (.setData values))))

(defn with-na-n-strategy
  "Build a new instance similar to the current one except for the
   NaN handling strategy.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(kthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-na-n-strategy - NaN strategy for the new instance - `org.apache.commons.math4.stat.ranking.NaNStrategy`

  returns: a new instance, with changed NaN handling strategy - `org.apache.commons.math4.stat.descriptive.rank.Percentile`

  throws: org.apache.commons.math4.exception.NullArgumentException - when newNaNStrategy is null"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile [^Percentile this ^org.apache.commons.math4.stat.ranking.NaNStrategy new-na-n-strategy]
    (-> this (.withNaNStrategy new-na-n-strategy))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.rank.Percentile`"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile [^Percentile this]
    (-> this (.copy))))

(defn get-pivoting-strategy
  "Get the PivotingStrategyInterface used in KthSelector for computation.

  returns: the pivoting strategy set - `org.apache.commons.math4.util.PivotingStrategyInterface`"
  (^org.apache.commons.math4.util.PivotingStrategyInterface [^Percentile this]
    (-> this (.getPivotingStrategy))))

(defn get-kth-selector
  "Get the kthSelector used for computation.

  returns: the kthSelector set - `org.apache.commons.math4.util.KthSelector`"
  (^org.apache.commons.math4.util.KthSelector [^Percentile this]
    (-> this (.getKthSelector))))

(defn evaluate
  "Returns an estimate of the pth percentile of the values
   in the values array, starting with the element in (0-based)
   position begin in the array and including length
   values.

   Calls to this method do not modify the internal quantile
   state of this statistic.


   Returns Double.NaN if length = 0
   Returns (for any value of p) values[begin]
    if length = 1
   Throws MathIllegalArgumentException if values
    is null , begin or length is invalid, or
   p is not a valid quantile value (p must be greater than 0
   and less than or equal to 100)


   See Percentile for a description of the percentile estimation
   algorithm used.

  values - array of input values - `double[]`
  begin - the first (0-based) element to include in the computation - `int`
  length - the number of array elements to include - `int`
  p - the percentile to compute - `double`

  returns: the percentile value - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid or the input array is null"
  (^Double [^Percentile this values ^Integer begin ^Integer length ^Double p]
    (-> this (.evaluate values begin length p)))
  (^Double [^Percentile this values ^Integer start ^Integer length]
    (-> this (.evaluate values start length)))
  (^Double [^Percentile this values ^Double p]
    (-> this (.evaluate values p)))
  (^Double [^Percentile this ^Double p]
    (-> this (.evaluate p))))

(defn with-estimation-type
  "Build a new instance similar to the current one except for the
   estimation type.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(kthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-estimation-type - estimation type for the new instance - `org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType`

  returns: a new instance, with changed estimation type - `org.apache.commons.math4.stat.descriptive.rank.Percentile`

  throws: org.apache.commons.math4.exception.NullArgumentException - when newEstimationType is null"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile [^Percentile this ^org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType new-estimation-type]
    (-> this (.withEstimationType new-estimation-type))))

(defn with-kth-selector
  "Build a new instance similar to the current one except for the
   kthSelector instance specifically set.

   This method is intended to be used as part of a fluent-type builder
   pattern. Building finely tune instances should be done as follows:



     Percentile customized = new Percentile(quantile).
                             withEstimationType(estimationType).
                             withNaNStrategy(nanStrategy).
                             withKthSelector(newKthSelector);

   If any of the withXxx method is omitted, the default value for
   the corresponding customization parameter will be used.

  new-kth-selector - KthSelector for the new instance - `org.apache.commons.math4.util.KthSelector`

  returns: a new instance, with changed KthSelector - `org.apache.commons.math4.stat.descriptive.rank.Percentile`

  throws: org.apache.commons.math4.exception.NullArgumentException - when newKthSelector is null"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile [^Percentile this ^org.apache.commons.math4.util.KthSelector new-kth-selector]
    (-> this (.withKthSelector new-kth-selector))))

(defn get-estimation-type
  "Get the estimation type used for computation.

  returns: the estimationType set - `org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType`"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType [^Percentile this]
    (-> this (.getEstimationType))))

(defn get-na-n-strategy
  "Get the NaN Handling strategy used for computation.

  returns: NaN Handling strategy set during construction - `org.apache.commons.math4.stat.ranking.NaNStrategy`"
  (^org.apache.commons.math4.stat.ranking.NaNStrategy [^Percentile this]
    (-> this (.getNaNStrategy))))

