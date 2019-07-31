(ns org.apache.commons.math4.analysis.interpolation.AkimaSplineInterpolator
  "Computes a cubic spline interpolation for the data set using the Akima
  algorithm, as originally formulated by Hiroshi Akima in his 1970 paper
  \"A New Method of Interpolation and Smooth Curve Fitting Based on Local Procedures.\"
  J. ACM 17, 4 (October 1970), 589-602. DOI=10.1145/321607.321609
  http://doi.acm.org/10.1145/321607.321609

  This implementation is based on the Akima implementation in the CubicSpline
  class in the Math.NET Numerics library. The method referenced is
  CubicSpline.InterpolateAkimaSorted


  The interpolate method returns a
  PolynomialSplineFunction consisting of n cubic polynomials, defined
  over the subintervals determined by the x values, x[0] < x[i] ... < x[n].
  The Akima algorithm requires that n >= 5."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation AkimaSplineInterpolator]))

(defn ->akima-spline-interpolator
  "Constructor."
  (^AkimaSplineInterpolator []
    (new AkimaSplineInterpolator )))

(defn interpolate
  "Computes an interpolating function for the data set.

  xvals - the arguments for the interpolation points - `double[]`
  yvals - the values for the interpolation points - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if xvals and yvals have different sizes."
  (^org.apache.commons.math4.analysis.polynomials.PolynomialSplineFunction [^AkimaSplineInterpolator this xvals yvals]
    (-> this (.interpolate xvals yvals))))

