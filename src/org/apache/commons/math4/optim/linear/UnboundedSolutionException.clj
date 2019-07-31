(ns org.apache.commons.math4.optim.linear.UnboundedSolutionException
  "This class represents exceptions thrown by optimizers when a solution escapes to infinity."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear UnboundedSolutionException]))

(defn ->unbounded-solution-exception
  "Constructor.

  Simple constructor using a default message."
  (^UnboundedSolutionException []
    (new UnboundedSolutionException )))

