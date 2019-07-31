(ns org.apache.commons.math4.analysis.interpolation.DividedDifferenceInterpolator
  "Implements the
  Divided Difference Algorithm for interpolation of real univariate
  functions. For reference, see Introduction to Numerical Analysis,
  ISBN 038795452X, chapter 2.

  The actual code of Neville's evaluation is in PolynomialFunctionLagrangeForm,
  this class provides an easy-to-use interface to it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation DividedDifferenceInterpolator]))

(defn ->divided-difference-interpolator
  "Constructor."
  (^DividedDifferenceInterpolator []
    (new DividedDifferenceInterpolator )))

(defn interpolate
  "Compute an interpolating function for the dataset.

  x - Interpolating points array. - `double[]`
  y - Interpolating values array. - `double[]`

  returns: a function which interpolates the dataset. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunctionNewtonForm`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths are different."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunctionNewtonForm [^DividedDifferenceInterpolator this x y]
    (-> this (.interpolate x y))))

