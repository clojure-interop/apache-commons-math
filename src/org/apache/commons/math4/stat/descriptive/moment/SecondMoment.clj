(ns org.apache.commons.math4.stat.descriptive.moment.SecondMoment
  "Computes a statistic related to the Second Central Moment.  Specifically,
  what is computed is the sum of squared deviations from the sample mean.

  The following recursive updating formula is used:

  Let
   dev = (current obs - previous mean)
   n = number of observations (including current obs)

  Then

  new value = old value  dev^2 * (n -1) / n.

  Returns Double.NaN if no data values have been added and
  returns 0 if there is just one value in the data set.
  Note that Double.NaN may also be returned if the input includes NaN
  and / or infinite values.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment SecondMoment]))

(defn ->second-moment
  "Constructor.

  Copy constructor, creates a new SecondMoment identical
   to the original.

  original - the SecondMoment instance to copy - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^SecondMoment [^org.apache.commons.math4.stat.descriptive.moment.SecondMoment original]
    (new SecondMoment original))
  (^SecondMoment []
    (new SecondMoment )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - SecondMoment to copy - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`
  dest - SecondMoment to copy to - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.moment.SecondMoment source ^org.apache.commons.math4.stat.descriptive.moment.SecondMoment dest]
    (SecondMoment/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^SecondMoment this ^Double d]
    (-> this (.increment d))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^SecondMoment this]
    (-> this (.clear))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^SecondMoment this]
    (-> this (.getResult))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.moment.SecondMoment`"
  (^org.apache.commons.math4.stat.descriptive.moment.SecondMoment [^SecondMoment this]
    (-> this (.copy))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^SecondMoment this]
    (-> this (.getN))))

