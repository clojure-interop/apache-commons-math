(ns org.apache.commons.math4.analysis.interpolation.NevilleInterpolator
  "Implements the
  Neville's Algorithm for interpolation of real univariate functions. For
  reference, see Introduction to Numerical Analysis, ISBN 038795452X,
  chapter 2.

  The actual code of Neville's algorithm is in PolynomialFunctionLagrangeForm,
  this class provides an easy-to-use interface to it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation NevilleInterpolator]))

(defn ->neville-interpolator
  "Constructor."
  (^NevilleInterpolator []
    (new NevilleInterpolator )))

(defn interpolate
  "Computes an interpolating function for the data set.

  x - Interpolating points. - `double[]`
  y - Interpolating values. - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.polynomials.PolynomialFunctionLagrangeForm`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths are different."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunctionLagrangeForm [^NevilleInterpolator this x y]
    (-> this (.interpolate x y))))

