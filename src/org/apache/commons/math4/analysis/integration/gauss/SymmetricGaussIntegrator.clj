(ns org.apache.commons.math4.analysis.integration.gauss.SymmetricGaussIntegrator
  "This class's implements integrate
  method assuming that the integral is symmetric about 0.
  This allows to reduce numerical errors."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss SymmetricGaussIntegrator]))

(defn ->symmetric-gauss-integrator
  "Constructor.

  Creates an integrator from the given points and weights.
   The integration interval is defined by the first and last value of
   points which must be sorted in increasing order.

  points - Integration points. - `double[]`
  weights - Weights of the corresponding integration nodes. - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the points are not sorted in increasing order."
  (^SymmetricGaussIntegrator [points weights]
    (new SymmetricGaussIntegrator points weights))
  (^SymmetricGaussIntegrator [^org.apache.commons.math4.util.Pair points-and-weights]
    (new SymmetricGaussIntegrator points-and-weights)))

(defn integrate
  "Returns an estimate of the integral of f(x) * w(x),
   where w is a weight function that depends on the actual
   flavor of the Gauss integration scheme.
   The algorithm uses the points and associated weights, as passed
   to the constructor.

  f - Function to integrate. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: the integral of the weighted function. - `double`"
  (^Double [^SymmetricGaussIntegrator this ^org.apache.commons.math4.analysis.UnivariateFunction f]
    (-> this (.integrate f))))

