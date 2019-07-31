(ns org.apache.commons.math4.util.KthSelector
  "A Simple Kth selector implementation to pick up the
  Kth ordered element from a work array containing the input
  numbers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util KthSelector]))

(defn ->kth-selector
  "Constructor.

  Constructor with specified pivoting strategy

  pivoting-strategy - pivoting strategy to use - `org.apache.commons.math4.util.PivotingStrategyInterface`

  throws: org.apache.commons.math4.exception.NullArgumentException - when pivotingStrategy is null"
  (^KthSelector [^org.apache.commons.math4.util.PivotingStrategyInterface pivoting-strategy]
    (new KthSelector pivoting-strategy))
  (^KthSelector []
    (new KthSelector )))

(defn get-pivoting-strategy
  "Get the pivotin strategy.

  returns: pivoting strategy - `org.apache.commons.math4.util.PivotingStrategyInterface`"
  (^org.apache.commons.math4.util.PivotingStrategyInterface [^KthSelector this]
    (-> this (.getPivotingStrategy))))

(defn select
  "Select Kth value in the array.

  work - work array to use to find out the Kth value - `double[]`
  pivots-heap - cached pivots heap that can be used for efficient estimation - `int[]`
  k - the index whose value in the array is of interest - `int`

  returns: Kth value - `double`"
  (^Double [^KthSelector this work pivots-heap ^Integer k]
    (-> this (.select work pivots-heap k))))

