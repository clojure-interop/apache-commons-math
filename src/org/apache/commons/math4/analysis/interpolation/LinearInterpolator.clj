(ns org.apache.commons.math4.analysis.interpolation.LinearInterpolator
  "Implements a linear function for interpolation of real univariate functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation LinearInterpolator]))

(defn ->linear-interpolator
  "Constructor."
  (^LinearInterpolator []
    (new LinearInterpolator )))

(defn interpolate
  "Computes a linear interpolating function for the data set.

  x - the arguments for the interpolation points - `double[]`
  y - the values for the interpolation points - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if x and y have different sizes."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction [^LinearInterpolator this x y]
    (-> this (.interpolate x y))))

