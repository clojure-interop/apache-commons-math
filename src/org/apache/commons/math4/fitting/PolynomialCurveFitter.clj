(ns org.apache.commons.math4.fitting.PolynomialCurveFitter
  "Fits points to a polynomial
  function.

  The size of the initial guess array defines the
  degree of the polynomial to be fitted.
  They must be sorted in increasing order of the polynomial's degree.
  The optimal values of the coefficients will be returned in the same order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting PolynomialCurveFitter]))

(defn *create
  "Creates a default curve fitter.
   Zero will be used as initial guess for the coefficients, and the maximum
   number of iterations of the optimization algorithm is set to
   Integer.MAX_VALUE.

  degree - Degree of the polynomial to be fitted. - `int`

  returns: a curve fitter. - `org.apache.commons.math4.fitting.PolynomialCurveFitter`"
  (^org.apache.commons.math4.fitting.PolynomialCurveFitter [^Integer degree]
    (PolynomialCurveFitter/create degree)))

(defn with-start-point
  "Configure the start point (initial guess).

  new-start - new start point (initial guess) - `double[]`

  returns: a new instance. - `org.apache.commons.math4.fitting.PolynomialCurveFitter`"
  (^org.apache.commons.math4.fitting.PolynomialCurveFitter [^PolynomialCurveFitter this new-start]
    (-> this (.withStartPoint new-start))))

(defn with-max-iterations
  "Configure the maximum number of iterations.

  new-max-iter - maximum number of iterations - `int`

  returns: a new instance. - `org.apache.commons.math4.fitting.PolynomialCurveFitter`"
  (^org.apache.commons.math4.fitting.PolynomialCurveFitter [^PolynomialCurveFitter this ^Integer new-max-iter]
    (-> this (.withMaxIterations new-max-iter))))

