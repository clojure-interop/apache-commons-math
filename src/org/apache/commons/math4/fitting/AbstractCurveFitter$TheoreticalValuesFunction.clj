(ns org.apache.commons.math4.fitting.AbstractCurveFitter$TheoreticalValuesFunction
  "Vector function for computing function theoretical values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting AbstractCurveFitter$TheoreticalValuesFunction]))

(defn ->theoretical-values-function
  "Constructor.

  f - function to fit. - `org.apache.commons.math4.analysis.ParametricUnivariateFunction`
  observations - Observations. - `java.util.Collection`"
  (^AbstractCurveFitter$TheoreticalValuesFunction [^org.apache.commons.math4.analysis.ParametricUnivariateFunction f ^java.util.Collection observations]
    (new AbstractCurveFitter$TheoreticalValuesFunction f observations)))

(defn get-model-function
  "returns: the model function values. - `org.apache.commons.math4.analysis.MultivariateVectorFunction`"
  (^org.apache.commons.math4.analysis.MultivariateVectorFunction [^AbstractCurveFitter$TheoreticalValuesFunction this]
    (-> this (.getModelFunction))))

(defn get-model-function-jacobian
  "returns: the model function Jacobian. - `org.apache.commons.math4.analysis.MultivariateMatrixFunction`"
  (^org.apache.commons.math4.analysis.MultivariateMatrixFunction [^AbstractCurveFitter$TheoreticalValuesFunction this]
    (-> this (.getModelFunctionJacobian))))

