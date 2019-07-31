(ns org.apache.commons.math4.util.PivotingStrategyInterface
  "A strategy to pick a pivoting index of an array for doing partitioning."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util PivotingStrategyInterface]))

(defn pivot-index
  "Find pivot index of the array so that partition and Kth
   element selection can be made

  work - data array - `double[]`
  begin - index of the first element of the slice - `int`
  end - index after the last element of the slice - `int`

  returns: the index of the pivot element chosen between the
   first and the last element of the array slice - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - when indices exceeds range"
  (^Integer [^PivotingStrategyInterface this work ^Integer begin ^Integer end]
    (-> this (.pivotIndex work begin end))))

