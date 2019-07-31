(ns org.apache.commons.math4.fitting.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.apache.commons.math4.fitting.AbstractCurveFitter$TheoreticalValuesFunction])
(require '[org.apache.commons.math4.fitting.AbstractCurveFitter])
(require '[org.apache.commons.math4.fitting.GaussianCurveFitter$ParameterGuesser])
(require '[org.apache.commons.math4.fitting.GaussianCurveFitter])
(require '[org.apache.commons.math4.fitting.HarmonicCurveFitter$ParameterGuesser])
(require '[org.apache.commons.math4.fitting.HarmonicCurveFitter])
(require '[org.apache.commons.math4.fitting.PolynomialCurveFitter])
(require '[org.apache.commons.math4.fitting.SimpleCurveFitter])
(require '[org.apache.commons.math4.fitting.WeightedObservedPoint])
(require '[org.apache.commons.math4.fitting.WeightedObservedPoints])
