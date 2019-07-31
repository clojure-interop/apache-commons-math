(ns org.apache.commons.math4.optim.nonlinear.scalar.LeastSquaresConverter
  "This class converts
  vectorial objective functions to
  scalar objective functions
  when the goal is to minimize them.

  This class is mostly used when the vectorial objective function represents
  a theoretical result computed from a point set applied to a model and
  the models point must be adjusted to fit the theoretical result to some
  reference observations. The observations may be obtained for example from
  physical measurements whether the model is built from theoretical
  considerations.

  This class computes a possibly weighted squared sum of the residuals, which is
  a scalar value. The residuals are the difference between the theoretical model
  (i.e. the output of the vectorial objective function) and the observations. The
  class implements the MultivariateFunction interface and can therefore be
  minimized by any optimizer supporting scalar objectives functions.This is one way
  to perform a least square estimation. There are other ways to do this without using
  this converter, as some optimization algorithms directly support vectorial objective
  functions.

  This class support combination of residuals with or without weights and correlations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar LeastSquaresConverter]))

(defn ->least-squares-converter
  "Constructor.

  Builds a simple converter for uncorrelated residuals with the
   specified weights.

   The scalar objective function value is computed as:


   objective = ∑weighti(observationi-objectivei)2


   Weights can be used for example to combine residuals with different standard
   deviations. As an example, consider a residuals array in which even elements
   are angular measurements in degrees with a 0.01° standard deviation and
   odd elements are distance measurements in meters with a 15m standard deviation.
   In this case, the weights array should be initialized with value
   1.0/(0.012) in the even elements and 1.0/(15.02) in the
   odd elements (i.e. reciprocals of variances).


   The array computed by the objective function, the observations array and the
   weights array must have consistent sizes or a DimensionMismatchException
   will be triggered while computing the scalar objective.

  function - vectorial residuals function to wrap - `org.apache.commons.math4.analysis.MultivariateVectorFunction`
  observations - observations to be compared to objective function to compute residuals - `double[]`
  weights - weights to apply to the residuals - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the observations vector and the weights vector dimensions do not match (objective function dimension is checked only when the value(double[]) method is called)"
  (^LeastSquaresConverter [^org.apache.commons.math4.analysis.MultivariateVectorFunction function observations weights]
    (new LeastSquaresConverter function observations weights))
  (^LeastSquaresConverter [^org.apache.commons.math4.analysis.MultivariateVectorFunction function observations]
    (new LeastSquaresConverter function observations)))

(defn value
  "Compute the value for the function at the given point.

  point - Point at which the function must be evaluated. - `double[]`

  returns: the function value for the given point. - `double`"
  (^Double [^LeastSquaresConverter this point]
    (-> this (.value point))))

