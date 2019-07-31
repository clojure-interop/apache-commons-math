(ns org.apache.commons.math4.analysis.integration.gauss.BaseRuleFactory
  "Base class for rules that determines the integration nodes and their
  weights.
  Subclasses must implement the computeRule method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.integration.gauss BaseRuleFactory]))

(defn ->base-rule-factory
  "Constructor."
  (^BaseRuleFactory []
    (new BaseRuleFactory )))

(defn get-rule
  "Gets a copy of the quadrature rule with the given number of integration
   points.

  number-of-points - Number of integration points. - `int`

  returns: a copy of the integration rule. - `org.apache.commons.math4.util.Pair<double[],double[]>`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numberOfPoints < 1."
  ([^BaseRuleFactory this ^Integer number-of-points]
    (-> this (.getRule number-of-points))))

