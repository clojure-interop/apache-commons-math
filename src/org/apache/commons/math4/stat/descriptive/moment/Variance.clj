(ns org.apache.commons.math4.stat.descriptive.moment.Variance
  "Computes the variance of the available values.  By default, the unbiased
  \"sample variance\" definitional formula is used:

  variance = sum((x_i - mean)^2) / (n - 1)

  where mean is the Mean and n is the number
  of sample observations.

  The definitional formula does not have good numerical properties, so
  this implementation does not compute the statistic using the definitional
  formula.
   The getResult method computes the variance using
  updating formulas based on West's algorithm, as described in
   Chan, T. F. and
  J. G. Lewis 1979, Communications of the ACM,
  vol. 22 no. 9, pp. 526-531.
   The evaluate methods leverage the fact that they have the
  full array of values in memory to execute a two-pass algorithm.
  Specifically, these methods use the \"corrected two-pass algorithm\" from
  Chan, Golub, Levesque, Algorithms for Computing the Sample Variance,
  American Statistician, vol. 37, no. 3 (1983) pp. 242-247.
  Note that adding values using increment or
  incrementAll and then executing getResult will
  sometimes give a different, less accurate, result than executing
  evaluate with the full array of values. The former approach
  should only be used when the full array of values is not available.

  The \"population variance\"  ( sum((x_i - mean)^2) / n ) can also
  be computed using this statistic.  The isBiasCorrected
  property determines whether the \"population\" or \"sample\" value is
  returned by the evaluate and getResult methods.
  To compute population variances, set this property to false.


  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment Variance]))

(defn ->variance
  "Constructor.

  Constructs a Variance with the specified isBiasCorrected
   property and the supplied external second moment.

  is-bias-corrected - setting for bias correction - true means bias will be corrected - `boolean`
  m-2 - the SecondMoment (Third or Fourth moments work here as well.) - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`"
  (^Variance [^Boolean is-bias-corrected ^org.apache.commons.math4.stat.descriptive.moment.SecondMoment m-2]
    (new Variance is-bias-corrected m-2))
  (^Variance [^org.apache.commons.math4.stat.descriptive.moment.SecondMoment m-2]
    (new Variance m-2))
  (^Variance []
    (new Variance )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Variance to copy - `org.apache.commons.math4.stat.descriptive.moment.Variance`
  dest - Variance to copy to - `org.apache.commons.math4.stat.descriptive.moment.Variance`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.Variance source ^org.apache.commons.math4.stat.descriptive.moment.Variance dest]
    (Variance/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.
   If all values are available, it is more accurate to use
   evaluate(double[]) rather than adding values one at a time
   using this method and then executing getResult(), since
   evaluate leverages the fact that is has the full
   list of values together to execute a two-pass algorithm.
   See Variance.

   Note also that when Variance(SecondMoment) is used to
   create a Variance, this method does nothing. In that case, the
   SecondMoment should be incremented directly.

  d - the new value. - `double`"
  ([^Variance this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Variance this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Variance this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Variance this]
    (-> this (.clear))))

(defn evaluate
  "Returns the weighted variance of the entries in the specified portion of
   the input array, using the precomputed weighted mean value.  Returns
   Double.NaN if the designated subarray is empty.

   Uses the formula

     Σ(weights[i]*(values[i] - mean)2)/(Σ(weights[i]) - 1)

   The formula used assumes that the supplied mean value is the weighted arithmetic
   mean of the sample data, not a known population parameter. This method
   is supplied only to save computation when the mean has already been
   computed.

   This formula will not return the same result as the unweighted variance when all
   weights are equal, unless all weights are equal to 1. The formula assumes that
   weights are to be treated as \"expansion values,\" as will be the case if for example
   the weights represent frequency counts. To normalize weights so that the denominator
   in the variance computation equals the length of the input vector minus one, use

     evaluate(values, MathArrays.normalizeArray(weights, values.length), mean);

   Returns 0 for a single-value (i.e. length = 1) sample.

   Throws MathIllegalArgumentException if any of the following are true:
   the values array is null
       the weights array is null
       the weights array does not have the same length as the values array
       the weights array contains one or more infinite values
       the weights array contains one or more NaN values
       the weights array contains negative values
       the start and length arguments do not determine a valid array


   Does not change the internal state of the statistic.

  values - the input array - `double[]`
  weights - the weights array - `double[]`
  mean - the precomputed weighted mean value - `double`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the variance of the values or Double.NaN if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid"
  (^Double [^Variance this values weights ^Double mean ^Integer begin ^Integer length]
    (-> this (.evaluate values weights mean begin length)))
  (^Double [^Variance this values weights ^Integer begin ^Integer length]
    (-> this (.evaluate values weights begin length)))
  (^Double [^Variance this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^Variance this values weights]
    (-> this (.evaluate values weights)))
  (^Double [^Variance this values]
    (-> this (.evaluate values))))

(defn bias-corrected?
  "returns: Returns the isBiasCorrected. - `boolean`"
  (^Boolean [^Variance this]
    (-> this (.isBiasCorrected))))

(defn set-bias-corrected
  "bias-corrected - The isBiasCorrected to set. - `boolean`"
  ([^Variance this ^Boolean bias-corrected]
    (-> this (.setBiasCorrected bias-corrected))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.Variance`"
  (^org.apache.commons.math4.stat.descriptive.moment.Variance [^Variance this]
    (-> this (.copy))))

