(ns org.apache.commons.math4.analysis.integration.UnivariateIntegrator
  "Interface for univariate real integration algorithms."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration UnivariateIntegrator]))

(defn get-relative-accuracy
  "Get the relative accuracy.

  returns: the accuracy - `double`"
  (^Double [^UnivariateIntegrator this]
    (-> this (.getRelativeAccuracy))))

(defn get-absolute-accuracy
  "Get the absolute accuracy.

  returns: the accuracy - `double`"
  (^Double [^UnivariateIntegrator this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-minimal-iteration-count
  "Get the min limit for the number of iterations.

  returns: the actual min limit - `int`"
  (^Integer [^UnivariateIntegrator this]
    (-> this (.getMinimalIterationCount))))

(defn get-maximal-iteration-count
  "Get the upper limit for the number of iterations.

  returns: the actual upper limit - `int`"
  (^Integer [^UnivariateIntegrator this]
    (-> this (.getMaximalIterationCount))))

(defn integrate
  "Integrate the function in the given interval.

  max-eval - Maximum number of evaluations. - `int`
  f - the integrand function - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - the lower bound for the interval - `double`
  max - the upper bound for the interval - `double`

  returns: the value of integral - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum number of function evaluations is exceeded"
  (^Double [^UnivariateIntegrator this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max]
    (-> this (.integrate max-eval f min max))))

(defn get-evaluations
  "Get the number of function evaluations of the last run of the integrator.

  returns: number of function evaluations - `int`"
  (^Integer [^UnivariateIntegrator this]
    (-> this (.getEvaluations))))

(defn get-iterations
  "Get the number of iterations of the last run of the integrator.

  returns: number of iterations - `int`"
  (^Integer [^UnivariateIntegrator this]
    (-> this (.getIterations))))

