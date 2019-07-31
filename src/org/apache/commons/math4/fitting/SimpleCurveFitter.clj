(ns org.apache.commons.math4.fitting.SimpleCurveFitter
  "Fits points to a user-defined function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting SimpleCurveFitter]))

(defn *create
  "Creates a curve fitter.
   The maximum number of iterations of the optimization algorithm is set
   to Integer.MAX_VALUE.

  f - Function to fit. - `org.apache.commons.math4.analysis.ParametricUnivariateFunction`
  start - Initial guess for the parameters. Cannot be null. Its length must be consistent with the number of parameters of the function to fit. - `double[]`

  returns: a curve fitter. - `org.apache.commons.math4.fitting.SimpleCurveFitter`"
  (^org.apache.commons.math4.fitting.SimpleCurveFitter [^org.apache.commons.math4.analysis.ParametricUnivariateFunction f start]
    (SimpleCurveFitter/create f start)))

(defn with-start-point
  "Configure the start point (initial guess).

  new-start - new start point (initial guess) - `double[]`

  returns: a new instance. - `org.apache.commons.math4.fitting.SimpleCurveFitter`"
  (^org.apache.commons.math4.fitting.SimpleCurveFitter [^SimpleCurveFitter this new-start]
    (-> this (.withStartPoint new-start))))

(defn with-max-iterations
  "Configure the maximum number of iterations.

  new-max-iter - maximum number of iterations - `int`

  returns: a new instance. - `org.apache.commons.math4.fitting.SimpleCurveFitter`"
  (^org.apache.commons.math4.fitting.SimpleCurveFitter [^SimpleCurveFitter this ^Integer new-max-iter]
    (-> this (.withMaxIterations new-max-iter))))

