(ns org.apache.commons.math4.util.CentralPivotingStrategy
  "A mid point strategy based on the average of begin and end indices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util CentralPivotingStrategy]))

(defn ->central-pivoting-strategy
  "Constructor."
  (^CentralPivotingStrategy []
    (new CentralPivotingStrategy )))

(defn pivot-index
  "Find pivot index of the array so that partition and Kth
   element selection can be made
   This in particular picks a average of begin and end indices

  work - data array - `double[]`
  begin - index of the first element of the slice - `int`
  end - index after the last element of the slice - `int`

  returns: The index corresponding to a simple average of
   the first and the last element indices of the array slice - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - when indices exceeds range"
  (^Integer [^CentralPivotingStrategy this work ^Integer begin ^Integer end]
    (-> this (.pivotIndex work begin end))))

