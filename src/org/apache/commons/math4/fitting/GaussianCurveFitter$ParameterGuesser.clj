(ns org.apache.commons.math4.fitting.GaussianCurveFitter$ParameterGuesser
  "Guesses the parameters norm, mean, and sigma
  of a Gaussian.Parametric
  based on the specified observed points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting GaussianCurveFitter$ParameterGuesser]))

(defn ->parameter-guesser
  "Constructor.

  Constructs instance with the specified observed points.

  observations - Observed points from which to guess the parameters of the Gaussian. - `java.util.Collection`

  throws: org.apache.commons.math4.exception.NullArgumentException - if observations is null."
  (^GaussianCurveFitter$ParameterGuesser [^java.util.Collection observations]
    (new GaussianCurveFitter$ParameterGuesser observations)))

(defn guess
  "Gets an estimation of the parameters.

  returns: the guessed parameters, in the following order:

    Normalization factor
    Mean
    Standard deviation - `double[]`"
  ([^GaussianCurveFitter$ParameterGuesser this]
    (-> this (.guess))))

