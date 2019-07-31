(ns org.apache.commons.math4.optim.linear.NoFeasibleSolutionException
  "This class represents exceptions thrown by optimizers when no solution fulfills the constraints."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear NoFeasibleSolutionException]))

(defn ->no-feasible-solution-exception
  "Constructor.

  Simple constructor using a default message."
  (^NoFeasibleSolutionException []
    (new NoFeasibleSolutionException )))

