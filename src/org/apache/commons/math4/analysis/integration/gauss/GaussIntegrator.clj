(ns org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator
  "Class that implements the Gaussian rule for
  integrating a weighted
  function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss GaussIntegrator]))

(defn ->gauss-integrator
  "Constructor.

  Creates an integrator from the given points and weights.
   The integration interval is defined by the first and last value of
   points which must be sorted in increasing order.

  points - Integration points. - `double[]`
  weights - Weights of the corresponding integration nodes. - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the points are not sorted in increasing order."
  (^GaussIntegrator [points weights]
    (new GaussIntegrator points weights))
  (^GaussIntegrator [^org.apache.commons.math4.util.Pair points-and-weights]
    (new GaussIntegrator points-and-weights)))

(defn integrate
  "Returns an estimate of the integral of f(x) * w(x),
   where w is a weight function that depends on the actual
   flavor of the Gauss integration scheme.
   The algorithm uses the points and associated weights, as passed
   to the constructor.

  f - Function to integrate. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: the integral of the weighted function. - `double`"
  (^Double [^GaussIntegrator this ^org.apache.commons.math4.analysis.UnivariateFunction f]
    (-> this (.integrate f))))

(defn get-number-of-points
  "returns: the order of the integration rule (the number of integration
   points). - `int`"
  (^Integer [^GaussIntegrator this]
    (-> this (.getNumberOfPoints))))

(defn get-point
  "Gets the integration point at the given index.
   The index must be in the valid range but no check is performed.

  index - index of the integration point - `int`

  returns: the integration point. - `double`"
  (^Double [^GaussIntegrator this ^Integer index]
    (-> this (.getPoint index))))

(defn get-weight
  "Gets the weight of the integration point at the given index.
   The index must be in the valid range but no check is performed.

  index - index of the integration point - `int`

  returns: the weight. - `double`"
  (^Double [^GaussIntegrator this ^Integer index]
    (-> this (.getWeight index))))

