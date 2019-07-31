(ns org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer
  "An algorithm that can be applied to a non-linear least squares problem."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LeastSquaresOptimizer]))

(defn optimize
  "Solve the non-linear least squares problem.

  least-squares-problem - the problem definition, including model function and convergence criteria. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`

  returns: The optimum. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum [^LeastSquaresOptimizer this ^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem least-squares-problem]
    (-> this (.optimize least-squares-problem))))

