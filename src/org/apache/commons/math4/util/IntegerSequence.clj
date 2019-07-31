(ns org.apache.commons.math4.util.IntegerSequence
  "Provides a sequence of integers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IntegerSequence]))

(defn *range
  "Creates a sequence ai, i < 0 < n
   where ai = start  i * step
   and n is such that an <= max
   and  an+1 > max.

  start - First value of the range. - `int`
  max - Last value of the range that satisfies the above construction rule. - `int`
  step - Increment. - `int`

  returns: a range. - `org.apache.commons.math4.util.IntegerSequence$Range`"
  (^org.apache.commons.math4.util.IntegerSequence$Range [^Integer start ^Integer max ^Integer step]
    (IntegerSequence/range start max step))
  (^org.apache.commons.math4.util.IntegerSequence$Range [^Integer start ^Integer end]
    (IntegerSequence/range start end)))

