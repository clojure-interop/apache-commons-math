(ns org.apache.commons.math4.analysis.integration.gauss.GaussIntegratorFactory
  "Class that provides different ways to compute the nodes and weights to be
  used by the Gaussian integration rule."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss GaussIntegratorFactory]))

(defn ->gauss-integrator-factory
  "Constructor."
  (^GaussIntegratorFactory []
    (new GaussIntegratorFactory )))

(defn laguerre
  "Creates a Gauss-Laguerre integrator of the given order.
   The call to the
   integrate method will perform an integration on the interval
   \\([0, \\infty)\\): the computed value is the improper integral of
   \\(e^{-x} f(x)\\)
   where \\(f(x)\\) is the function passed to the
   integrate method.

  number-of-points - Order of the integration rule. - `int`

  returns: a Gauss-Legendre integrator. - `org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator`"
  (^org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points]
    (-> this (.laguerre number-of-points))))

(defn legendre
  "Creates a Gauss-Legendre integrator of the given order.
   The call to the
   integrate method will perform an integration on the given interval.

  number-of-points - Order of the integration rule. - `int`
  lower-bound - Lower bound of the integration interval. - `double`
  upper-bound - Upper bound of the integration interval. - `double`

  returns: a Gauss-Legendre integrator. - `org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if number of points is not positive"
  (^org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points ^Double lower-bound ^Double upper-bound]
    (-> this (.legendre number-of-points lower-bound upper-bound)))
  (^org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points]
    (-> this (.legendre number-of-points))))

(defn legendre-high-precision
  "Creates an integrator of the given order, and whose call to the
   integrate method will perform an integration on the given interval.

  number-of-points - Order of the integration rule. - `int`
  lower-bound - Lower bound of the integration interval. - `double`
  upper-bound - Upper bound of the integration interval. - `double`

  returns: a Gauss-Legendre integrator. - `org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if number of points is not positive"
  (^org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points ^Double lower-bound ^Double upper-bound]
    (-> this (.legendreHighPrecision number-of-points lower-bound upper-bound)))
  (^org.apache.commons.math4.analysis.integration.gauss.GaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points]
    (-> this (.legendreHighPrecision number-of-points))))

(defn hermite
  "Creates a Gauss-Hermite integrator of the given order.
   The call to the
   integrate method will perform a weighted integration on the interval
   \\([-\\infty, \\infty]\\): the computed value is the improper integral of
   \\(e^{-x^2}f(x)\\)
   where \\(f(x)\\) is the function passed to the
   integrate method.

  number-of-points - Order of the integration rule. - `int`

  returns: a Gauss-Hermite integrator. - `org.apache.commons.math4.analysis.integration.gauss.SymmetricGaussIntegrator`"
  (^org.apache.commons.math4.analysis.integration.gauss.SymmetricGaussIntegrator [^GaussIntegratorFactory this ^Integer number-of-points]
    (-> this (.hermite number-of-points))))

