(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma
  "Input sigma values.
  They define the initial coordinate-wise standard deviations for
  sampling new search points around the initial guess.
  It is suggested to set them to the estimated distance from the
  initial to the desired optimum.
  Small values induce the search to be more local (and very small
  values are more likely to find a local optimum close to the initial
  guess).
  Too small values might however lead to early termination."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv CMAESOptimizer$Sigma]))

(defn ->sigma
  "Constructor.

  s - Sigma values. - `double[]`

  throws: org.apache.commons.math4.exception.NotPositiveException - if any of the array entries is smaller than zero."
  (^CMAESOptimizer$Sigma [s]
    (new CMAESOptimizer$Sigma s)))

(defn get-sigma
  "returns: the sigma values. - `double[]`"
  ([^CMAESOptimizer$Sigma this]
    (-> this (.getSigma))))

