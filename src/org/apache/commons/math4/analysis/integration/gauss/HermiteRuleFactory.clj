(ns org.apache.commons.math4.analysis.integration.gauss.HermiteRuleFactory
  "Factory that creates a

  Gauss-type quadrature rule using Hermite polynomials
  of the first kind.
  Such a quadrature rule allows the calculation of improper integrals
  of a function

   \\(f(x) e^{-x^2}\\)

  Recurrence relation and weights computation follow

  Abramowitz and Stegun, 1964.

  The coefficients of the standard Hermite polynomials grow very rapidly.
  In order to avoid overflows, each Hermite polynomial is normalized with
  respect to the underlying scalar product.
  The initial interval for the application of the bisection method is
  based on the roots of the previous Hermite polynomial (interlacing).
  Upper and lower bounds of these roots are provided by

   I. Krasikov,
   Nonnegative quadratic forms and bounds on orthogonal polynomials,
   Journal of Approximation theory 111, 31-49"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss HermiteRuleFactory]))

(defn ->hermite-rule-factory
  "Constructor."
  (^HermiteRuleFactory []
    (new HermiteRuleFactory )))

