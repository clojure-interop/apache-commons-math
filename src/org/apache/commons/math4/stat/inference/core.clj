(ns org.apache.commons.math4.stat.inference.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.apache.commons.math4.stat.inference.AlternativeHypothesis])
(require '[org.apache.commons.math4.stat.inference.BinomialTest])
(require '[org.apache.commons.math4.stat.inference.ChiSquareTest])
(require '[org.apache.commons.math4.stat.inference.GTest])
(require '[org.apache.commons.math4.stat.inference.InferenceTestUtils])
(require '[org.apache.commons.math4.stat.inference.KolmogorovSmirnovTest])
(require '[org.apache.commons.math4.stat.inference.MannWhitneyUTest])
(require '[org.apache.commons.math4.stat.inference.OneWayAnova])
(require '[org.apache.commons.math4.stat.inference.TTest])
(require '[org.apache.commons.math4.stat.inference.WilcoxonSignedRankTest])
