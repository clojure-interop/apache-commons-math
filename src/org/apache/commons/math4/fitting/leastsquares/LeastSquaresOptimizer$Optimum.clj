(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum
  "The optimum found by the optimizer. This object contains the point, its value, and
  some metadata."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresOptimizer$Optimum]))

(defn get-evaluations
  "Get the number of times the model was evaluated in order to produce this
   optimum.

  returns: the number of model (objective) function evaluations - `int`"
  (^Integer [^LeastSquaresOptimizer$Optimum this]
    (-> this (.getEvaluations))))

(defn get-iterations
  "Get the number of times the algorithm iterated in order to produce this
   optimum. In general least squares it is common to have one evaluation per iterations.

  returns: the number of iterations - `int`"
  (^Integer [^LeastSquaresOptimizer$Optimum this]
    (-> this (.getIterations))))

