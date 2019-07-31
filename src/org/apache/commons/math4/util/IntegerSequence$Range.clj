(ns org.apache.commons.math4.util.IntegerSequence$Range
  "Generates a sequence of integers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IntegerSequence$Range]))

(defn ->range
  "Constructor.

  Creates a sequence ai, i < 0 < n
   where ai = start  i * step
   and n is such that an <= max
   and  an+1 > max.

  start - First value of the range. - `int`
  max - Last value of the range that satisfies the above construction rule. - `int`
  step - Increment. - `int`"
  (^IntegerSequence$Range [^Integer start ^Integer max ^Integer step]
    (new IntegerSequence$Range start max step)))

(defn size
  "Gets the number of elements contained in the range.

  returns: the size of the range. - `int`"
  (^Integer [^IntegerSequence$Range this]
    (-> this (.size))))

(defn iterator
  "returns: `java.util.Iterator<java.lang.Integer>`"
  (^java.util.Iterator [^IntegerSequence$Range this]
    (-> this (.iterator))))

