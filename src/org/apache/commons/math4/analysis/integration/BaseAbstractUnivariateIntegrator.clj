(ns org.apache.commons.math4.analysis.integration.BaseAbstractUnivariateIntegrator
  "Provide a default implementation for several generic functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration BaseAbstractUnivariateIntegrator]))

(def *-default-absolute-accuracy
  "Static Constant.

  Default absolute accuracy.

  type: double"
  BaseAbstractUnivariateIntegrator/DEFAULT_ABSOLUTE_ACCURACY)

(def *-default-relative-accuracy
  "Static Constant.

  Default relative accuracy.

  type: double"
  BaseAbstractUnivariateIntegrator/DEFAULT_RELATIVE_ACCURACY)

(def *-default-min-iterations-count
  "Static Constant.

  Default minimal iteration count.

  type: int"
  BaseAbstractUnivariateIntegrator/DEFAULT_MIN_ITERATIONS_COUNT)

(def *-default-max-iterations-count
  "Static Constant.

  Default maximal iteration count.

  type: int"
  BaseAbstractUnivariateIntegrator/DEFAULT_MAX_ITERATIONS_COUNT)

(defn get-relative-accuracy
  "Get the relative accuracy.

  returns: the accuracy - `double`"
  (^Double [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getRelativeAccuracy))))

(defn get-absolute-accuracy
  "Get the absolute accuracy.

  returns: the accuracy - `double`"
  (^Double [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getAbsoluteAccuracy))))

(defn get-minimal-iteration-count
  "Get the min limit for the number of iterations.

  returns: the actual min limit - `int`"
  (^Integer [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getMinimalIterationCount))))

(defn get-maximal-iteration-count
  "Get the upper limit for the number of iterations.

  returns: the actual upper limit - `int`"
  (^Integer [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getMaximalIterationCount))))

(defn get-evaluations
  "Get the number of function evaluations of the last run of the integrator.

  returns: number of function evaluations - `int`"
  (^Integer [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getEvaluations))))

(defn get-iterations
  "Get the number of iterations of the last run of the integrator.

  returns: number of iterations - `int`"
  (^Integer [^BaseAbstractUnivariateIntegrator this]
    (-> this (.getIterations))))

(defn integrate
  "Integrate the function in the given interval.

  max-eval - Maximum number of evaluations. - `int`
  f - the integrand function - `org.apache.commons.math4.analysis.UnivariateFunction`
  lower - the lower bound for the interval - `double`
  upper - the upper bound for the interval - `double`

  returns: the value of integral - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum number of function evaluations is exceeded"
  (^Double [^BaseAbstractUnivariateIntegrator this ^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double lower ^Double upper]
    (-> this (.integrate max-eval f lower upper))))

