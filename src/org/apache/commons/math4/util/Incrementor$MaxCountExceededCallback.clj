(ns org.apache.commons.math4.util.Incrementor$MaxCountExceededCallback
  "Defines a method to be called at counter exhaustion.
  The trigger method should usually throw an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Incrementor$MaxCountExceededCallback]))

(defn trigger
  "Function called when the maximal count has been reached.

  maximal-count - Maximal count. - `int`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - at counter exhaustion"
  ([^Incrementor$MaxCountExceededCallback this ^Integer maximal-count]
    (-> this (.trigger maximal-count))))

