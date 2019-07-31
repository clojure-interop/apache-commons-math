(ns org.apache.commons.math4.stat.StatUtils
  "StatUtils provides static methods for computing statistics based on data
  stored in double[] arrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat StatUtils]))

(defn *mean-difference
  "Returns the mean of the (signed) differences between corresponding elements of the
   input arrays -- i.e., sum(sample1[i] - sample2[i]) / sample1.length.

  sample-1 - the first array - `double[]`
  sample-2 - the second array - `double[]`

  returns: mean of paired differences - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays do not have the same (positive) length."
  (^Double [sample-1 sample-2]
    (StatUtils/meanDifference sample-1 sample-2)))

(defn *min
  "Returns the minimum of the entries in the specified portion of the input array,
   or Double.NaN if the designated subarray is empty.

   Throws MathIllegalArgumentException if the array is null or
   the array index parameters are not valid.


   The result is NaN iff all values are NaN
   (i.e. NaN values have no impact on the value of the statistic).
   If any of the values equals Double.NEGATIVE_INFINITY,
   the result is Double.NEGATIVE_INFINITY.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the minimum of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/min values begin length))
  (^Double [values]
    (StatUtils/min values)))

(defn *normalize
  "Normalize (standardize) the sample, so it is has a mean of 0 and a standard deviation of 1.

  sample - Sample to normalize. - `double[]`

  returns: normalized (standardized) sample. - `double[]`"
  ([sample]
    (StatUtils/normalize sample)))

(defn *mean
  "Returns the arithmetic mean of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws IllegalArgumentException if the array is null.

   See Mean for
   details on the computing algorithm.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the mean of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/mean values begin length))
  (^Double [values]
    (StatUtils/mean values)))

(defn *sum
  "Returns the sum of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray is empty.

   Throws IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/sum values begin length))
  (^Double [values]
    (StatUtils/sum values)))

(defn *max
  "Returns the maximum of the entries in the specified portion of the input array,
   or Double.NaN if the designated subarray is empty.

   Throws MathIllegalArgumentException if the array is null or
   the array index parameters are not valid.


   The result is NaN iff all values are NaN
   (i.e. NaN values have no impact on the value of the statistic).
   If any of the values equals Double.POSITIVE_INFINITY,
   the result is Double.POSITIVE_INFINITY.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the maximum of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/max values begin length))
  (^Double [values]
    (StatUtils/max values)))

(defn *mode
  "Returns the sample mode(s).

   The mode is the most frequently occurring value in the sample.
   If there is a unique value with maximum frequency, this value is returned
   as the only element of the output array. Otherwise, the returned array
   contains the maximum frequency elements in increasing order.

   For example, if sample is {0, 12, 5, 6, 0, 13, 5, 17},
   the returned array will have length two, with 0 in the first element and
   5 in the second.

   NaN values are ignored when computing the mode - i.e., NaNs will never
   appear in the output array.  If the sample includes only NaNs or has
   length 0, an empty array is returned.

  sample - input data - `double[]`
  begin - index (0-based) of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: array of array of the most frequently occurring element(s) sorted in ascending order. - `double[]`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the indices are invalid or the array is null"
  ([sample ^Integer begin ^Integer length]
    (StatUtils/mode sample begin length))
  ([sample]
    (StatUtils/mode sample)))

(defn *product
  "Returns the product of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the product of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/product values begin length))
  (^Double [values]
    (StatUtils/product values)))

(defn *percentile
  "Returns an estimate of the pth percentile of the values
   in the values array, starting with the element in (0-based)
   position begin in the array and including length
   values.


   Returns Double.NaN if length = 0
   Returns (for any value of p) values[begin]
    if length = 1
   Throws MathIllegalArgumentException if values
    is null, begin or length is invalid, or
    p is not a valid quantile value (p must be greater than 0
    and less than or equal to 100)


   See Percentile
   for a description of the percentile estimation algorithm used.

  values - array of input values - `double[]`
  begin - the first (0-based) element to include in the computation - `int`
  length - the number of array elements to include - `int`
  p - the percentile to compute - `double`

  returns: the percentile value - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid or the input array is null"
  (^Double [values ^Integer begin ^Integer length ^Double p]
    (StatUtils/percentile values begin length p))
  (^Double [values ^Double p]
    (StatUtils/percentile values p)))

(defn *sum-difference
  "Returns the sum of the (signed) differences between corresponding elements of the
   input arrays -- i.e., sum(sample1[i] - sample2[i]).

  sample-1 - the first array - `double[]`
  sample-2 - the second array - `double[]`

  returns: sum of paired differences - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays do not have the same (positive) length."
  (^Double [sample-1 sample-2]
    (StatUtils/sumDifference sample-1 sample-2)))

(defn *geometric-mean
  "Returns the geometric mean of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws IllegalArgumentException if the array is null.

   See GeometricMean
   for details on the computing algorithm.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the geometric mean of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/geometricMean values begin length))
  (^Double [values]
    (StatUtils/geometricMean values)))

(defn *sum-sq
  "Returns the sum of the squares of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the squares of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/sumSq values begin length))
  (^Double [values]
    (StatUtils/sumSq values)))

(defn *population-variance
  "Returns the
   population variance of the entries in the specified portion of
   the input array, using the precomputed mean value.  Returns
   Double.NaN if the designated subarray is empty.

   See Variance for
   details on the computing algorithm.

   The formula used assumes that the supplied mean value is the arithmetic
   mean of the sample data, not a known population parameter.  This method
   is supplied only to save computation when the mean has already been
   computed.

   Returns 0 for a single-value (i.e. length = 1) sample.

   Throws MathIllegalArgumentException if the array is null or the
   array index parameters are not valid.

  values - the input array - `double[]`
  mean - the precomputed mean value - `double`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the population variance of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Double mean ^Integer begin ^Integer length]
    (StatUtils/populationVariance values mean begin length))
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/populationVariance values begin length))
  (^Double [values ^Double mean]
    (StatUtils/populationVariance values mean))
  (^Double [values]
    (StatUtils/populationVariance values)))

(defn *variance
  "Returns the variance of the entries in the specified portion of
   the input array, using the precomputed mean value.  Returns
   Double.NaN if the designated subarray is empty.

   This method returns the bias-corrected sample variance (using n - 1 in
   the denominator). Use populationVariance(double[], double, int, int) for
   the non-bias-corrected population variance.

   See Variance for
   details on the computing algorithm.

   The formula used assumes that the supplied mean value is the arithmetic
   mean of the sample data, not a known population parameter.  This method
   is supplied only to save computation when the mean has already been
   computed.

   Returns 0 for a single-value (i.e. length = 1) sample.

   Throws MathIllegalArgumentException if the array is null or the
   array index parameters are not valid.

  values - the input array - `double[]`
  mean - the precomputed mean value - `double`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the variance of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Double mean ^Integer begin ^Integer length]
    (StatUtils/variance values mean begin length))
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/variance values begin length))
  (^Double [values ^Double mean]
    (StatUtils/variance values mean))
  (^Double [values]
    (StatUtils/variance values)))

(defn *variance-difference
  "Returns the variance of the (signed) differences between corresponding elements of the
   input arrays -- i.e., var(sample1[i] - sample2[i]).

  sample-1 - the first array - `double[]`
  sample-2 - the second array - `double[]`
  mean-difference - the mean difference between corresponding entries - `double`

  returns: variance of paired differences - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the arrays do not have the same length."
  (^Double [sample-1 sample-2 ^Double mean-difference]
    (StatUtils/varianceDifference sample-1 sample-2 mean-difference)))

(defn *sum-log
  "Returns the sum of the natural logs of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray is empty.

   Throws IllegalArgumentException if the array is null.

   See SumOfLogs.

  values - the input array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the sum of the natural logs of the values or Double.NaN if
   length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the array is null or the array index parameters are not valid"
  (^Double [values ^Integer begin ^Integer length]
    (StatUtils/sumLog values begin length))
  (^Double [values]
    (StatUtils/sumLog values)))

