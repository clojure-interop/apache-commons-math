(ns org.apache.commons.math4.util.MedianOf3PivotingStrategy
  "Classic median of 3 strategy given begin and end indices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MedianOf3PivotingStrategy]))

(defn ->median-of-3-pivoting-strategy
  "Constructor."
  (^MedianOf3PivotingStrategy []
    (new MedianOf3PivotingStrategy )))

(defn pivot-index
  "Find pivot index of the array so that partition and Kth
   element selection can be made
   This in specific makes use of median of 3 pivoting.

  work - data array - `double[]`
  begin - index of the first element of the slice - `int`
  end - index after the last element of the slice - `int`

  returns: The index corresponding to a pivot chosen between the
   first, middle and the last indices of the array slice - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - when indices exceeds range"
  (^Integer [^MedianOf3PivotingStrategy this work ^Integer begin ^Integer end]
    (-> this (.pivotIndex work begin end))))

