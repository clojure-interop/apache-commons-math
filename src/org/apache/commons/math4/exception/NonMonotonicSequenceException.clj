(ns org.apache.commons.math4.exception.NonMonotonicSequenceException
  "Exception to be thrown when the a sequence of values is not monotonically
  increasing or decreasing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NonMonotonicSequenceException]))

(defn ->non-monotonic-sequence-exception
  "Constructor.

  Construct the exception.

  wrong - Value that did not match the requirements. - `java.lang.Number`
  previous - Previous value in the sequence. - `java.lang.Number`
  index - Index of the value that did not match the requirements. - `int`
  direction - Strictly positive for a sequence required to be increasing, negative (or zero) for a decreasing sequence. - `org.apache.commons.math4.util.MathArrays$OrderDirection`
  strict - Whether the sequence must be strictly increasing or decreasing. - `boolean`"
  (^NonMonotonicSequenceException [^java.lang.Number wrong ^java.lang.Number previous ^Integer index ^org.apache.commons.math4.util.MathArrays$OrderDirection direction ^Boolean strict]
    (new NonMonotonicSequenceException wrong previous index direction strict))
  (^NonMonotonicSequenceException [^java.lang.Number wrong ^java.lang.Number previous ^Integer index]
    (new NonMonotonicSequenceException wrong previous index)))

(defn get-direction
  "returns: the order direction. - `org.apache.commons.math4.util.MathArrays$OrderDirection`"
  (^org.apache.commons.math4.util.MathArrays$OrderDirection [^NonMonotonicSequenceException this]
    (-> this (.getDirection))))

(defn get-strict?
  "returns: true is the sequence should be strictly monotonic. - `boolean`"
  (^Boolean [^NonMonotonicSequenceException this]
    (-> this (.getStrict))))

(defn get-index
  "Get the index of the wrong value.

  returns: the current index. - `int`"
  (^Integer [^NonMonotonicSequenceException this]
    (-> this (.getIndex))))

(defn get-previous
  "returns: the previous value. - `java.lang.Number`"
  (^java.lang.Number [^NonMonotonicSequenceException this]
    (-> this (.getPrevious))))

