(ns org.apache.commons.math4.fitting.AbstractCurveFitter
  "Base class that contains common code for fitting parametric univariate
  real functions y = f(pi;x), where x is
  the independent variable and the pi are the
  parameters.

  A fitter will find the optimal values of the parameters by
  fitting the curve so it remains very close to a set of
  N observed points (xk, yk),
  0 <= k < N.

  An algorithm usually performs the fit by finding the parameter
  values that minimizes the objective function


   ∑yk - f(xk)2,
  which is actually a least-squares problem.
  This class contains boilerplate code for calling the
  fit(Collection) method for obtaining the parameters.
  The problem setup, such as the choice of optimization algorithm
  for fitting a specific function is delegated to subclasses."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting AbstractCurveFitter]))

(defn ->abstract-curve-fitter
  "Constructor."
  (^AbstractCurveFitter []
    (new AbstractCurveFitter )))

(defn fit
  "Fits a curve.
   This method computes the coefficients of the curve that best
   fit the sample of observed points.

  points - Observations. - `java.util.Collection`

  returns: the fitted parameters. - `double[]`"
  ([^AbstractCurveFitter this ^java.util.Collection points]
    (-> this (.fit points))))

