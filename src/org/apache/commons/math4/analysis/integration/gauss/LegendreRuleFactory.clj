(ns org.apache.commons.math4.analysis.integration.gauss.LegendreRuleFactory
  "Factory that creates Gauss-type quadrature rule using Legendre polynomials.
  In this implementation, the lower and upper bounds of the natural interval
  of integration are -1 and 1, respectively.
  The Legendre polynomials are evaluated using the recurrence relation
  presented in
  Abramowitz and Stegun, 1964."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss LegendreRuleFactory]))

(defn ->legendre-rule-factory
  "Constructor."
  (^LegendreRuleFactory []
    (new LegendreRuleFactory )))

