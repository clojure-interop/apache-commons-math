(ns org.apache.commons.math4.optim.linear.SolutionCallback
  "A callback object that can be provided to a linear optimizer to keep track
  of the best solution found."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear SolutionCallback]))

(defn ->solution-callback
  "Constructor."
  (^SolutionCallback []
    (new SolutionCallback )))

(defn get-solution
  "Retrieve the best solution found so far.

   Note: the returned solution may not be optimal, e.g. in case
   the optimizer did reach the iteration limits.

  returns: the best solution found so far by the optimizer, or null if
   no feasible solution could be found - `org.apache.commons.math4.optim.PointValuePair`"
  (^org.apache.commons.math4.optim.PointValuePair [^SolutionCallback this]
    (-> this (.getSolution))))

(defn solution-optimal?
  "Returns if the found solution is optimal.

  returns: true if the solution is optimal, false otherwise - `boolean`"
  (^Boolean [^SolutionCallback this]
    (-> this (.isSolutionOptimal))))

