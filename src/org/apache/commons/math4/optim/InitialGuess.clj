(ns org.apache.commons.math4.optim.InitialGuess
  "Starting point (first guess) of the optimization procedure.

  Immutable class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim InitialGuess]))

(defn ->initial-guess
  "Constructor.

  start-point - Initial guess. - `double[]`"
  (^InitialGuess [start-point]
    (new InitialGuess start-point)))

(defn get-initial-guess
  "Gets the initial guess.

  returns: the initial guess. - `double[]`"
  ([^InitialGuess this]
    (-> this (.getInitialGuess))))

