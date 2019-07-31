(ns org.apache.commons.math4.analysis.integration.gauss.LegendreHighPrecisionRuleFactory
  "Factory that creates Gauss-type quadrature rule using Legendre polynomials.
  In this implementation, the lower and upper bounds of the natural interval
  of integration are -1 and 1, respectively.
  The Legendre polynomials are evaluated using the recurrence relation
  presented in
  Abramowitz and Stegun, 1964."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss LegendreHighPrecisionRuleFactory]))

(defn ->legendre-high-precision-rule-factory
  "Constructor.

  Default precision is DECIMAL128."
  (^LegendreHighPrecisionRuleFactory []
    (new LegendreHighPrecisionRuleFactory ))
  (^LegendreHighPrecisionRuleFactory [^java.math.MathContext m-context]
    (new LegendreHighPrecisionRuleFactory m-context)))

