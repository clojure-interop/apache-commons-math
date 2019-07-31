(ns org.apache.commons.math4.stat.descriptive.moment.SemiVariance
  "Computes the semivariance of a set of values with respect to a given cutoff value.
  We define the downside semivariance of a set of values x
  against the cutoff value cutoff to be
  Σ (x[i] - target)2 / df
  where the sum is taken over all i such that x[i] < cutoff
  and df is the length of x (non-bias-corrected) or
  one less than this number (bias corrected).  The upside semivariance
  is defined similarly, with the sum taken over values of x that
  exceed the cutoff value.

  The cutoff value defaults to the mean, bias correction defaults to true
  and the \"variance direction\" (upside or downside) defaults to downside.  The variance direction
  and bias correction may be set using property setters or their values can provided as
  parameters to evaluate(double[], double, Direction, boolean, int, int).

  If the input array is null, evaluate methods throw
  IllegalArgumentException.  If the array has length 1, 0
  is returned, regardless of the value of the cutoff.

  Note that this class is not intended to be threadsafe. If
  multiple threads access an instance of this class concurrently, and one or
  more of these threads invoke property setters, external synchronization must
  be provided to ensure correct results."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment SemiVariance]))

(defn ->semi-variance
  "Constructor.

  Constructs a SemiVariance with the specified isBiasCorrected
   property and the specified Direction property.

  corrected - setting for bias correction - true means bias will be corrected and is equivalent to using the argumentless constructor - `boolean`
  direction - setting for the direction of the SemiVariance to calculate - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction`"
  (^SemiVariance [^Boolean corrected ^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction direction]
    (new SemiVariance corrected direction))
  (^SemiVariance [^Boolean bias-corrected]
    (new SemiVariance bias-corrected))
  (^SemiVariance []
    (new SemiVariance )))

(def *-upside-variance
  "Static Constant.

  The UPSIDE Direction is used to specify that the observations above the
   cutoff point will be used to calculate SemiVariance.

  type: org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction"
  SemiVariance/UPSIDE_VARIANCE)

(def *-downside-variance
  "Static Constant.

  The DOWNSIDE Direction is used to specify that the observations below
   the cutoff point will be used to calculate SemiVariance

  type: org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction"
  SemiVariance/DOWNSIDE_VARIANCE)

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - SemiVariance to copy - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance`
  dest - SemiVariance to copy to - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.SemiVariance source ^org.apache.commons.math4.stat.descriptive.moment.SemiVariance dest]
    (SemiVariance/copy source dest)))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance`"
  (^org.apache.commons.math4.stat.descriptive.moment.SemiVariance [^SemiVariance this]
    (-> this (.copy))))

(defn evaluate
  "Returns the SemiVariance of the designated values against the cutoff
   in the given direction with the provided bias correction.

   Returns NaN if the array is empty and throws
   IllegalArgumentException if the array is null.

  values - the input array - `double[]`
  cutoff - the reference point - `double`
  direction - the SemiVariance.Direction of the semivariance - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction`
  corrected - the BiasCorrection flag - `boolean`
  start - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the SemiVariance - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid"
  (^Double [^SemiVariance this values ^Double cutoff ^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction direction ^Boolean corrected ^Integer start ^Integer length]
    (-> this (.evaluate values cutoff direction corrected start length)))
  (^Double [^SemiVariance this values ^Integer start ^Integer length]
    (-> this (.evaluate values start length)))
  (^Double [^SemiVariance this values ^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction direction]
    (-> this (.evaluate values direction))))

(defn bias-corrected?
  "Returns true iff biasCorrected property is set to true.

  returns: the value of biasCorrected. - `boolean`"
  (^Boolean [^SemiVariance this]
    (-> this (.isBiasCorrected))))

(defn set-bias-corrected
  "Sets the biasCorrected property.

  bias-corrected - new biasCorrected property value - `boolean`"
  ([^SemiVariance this ^Boolean bias-corrected]
    (-> this (.setBiasCorrected bias-corrected))))

(defn get-variance-direction
  "Returns the varianceDirection property.

  returns: the varianceDirection - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction`"
  (^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction [^SemiVariance this]
    (-> this (.getVarianceDirection))))

(defn set-variance-direction
  "Sets the variance direction

  variance-direction - the direction of the semivariance - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction`"
  ([^SemiVariance this ^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction variance-direction]
    (-> this (.setVarianceDirection variance-direction))))

