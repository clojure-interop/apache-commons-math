(ns org.apache.commons.math4.analysis.integration.gauss.LaguerreRuleFactory
  "Factory that creates Gauss-type quadrature rule using Laguerre polynomials."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss LaguerreRuleFactory]))

(defn ->laguerre-rule-factory
  "Constructor."
  (^LaguerreRuleFactory []
    (new LaguerreRuleFactory )))

