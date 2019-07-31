(ns org.apache.commons.math4.stat.descriptive.summary.Product
  "Returns the product of the available values.

  If there are no values in the dataset, then 1 is returned.
   If any of the values are
  NaN, then NaN is returned.

  Note that this implementation is not synchronized. If
  multiple threads access an instance of this class concurrently, and at least
  one of the threads invokes the increment() or
  clear() method, it must be synchronized externally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.summary Product]))

(defn ->product
  "Constructor.

  Copy constructor, creates a new Product identical
   to the original.

  original - the Product instance to copy - `org.apache.commons.math4.stat.descriptive.summary.Product`

  throws: org.apache.commons.math4.exception.NullArgumentException - if original is null"
  (^Product [^org.apache.commons.math4.stat.descriptive.summary.Product original]
    (new Product original))
  (^Product []
    (new Product )))

(defn *copy
  "Copies source to dest.
   Neither source nor dest can be null.

  source - Product to copy - `org.apache.commons.math4.stat.descriptive.summary.Product`
  dest - Product to copy to - `org.apache.commons.math4.stat.descriptive.summary.Product`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either source or dest is null"
  ([^org.apache.commons.math4.stat.descriptive.summary.Product source ^org.apache.commons.math4.stat.descriptive.summary.Product dest]
    (Product/copy source dest)))

(defn increment
  "Updates the internal state of the statistic to reflect the addition of the new value.

  d - the new value. - `double`"
  ([^Product this ^Double d]
    (-> this (.increment d))))

(defn get-result
  "Returns the current value of the Statistic.

  returns: value of the statistic, Double.NaN if it
   has been cleared or just instantiated. - `double`"
  (^Double [^Product this]
    (-> this (.getResult))))

(defn get-n
  "Returns the number of values that have been added.

  returns: the number of values. - `long`"
  (^Long [^Product this]
    (-> this (.getN))))

(defn clear
  "Clears the internal state of the Statistic"
  ([^Product this]
    (-> this (.clear))))

(defn evaluate
  "Returns the weighted product of the entries in the specified portion of
   the input array, or Double.NaN if the designated subarray
   is empty.

   Throws MathIllegalArgumentException if any of the following are true:
   the values array is null
       the weights array is null
       the weights array does not have the same length as the values array
       the weights array contains one or more infinite values
       the weights array contains one or more NaN values
       the weights array contains negative values
       the start and length arguments do not determine a valid array


   Uses the formula,

      weighted product = ∏values[i]weights[i]
   that is, the weights are applied as exponents when computing the weighted product.

  values - the input array - `double[]`
  weights - the weights array - `double[]`
  begin - index of the first array element to include - `int`
  length - the number of elements to include - `int`

  returns: the product of the values or 1 if length = 0 - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid"
  (^Double [^Product this values weights ^Integer begin ^Integer length]
    (-> this (.evaluate values weights begin length)))
  (^Double [^Product this values ^Integer begin ^Integer length]
    (-> this (.evaluate values begin length)))
  (^Double [^Product this values weights]
    (-> this (.evaluate values weights))))

(defn copy
  "Returns a copy of the statistic with the same internal state.

  returns: a copy of the statistic - `org.apache.commons.math4.stat.descriptive.summary.Product`"
  (^org.apache.commons.math4.stat.descriptive.summary.Product [^Product this]
    (-> this (.copy))))

